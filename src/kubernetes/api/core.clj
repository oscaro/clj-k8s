(ns kubernetes.api.core
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-core-api-versions-with-http-info
  "
  get available API versions"
  []
  (call-api "/api/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-core-api-versions
  "
  get available API versions"
  []
  (:data (get-core-api-versions-with-http-info)))

