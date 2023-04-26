(ns clj-k8s.auth-test
  (:require [clojure.test :refer :all]
            [test-helper :refer :all]
            [clj-k8s.api :as k]))

(deftest client-instantiation-tests
  (testing "client is correctly instantiated and user can query"
    (let [local-conf (str (System/getenv "HOME") "/.kube/config")]
      (is (map? (k/mk-client)))
      (is (map? (k/mk-client local-conf)))
      (is (map? (k/mk-client local-conf "t0k3n"))))))
