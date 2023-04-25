(ns kubernetes.api.cloud-google-com-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  create a BackendConfig"
  ([namespace body ] (create-cloud-google-com-v1-namespaced-backend-config-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-cloud-google-com-v1-namespaced-backend-config
  "
  create a BackendConfig"
  ([namespace body ] (create-cloud-google-com-v1-namespaced-backend-config namespace body nil))
  ([namespace body optional-params]
   (:data (create-cloud-google-com-v1-namespaced-backend-config-with-http-info namespace body optional-params))))

(defn delete-cloud-google-com-v1-collection-namespaced-backend-config-with-http-info
  "
  delete collection of BackendConfig"
  ([namespace ] (delete-cloud-google-com-v1-collection-namespaced-backend-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-cloud-google-com-v1-collection-namespaced-backend-config
  "
  delete collection of BackendConfig"
  ([namespace ] (delete-cloud-google-com-v1-collection-namespaced-backend-config namespace nil))
  ([namespace optional-params]
   (:data (delete-cloud-google-com-v1-collection-namespaced-backend-config-with-http-info namespace optional-params))))

(defn delete-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  delete a BackendConfig"
  ([name namespace ] (delete-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-cloud-google-com-v1-namespaced-backend-config
  "
  delete a BackendConfig"
  ([name namespace ] (delete-cloud-google-com-v1-namespaced-backend-config name namespace nil))
  ([name namespace optional-params]
   (:data (delete-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace optional-params))))

(defn list-cloud-google-com-v1-backend-config-for-all-namespaces-with-http-info
  "
  list objects of kind BackendConfig"
  ([] (list-cloud-google-com-v1-backend-config-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/cloud.google.com/v1/backendconfigs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-cloud-google-com-v1-backend-config-for-all-namespaces
  "
  list objects of kind BackendConfig"
  ([] (list-cloud-google-com-v1-backend-config-for-all-namespaces nil))
  ([optional-params]
   (:data (list-cloud-google-com-v1-backend-config-for-all-namespaces-with-http-info optional-params))))

(defn list-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  list objects of kind BackendConfig"
  ([namespace ] (list-cloud-google-com-v1-namespaced-backend-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-cloud-google-com-v1-namespaced-backend-config
  "
  list objects of kind BackendConfig"
  ([namespace ] (list-cloud-google-com-v1-namespaced-backend-config namespace nil))
  ([namespace optional-params]
   (:data (list-cloud-google-com-v1-namespaced-backend-config-with-http-info namespace optional-params))))

(defn patch-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  partially update the specified BackendConfig"
  ([name namespace body ] (patch-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-cloud-google-com-v1-namespaced-backend-config
  "
  partially update the specified BackendConfig"
  ([name namespace body ] (patch-cloud-google-com-v1-namespaced-backend-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace body optional-params))))

(defn read-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  read the specified BackendConfig"
  ([name namespace ] (read-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-cloud-google-com-v1-namespaced-backend-config
  "
  read the specified BackendConfig"
  ([name namespace ] (read-cloud-google-com-v1-namespaced-backend-config name namespace nil))
  ([name namespace optional-params]
   (:data (read-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace optional-params))))

(defn replace-cloud-google-com-v1-namespaced-backend-config-with-http-info
  "
  replace the specified BackendConfig"
  ([name namespace body ] (replace-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/cloud.google.com/v1/namespaces/{namespace}/backendconfigs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-cloud-google-com-v1-namespaced-backend-config
  "
  replace the specified BackendConfig"
  ([name namespace body ] (replace-cloud-google-com-v1-namespaced-backend-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-cloud-google-com-v1-namespaced-backend-config-with-http-info name namespace body optional-params))))

