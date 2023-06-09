(ns kubernetes.api.storage-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  create a CSIStorageCapacity"
  ([namespace body ] (create-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1beta1-namespaced-csi-storage-capacity
  "
  create a CSIStorageCapacity"
  ([namespace body ] (create-storage-v1beta1-namespaced-csi-storage-capacity namespace body nil))
  ([namespace body optional-params]
   (:data (create-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info namespace body optional-params))))

(defn delete-storage-v1beta1-collection-namespaced-csi-storage-capacity-with-http-info
  "
  delete collection of CSIStorageCapacity"
  ([namespace ] (delete-storage-v1beta1-collection-namespaced-csi-storage-capacity-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-collection-namespaced-csi-storage-capacity
  "
  delete collection of CSIStorageCapacity"
  ([namespace ] (delete-storage-v1beta1-collection-namespaced-csi-storage-capacity namespace nil))
  ([namespace optional-params]
   (:data (delete-storage-v1beta1-collection-namespaced-csi-storage-capacity-with-http-info namespace optional-params))))

(defn delete-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  delete a CSIStorageCapacity"
  ([name namespace ] (delete-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-namespaced-csi-storage-capacity
  "
  delete a CSIStorageCapacity"
  ([name namespace ] (delete-storage-v1beta1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (delete-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn get-storage-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/storage.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-storage-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-storage-v1beta1-api-resources-with-http-info)))

(defn list-storage-v1beta1-csi-storage-capacity-for-all-namespaces-with-http-info
  "
  list or watch objects of kind CSIStorageCapacity"
  ([] (list-storage-v1beta1-csi-storage-capacity-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/csistoragecapacities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1beta1-csi-storage-capacity-for-all-namespaces
  "
  list or watch objects of kind CSIStorageCapacity"
  ([] (list-storage-v1beta1-csi-storage-capacity-for-all-namespaces nil))
  ([optional-params]
   (:data (list-storage-v1beta1-csi-storage-capacity-for-all-namespaces-with-http-info optional-params))))

(defn list-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  list or watch objects of kind CSIStorageCapacity"
  ([namespace ] (list-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1beta1-namespaced-csi-storage-capacity
  "
  list or watch objects of kind CSIStorageCapacity"
  ([namespace ] (list-storage-v1beta1-namespaced-csi-storage-capacity namespace nil))
  ([namespace optional-params]
   (:data (list-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info namespace optional-params))))

(defn patch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  partially update the specified CSIStorageCapacity"
  ([name namespace body ] (patch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1beta1-namespaced-csi-storage-capacity
  "
  partially update the specified CSIStorageCapacity"
  ([name namespace body ] (patch-storage-v1beta1-namespaced-csi-storage-capacity name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace body optional-params))))

(defn read-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  read the specified CSIStorageCapacity"
  ([name namespace ] (read-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1beta1-namespaced-csi-storage-capacity
  "
  read the specified CSIStorageCapacity"
  ([name namespace ] (read-storage-v1beta1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (read-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn replace-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  replace the specified CSIStorageCapacity"
  ([name namespace body ] (replace-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/namespaces/{namespace}/csistoragecapacities/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1beta1-namespaced-csi-storage-capacity
  "
  replace the specified CSIStorageCapacity"
  ([name namespace body ] (replace-storage-v1beta1-namespaced-csi-storage-capacity name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace body optional-params))))

(defn watch-storage-v1beta1-csi-storage-capacity-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-csi-storage-capacity-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/csistoragecapacities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-csi-storage-capacity-list-for-all-namespaces
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-csi-storage-capacity-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-storage-v1beta1-csi-storage-capacity-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info
  "
  watch changes to an object of kind CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/namespaces/{namespace}/csistoragecapacities/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-namespaced-csi-storage-capacity
  "
  watch changes to an object of kind CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-storage-v1beta1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (watch-storage-v1beta1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn watch-storage-v1beta1-namespaced-csi-storage-capacity-list-with-http-info
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-storage-v1beta1-namespaced-csi-storage-capacity-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/namespaces/{namespace}/csistoragecapacities" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-namespaced-csi-storage-capacity-list
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-storage-v1beta1-namespaced-csi-storage-capacity-list namespace nil))
  ([namespace optional-params]
   (:data (watch-storage-v1beta1-namespaced-csi-storage-capacity-list-with-http-info namespace optional-params))))

