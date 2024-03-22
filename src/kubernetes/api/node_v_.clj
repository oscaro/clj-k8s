(ns kubernetes.api.node-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-node-v1-runtime-class-with-http-info
  "
  create a RuntimeClass"
  ([body ] (create-node-v1-runtime-class-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-node-v1-runtime-class
  "
  create a RuntimeClass"
  ([body ] (create-node-v1-runtime-class body nil))
  ([body optional-params]
   (:data (create-node-v1-runtime-class-with-http-info body optional-params))))

(defn delete-node-v1-collection-runtime-class-with-http-info
  "
  delete collection of RuntimeClass"
  ([] (delete-node-v1-collection-runtime-class-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-node-v1-collection-runtime-class
  "
  delete collection of RuntimeClass"
  ([] (delete-node-v1-collection-runtime-class nil))
  ([optional-params]
   (:data (delete-node-v1-collection-runtime-class-with-http-info optional-params))))

(defn delete-node-v1-runtime-class-with-http-info
  "
  delete a RuntimeClass"
  ([name ] (delete-node-v1-runtime-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-node-v1-runtime-class
  "
  delete a RuntimeClass"
  ([name ] (delete-node-v1-runtime-class name nil))
  ([name optional-params]
   (:data (delete-node-v1-runtime-class-with-http-info name optional-params))))

(defn get-node-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/node.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-node-v1-api-resources
  "
  get available resources"
  []
  (:data (get-node-v1-api-resources-with-http-info)))

(defn list-node-v1-runtime-class-with-http-info
  "
  list or watch objects of kind RuntimeClass"
  ([] (list-node-v1-runtime-class-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-node-v1-runtime-class
  "
  list or watch objects of kind RuntimeClass"
  ([] (list-node-v1-runtime-class nil))
  ([optional-params]
   (:data (list-node-v1-runtime-class-with-http-info optional-params))))

(defn patch-node-v1-runtime-class-with-http-info
  "
  partially update the specified RuntimeClass"
  ([name body ] (patch-node-v1-runtime-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-node-v1-runtime-class
  "
  partially update the specified RuntimeClass"
  ([name body ] (patch-node-v1-runtime-class name body nil))
  ([name body optional-params]
   (:data (patch-node-v1-runtime-class-with-http-info name body optional-params))))

(defn read-node-v1-runtime-class-with-http-info
  "
  read the specified RuntimeClass"
  ([name ] (read-node-v1-runtime-class-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-node-v1-runtime-class
  "
  read the specified RuntimeClass"
  ([name ] (read-node-v1-runtime-class name nil))
  ([name optional-params]
   (:data (read-node-v1-runtime-class-with-http-info name optional-params))))

(defn replace-node-v1-runtime-class-with-http-info
  "
  replace the specified RuntimeClass"
  ([name body ] (replace-node-v1-runtime-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/node.k8s.io/v1/runtimeclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-node-v1-runtime-class
  "
  replace the specified RuntimeClass"
  ([name body ] (replace-node-v1-runtime-class name body nil))
  ([name body optional-params]
   (:data (replace-node-v1-runtime-class-with-http-info name body optional-params))))

(defn watch-node-v1-runtime-class-with-http-info
  "
  watch changes to an object of kind RuntimeClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-node-v1-runtime-class-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/node.k8s.io/v1/watch/runtimeclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-node-v1-runtime-class
  "
  watch changes to an object of kind RuntimeClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-node-v1-runtime-class name nil))
  ([name optional-params]
   (:data (watch-node-v1-runtime-class-with-http-info name optional-params))))

(defn watch-node-v1-runtime-class-list-with-http-info
  "
  watch individual changes to a list of RuntimeClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-node-v1-runtime-class-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/node.k8s.io/v1/watch/runtimeclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-node-v1-runtime-class-list
  "
  watch individual changes to a list of RuntimeClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-node-v1-runtime-class-list nil))
  ([optional-params]
   (:data (watch-node-v1-runtime-class-list-with-http-info optional-params))))

