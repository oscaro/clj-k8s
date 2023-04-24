(ns clj-k8s.batch-test
  (:require [clojure.test :refer :all]
            [clj-k8s.batch :refer :all]
            [test-helper :refer :all]
            [clj-k8s.core :as core]
            [clojure.string :as str]))

(use-fixtures
  :each
  with-context
  with-namespace)

(def job-spec
  {:metadata {:name   "test-job"
              :labels {:env "test"}}
   :spec     {:template
              {:spec {:containers    [{:image   "alpine"
                                       :name    "alpine"
                                       :command ["sh" "-c" "for i in `seq 1 5`; do echo $i; sleep .2; done"]}]
                      :restartPolicy "Never"}}}})

(deftest submit-job-test

  (testing "The job should not yet exist"
    (is (nil? (get-job "test-job"))))

  (testing "The job should be created"
    (let [submitted-job (-> (submit-job job-spec)
                            (clean-response :controller-uid :managedFields :fieldsV1
                                            :namespace)
                            (update :metadata dissoc :annotations))]
      (is (= {:kind "Job"
              :apiVersion "batch/v1"
              :metadata
              {:labels {:env "test"}
               :generation 1
               :name "test-job"}
              :spec
              {:parallelism 1
               :completions 1
               :backoffLimit 6
               :selector {:matchLabels {}}
               :template
               {:metadata {:labels {:job-name "test-job"}}
                :spec
                {:containers
                 [{:name "alpine"
                   :image "alpine"
                   :command
                   ["sh" "-c" "for i in `seq 1 5`; do echo $i; sleep .2; done"]
                   :resources {}
                   :terminationMessagePath "/dev/termination-log"
                   :terminationMessagePolicy "File"
                   :imagePullPolicy "Always"}]
                 :restartPolicy "Never"
                 :terminationGracePeriodSeconds 30
                 :dnsPolicy "ClusterFirst"
                 :securityContext {}
                 :schedulerName "default-scheduler"}}
               :completionMode "NonIndexed"
               :suspend false}
              :status {}}
             submitted-job))
      (is (wait-for (running? (get-job "test-job"))))))

  (testing "The job should be retrievied by this label"
    (is (= 1  (count (list-jobs {:label-selector {:env "test"}}))))
    (is (= ["test-job"] (->> (wait-for (list-jobs {:label-selector {:env "test"}}))
                             (map (fn [{:keys [metadata]}] (:name metadata)))))))

  (testing "There should be at least one pod matching the job"
    (is (= ["test-job-"]
           (->> (job-pods "test-job")
                (map :metadata)
                (map :generateName)))))

  (testing "Listing all jobs should return something normally"
    (let [jobs (->> (list-jobs {:all-namespaces true})
                    (map :metadata)
                    (map #(format "%s/%s" (:namespace %) (:name %)))
                    (into #{}))]
      (is (contains? jobs (str *namespace* "/test-job")))))

  #_(testing "The pod logs should be fetched"
    (let [pod-name (wait-for (-> (job-pods "test-job")
                                 first
                                 (get-in [:metadata :name])))]
      (is (= (str/join "\n" (range 1 6))
             (str/trim (wait-for (core/pod-logs pod-name) :interval 5 :timeout 10))))))

  (testing "The job should be deleted"
    (let [deleted-job (-> (delete-job "test-job")
                          (clean-response :controller-uid :startTime :completionTime :namespace
                                          :lastProbeTime :lastTransitionTime :managedFields)
                          (update :metadata dissoc :annotations))]
      (is (= {:kind "Job"
              :apiVersion "batch/v1"
              :metadata
              {:labels {:env "test"}
               :generation 2
               :name "test-job"
               :finalizers ["foregroundDeletion"]
               :deletionGracePeriodSeconds 0}
              :spec
              {:parallelism 1
               :completions 1
               :backoffLimit 6
               :selector {:matchLabels {}}
               :template
               {:metadata {:labels {:job-name "test-job"}}
                :spec
                {:containers
                 [{:name "alpine"
                   :image "alpine"
                   :command
                   ["sh" "-c" "for i in `seq 1 5`; do echo $i; sleep .2; done"]
                   :resources {}
                   :terminationMessagePath "/dev/termination-log"
                   :terminationMessagePolicy "File"
                   :imagePullPolicy "Always"}]
                 :restartPolicy "Never"
                 :terminationGracePeriodSeconds 30
                 :dnsPolicy "ClusterFirst"
                 :securityContext {}
                 :schedulerName "default-scheduler"}}
               :completionMode "NonIndexed"
               :suspend false}
              :status {:active 1 :uncountedTerminatedPods {} :ready 0}} deleted-job))
      (is (wait-for (nil? (get-job "test-job"))))
      (is (= [] (core/list-pods))))))

(deftest job-status-test
  (let [job {:spec {:parallelism 1}}]

    (testing "Nil job"
      (is (false? (running? nil)))
      (is (false? (succeeded? nil)))
      (is (true? (failed? nil))))

    (testing "Job is running"
      (let [job (assoc job :status {:startTime "2019-10-11T14:09:08Z" :active 1})]
        (is (true? (running? job)))
        (is (false? (succeeded? job)))
        (is (false? (failed? job)))))

    (testing "Job is successful"
      (let [job (assoc job :status {:conditions     [{:type               "Complete"
                                                      :status             "True"
                                                      :lastProbeTime      "2019-10-11T14:09:11Z"
                                                      :lastTransitionTime "2019-10-11T14:09:11Z"}]
                                    :startTime      "2019-10-11T14:09:08Z"
                                    :completionTime "2019-10-11T14:09:11Z"
                                    :succeeded      1})]
        (is (false? (running? job)))
        (is (true? (succeeded? job)))
        (is (false? (failed? job)))))

    (testing "Job is unsuccessful"
      (let [job (assoc job :status {:conditions [{:lastProbeTime      "2019-10-15T13:34:14Z"
                                                  :lastTransitionTime "2019-10-15T13:34:14Z"
                                                  :message            "Job has reached the specified backoff limit"
                                                  :reason             "BackoffLimitExceeded"
                                                  :status             "True"
                                                  :type               "Failed"}]
                                    :startTime  "2019-10-11T14:09:08Z"
                                    :failed     6})]
        (is (false? (running? job)))
        (is (false? (succeeded? job)))
        (is (true? (failed? job)))))))
