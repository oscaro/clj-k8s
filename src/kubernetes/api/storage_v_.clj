(ns kubernetes.api.storage-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-storage-v1-csi-driver-with-http-info
  "
  create a CSIDriver"
  ([body ] (create-storage-v1-csi-driver-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1-csi-driver
  "
  create a CSIDriver"
  ([body ] (create-storage-v1-csi-driver body nil))
  ([body optional-params]
   (:data (create-storage-v1-csi-driver-with-http-info body optional-params))))

(defn create-storage-v1-csi-node-with-http-info
  "
  create a CSINode"
  ([body ] (create-storage-v1-csi-node-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1-csi-node
  "
  create a CSINode"
  ([body ] (create-storage-v1-csi-node body nil))
  ([body optional-params]
   (:data (create-storage-v1-csi-node-with-http-info body optional-params))))

(defn create-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  create a CSIStorageCapacity"
  ([namespace body ] (create-storage-v1-namespaced-csi-storage-capacity-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1-namespaced-csi-storage-capacity
  "
  create a CSIStorageCapacity"
  ([namespace body ] (create-storage-v1-namespaced-csi-storage-capacity namespace body nil))
  ([namespace body optional-params]
   (:data (create-storage-v1-namespaced-csi-storage-capacity-with-http-info namespace body optional-params))))

(defn create-storage-v1-storage-class-with-http-info
  "
  create a StorageClass"
  ([body ] (create-storage-v1-storage-class-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1-storage-class
  "
  create a StorageClass"
  ([body ] (create-storage-v1-storage-class body nil))
  ([body optional-params]
   (:data (create-storage-v1-storage-class-with-http-info body optional-params))))

(defn create-storage-v1-volume-attachment-with-http-info
  "
  create a VolumeAttachment"
  ([body ] (create-storage-v1-volume-attachment-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-storage-v1-volume-attachment
  "
  create a VolumeAttachment"
  ([body ] (create-storage-v1-volume-attachment body nil))
  ([body optional-params]
   (:data (create-storage-v1-volume-attachment-with-http-info body optional-params))))

(defn delete-storage-v1-collection-csi-driver-with-http-info
  "
  delete collection of CSIDriver"
  ([] (delete-storage-v1-collection-csi-driver-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-collection-csi-driver
  "
  delete collection of CSIDriver"
  ([] (delete-storage-v1-collection-csi-driver nil))
  ([optional-params]
   (:data (delete-storage-v1-collection-csi-driver-with-http-info optional-params))))

(defn delete-storage-v1-collection-csi-node-with-http-info
  "
  delete collection of CSINode"
  ([] (delete-storage-v1-collection-csi-node-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-collection-csi-node
  "
  delete collection of CSINode"
  ([] (delete-storage-v1-collection-csi-node nil))
  ([optional-params]
   (:data (delete-storage-v1-collection-csi-node-with-http-info optional-params))))

(defn delete-storage-v1-collection-namespaced-csi-storage-capacity-with-http-info
  "
  delete collection of CSIStorageCapacity"
  ([namespace ] (delete-storage-v1-collection-namespaced-csi-storage-capacity-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-collection-namespaced-csi-storage-capacity
  "
  delete collection of CSIStorageCapacity"
  ([namespace ] (delete-storage-v1-collection-namespaced-csi-storage-capacity namespace nil))
  ([namespace optional-params]
   (:data (delete-storage-v1-collection-namespaced-csi-storage-capacity-with-http-info namespace optional-params))))

(defn delete-storage-v1-collection-storage-class-with-http-info
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1-collection-storage-class-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-collection-storage-class
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1-collection-storage-class nil))
  ([optional-params]
   (:data (delete-storage-v1-collection-storage-class-with-http-info optional-params))))

(defn delete-storage-v1-collection-volume-attachment-with-http-info
  "
  delete collection of VolumeAttachment"
  ([] (delete-storage-v1-collection-volume-attachment-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-collection-volume-attachment
  "
  delete collection of VolumeAttachment"
  ([] (delete-storage-v1-collection-volume-attachment nil))
  ([optional-params]
   (:data (delete-storage-v1-collection-volume-attachment-with-http-info optional-params))))

(defn delete-storage-v1-csi-driver-with-http-info
  "
  delete a CSIDriver"
  ([name ] (delete-storage-v1-csi-driver-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-csi-driver
  "
  delete a CSIDriver"
  ([name ] (delete-storage-v1-csi-driver name nil))
  ([name optional-params]
   (:data (delete-storage-v1-csi-driver-with-http-info name optional-params))))

(defn delete-storage-v1-csi-node-with-http-info
  "
  delete a CSINode"
  ([name ] (delete-storage-v1-csi-node-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-csi-node
  "
  delete a CSINode"
  ([name ] (delete-storage-v1-csi-node name nil))
  ([name optional-params]
   (:data (delete-storage-v1-csi-node-with-http-info name optional-params))))

(defn delete-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  delete a CSIStorageCapacity"
  ([name namespace ] (delete-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-namespaced-csi-storage-capacity
  "
  delete a CSIStorageCapacity"
  ([name namespace ] (delete-storage-v1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (delete-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn delete-storage-v1-storage-class-with-http-info
  "
  delete a StorageClass"
  ([name ] (delete-storage-v1-storage-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-storage-class
  "
  delete a StorageClass"
  ([name ] (delete-storage-v1-storage-class name nil))
  ([name optional-params]
   (:data (delete-storage-v1-storage-class-with-http-info name optional-params))))

(defn delete-storage-v1-volume-attachment-with-http-info
  "
  delete a VolumeAttachment"
  ([name ] (delete-storage-v1-volume-attachment-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-storage-v1-volume-attachment
  "
  delete a VolumeAttachment"
  ([name ] (delete-storage-v1-volume-attachment name nil))
  ([name optional-params]
   (:data (delete-storage-v1-volume-attachment-with-http-info name optional-params))))

(defn get-storage-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/storage.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-storage-v1-api-resources
  "
  get available resources"
  []
  (:data (get-storage-v1-api-resources-with-http-info)))

(defn list-storage-v1-csi-driver-with-http-info
  "
  list or watch objects of kind CSIDriver"
  ([] (list-storage-v1-csi-driver-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-csi-driver
  "
  list or watch objects of kind CSIDriver"
  ([] (list-storage-v1-csi-driver nil))
  ([optional-params]
   (:data (list-storage-v1-csi-driver-with-http-info optional-params))))

(defn list-storage-v1-csi-node-with-http-info
  "
  list or watch objects of kind CSINode"
  ([] (list-storage-v1-csi-node-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-csi-node
  "
  list or watch objects of kind CSINode"
  ([] (list-storage-v1-csi-node nil))
  ([optional-params]
   (:data (list-storage-v1-csi-node-with-http-info optional-params))))

(defn list-storage-v1-csi-storage-capacity-for-all-namespaces-with-http-info
  "
  list or watch objects of kind CSIStorageCapacity"
  ([] (list-storage-v1-csi-storage-capacity-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/csistoragecapacities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-csi-storage-capacity-for-all-namespaces
  "
  list or watch objects of kind CSIStorageCapacity"
  ([] (list-storage-v1-csi-storage-capacity-for-all-namespaces nil))
  ([optional-params]
   (:data (list-storage-v1-csi-storage-capacity-for-all-namespaces-with-http-info optional-params))))

(defn list-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  list or watch objects of kind CSIStorageCapacity"
  ([namespace ] (list-storage-v1-namespaced-csi-storage-capacity-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-namespaced-csi-storage-capacity
  "
  list or watch objects of kind CSIStorageCapacity"
  ([namespace ] (list-storage-v1-namespaced-csi-storage-capacity namespace nil))
  ([namespace optional-params]
   (:data (list-storage-v1-namespaced-csi-storage-capacity-with-http-info namespace optional-params))))

(defn list-storage-v1-storage-class-with-http-info
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1-storage-class-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-storage-class
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1-storage-class nil))
  ([optional-params]
   (:data (list-storage-v1-storage-class-with-http-info optional-params))))

(defn list-storage-v1-volume-attachment-with-http-info
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-storage-v1-volume-attachment-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-storage-v1-volume-attachment
  "
  list or watch objects of kind VolumeAttachment"
  ([] (list-storage-v1-volume-attachment nil))
  ([optional-params]
   (:data (list-storage-v1-volume-attachment-with-http-info optional-params))))

(defn patch-storage-v1-csi-driver-with-http-info
  "
  partially update the specified CSIDriver"
  ([name body ] (patch-storage-v1-csi-driver-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-csi-driver
  "
  partially update the specified CSIDriver"
  ([name body ] (patch-storage-v1-csi-driver name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1-csi-driver-with-http-info name body optional-params))))

(defn patch-storage-v1-csi-node-with-http-info
  "
  partially update the specified CSINode"
  ([name body ] (patch-storage-v1-csi-node-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-csi-node
  "
  partially update the specified CSINode"
  ([name body ] (patch-storage-v1-csi-node name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1-csi-node-with-http-info name body optional-params))))

(defn patch-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  partially update the specified CSIStorageCapacity"
  ([name namespace body ] (patch-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-namespaced-csi-storage-capacity
  "
  partially update the specified CSIStorageCapacity"
  ([name namespace body ] (patch-storage-v1-namespaced-csi-storage-capacity name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace body optional-params))))

(defn patch-storage-v1-storage-class-with-http-info
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-storage-class
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1-storage-class name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1-storage-class-with-http-info name body optional-params))))

(defn patch-storage-v1-volume-attachment-with-http-info
  "
  partially update the specified VolumeAttachment"
  ([name body ] (patch-storage-v1-volume-attachment-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-volume-attachment
  "
  partially update the specified VolumeAttachment"
  ([name body ] (patch-storage-v1-volume-attachment name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1-volume-attachment-with-http-info name body optional-params))))

(defn patch-storage-v1-volume-attachment-status-with-http-info
  "
  partially update status of the specified VolumeAttachment"
  ([name body ] (patch-storage-v1-volume-attachment-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-storage-v1-volume-attachment-status
  "
  partially update status of the specified VolumeAttachment"
  ([name body ] (patch-storage-v1-volume-attachment-status name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1-volume-attachment-status-with-http-info name body optional-params))))

(defn read-storage-v1-csi-driver-with-http-info
  "
  read the specified CSIDriver"
  ([name ] (read-storage-v1-csi-driver-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-csi-driver
  "
  read the specified CSIDriver"
  ([name ] (read-storage-v1-csi-driver name nil))
  ([name optional-params]
   (:data (read-storage-v1-csi-driver-with-http-info name optional-params))))

(defn read-storage-v1-csi-node-with-http-info
  "
  read the specified CSINode"
  ([name ] (read-storage-v1-csi-node-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-csi-node
  "
  read the specified CSINode"
  ([name ] (read-storage-v1-csi-node name nil))
  ([name optional-params]
   (:data (read-storage-v1-csi-node-with-http-info name optional-params))))

(defn read-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  read the specified CSIStorageCapacity"
  ([name namespace ] (read-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-namespaced-csi-storage-capacity
  "
  read the specified CSIStorageCapacity"
  ([name namespace ] (read-storage-v1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (read-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn read-storage-v1-storage-class-with-http-info
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1-storage-class-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-storage-class
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1-storage-class name nil))
  ([name optional-params]
   (:data (read-storage-v1-storage-class-with-http-info name optional-params))))

(defn read-storage-v1-volume-attachment-with-http-info
  "
  read the specified VolumeAttachment"
  ([name ] (read-storage-v1-volume-attachment-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-volume-attachment
  "
  read the specified VolumeAttachment"
  ([name ] (read-storage-v1-volume-attachment name nil))
  ([name optional-params]
   (:data (read-storage-v1-volume-attachment-with-http-info name optional-params))))

(defn read-storage-v1-volume-attachment-status-with-http-info
  "
  read status of the specified VolumeAttachment"
  ([name ] (read-storage-v1-volume-attachment-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-storage-v1-volume-attachment-status
  "
  read status of the specified VolumeAttachment"
  ([name ] (read-storage-v1-volume-attachment-status name nil))
  ([name optional-params]
   (:data (read-storage-v1-volume-attachment-status-with-http-info name optional-params))))

(defn replace-storage-v1-csi-driver-with-http-info
  "
  replace the specified CSIDriver"
  ([name body ] (replace-storage-v1-csi-driver-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/csidrivers/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-csi-driver
  "
  replace the specified CSIDriver"
  ([name body ] (replace-storage-v1-csi-driver name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1-csi-driver-with-http-info name body optional-params))))

(defn replace-storage-v1-csi-node-with-http-info
  "
  replace the specified CSINode"
  ([name body ] (replace-storage-v1-csi-node-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/csinodes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-csi-node
  "
  replace the specified CSINode"
  ([name body ] (replace-storage-v1-csi-node name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1-csi-node-with-http-info name body optional-params))))

(defn replace-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  replace the specified CSIStorageCapacity"
  ([name namespace body ] (replace-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/namespaces/{namespace}/csistoragecapacities/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-namespaced-csi-storage-capacity
  "
  replace the specified CSIStorageCapacity"
  ([name namespace body ] (replace-storage-v1-namespaced-csi-storage-capacity name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace body optional-params))))

(defn replace-storage-v1-storage-class-with-http-info
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/storageclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-storage-class
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1-storage-class name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1-storage-class-with-http-info name body optional-params))))

(defn replace-storage-v1-volume-attachment-with-http-info
  "
  replace the specified VolumeAttachment"
  ([name body ] (replace-storage-v1-volume-attachment-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-volume-attachment
  "
  replace the specified VolumeAttachment"
  ([name body ] (replace-storage-v1-volume-attachment name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1-volume-attachment-with-http-info name body optional-params))))

(defn replace-storage-v1-volume-attachment-status-with-http-info
  "
  replace status of the specified VolumeAttachment"
  ([name body ] (replace-storage-v1-volume-attachment-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/storage.k8s.io/v1/volumeattachments/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-storage-v1-volume-attachment-status
  "
  replace status of the specified VolumeAttachment"
  ([name body ] (replace-storage-v1-volume-attachment-status name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1-volume-attachment-status-with-http-info name body optional-params))))

(defn watch-storage-v1-csi-driver-with-http-info
  "
  watch changes to an object of kind CSIDriver. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-csi-driver-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/csidrivers/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-csi-driver
  "
  watch changes to an object of kind CSIDriver. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-csi-driver name nil))
  ([name optional-params]
   (:data (watch-storage-v1-csi-driver-with-http-info name optional-params))))

(defn watch-storage-v1-csi-driver-list-with-http-info
  "
  watch individual changes to a list of CSIDriver. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-driver-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/csidrivers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-csi-driver-list
  "
  watch individual changes to a list of CSIDriver. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-driver-list nil))
  ([optional-params]
   (:data (watch-storage-v1-csi-driver-list-with-http-info optional-params))))

(defn watch-storage-v1-csi-node-with-http-info
  "
  watch changes to an object of kind CSINode. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-csi-node-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/csinodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-csi-node
  "
  watch changes to an object of kind CSINode. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-csi-node name nil))
  ([name optional-params]
   (:data (watch-storage-v1-csi-node-with-http-info name optional-params))))

(defn watch-storage-v1-csi-node-list-with-http-info
  "
  watch individual changes to a list of CSINode. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-node-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/csinodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-csi-node-list
  "
  watch individual changes to a list of CSINode. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-node-list nil))
  ([optional-params]
   (:data (watch-storage-v1-csi-node-list-with-http-info optional-params))))

(defn watch-storage-v1-csi-storage-capacity-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-storage-capacity-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/csistoragecapacities" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-csi-storage-capacity-list-for-all-namespaces
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-csi-storage-capacity-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-storage-v1-csi-storage-capacity-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-storage-v1-namespaced-csi-storage-capacity-with-http-info
  "
  watch changes to an object of kind CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/namespaces/{namespace}/csistoragecapacities/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-namespaced-csi-storage-capacity
  "
  watch changes to an object of kind CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-storage-v1-namespaced-csi-storage-capacity name namespace nil))
  ([name namespace optional-params]
   (:data (watch-storage-v1-namespaced-csi-storage-capacity-with-http-info name namespace optional-params))))

(defn watch-storage-v1-namespaced-csi-storage-capacity-list-with-http-info
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-storage-v1-namespaced-csi-storage-capacity-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/namespaces/{namespace}/csistoragecapacities" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-namespaced-csi-storage-capacity-list
  "
  watch individual changes to a list of CSIStorageCapacity. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-storage-v1-namespaced-csi-storage-capacity-list namespace nil))
  ([namespace optional-params]
   (:data (watch-storage-v1-namespaced-csi-storage-capacity-list-with-http-info namespace optional-params))))

(defn watch-storage-v1-storage-class-with-http-info
  "
  watch changes to an object of kind StorageClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-storage-class-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-storage-class
  "
  watch changes to an object of kind StorageClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-storage-class name nil))
  ([name optional-params]
   (:data (watch-storage-v1-storage-class-with-http-info name optional-params))))

(defn watch-storage-v1-storage-class-list-with-http-info
  "
  watch individual changes to a list of StorageClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-storage-class-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-storage-class-list
  "
  watch individual changes to a list of StorageClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-storage-class-list nil))
  ([optional-params]
   (:data (watch-storage-v1-storage-class-list-with-http-info optional-params))))

(defn watch-storage-v1-volume-attachment-with-http-info
  "
  watch changes to an object of kind VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-volume-attachment-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/volumeattachments/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-volume-attachment
  "
  watch changes to an object of kind VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-storage-v1-volume-attachment name nil))
  ([name optional-params]
   (:data (watch-storage-v1-volume-attachment-with-http-info name optional-params))))

(defn watch-storage-v1-volume-attachment-list-with-http-info
  "
  watch individual changes to a list of VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-volume-attachment-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1/watch/volumeattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-storage-v1-volume-attachment-list
  "
  watch individual changes to a list of VolumeAttachment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-storage-v1-volume-attachment-list nil))
  ([optional-params]
   (:data (watch-storage-v1-volume-attachment-list-with-http-info optional-params))))

