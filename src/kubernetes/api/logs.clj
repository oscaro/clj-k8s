(ns kubernetes.api.logs
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn log-file-handler-with-http-info
  ""
  [logpath ]
  (check-required-params logpath)
  (call-api "/logs/{logpath}" :get
            {:path-params   {"logpath" logpath }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["BearerToken"]}))

(defn log-file-handler
  ""
  [logpath ]
  (:data (log-file-handler-with-http-info logpath)))

(defn log-file-list-handler-with-http-info
  ""
  []
  (call-api "/logs/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       []
             :auth-names    ["BearerToken"]}))

(defn log-file-list-handler
  ""
  []
  (:data (log-file-list-handler-with-http-info)))

