(ns clj-k8s.utils-test
  (:require [clj-k8s.utils :refer :all]
            [clojure.test :refer :all]))

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
