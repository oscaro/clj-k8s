(ns user
  (:require [clojure.pprint :refer :all]
            [clojure.repl :refer :all]
            [clojure.tools.namespace.repl :refer :all]
            [clj-k8s.api :as k]))

(def client
  (k/mk-client {:base-url "https://192.168.49.2:8443"
                :token "eyJhbGciOiJSUzI1NiIsImtpZCI6IjZFbXRZUE9NNEVEbXdKcVhTekhhX19KOGpVX3RLR0owZXhmVUtJdlo1d0UifQ.eyJhdWQiOlsiaHR0cHM6Ly9rdWJlcm5ldGVzLmRlZmF1bHQuc3ZjLmNsdXN0ZXIubG9jYWwiXSwiZXhwIjoxNjgyNTMxNjAwLCJpYXQiOjE2ODI1MjgwMDAsImlzcyI6Imh0dHBzOi8va3ViZXJuZXRlcy5kZWZhdWx0LnN2Yy5jbHVzdGVyLmxvY2FsIiwia3ViZXJuZXRlcy5pbyI6eyJuYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsInNlcnZpY2VhY2NvdW50Ijp7Im5hbWUiOiJ0b2FzdCIsInVpZCI6ImZkNDU2ZjA3LWJkMjAtNDhjZi1hZGE4LTk4ZjFkMTUwYjYwNyJ9fSwibmJmIjoxNjgyNTI4MDAwLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZS1zeXN0ZW06dG9hc3QifQ.ZbIXAT7MjpKpPOAph4fr--GtBpARDhlO8NpXk9fJCNtjm_biBpGP2UEOQe9dKhH5n8Dd3A2ozk2sv1zBvT-PaAcJTRQelDBnLuKN7bYh6biDO78u0xyqcq78LhD3YAJj2rFUo_KAU0cciHyDokGa2OjxlqP2ptFCutoVqdcr227xqrqx0Ep-Sw4SUujWd7azDByAVSkjb4J06mFi4MOv_sFDwBsjkj_c0roOoqcxFiDxPQySr8npD6cTRnQUPGKkKUN1eAnaulAHpM5JMoowHBtKlnL4xEKqJA64RX9-gw3M3tuuWsO4-yaUu69cGJlfAgE-OZA51Z6zSuEMiqhSCg"}))

(comment

  (k/active-ns client)
  ;; Namespace
  (k/get-namespace client "foobar")
  (k/create-namespace client "foobar")
  (k/delete-namespace client "foobar")

  ;; Endpoints

  (pprint (k/get-endpoints client "kubernetes"))
  (k/get-job client "foo" {:namespace "foo"})
  )
