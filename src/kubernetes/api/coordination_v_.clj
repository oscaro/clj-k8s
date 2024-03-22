(ns kubernetes.api.coordination-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-coordination-v1-namespaced-lease-with-http-info
  "
  create a Lease"
  ([namespace body ] (create-coordination-v1-namespaced-lease-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-coordination-v1-namespaced-lease
  "
  create a Lease"
  ([namespace body ] (create-coordination-v1-namespaced-lease namespace body nil))
  ([namespace body optional-params]
   (:data (create-coordination-v1-namespaced-lease-with-http-info namespace body optional-params))))

(defn delete-coordination-v1-collection-namespaced-lease-with-http-info
  "
  delete collection of Lease"
  ([namespace ] (delete-coordination-v1-collection-namespaced-lease-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-coordination-v1-collection-namespaced-lease
  "
  delete collection of Lease"
  ([namespace ] (delete-coordination-v1-collection-namespaced-lease namespace nil))
  ([namespace optional-params]
   (:data (delete-coordination-v1-collection-namespaced-lease-with-http-info namespace optional-params))))

(defn delete-coordination-v1-namespaced-lease-with-http-info
  "
  delete a Lease"
  ([name namespace ] (delete-coordination-v1-namespaced-lease-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-coordination-v1-namespaced-lease
  "
  delete a Lease"
  ([name namespace ] (delete-coordination-v1-namespaced-lease name namespace nil))
  ([name namespace optional-params]
   (:data (delete-coordination-v1-namespaced-lease-with-http-info name namespace optional-params))))

(defn get-coordination-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/coordination.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-coordination-v1-api-resources
  "
  get available resources"
  []
  (:data (get-coordination-v1-api-resources-with-http-info)))

(defn list-coordination-v1-lease-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Lease"
  ([] (list-coordination-v1-lease-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/coordination.k8s.io/v1/leases" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-coordination-v1-lease-for-all-namespaces
  "
  list or watch objects of kind Lease"
  ([] (list-coordination-v1-lease-for-all-namespaces nil))
  ([optional-params]
   (:data (list-coordination-v1-lease-for-all-namespaces-with-http-info optional-params))))

(defn list-coordination-v1-namespaced-lease-with-http-info
  "
  list or watch objects of kind Lease"
  ([namespace ] (list-coordination-v1-namespaced-lease-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-coordination-v1-namespaced-lease
  "
  list or watch objects of kind Lease"
  ([namespace ] (list-coordination-v1-namespaced-lease namespace nil))
  ([namespace optional-params]
   (:data (list-coordination-v1-namespaced-lease-with-http-info namespace optional-params))))

(defn patch-coordination-v1-namespaced-lease-with-http-info
  "
  partially update the specified Lease"
  ([name namespace body ] (patch-coordination-v1-namespaced-lease-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-coordination-v1-namespaced-lease
  "
  partially update the specified Lease"
  ([name namespace body ] (patch-coordination-v1-namespaced-lease name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-coordination-v1-namespaced-lease-with-http-info name namespace body optional-params))))

(defn read-coordination-v1-namespaced-lease-with-http-info
  "
  read the specified Lease"
  ([name namespace ] (read-coordination-v1-namespaced-lease-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-coordination-v1-namespaced-lease
  "
  read the specified Lease"
  ([name namespace ] (read-coordination-v1-namespaced-lease name namespace nil))
  ([name namespace optional-params]
   (:data (read-coordination-v1-namespaced-lease-with-http-info name namespace optional-params))))

(defn replace-coordination-v1-namespaced-lease-with-http-info
  "
  replace the specified Lease"
  ([name namespace body ] (replace-coordination-v1-namespaced-lease-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/coordination.k8s.io/v1/namespaces/{namespace}/leases/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-coordination-v1-namespaced-lease
  "
  replace the specified Lease"
  ([name namespace body ] (replace-coordination-v1-namespaced-lease name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-coordination-v1-namespaced-lease-with-http-info name namespace body optional-params))))

(defn watch-coordination-v1-lease-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Lease. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-coordination-v1-lease-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/coordination.k8s.io/v1/watch/leases" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-coordination-v1-lease-list-for-all-namespaces
  "
  watch individual changes to a list of Lease. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-coordination-v1-lease-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-coordination-v1-lease-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-coordination-v1-namespaced-lease-with-http-info
  "
  watch changes to an object of kind Lease. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-coordination-v1-namespaced-lease-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/coordination.k8s.io/v1/watch/namespaces/{namespace}/leases/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-coordination-v1-namespaced-lease
  "
  watch changes to an object of kind Lease. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-coordination-v1-namespaced-lease name namespace nil))
  ([name namespace optional-params]
   (:data (watch-coordination-v1-namespaced-lease-with-http-info name namespace optional-params))))

(defn watch-coordination-v1-namespaced-lease-list-with-http-info
  "
  watch individual changes to a list of Lease. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-coordination-v1-namespaced-lease-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/coordination.k8s.io/v1/watch/namespaces/{namespace}/leases" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-coordination-v1-namespaced-lease-list
  "
  watch individual changes to a list of Lease. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-coordination-v1-namespaced-lease-list namespace nil))
  ([namespace optional-params]
   (:data (watch-coordination-v1-namespaced-lease-list-with-http-info namespace optional-params))))

