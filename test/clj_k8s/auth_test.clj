(ns clj-k8s.auth-test
  (:require [clojure.test :refer :all]
            [clj-k8s.auth :refer :all]))

(deftest from-service-account-test
  (is (= {:base-url  "https://10.137.16.1:443"
          :auths     {"BearerToken" "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IiJ9.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJjdXJpb3NpdHkiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlY3JldC5uYW1lIjoiZGVmYXVsdC10b2tlbi1ieG1uaiIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VydmljZS1hY2NvdW50Lm5hbWUiOiJkZWZhdWx0Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQudWlkIjoiMTNiZWEzNzgtYWUyZC0xMWU5LWFmYmMtNDIwMWMwYTgwMDA1Iiwic3ViIjoic3lzdGVtOnNlcnZpY2VhY2NvdW50OmN1cmlvc2l0eTpkZWZhdWx0In0.iWeogKkXquXXkE4tH70B8EHyV4yBiz635JSYPYjTMDW9hq7_80sZc-YEI4e8z36JPxpc8En1FLUnsx2B-nKZwcnS9GaOrY9aQW57Kwz4Ru5AUYl-i1eQPxOAZJGSntHquIKCWDF1lKFh-5C4mmnDqldALqoR527RUaQh9Gvyu-QOoIwBTy2p7gwOgkZPC3gCZhZrkccyHewPT2D17C4zLow6zVzKzohIGaJvnFttVs0QpxzjnAdNRTgy_DrUG4lG1mLFMQ9aXzP7h2QL-V3E1FLnHHwksaMhTZR-hUNsaetKggmjDCBnqW0hUEwYON8nXrq50cew2qmwPkLtz7V4Ow"}
          :namespace "default"}
         (from-service-account "10.137.16.1" "443" "dev-resources"))))

(deftest from-gcp-kube-config-test
  (let [{:keys [base-url auths namespace]} (from-gcp-kube-config)]
    (is (= "https://104.155.37.154" base-url))
    (is (= (str "Bearer " (get-google-access-token)) (get auths "BearerToken")))
    (is (string? namespace))))
