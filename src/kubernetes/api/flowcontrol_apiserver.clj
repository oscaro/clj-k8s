(ns kubernetes.api.flowcontrol-apiserver
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-flowcontrol-apiserver-api-group-with-http-info
  "
  get information of a group"
  []
  (call-api "/apis/flowcontrol.apiserver.k8s.io/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-flowcontrol-apiserver-api-group
  "
  get information of a group"
  []
  (:data (get-flowcontrol-apiserver-api-group-with-http-info)))

