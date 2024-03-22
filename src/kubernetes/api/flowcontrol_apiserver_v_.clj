(ns kubernetes.api.flowcontrol-apiserver-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  create a FlowSchema"
  ([body ] (create-flowcontrol-apiserver-v1-flow-schema-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-flowcontrol-apiserver-v1-flow-schema
  "
  create a FlowSchema"
  ([body ] (create-flowcontrol-apiserver-v1-flow-schema body nil))
  ([body optional-params]
   (:data (create-flowcontrol-apiserver-v1-flow-schema-with-http-info body optional-params))))

(defn create-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  create a PriorityLevelConfiguration"
  ([body ] (create-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-flowcontrol-apiserver-v1-priority-level-configuration
  "
  create a PriorityLevelConfiguration"
  ([body ] (create-flowcontrol-apiserver-v1-priority-level-configuration body nil))
  ([body optional-params]
   (:data (create-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info body optional-params))))

(defn delete-flowcontrol-apiserver-v1-collection-flow-schema-with-http-info
  "
  delete collection of FlowSchema"
  ([] (delete-flowcontrol-apiserver-v1-collection-flow-schema-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-flowcontrol-apiserver-v1-collection-flow-schema
  "
  delete collection of FlowSchema"
  ([] (delete-flowcontrol-apiserver-v1-collection-flow-schema nil))
  ([optional-params]
   (:data (delete-flowcontrol-apiserver-v1-collection-flow-schema-with-http-info optional-params))))

(defn delete-flowcontrol-apiserver-v1-collection-priority-level-configuration-with-http-info
  "
  delete collection of PriorityLevelConfiguration"
  ([] (delete-flowcontrol-apiserver-v1-collection-priority-level-configuration-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-flowcontrol-apiserver-v1-collection-priority-level-configuration
  "
  delete collection of PriorityLevelConfiguration"
  ([] (delete-flowcontrol-apiserver-v1-collection-priority-level-configuration nil))
  ([optional-params]
   (:data (delete-flowcontrol-apiserver-v1-collection-priority-level-configuration-with-http-info optional-params))))

(defn delete-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  delete a FlowSchema"
  ([name ] (delete-flowcontrol-apiserver-v1-flow-schema-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-flowcontrol-apiserver-v1-flow-schema
  "
  delete a FlowSchema"
  ([name ] (delete-flowcontrol-apiserver-v1-flow-schema name nil))
  ([name optional-params]
   (:data (delete-flowcontrol-apiserver-v1-flow-schema-with-http-info name optional-params))))

(defn delete-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  delete a PriorityLevelConfiguration"
  ([name ] (delete-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-flowcontrol-apiserver-v1-priority-level-configuration
  "
  delete a PriorityLevelConfiguration"
  ([name ] (delete-flowcontrol-apiserver-v1-priority-level-configuration name nil))
  ([name optional-params]
   (:data (delete-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name optional-params))))

(defn get-flowcontrol-apiserver-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-flowcontrol-apiserver-v1-api-resources
  "
  get available resources"
  []
  (:data (get-flowcontrol-apiserver-v1-api-resources-with-http-info)))

(defn list-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  list or watch objects of kind FlowSchema"
  ([] (list-flowcontrol-apiserver-v1-flow-schema-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-flowcontrol-apiserver-v1-flow-schema
  "
  list or watch objects of kind FlowSchema"
  ([] (list-flowcontrol-apiserver-v1-flow-schema nil))
  ([optional-params]
   (:data (list-flowcontrol-apiserver-v1-flow-schema-with-http-info optional-params))))

(defn list-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  list or watch objects of kind PriorityLevelConfiguration"
  ([] (list-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-flowcontrol-apiserver-v1-priority-level-configuration
  "
  list or watch objects of kind PriorityLevelConfiguration"
  ([] (list-flowcontrol-apiserver-v1-priority-level-configuration nil))
  ([optional-params]
   (:data (list-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info optional-params))))

(defn patch-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  partially update the specified FlowSchema"
  ([name body ] (patch-flowcontrol-apiserver-v1-flow-schema-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-flowcontrol-apiserver-v1-flow-schema
  "
  partially update the specified FlowSchema"
  ([name body ] (patch-flowcontrol-apiserver-v1-flow-schema name body nil))
  ([name body optional-params]
   (:data (patch-flowcontrol-apiserver-v1-flow-schema-with-http-info name body optional-params))))

(defn patch-flowcontrol-apiserver-v1-flow-schema-status-with-http-info
  "
  partially update status of the specified FlowSchema"
  ([name body ] (patch-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-flowcontrol-apiserver-v1-flow-schema-status
  "
  partially update status of the specified FlowSchema"
  ([name body ] (patch-flowcontrol-apiserver-v1-flow-schema-status name body nil))
  ([name body optional-params]
   (:data (patch-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name body optional-params))))

(defn patch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  partially update the specified PriorityLevelConfiguration"
  ([name body ] (patch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-flowcontrol-apiserver-v1-priority-level-configuration
  "
  partially update the specified PriorityLevelConfiguration"
  ([name body ] (patch-flowcontrol-apiserver-v1-priority-level-configuration name body nil))
  ([name body optional-params]
   (:data (patch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name body optional-params))))

(defn patch-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info
  "
  partially update status of the specified PriorityLevelConfiguration"
  ([name body ] (patch-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-flowcontrol-apiserver-v1-priority-level-configuration-status
  "
  partially update status of the specified PriorityLevelConfiguration"
  ([name body ] (patch-flowcontrol-apiserver-v1-priority-level-configuration-status name body nil))
  ([name body optional-params]
   (:data (patch-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name body optional-params))))

(defn read-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  read the specified FlowSchema"
  ([name ] (read-flowcontrol-apiserver-v1-flow-schema-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-flowcontrol-apiserver-v1-flow-schema
  "
  read the specified FlowSchema"
  ([name ] (read-flowcontrol-apiserver-v1-flow-schema name nil))
  ([name optional-params]
   (:data (read-flowcontrol-apiserver-v1-flow-schema-with-http-info name optional-params))))

(defn read-flowcontrol-apiserver-v1-flow-schema-status-with-http-info
  "
  read status of the specified FlowSchema"
  ([name ] (read-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-flowcontrol-apiserver-v1-flow-schema-status
  "
  read status of the specified FlowSchema"
  ([name ] (read-flowcontrol-apiserver-v1-flow-schema-status name nil))
  ([name optional-params]
   (:data (read-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name optional-params))))

(defn read-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  read the specified PriorityLevelConfiguration"
  ([name ] (read-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-flowcontrol-apiserver-v1-priority-level-configuration
  "
  read the specified PriorityLevelConfiguration"
  ([name ] (read-flowcontrol-apiserver-v1-priority-level-configuration name nil))
  ([name optional-params]
   (:data (read-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name optional-params))))

(defn read-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info
  "
  read status of the specified PriorityLevelConfiguration"
  ([name ] (read-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-flowcontrol-apiserver-v1-priority-level-configuration-status
  "
  read status of the specified PriorityLevelConfiguration"
  ([name ] (read-flowcontrol-apiserver-v1-priority-level-configuration-status name nil))
  ([name optional-params]
   (:data (read-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name optional-params))))

(defn replace-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  replace the specified FlowSchema"
  ([name body ] (replace-flowcontrol-apiserver-v1-flow-schema-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-flowcontrol-apiserver-v1-flow-schema
  "
  replace the specified FlowSchema"
  ([name body ] (replace-flowcontrol-apiserver-v1-flow-schema name body nil))
  ([name body optional-params]
   (:data (replace-flowcontrol-apiserver-v1-flow-schema-with-http-info name body optional-params))))

(defn replace-flowcontrol-apiserver-v1-flow-schema-status-with-http-info
  "
  replace status of the specified FlowSchema"
  ([name body ] (replace-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/flowschemas/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-flowcontrol-apiserver-v1-flow-schema-status
  "
  replace status of the specified FlowSchema"
  ([name body ] (replace-flowcontrol-apiserver-v1-flow-schema-status name body nil))
  ([name body optional-params]
   (:data (replace-flowcontrol-apiserver-v1-flow-schema-status-with-http-info name body optional-params))))

(defn replace-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  replace the specified PriorityLevelConfiguration"
  ([name body ] (replace-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-flowcontrol-apiserver-v1-priority-level-configuration
  "
  replace the specified PriorityLevelConfiguration"
  ([name body ] (replace-flowcontrol-apiserver-v1-priority-level-configuration name body nil))
  ([name body optional-params]
   (:data (replace-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name body optional-params))))

(defn replace-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info
  "
  replace status of the specified PriorityLevelConfiguration"
  ([name body ] (replace-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/prioritylevelconfigurations/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-flowcontrol-apiserver-v1-priority-level-configuration-status
  "
  replace status of the specified PriorityLevelConfiguration"
  ([name body ] (replace-flowcontrol-apiserver-v1-priority-level-configuration-status name body nil))
  ([name body optional-params]
   (:data (replace-flowcontrol-apiserver-v1-priority-level-configuration-status-with-http-info name body optional-params))))

(defn watch-flowcontrol-apiserver-v1-flow-schema-with-http-info
  "
  watch changes to an object of kind FlowSchema. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-flowcontrol-apiserver-v1-flow-schema-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/watch/flowschemas/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-flowcontrol-apiserver-v1-flow-schema
  "
  watch changes to an object of kind FlowSchema. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-flowcontrol-apiserver-v1-flow-schema name nil))
  ([name optional-params]
   (:data (watch-flowcontrol-apiserver-v1-flow-schema-with-http-info name optional-params))))

(defn watch-flowcontrol-apiserver-v1-flow-schema-list-with-http-info
  "
  watch individual changes to a list of FlowSchema. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-flowcontrol-apiserver-v1-flow-schema-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/watch/flowschemas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-flowcontrol-apiserver-v1-flow-schema-list
  "
  watch individual changes to a list of FlowSchema. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-flowcontrol-apiserver-v1-flow-schema-list nil))
  ([optional-params]
   (:data (watch-flowcontrol-apiserver-v1-flow-schema-list-with-http-info optional-params))))

(defn watch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info
  "
  watch changes to an object of kind PriorityLevelConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/watch/prioritylevelconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-flowcontrol-apiserver-v1-priority-level-configuration
  "
  watch changes to an object of kind PriorityLevelConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-flowcontrol-apiserver-v1-priority-level-configuration name nil))
  ([name optional-params]
   (:data (watch-flowcontrol-apiserver-v1-priority-level-configuration-with-http-info name optional-params))))

(defn watch-flowcontrol-apiserver-v1-priority-level-configuration-list-with-http-info
  "
  watch individual changes to a list of PriorityLevelConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-flowcontrol-apiserver-v1-priority-level-configuration-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/flowcontrol.apiserver.k8s.io/v1/watch/prioritylevelconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-flowcontrol-apiserver-v1-priority-level-configuration-list
  "
  watch individual changes to a list of PriorityLevelConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-flowcontrol-apiserver-v1-priority-level-configuration-list nil))
  ([optional-params]
   (:data (watch-flowcontrol-apiserver-v1-priority-level-configuration-list-with-http-info optional-params))))

