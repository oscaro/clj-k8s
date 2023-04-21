(ns kubernetes.api.apis
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-api-versions-with-http-info
  "
  get available API versions"
  []
  (call-api "/apis/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-api-versions
  "
  get available API versions"
  []
  (:data (get-api-versions-with-http-info)))

