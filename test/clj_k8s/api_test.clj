(ns clj-k8s.api-test
  (:require [clojure.test :refer :all]
            [test-helper :refer :all]
            [clj-k8s.api :as k]
            [clj-k8s.utils :refer :all])
  (:import (java.util UUID)))

(use-fixtures
  :each
  with-client
  with-namespace)

(deftest version-test
  (testing "version endpoint is functional"
    (is (= [:buildDate :gitCommit :gitTreeState :major :compiler
            :goVersion :minor :gitVersion :platform]
           (keys (k/cluster-version *client*))))))


(deftest namespaces-test
  (testing "namespace interactions"
    (let [generated-ns (str (UUID/randomUUID))]
      (is (= "default" (k/active-ns *client*)))
      (is (nil? (k/delete-namespace *client* generated-ns)))
      (is (= (get-in (k/create-namespace *client* generated-ns) [:metadata :name]) generated-ns))
      (is (= (:status (k/delete-namespace *client* generated-ns)) {:phase "Terminating"} )))))


(deftest endpoints-test
  (testing "endpoints are properly fetched"
    (is (nil? (k/get-endpoints *client* "nop")))
    (is (= (get-in (k/get-endpoints *client* "kubernetes") [:subsets 0 :ports 0 :port]) 8443))))


(deftest job-batch-test
  (let [job-spec
        {:metadata {:name   "test-job"
                    :labels {:env "test"}}
         :spec     {:template
                    {:spec {:containers    [{:image   "alpine"
                                             :name    "alpine"
                                             :command ["sh" "-c" "for i in `seq 1 5`; do echo $i; sleep .2; done"]}]
                            :restartPolicy "Never"}}}}]
    (testing "The job should not yet exist"
      (is (nil? (k/get-job *client*"test-job"))))

    (testing "The job should be created"
      (let [submitted-job (-> (k/submit-job *client* job-spec)
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
        (is (wait-for (running? (k/get-job *client* "test-job"))))))

    (testing "The job should be retrievied by this label"
      (is (= 1  (count (k/list-jobs *client* {:label-selector {:env "test"}}))))
      (is (= ["test-job"] (->> (wait-for (k/list-jobs *client* {:label-selector {:env "test"}}))
                               (map (fn [{:keys [metadata]}] (:name metadata)))))))

    (testing "There should be at least one pod matching the job"
      (is (= ["test-job-"]
             (->> (k/job-pods *client* "test-job")
                  (map :metadata)
                  (map :generateName)))))

    (testing "Listing all jobs should return something normally"
      (let [jobs (->> (k/list-jobs *client* {:all-namespaces true})
                      (map :metadata)
                      (map #(format "%s/%s" (:namespace %) (:name %)))
                      (into #{}))]
        (is (contains? jobs (str (k/active-ns *client*) "/test-job")))))

    (testing "The job should be deleted"
      (let [deleted-job (-> (k/delete-job *client* "test-job")
                            (clean-response :controller-uid :startTime :completionTime :namespace
                                            :lastProbeTime :lastTransitionTime :managedFields)
                            (update :metadata dissoc :annotations)
                            (dissoc :status))]
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
                 :suspend false}} deleted-job))
        (is (wait-for (nil? (k/get-job *client* "test-job"))))
        (is (= [] (k/list-pods *client*)))))))
