(ns kubernetes.api.snapshot-storage-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  create a VolumeSnapshot"
  ([namespace body ] (create-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-snapshot-storage-v1-namespaced-volume-snapshot
  "
  create a VolumeSnapshot"
  ([namespace body ] (create-snapshot-storage-v1-namespaced-volume-snapshot namespace body nil))
  ([namespace body optional-params]
   (:data (create-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info namespace body optional-params))))

(defn create-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  create a VolumeSnapshotClass"
  ([body ] (create-snapshot-storage-v1-volume-snapshot-class-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-snapshot-storage-v1-volume-snapshot-class
  "
  create a VolumeSnapshotClass"
  ([body ] (create-snapshot-storage-v1-volume-snapshot-class body nil))
  ([body optional-params]
   (:data (create-snapshot-storage-v1-volume-snapshot-class-with-http-info body optional-params))))

(defn create-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  create a VolumeSnapshotContent"
  ([body ] (create-snapshot-storage-v1-volume-snapshot-content-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-snapshot-storage-v1-volume-snapshot-content
  "
  create a VolumeSnapshotContent"
  ([body ] (create-snapshot-storage-v1-volume-snapshot-content body nil))
  ([body optional-params]
   (:data (create-snapshot-storage-v1-volume-snapshot-content-with-http-info body optional-params))))

(defn delete-snapshot-storage-v1-collection-namespaced-volume-snapshot-with-http-info
  "
  delete collection of VolumeSnapshot"
  ([namespace ] (delete-snapshot-storage-v1-collection-namespaced-volume-snapshot-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-collection-namespaced-volume-snapshot
  "
  delete collection of VolumeSnapshot"
  ([namespace ] (delete-snapshot-storage-v1-collection-namespaced-volume-snapshot namespace nil))
  ([namespace optional-params]
   (:data (delete-snapshot-storage-v1-collection-namespaced-volume-snapshot-with-http-info namespace optional-params))))

(defn delete-snapshot-storage-v1-collection-volume-snapshot-class-with-http-info
  "
  delete collection of VolumeSnapshotClass"
  ([] (delete-snapshot-storage-v1-collection-volume-snapshot-class-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-collection-volume-snapshot-class
  "
  delete collection of VolumeSnapshotClass"
  ([] (delete-snapshot-storage-v1-collection-volume-snapshot-class nil))
  ([optional-params]
   (:data (delete-snapshot-storage-v1-collection-volume-snapshot-class-with-http-info optional-params))))

(defn delete-snapshot-storage-v1-collection-volume-snapshot-content-with-http-info
  "
  delete collection of VolumeSnapshotContent"
  ([] (delete-snapshot-storage-v1-collection-volume-snapshot-content-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-collection-volume-snapshot-content
  "
  delete collection of VolumeSnapshotContent"
  ([] (delete-snapshot-storage-v1-collection-volume-snapshot-content nil))
  ([optional-params]
   (:data (delete-snapshot-storage-v1-collection-volume-snapshot-content-with-http-info optional-params))))

(defn delete-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  delete a VolumeSnapshot"
  ([name namespace ] (delete-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-namespaced-volume-snapshot
  "
  delete a VolumeSnapshot"
  ([name namespace ] (delete-snapshot-storage-v1-namespaced-volume-snapshot name namespace nil))
  ([name namespace optional-params]
   (:data (delete-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace optional-params))))

(defn delete-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  delete a VolumeSnapshotClass"
  ([name ] (delete-snapshot-storage-v1-volume-snapshot-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-volume-snapshot-class
  "
  delete a VolumeSnapshotClass"
  ([name ] (delete-snapshot-storage-v1-volume-snapshot-class name nil))
  ([name optional-params]
   (:data (delete-snapshot-storage-v1-volume-snapshot-class-with-http-info name optional-params))))

(defn delete-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  delete a VolumeSnapshotContent"
  ([name ] (delete-snapshot-storage-v1-volume-snapshot-content-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-snapshot-storage-v1-volume-snapshot-content
  "
  delete a VolumeSnapshotContent"
  ([name ] (delete-snapshot-storage-v1-volume-snapshot-content name nil))
  ([name optional-params]
   (:data (delete-snapshot-storage-v1-volume-snapshot-content-with-http-info name optional-params))))

(defn list-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  list objects of kind VolumeSnapshot"
  ([namespace ] (list-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-snapshot-storage-v1-namespaced-volume-snapshot
  "
  list objects of kind VolumeSnapshot"
  ([namespace ] (list-snapshot-storage-v1-namespaced-volume-snapshot namespace nil))
  ([namespace optional-params]
   (:data (list-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info namespace optional-params))))

(defn list-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  list objects of kind VolumeSnapshotClass"
  ([] (list-snapshot-storage-v1-volume-snapshot-class-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-snapshot-storage-v1-volume-snapshot-class
  "
  list objects of kind VolumeSnapshotClass"
  ([] (list-snapshot-storage-v1-volume-snapshot-class nil))
  ([optional-params]
   (:data (list-snapshot-storage-v1-volume-snapshot-class-with-http-info optional-params))))

(defn list-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  list objects of kind VolumeSnapshotContent"
  ([] (list-snapshot-storage-v1-volume-snapshot-content-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-snapshot-storage-v1-volume-snapshot-content
  "
  list objects of kind VolumeSnapshotContent"
  ([] (list-snapshot-storage-v1-volume-snapshot-content nil))
  ([optional-params]
   (:data (list-snapshot-storage-v1-volume-snapshot-content-with-http-info optional-params))))

(defn list-snapshot-storage-v1-volume-snapshot-for-all-namespaces-with-http-info
  "
  list objects of kind VolumeSnapshot"
  ([] (list-snapshot-storage-v1-volume-snapshot-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshots" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-snapshot-storage-v1-volume-snapshot-for-all-namespaces
  "
  list objects of kind VolumeSnapshot"
  ([] (list-snapshot-storage-v1-volume-snapshot-for-all-namespaces nil))
  ([optional-params]
   (:data (list-snapshot-storage-v1-volume-snapshot-for-all-namespaces-with-http-info optional-params))))

(defn patch-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  partially update the specified VolumeSnapshot"
  ([name namespace body ] (patch-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-snapshot-storage-v1-namespaced-volume-snapshot
  "
  partially update the specified VolumeSnapshot"
  ([name namespace body ] (patch-snapshot-storage-v1-namespaced-volume-snapshot name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace body optional-params))))

(defn patch-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info
  "
  partially update status of the specified VolumeSnapshot"
  ([name namespace body ] (patch-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-snapshot-storage-v1-namespaced-volume-snapshot-status
  "
  partially update status of the specified VolumeSnapshot"
  ([name namespace body ] (patch-snapshot-storage-v1-namespaced-volume-snapshot-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace body optional-params))))

(defn patch-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  partially update the specified VolumeSnapshotClass"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-snapshot-storage-v1-volume-snapshot-class
  "
  partially update the specified VolumeSnapshotClass"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-class name body nil))
  ([name body optional-params]
   (:data (patch-snapshot-storage-v1-volume-snapshot-class-with-http-info name body optional-params))))

(defn patch-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  partially update the specified VolumeSnapshotContent"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-content-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-snapshot-storage-v1-volume-snapshot-content
  "
  partially update the specified VolumeSnapshotContent"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-content name body nil))
  ([name body optional-params]
   (:data (patch-snapshot-storage-v1-volume-snapshot-content-with-http-info name body optional-params))))

(defn patch-snapshot-storage-v1-volume-snapshot-content-status-with-http-info
  "
  partially update status of the specified VolumeSnapshotContent"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-snapshot-storage-v1-volume-snapshot-content-status
  "
  partially update status of the specified VolumeSnapshotContent"
  ([name body ] (patch-snapshot-storage-v1-volume-snapshot-content-status name body nil))
  ([name body optional-params]
   (:data (patch-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name body optional-params))))

(defn read-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  read the specified VolumeSnapshot"
  ([name namespace ] (read-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-snapshot-storage-v1-namespaced-volume-snapshot
  "
  read the specified VolumeSnapshot"
  ([name namespace ] (read-snapshot-storage-v1-namespaced-volume-snapshot name namespace nil))
  ([name namespace optional-params]
   (:data (read-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace optional-params))))

(defn read-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info
  "
  read status of the specified VolumeSnapshot"
  ([name namespace ] (read-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-snapshot-storage-v1-namespaced-volume-snapshot-status
  "
  read status of the specified VolumeSnapshot"
  ([name namespace ] (read-snapshot-storage-v1-namespaced-volume-snapshot-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace optional-params))))

(defn read-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  read the specified VolumeSnapshotClass"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-class-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-snapshot-storage-v1-volume-snapshot-class
  "
  read the specified VolumeSnapshotClass"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-class name nil))
  ([name optional-params]
   (:data (read-snapshot-storage-v1-volume-snapshot-class-with-http-info name optional-params))))

(defn read-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  read the specified VolumeSnapshotContent"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-content-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-snapshot-storage-v1-volume-snapshot-content
  "
  read the specified VolumeSnapshotContent"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-content name nil))
  ([name optional-params]
   (:data (read-snapshot-storage-v1-volume-snapshot-content-with-http-info name optional-params))))

(defn read-snapshot-storage-v1-volume-snapshot-content-status-with-http-info
  "
  read status of the specified VolumeSnapshotContent"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-snapshot-storage-v1-volume-snapshot-content-status
  "
  read status of the specified VolumeSnapshotContent"
  ([name ] (read-snapshot-storage-v1-volume-snapshot-content-status name nil))
  ([name optional-params]
   (:data (read-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name optional-params))))

(defn replace-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info
  "
  replace the specified VolumeSnapshot"
  ([name namespace body ] (replace-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-snapshot-storage-v1-namespaced-volume-snapshot
  "
  replace the specified VolumeSnapshot"
  ([name namespace body ] (replace-snapshot-storage-v1-namespaced-volume-snapshot name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-snapshot-storage-v1-namespaced-volume-snapshot-with-http-info name namespace body optional-params))))

(defn replace-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info
  "
  replace status of the specified VolumeSnapshot"
  ([name namespace body ] (replace-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/namespaces/{namespace}/volumesnapshots/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-snapshot-storage-v1-namespaced-volume-snapshot-status
  "
  replace status of the specified VolumeSnapshot"
  ([name namespace body ] (replace-snapshot-storage-v1-namespaced-volume-snapshot-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-snapshot-storage-v1-namespaced-volume-snapshot-status-with-http-info name namespace body optional-params))))

(defn replace-snapshot-storage-v1-volume-snapshot-class-with-http-info
  "
  replace the specified VolumeSnapshotClass"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-snapshot-storage-v1-volume-snapshot-class
  "
  replace the specified VolumeSnapshotClass"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-class name body nil))
  ([name body optional-params]
   (:data (replace-snapshot-storage-v1-volume-snapshot-class-with-http-info name body optional-params))))

(defn replace-snapshot-storage-v1-volume-snapshot-content-with-http-info
  "
  replace the specified VolumeSnapshotContent"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-content-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-snapshot-storage-v1-volume-snapshot-content
  "
  replace the specified VolumeSnapshotContent"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-content name body nil))
  ([name body optional-params]
   (:data (replace-snapshot-storage-v1-volume-snapshot-content-with-http-info name body optional-params))))

(defn replace-snapshot-storage-v1-volume-snapshot-content-status-with-http-info
  "
  replace status of the specified VolumeSnapshotContent"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/snapshot.storage.k8s.io/v1/volumesnapshotcontents/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-snapshot-storage-v1-volume-snapshot-content-status
  "
  replace status of the specified VolumeSnapshotContent"
  ([name body ] (replace-snapshot-storage-v1-volume-snapshot-content-status name body nil))
  ([name body optional-params]
   (:data (replace-snapshot-storage-v1-volume-snapshot-content-status-with-http-info name body optional-params))))

