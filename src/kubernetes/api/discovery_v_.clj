(ns kubernetes.api.discovery-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  create an EndpointSlice"
  ([namespace body ] (create-discovery-v1-namespaced-endpoint-slice-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-discovery-v1-namespaced-endpoint-slice
  "
  create an EndpointSlice"
  ([namespace body ] (create-discovery-v1-namespaced-endpoint-slice namespace body nil))
  ([namespace body optional-params]
   (:data (create-discovery-v1-namespaced-endpoint-slice-with-http-info namespace body optional-params))))

(defn delete-discovery-v1-collection-namespaced-endpoint-slice-with-http-info
  "
  delete collection of EndpointSlice"
  ([namespace ] (delete-discovery-v1-collection-namespaced-endpoint-slice-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match timeout-seconds ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-discovery-v1-collection-namespaced-endpoint-slice
  "
  delete collection of EndpointSlice"
  ([namespace ] (delete-discovery-v1-collection-namespaced-endpoint-slice namespace nil))
  ([namespace optional-params]
   (:data (delete-discovery-v1-collection-namespaced-endpoint-slice-with-http-info namespace optional-params))))

(defn delete-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  delete an EndpointSlice"
  ([name namespace ] (delete-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-discovery-v1-namespaced-endpoint-slice
  "
  delete an EndpointSlice"
  ([name namespace ] (delete-discovery-v1-namespaced-endpoint-slice name namespace nil))
  ([name namespace optional-params]
   (:data (delete-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace optional-params))))

(defn get-discovery-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/discovery.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-discovery-v1-api-resources
  "
  get available resources"
  []
  (:data (get-discovery-v1-api-resources-with-http-info)))

(defn list-discovery-v1-endpoint-slice-for-all-namespaces-with-http-info
  "
  list or watch objects of kind EndpointSlice"
  ([] (list-discovery-v1-endpoint-slice-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/discovery.k8s.io/v1/endpointslices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-discovery-v1-endpoint-slice-for-all-namespaces
  "
  list or watch objects of kind EndpointSlice"
  ([] (list-discovery-v1-endpoint-slice-for-all-namespaces nil))
  ([optional-params]
   (:data (list-discovery-v1-endpoint-slice-for-all-namespaces-with-http-info optional-params))))

(defn list-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  list or watch objects of kind EndpointSlice"
  ([namespace ] (list-discovery-v1-namespaced-endpoint-slice-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-discovery-v1-namespaced-endpoint-slice
  "
  list or watch objects of kind EndpointSlice"
  ([namespace ] (list-discovery-v1-namespaced-endpoint-slice namespace nil))
  ([namespace optional-params]
   (:data (list-discovery-v1-namespaced-endpoint-slice-with-http-info namespace optional-params))))

(defn patch-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  partially update the specified EndpointSlice"
  ([name namespace body ] (patch-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-discovery-v1-namespaced-endpoint-slice
  "
  partially update the specified EndpointSlice"
  ([name namespace body ] (patch-discovery-v1-namespaced-endpoint-slice name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace body optional-params))))

(defn read-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  read the specified EndpointSlice"
  ([name namespace ] (read-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-discovery-v1-namespaced-endpoint-slice
  "
  read the specified EndpointSlice"
  ([name namespace ] (read-discovery-v1-namespaced-endpoint-slice name namespace nil))
  ([name namespace optional-params]
   (:data (read-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace optional-params))))

(defn replace-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  replace the specified EndpointSlice"
  ([name namespace body ] (replace-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/discovery.k8s.io/v1/namespaces/{namespace}/endpointslices/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-discovery-v1-namespaced-endpoint-slice
  "
  replace the specified EndpointSlice"
  ([name namespace body ] (replace-discovery-v1-namespaced-endpoint-slice name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace body optional-params))))

(defn watch-discovery-v1-endpoint-slice-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-discovery-v1-endpoint-slice-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/discovery.k8s.io/v1/watch/endpointslices" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-discovery-v1-endpoint-slice-list-for-all-namespaces
  "
  watch individual changes to a list of EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-discovery-v1-endpoint-slice-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-discovery-v1-endpoint-slice-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-discovery-v1-namespaced-endpoint-slice-with-http-info
  "
  watch changes to an object of kind EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/discovery.k8s.io/v1/watch/namespaces/{namespace}/endpointslices/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-discovery-v1-namespaced-endpoint-slice
  "
  watch changes to an object of kind EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-discovery-v1-namespaced-endpoint-slice name namespace nil))
  ([name namespace optional-params]
   (:data (watch-discovery-v1-namespaced-endpoint-slice-with-http-info name namespace optional-params))))

(defn watch-discovery-v1-namespaced-endpoint-slice-list-with-http-info
  "
  watch individual changes to a list of EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-discovery-v1-namespaced-endpoint-slice-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/discovery.k8s.io/v1/watch/namespaces/{namespace}/endpointslices" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-discovery-v1-namespaced-endpoint-slice-list
  "
  watch individual changes to a list of EndpointSlice. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-discovery-v1-namespaced-endpoint-slice-list namespace nil))
  ([namespace optional-params]
   (:data (watch-discovery-v1-namespaced-endpoint-slice-list-with-http-info namespace optional-params))))

