(ns user
  (:require [clojure.pprint :refer :all]
            [clojure.repl :refer :all]
            [clojure.tools.namespace.repl :refer :all]
            [clj-k8s.api :as k]))

(def client
  (k/mk-client {:base-url "https://192.168.49.2:8443"
                :token "eyJhbGciOiJSUzI1NiIsImtpZCI6IjZFbXRZUE9NNEVEbXdKcVhTekhhX19KOGpVX3RLR0owZXhmVUtJdlo1d0UifQ.eyJhdWQiOlsiaHR0cHM6Ly9rdWJlcm5ldGVzLmRlZmF1bHQuc3ZjLmNsdXN0ZXIubG9jYWwiXSwiZXhwIjoxNjgyNTM2MDU2LCJpYXQiOjE2ODI1MzI0NTYsImlzcyI6Imh0dHBzOi8va3ViZXJuZXRlcy5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsIiwia3ViZXJuZXRlcy5pbyI6eyJuYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsInNlcnZpY2VhY2NvdW50Ijp7Im5hbWUiOiJ0b2FzdCIsInVpZCI6ImZkNDU2ZjA3LWJkMjAtNDhjZi1hZGE4LTk4ZjFkMTUwYjYwNyJ9fSwibmJmIjoxNjgyNTMyNDU2LCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZS1zeXN0ZW06dG9hc3QifQ.YXRZIUIVVM_TgqP4lhygmzkLTHtpIY-C6SljXtqQlH2xg9JmZfr0gnReUiACYGzKGYfOBlM3nVzAS5v4yBSHLJ9wNLzPOQ45biVax5w2_XytUxcH3aNoiCueKyU4SrMGwW6z1n7sVNf6yQPvwt2Qh6JpWdQrt6x__Ve4fUiY0DU59_xc2UxtPMtv9nVOdMJiF-ssiFrTj2q2hB_NEoPdnpvOgHO0bJmvWBVWJJtYqtW8dn57dITh-LsF92jVYqStoLz-KtByuFtMRwH4s_hZcHkXAVVs5VXQdo4dco_vzIGdMx8ngGgB6plYaqGj0uCiTNW3rHlfixtyXwj-bpZXqg"}))

(comment

  (k/active-ns client)
  ;; Namespace
  (k/get-namespace client "foobar")
  (k/create-namespace client "foobar")
  (k/delete-namespace client "foobar")

  ;; Endpoints

  (pprint (k/get-endpoints client "kubernetes"))

  ;; Jobs

  ;; Pods

   (count (k/list-pods client {:namespace "kube-system"}))
  )
