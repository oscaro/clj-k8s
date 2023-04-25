(ns kubernetes.api.apiregistration-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-apiregistration-v1-api-service-with-http-info
  "
  create an APIService"
  ([body ] (create-apiregistration-v1-api-service-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apiregistration-v1-api-service
  "
  create an APIService"
  ([body ] (create-apiregistration-v1-api-service body nil))
  ([body optional-params]
   (:data (create-apiregistration-v1-api-service-with-http-info body optional-params))))

(defn delete-apiregistration-v1-api-service-with-http-info
  "
  delete an APIService"
  ([name ] (delete-apiregistration-v1-api-service-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apiregistration-v1-api-service
  "
  delete an APIService"
  ([name ] (delete-apiregistration-v1-api-service name nil))
  ([name optional-params]
   (:data (delete-apiregistration-v1-api-service-with-http-info name optional-params))))

(defn delete-apiregistration-v1-collection-api-service-with-http-info
  "
  delete collection of APIService"
  ([] (delete-apiregistration-v1-collection-api-service-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match timeout-seconds ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apiregistration-v1-collection-api-service
  "
  delete collection of APIService"
  ([] (delete-apiregistration-v1-collection-api-service nil))
  ([optional-params]
   (:data (delete-apiregistration-v1-collection-api-service-with-http-info optional-params))))

(defn get-apiregistration-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/apiregistration.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-apiregistration-v1-api-resources
  "
  get available resources"
  []
  (:data (get-apiregistration-v1-api-resources-with-http-info)))

(defn list-apiregistration-v1-api-service-with-http-info
  "
  list or watch objects of kind APIService"
  ([] (list-apiregistration-v1-api-service-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apiregistration-v1-api-service
  "
  list or watch objects of kind APIService"
  ([] (list-apiregistration-v1-api-service nil))
  ([optional-params]
   (:data (list-apiregistration-v1-api-service-with-http-info optional-params))))

(defn patch-apiregistration-v1-api-service-with-http-info
  "
  partially update the specified APIService"
  ([name body ] (patch-apiregistration-v1-api-service-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apiregistration-v1-api-service
  "
  partially update the specified APIService"
  ([name body ] (patch-apiregistration-v1-api-service name body nil))
  ([name body optional-params]
   (:data (patch-apiregistration-v1-api-service-with-http-info name body optional-params))))

(defn patch-apiregistration-v1-api-service-status-with-http-info
  "
  partially update status of the specified APIService"
  ([name body ] (patch-apiregistration-v1-api-service-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apiregistration-v1-api-service-status
  "
  partially update status of the specified APIService"
  ([name body ] (patch-apiregistration-v1-api-service-status name body nil))
  ([name body optional-params]
   (:data (patch-apiregistration-v1-api-service-status-with-http-info name body optional-params))))

(defn read-apiregistration-v1-api-service-with-http-info
  "
  read the specified APIService"
  ([name ] (read-apiregistration-v1-api-service-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apiregistration-v1-api-service
  "
  read the specified APIService"
  ([name ] (read-apiregistration-v1-api-service name nil))
  ([name optional-params]
   (:data (read-apiregistration-v1-api-service-with-http-info name optional-params))))

(defn read-apiregistration-v1-api-service-status-with-http-info
  "
  read status of the specified APIService"
  ([name ] (read-apiregistration-v1-api-service-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apiregistration-v1-api-service-status
  "
  read status of the specified APIService"
  ([name ] (read-apiregistration-v1-api-service-status name nil))
  ([name optional-params]
   (:data (read-apiregistration-v1-api-service-status-with-http-info name optional-params))))

(defn replace-apiregistration-v1-api-service-with-http-info
  "
  replace the specified APIService"
  ([name body ] (replace-apiregistration-v1-api-service-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apiregistration-v1-api-service
  "
  replace the specified APIService"
  ([name body ] (replace-apiregistration-v1-api-service name body nil))
  ([name body optional-params]
   (:data (replace-apiregistration-v1-api-service-with-http-info name body optional-params))))

(defn replace-apiregistration-v1-api-service-status-with-http-info
  "
  replace status of the specified APIService"
  ([name body ] (replace-apiregistration-v1-api-service-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/apiservices/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apiregistration-v1-api-service-status
  "
  replace status of the specified APIService"
  ([name body ] (replace-apiregistration-v1-api-service-status name body nil))
  ([name body optional-params]
   (:data (replace-apiregistration-v1-api-service-status-with-http-info name body optional-params))))

(defn watch-apiregistration-v1-api-service-with-http-info
  "
  watch changes to an object of kind APIService. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-apiregistration-v1-api-service-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/watch/apiservices/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apiregistration-v1-api-service
  "
  watch changes to an object of kind APIService. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-apiregistration-v1-api-service name nil))
  ([name optional-params]
   (:data (watch-apiregistration-v1-api-service-with-http-info name optional-params))))

(defn watch-apiregistration-v1-api-service-list-with-http-info
  "
  watch individual changes to a list of APIService. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apiregistration-v1-api-service-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/apiregistration.k8s.io/v1/watch/apiservices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apiregistration-v1-api-service-list
  "
  watch individual changes to a list of APIService. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apiregistration-v1-api-service-list nil))
  ([optional-params]
   (:data (watch-apiregistration-v1-api-service-list-with-http-info optional-params))))

