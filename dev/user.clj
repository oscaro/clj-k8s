(ns user
  (:require [clojure.pprint :refer [pprint]]
            [clojure.repl :refer [doc pst source]]
            [clojure.tools.namespace.repl :refer :all]
            [clj-k8s.auth :refer [from-gcp-kube-config]]
            [clj-k8s.core :as k]
            [clojure.string :as s]
            [clojure.walk :as w]
            [kubernetes.api.batch-v-beta- :as bb]
            [test-helper :refer [clean-response]]
            [yaml.core :as yaml]))
