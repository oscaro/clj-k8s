(ns kubernetes.api.apps
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-apps-api-group-with-http-info
  "
  get information of a group"
  []
  (call-api "/apis/apps/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-apps-api-group
  "
  get information of a group"
  []
  (:data (get-apps-api-group-with-http-info)))

