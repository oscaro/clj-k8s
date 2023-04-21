(ns kubernetes.api.policy
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-policy-api-group-with-http-info
  "
  get information of a group"
  []
  (call-api "/apis/policy/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-policy-api-group
  "
  get information of a group"
  []
  (:data (get-policy-api-group-with-http-info)))

