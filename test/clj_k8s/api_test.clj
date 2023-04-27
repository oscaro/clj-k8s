(ns clj-k8s.api-test
  (:require [clojure.test :refer :all]
            [test-helper :refer :all]
            [clj-k8s.api :as k])
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
