(ns kubernetes.api.migration-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-migration-v1alpha1-storage-state-with-http-info
  "
  create a StorageState"
  ([body ] (create-migration-v1alpha1-storage-state-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-migration-v1alpha1-storage-state
  "
  create a StorageState"
  ([body ] (create-migration-v1alpha1-storage-state body nil))
  ([body optional-params]
   (:data (create-migration-v1alpha1-storage-state-with-http-info body optional-params))))

(defn create-migration-v1alpha1-storage-version-migration-with-http-info
  "
  create a StorageVersionMigration"
  ([body ] (create-migration-v1alpha1-storage-version-migration-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-migration-v1alpha1-storage-version-migration
  "
  create a StorageVersionMigration"
  ([body ] (create-migration-v1alpha1-storage-version-migration body nil))
  ([body optional-params]
   (:data (create-migration-v1alpha1-storage-version-migration-with-http-info body optional-params))))

(defn delete-migration-v1alpha1-collection-storage-state-with-http-info
  "
  delete collection of StorageState"
  ([] (delete-migration-v1alpha1-collection-storage-state-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-migration-v1alpha1-collection-storage-state
  "
  delete collection of StorageState"
  ([] (delete-migration-v1alpha1-collection-storage-state nil))
  ([optional-params]
   (:data (delete-migration-v1alpha1-collection-storage-state-with-http-info optional-params))))

(defn delete-migration-v1alpha1-collection-storage-version-migration-with-http-info
  "
  delete collection of StorageVersionMigration"
  ([] (delete-migration-v1alpha1-collection-storage-version-migration-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-migration-v1alpha1-collection-storage-version-migration
  "
  delete collection of StorageVersionMigration"
  ([] (delete-migration-v1alpha1-collection-storage-version-migration nil))
  ([optional-params]
   (:data (delete-migration-v1alpha1-collection-storage-version-migration-with-http-info optional-params))))

(defn delete-migration-v1alpha1-storage-state-with-http-info
  "
  delete a StorageState"
  ([name ] (delete-migration-v1alpha1-storage-state-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-migration-v1alpha1-storage-state
  "
  delete a StorageState"
  ([name ] (delete-migration-v1alpha1-storage-state name nil))
  ([name optional-params]
   (:data (delete-migration-v1alpha1-storage-state-with-http-info name optional-params))))

(defn delete-migration-v1alpha1-storage-version-migration-with-http-info
  "
  delete a StorageVersionMigration"
  ([name ] (delete-migration-v1alpha1-storage-version-migration-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-migration-v1alpha1-storage-version-migration
  "
  delete a StorageVersionMigration"
  ([name ] (delete-migration-v1alpha1-storage-version-migration name nil))
  ([name optional-params]
   (:data (delete-migration-v1alpha1-storage-version-migration-with-http-info name optional-params))))

(defn list-migration-v1alpha1-storage-state-with-http-info
  "
  list objects of kind StorageState"
  ([] (list-migration-v1alpha1-storage-state-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-migration-v1alpha1-storage-state
  "
  list objects of kind StorageState"
  ([] (list-migration-v1alpha1-storage-state nil))
  ([optional-params]
   (:data (list-migration-v1alpha1-storage-state-with-http-info optional-params))))

(defn list-migration-v1alpha1-storage-version-migration-with-http-info
  "
  list objects of kind StorageVersionMigration"
  ([] (list-migration-v1alpha1-storage-version-migration-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-migration-v1alpha1-storage-version-migration
  "
  list objects of kind StorageVersionMigration"
  ([] (list-migration-v1alpha1-storage-version-migration nil))
  ([optional-params]
   (:data (list-migration-v1alpha1-storage-version-migration-with-http-info optional-params))))

(defn patch-migration-v1alpha1-storage-state-with-http-info
  "
  partially update the specified StorageState"
  ([name body ] (patch-migration-v1alpha1-storage-state-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-migration-v1alpha1-storage-state
  "
  partially update the specified StorageState"
  ([name body ] (patch-migration-v1alpha1-storage-state name body nil))
  ([name body optional-params]
   (:data (patch-migration-v1alpha1-storage-state-with-http-info name body optional-params))))

(defn patch-migration-v1alpha1-storage-state-status-with-http-info
  "
  partially update status of the specified StorageState"
  ([name body ] (patch-migration-v1alpha1-storage-state-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-migration-v1alpha1-storage-state-status
  "
  partially update status of the specified StorageState"
  ([name body ] (patch-migration-v1alpha1-storage-state-status name body nil))
  ([name body optional-params]
   (:data (patch-migration-v1alpha1-storage-state-status-with-http-info name body optional-params))))

(defn patch-migration-v1alpha1-storage-version-migration-with-http-info
  "
  partially update the specified StorageVersionMigration"
  ([name body ] (patch-migration-v1alpha1-storage-version-migration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-migration-v1alpha1-storage-version-migration
  "
  partially update the specified StorageVersionMigration"
  ([name body ] (patch-migration-v1alpha1-storage-version-migration name body nil))
  ([name body optional-params]
   (:data (patch-migration-v1alpha1-storage-version-migration-with-http-info name body optional-params))))

(defn patch-migration-v1alpha1-storage-version-migration-status-with-http-info
  "
  partially update status of the specified StorageVersionMigration"
  ([name body ] (patch-migration-v1alpha1-storage-version-migration-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-migration-v1alpha1-storage-version-migration-status
  "
  partially update status of the specified StorageVersionMigration"
  ([name body ] (patch-migration-v1alpha1-storage-version-migration-status name body nil))
  ([name body optional-params]
   (:data (patch-migration-v1alpha1-storage-version-migration-status-with-http-info name body optional-params))))

(defn read-migration-v1alpha1-storage-state-with-http-info
  "
  read the specified StorageState"
  ([name ] (read-migration-v1alpha1-storage-state-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-migration-v1alpha1-storage-state
  "
  read the specified StorageState"
  ([name ] (read-migration-v1alpha1-storage-state name nil))
  ([name optional-params]
   (:data (read-migration-v1alpha1-storage-state-with-http-info name optional-params))))

(defn read-migration-v1alpha1-storage-state-status-with-http-info
  "
  read status of the specified StorageState"
  ([name ] (read-migration-v1alpha1-storage-state-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-migration-v1alpha1-storage-state-status
  "
  read status of the specified StorageState"
  ([name ] (read-migration-v1alpha1-storage-state-status name nil))
  ([name optional-params]
   (:data (read-migration-v1alpha1-storage-state-status-with-http-info name optional-params))))

(defn read-migration-v1alpha1-storage-version-migration-with-http-info
  "
  read the specified StorageVersionMigration"
  ([name ] (read-migration-v1alpha1-storage-version-migration-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-migration-v1alpha1-storage-version-migration
  "
  read the specified StorageVersionMigration"
  ([name ] (read-migration-v1alpha1-storage-version-migration name nil))
  ([name optional-params]
   (:data (read-migration-v1alpha1-storage-version-migration-with-http-info name optional-params))))

(defn read-migration-v1alpha1-storage-version-migration-status-with-http-info
  "
  read status of the specified StorageVersionMigration"
  ([name ] (read-migration-v1alpha1-storage-version-migration-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-migration-v1alpha1-storage-version-migration-status
  "
  read status of the specified StorageVersionMigration"
  ([name ] (read-migration-v1alpha1-storage-version-migration-status name nil))
  ([name optional-params]
   (:data (read-migration-v1alpha1-storage-version-migration-status-with-http-info name optional-params))))

(defn replace-migration-v1alpha1-storage-state-with-http-info
  "
  replace the specified StorageState"
  ([name body ] (replace-migration-v1alpha1-storage-state-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-migration-v1alpha1-storage-state
  "
  replace the specified StorageState"
  ([name body ] (replace-migration-v1alpha1-storage-state name body nil))
  ([name body optional-params]
   (:data (replace-migration-v1alpha1-storage-state-with-http-info name body optional-params))))

(defn replace-migration-v1alpha1-storage-state-status-with-http-info
  "
  replace status of the specified StorageState"
  ([name body ] (replace-migration-v1alpha1-storage-state-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storagestates/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-migration-v1alpha1-storage-state-status
  "
  replace status of the specified StorageState"
  ([name body ] (replace-migration-v1alpha1-storage-state-status name body nil))
  ([name body optional-params]
   (:data (replace-migration-v1alpha1-storage-state-status-with-http-info name body optional-params))))

(defn replace-migration-v1alpha1-storage-version-migration-with-http-info
  "
  replace the specified StorageVersionMigration"
  ([name body ] (replace-migration-v1alpha1-storage-version-migration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-migration-v1alpha1-storage-version-migration
  "
  replace the specified StorageVersionMigration"
  ([name body ] (replace-migration-v1alpha1-storage-version-migration name body nil))
  ([name body optional-params]
   (:data (replace-migration-v1alpha1-storage-version-migration-with-http-info name body optional-params))))

(defn replace-migration-v1alpha1-storage-version-migration-status-with-http-info
  "
  replace status of the specified StorageVersionMigration"
  ([name body ] (replace-migration-v1alpha1-storage-version-migration-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/migration.k8s.io/v1alpha1/storageversionmigrations/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-migration-v1alpha1-storage-version-migration-status
  "
  replace status of the specified StorageVersionMigration"
  ([name body ] (replace-migration-v1alpha1-storage-version-migration-status name body nil))
  ([name body optional-params]
   (:data (replace-migration-v1alpha1-storage-version-migration-status-with-http-info name body optional-params))))

