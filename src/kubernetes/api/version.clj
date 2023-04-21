(ns kubernetes.api.version
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-code-version-with-http-info
  "
  get the code version"
  []
  (call-api "/version/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn get-code-version
  "
  get the code version"
  []
  (:data (get-code-version-with-http-info)))

