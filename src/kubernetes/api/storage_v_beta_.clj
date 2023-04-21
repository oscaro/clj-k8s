(ns kubernetes.api.storage-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-storage-v1beta1-storage-class-with-http-info
  "
  create a StorageClass"
  ([body ] (create-storage-v1beta1-storage-class-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1beta1-storage-class
  "
  create a StorageClass"
  ([body ] (create-storage-v1beta1-storage-class body nil))
  ([body optional-params]
   (:data (create-storage-v1beta1-storage-class-with-http-info body optional-params))))

(defn create-storage-v1beta1-volume-attachment-with-http-info
  "
  create a VolumeAttachment"
  ([body ] (create-storage-v1beta1-volume-attachment-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1beta1-volume-attachment
  "
  create a VolumeAttachment"
  ([body ] (create-storage-v1beta1-volume-attachment body nil))
  ([body optional-params]
   (:data (create-storage-v1beta1-volume-attachment-with-http-info body optional-params))))

(defn delete-storage-v1beta1-collection-storage-class-with-http-info
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1beta1-collection-storage-class-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-collection-storage-class
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1beta1-collection-storage-class nil))
  ([optional-params]
   (:data (delete-storage-v1beta1-collection-storage-class-with-http-info optional-params))))

(defn delete-storage-v1beta1-collection-volume-attachment-with-http-info
  "
  delete collection of VolumeAttachment"
  ([] (delete-storage-v1beta1-collection-volume-attachment-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-collection-volume-attachment
  "
  delete collection of VolumeAttachment"
  ([] (delete-storage-v1beta1-collection-volume-attachment nil))
  ([optional-params]
   (:data (delete-storage-v1beta1-collection-volume-attachment-with-http-info optional-params))))

(defn delete-storage-v1beta1-storage-class-with-http-info
  "
  delete a StorageClass"
  ([name ] (delete-storage-v1beta1-storage-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-storage-class
  "
  delete a StorageClass"
  ([name ] (delete-storage-v1beta1-storage-class name nil))
  ([name optional-params]
   (:data (delete-storage-v1beta1-storage-class-with-http-info name optional-params))))

(defn delete-storage-v1beta1-volume-attachment-with-http-info
  "
  delete a VolumeAttachment"
  ([name ] (delete-storage-v1beta1-volume-attachment-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1beta1-volume-attachment
  "
  delete a VolumeAttachment"
  ([name ] (delete-storage-v1beta1-volume-attachment name nil))
  ([name optional-params]
   (:data (delete-storage-v1beta1-volume-attachment-with-http-info name optional-params))))

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

(defn list-storage-v1beta1-storage-class-with-http-info
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1beta1-storage-class-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1beta1-storage-class
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1beta1-storage-class nil))
  ([optional-params]
   (:data (list-storage-v1beta1-storage-class-with-http-info optional-params))))

(defn list-storage-v1beta1-volume-attachment-with-http-info
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-storage-v1beta1-volume-attachment-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1beta1-volume-attachment
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-storage-v1beta1-volume-attachment nil))
  ([optional-params]
   (:data (list-storage-v1beta1-volume-attachment-with-http-info optional-params))))

(defn patch-storage-v1beta1-storage-class-with-http-info
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1beta1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1beta1-storage-class
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1beta1-storage-class name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1beta1-storage-class-with-http-info name body optional-params))))

(defn patch-storage-v1beta1-volume-attachment-with-http-info
  "
  partially update the specified VolumeAttachment"
  ([name body ] (patch-storage-v1beta1-volume-attachment-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1beta1-volume-attachment
  "
  partially update the specified VolumeAttachment"
  ([name body ] (patch-storage-v1beta1-volume-attachment name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1beta1-volume-attachment-with-http-info name body optional-params))))

(defn read-storage-v1beta1-storage-class-with-http-info
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1beta1-storage-class-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1beta1-storage-class
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1beta1-storage-class name nil))
  ([name optional-params]
   (:data (read-storage-v1beta1-storage-class-with-http-info name optional-params))))

(defn read-storage-v1beta1-volume-attachment-with-http-info
  "
  read the specified VolumeAttachment"
  ([name ] (read-storage-v1beta1-volume-attachment-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1beta1-volume-attachment
  "
  read the specified VolumeAttachment"
  ([name ] (read-storage-v1beta1-volume-attachment name nil))
  ([name optional-params]
   (:data (read-storage-v1beta1-volume-attachment-with-http-info name optional-params))))

(defn replace-storage-v1beta1-storage-class-with-http-info
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1beta1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1beta1-storage-class
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1beta1-storage-class name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1beta1-storage-class-with-http-info name body optional-params))))

(defn replace-storage-v1beta1-volume-attachment-with-http-info
  "
  replace the specified VolumeAttachment"
  ([name body ] (replace-storage-v1beta1-volume-attachment-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/volumeattachments/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1beta1-volume-attachment
  "
  replace the specified VolumeAttachment"
  ([name body ] (replace-storage-v1beta1-volume-attachment name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1beta1-volume-attachment-with-http-info name body optional-params))))

(defn watch-storage-v1beta1-storage-class-with-http-info
  "
  watch changes to an object of kind StorageClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1beta1-storage-class-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/watch/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-storage-class
  "
  watch changes to an object of kind StorageClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1beta1-storage-class name nil))
  ([name optional-params]
   (:data (watch-storage-v1beta1-storage-class-with-http-info name optional-params))))

(defn watch-storage-v1beta1-storage-class-list-with-http-info
  "
  watch individual changes to a list of StorageClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-storage-class-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-storage-class-list
  "
  watch individual changes to a list of StorageClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-storage-class-list nil))
  ([optional-params]
   (:data (watch-storage-v1beta1-storage-class-list-with-http-info optional-params))))

(defn watch-storage-v1beta1-volume-attachment-with-http-info
  "
  watch changes to an object of kind VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1beta1-volume-attachment-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/watch/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-volume-attachment
  "
  watch changes to an object of kind VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1beta1-volume-attachment name nil))
  ([name optional-params]
   (:data (watch-storage-v1beta1-volume-attachment-with-http-info name optional-params))))

(defn watch-storage-v1beta1-volume-attachment-list-with-http-info
  "
  watch individual changes to a list of VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-volume-attachment-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1beta1-volume-attachment-list
  "
  watch individual changes to a list of VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1beta1-volume-attachment-list nil))
  ([optional-params]
   (:data (watch-storage-v1beta1-volume-attachment-list-with-http-info optional-params))))

