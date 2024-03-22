(ns kubernetes.api.policy-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  create a PodDisruptionBudget"
  ([namespace body ] (create-policy-v1-namespaced-pod-disruption-budget-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-policy-v1-namespaced-pod-disruption-budget
  "
  create a PodDisruptionBudget"
  ([namespace body ] (create-policy-v1-namespaced-pod-disruption-budget namespace body nil))
  ([namespace body optional-params]
   (:data (create-policy-v1-namespaced-pod-disruption-budget-with-http-info namespace body optional-params))))

(defn delete-policy-v1-collection-namespaced-pod-disruption-budget-with-http-info
  "
  delete collection of PodDisruptionBudget"
  ([namespace ] (delete-policy-v1-collection-namespaced-pod-disruption-budget-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-policy-v1-collection-namespaced-pod-disruption-budget
  "
  delete collection of PodDisruptionBudget"
  ([namespace ] (delete-policy-v1-collection-namespaced-pod-disruption-budget namespace nil))
  ([namespace optional-params]
   (:data (delete-policy-v1-collection-namespaced-pod-disruption-budget-with-http-info namespace optional-params))))

(defn delete-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  delete a PodDisruptionBudget"
  ([name namespace ] (delete-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-policy-v1-namespaced-pod-disruption-budget
  "
  delete a PodDisruptionBudget"
  ([name namespace ] (delete-policy-v1-namespaced-pod-disruption-budget name namespace nil))
  ([name namespace optional-params]
   (:data (delete-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace optional-params))))

(defn get-policy-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/policy/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-policy-v1-api-resources
  "
  get available resources"
  []
  (:data (get-policy-v1-api-resources-with-http-info)))

(defn list-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  list or watch objects of kind PodDisruptionBudget"
  ([namespace ] (list-policy-v1-namespaced-pod-disruption-budget-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-policy-v1-namespaced-pod-disruption-budget
  "
  list or watch objects of kind PodDisruptionBudget"
  ([namespace ] (list-policy-v1-namespaced-pod-disruption-budget namespace nil))
  ([namespace optional-params]
   (:data (list-policy-v1-namespaced-pod-disruption-budget-with-http-info namespace optional-params))))

(defn list-policy-v1-pod-disruption-budget-for-all-namespaces-with-http-info
  "
  list or watch objects of kind PodDisruptionBudget"
  ([] (list-policy-v1-pod-disruption-budget-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/policy/v1/poddisruptionbudgets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-policy-v1-pod-disruption-budget-for-all-namespaces
  "
  list or watch objects of kind PodDisruptionBudget"
  ([] (list-policy-v1-pod-disruption-budget-for-all-namespaces nil))
  ([optional-params]
   (:data (list-policy-v1-pod-disruption-budget-for-all-namespaces-with-http-info optional-params))))

(defn patch-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  partially update the specified PodDisruptionBudget"
  ([name namespace body ] (patch-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-policy-v1-namespaced-pod-disruption-budget
  "
  partially update the specified PodDisruptionBudget"
  ([name namespace body ] (patch-policy-v1-namespaced-pod-disruption-budget name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace body optional-params))))

(defn patch-policy-v1-namespaced-pod-disruption-budget-status-with-http-info
  "
  partially update status of the specified PodDisruptionBudget"
  ([name namespace body ] (patch-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-policy-v1-namespaced-pod-disruption-budget-status
  "
  partially update status of the specified PodDisruptionBudget"
  ([name namespace body ] (patch-policy-v1-namespaced-pod-disruption-budget-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace body optional-params))))

(defn read-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  read the specified PodDisruptionBudget"
  ([name namespace ] (read-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-policy-v1-namespaced-pod-disruption-budget
  "
  read the specified PodDisruptionBudget"
  ([name namespace ] (read-policy-v1-namespaced-pod-disruption-budget name namespace nil))
  ([name namespace optional-params]
   (:data (read-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace optional-params))))

(defn read-policy-v1-namespaced-pod-disruption-budget-status-with-http-info
  "
  read status of the specified PodDisruptionBudget"
  ([name namespace ] (read-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-policy-v1-namespaced-pod-disruption-budget-status
  "
  read status of the specified PodDisruptionBudget"
  ([name namespace ] (read-policy-v1-namespaced-pod-disruption-budget-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace optional-params))))

(defn replace-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  replace the specified PodDisruptionBudget"
  ([name namespace body ] (replace-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-policy-v1-namespaced-pod-disruption-budget
  "
  replace the specified PodDisruptionBudget"
  ([name namespace body ] (replace-policy-v1-namespaced-pod-disruption-budget name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace body optional-params))))

(defn replace-policy-v1-namespaced-pod-disruption-budget-status-with-http-info
  "
  replace status of the specified PodDisruptionBudget"
  ([name namespace body ] (replace-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-policy-v1-namespaced-pod-disruption-budget-status
  "
  replace status of the specified PodDisruptionBudget"
  ([name namespace body ] (replace-policy-v1-namespaced-pod-disruption-budget-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-policy-v1-namespaced-pod-disruption-budget-status-with-http-info name namespace body optional-params))))

(defn watch-policy-v1-namespaced-pod-disruption-budget-with-http-info
  "
  watch changes to an object of kind PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/policy/v1/watch/namespaces/{namespace}/poddisruptionbudgets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-policy-v1-namespaced-pod-disruption-budget
  "
  watch changes to an object of kind PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-policy-v1-namespaced-pod-disruption-budget name namespace nil))
  ([name namespace optional-params]
   (:data (watch-policy-v1-namespaced-pod-disruption-budget-with-http-info name namespace optional-params))))

(defn watch-policy-v1-namespaced-pod-disruption-budget-list-with-http-info
  "
  watch individual changes to a list of PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-policy-v1-namespaced-pod-disruption-budget-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/policy/v1/watch/namespaces/{namespace}/poddisruptionbudgets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-policy-v1-namespaced-pod-disruption-budget-list
  "
  watch individual changes to a list of PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-policy-v1-namespaced-pod-disruption-budget-list namespace nil))
  ([namespace optional-params]
   (:data (watch-policy-v1-namespaced-pod-disruption-budget-list-with-http-info namespace optional-params))))

(defn watch-policy-v1-pod-disruption-budget-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-policy-v1-pod-disruption-budget-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/policy/v1/watch/poddisruptionbudgets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-policy-v1-pod-disruption-budget-list-for-all-namespaces
  "
  watch individual changes to a list of PodDisruptionBudget. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-policy-v1-pod-disruption-budget-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-policy-v1-pod-disruption-budget-list-for-all-namespaces-with-http-info optional-params))))

