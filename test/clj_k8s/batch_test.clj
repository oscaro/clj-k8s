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
    (is (= {:kind "Job"	  
	   :apiVersion "batch/v1"
	   :metadata
	   {:name "test-job"
	    ;;:namespace "test-a7133fda-2fca-4d82-8990-15c81845d144"
	    :labels {:env "test"}}
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
	      :schedulerName "default-scheduler"}}}
	   :status {}}
           (-> (submit-job job-spec) (clean-response :controller-uid :managedFields :fieldsV1
                                                     :namespace))))
    (is (wait-for (running? (get-job "test-job")))))

  (testing "The job should eventually be successful"
    (let [list-completed-jobs #(->> (list-jobs {:label-selector {:env "test"}})
                                    (filter succeeded?)
                                    (map :metadata)
                                    (map :name))]
      (is (wait-for (= ["test-job"] (list-completed-jobs))))))

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

  (testing "The pod logs should be fetched"
    (let [pod-name (-> (job-pods "test-job")
                       first
                       (get-in [:metadata :name]))]
      (is (= (str/join "\n" (range 1 6))
             (str/trim (core/pod-logs pod-name))))))

  (testing "The job should be deleted"
    (is (= {:kind "Job"
	   :apiVersion "batch/v1"
	   :metadata
	   {:labels {:env "test"}
	    :name "test-job"
	    :finalizers ["foregroundDeletion"]
	    :deletionGracePeriodSeconds 0
	    ;;:namespace "test-594bee42-2a5f-40c5-8d7b-710e409eeada"
            }
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
	      :schedulerName "default-scheduler"}}}
	   :status
	   {:conditions [{:type "Complete" :status "True"}] :succeeded 1}}
           (-> (delete-job "test-job")
               (clean-response :controller-uid :startTime :completionTime :namespace
                               :lastProbeTime :lastTransitionTime :managedFields))))
    (is (wait-for (nil? (get-job "test-job"))))
    (is (= [] (core/list-pods)))))

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
