(ns clj-k8s.core-test
  (:require [clojure.test :refer :all]
            [clj-k8s.core :refer :all]
            [test-helper :refer :all])
  (:import (java.util UUID)))

(def test-namespace (str "test-" (UUID/randomUUID)))

(use-fixtures
  :each
  with-context)

(deftest namespace-test

  (testing "The namespace should not exist"
    (is (nil? (get-namespace test-namespace))))

  (testing "The namespace should be created"
    (is (= {:apiVersion "v1"
            :kind       "Namespace"
            :metadata   {:name     test-namespace}
            :spec       {:finalizers ["kubernetes"]}
            :status     {:phase "Active"}}
           (clean-response (create-namespace test-namespace)
                           :managedFields :labels)))
    (is (get-namespace test-namespace)))

  (testing "The namespace should be deleted"
    (is (= {:apiVersion "v1"
            :kind       "Namespace"
            :metadata   {:name     test-namespace}
            :spec       {:finalizers ["kubernetes"]}
            :status     {:phase "Terminating"}}
           (clean-response (delete-namespace test-namespace {:grace-period-seconds 1})
                           :managedFields :labels)))
    (is (wait-for (nil? (get-namespace test-namespace))
                  :interval 2))))

(deftest service-test

  (testing "An unknown service should return nil"
    (is (nil? (get-endpoints "unknown"))))

  (testing "The kubernetes service should always exist"
    (let [ep (-> (get-endpoints "kubernetes" {:namespace "default"})
                 :subsets
                 first)]
      (is (= {:name "https" :port 443 :protocol "TCP"}
             (-> ep :ports first)))
      (is (re-matches #"\d+.\d+.\d+.\d+" (-> ep :addresses first :ip)))))

  )
