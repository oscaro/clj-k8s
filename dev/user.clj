(ns user
  (:require [clojure.pprint :refer :all]
            [clojure.repl :refer :all]
            [clojure.tools.namespace.repl :refer :all]
            [clj-k8s.api :as k]))

(def client
  (k/mk-client {:base-url "https://192.168.49.2:8443"
                :token "eyJhbGciOiJSUzI1NiIsImtpZCI6IjZFbXRZUE9NNEVEbXdKcVhTekhhX19KOGpVX3RLR0owZXhmVUtJdlo1d0UifQ.eyJhdWQiOlsiaHR0cHM6Ly9rdWJlcm5ldGVzLmRlZmF1bHQuc3ZjLmNsdXN0ZXIubG9jYWwiXSwiZXhwIjoxNzE4NTc5NDUxLCJpYXQiOjE2ODI1ODMwNTEsImlzcyI6Imh0dHBzOi8va3ViZXJuZXRlcy5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsIiwia3ViZXJuZXRlcy5pbyI6eyJuYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsInNlcnZpY2VhY2NvdW50Ijp7Im5hbWUiOiJ0b2FzdCIsInVpZCI6ImZkNDU2ZjA3LWJkMjAtNDhjZi1hZGE4LTk4ZjFkMTUwYjYwNyJ9fSwibmJmIjoxNjgyNTgzMDUxLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZS1zeXN0ZW06dG9hc3QifQ.v2M_KW7vE6boxq8TJcUHdRV6MzQjfVIA8Qx6TEAOnEASIJa0KpuCNt4Pz0_s54-pPBeBIaLfXUKvyMnl0sbm4qv9WI0TVQhCuJ2WNv_XZx0Sp7_Y_U2fLEWLLD-1nOtaDXF-o_s2t8tAkphYK9DP-nqSIK8L_GOhrAo6akb7DeIvRlEQj3PfhdbTAr6KOb_lVchCCnxyBM_DFjBn35U9YRiUkWFczaZHnKOhLztJhTSq3lTjzfVZ99dU04k9myNViER4HQMbl1D6xLMeK9Zryvrw0jiY_is-Sf0BapiMpuvZ81Mhxb4jSs5X3n2RuTNNNYTqlXgF4qVXuK68na0N1A"}))

(comment

  (k/active-ns client)
  ;; Namespace
  (k/get-namespace client "foobar")
  (k/create-namespace client "foobar")
  (k/delete-namespace client "foobar")

  ;; Endpoints

  (k/cluster-version client)
  (pprint (k/get-endpoints client "kubernetes"))

  ;; Jobs

  ;; Pods

  (->> (map #(get-in % [:metadata :name]) (k/list-pods client {:namespace "kube-system"}))
       pprint)

  )
