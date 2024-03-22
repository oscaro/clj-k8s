(ns kubernetes.api.agent-k-s-elastic-co-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  create an Agent"
  ([namespace body ] (create-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  create an Agent"
  ([namespace body ] (create-agent-k8s-elastic-co-v1alpha1-namespaced-agent namespace body nil))
  ([namespace body optional-params]
   (:data (create-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info namespace body optional-params))))

(defn delete-agent-k8s-elastic-co-v1alpha1-collection-namespaced-agent-with-http-info
  "
  delete collection of Agent"
  ([namespace ] (delete-agent-k8s-elastic-co-v1alpha1-collection-namespaced-agent-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-agent-k8s-elastic-co-v1alpha1-collection-namespaced-agent
  "
  delete collection of Agent"
  ([namespace ] (delete-agent-k8s-elastic-co-v1alpha1-collection-namespaced-agent namespace nil))
  ([namespace optional-params]
   (:data (delete-agent-k8s-elastic-co-v1alpha1-collection-namespaced-agent-with-http-info namespace optional-params))))

(defn delete-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  delete an Agent"
  ([name namespace ] (delete-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  delete an Agent"
  ([name namespace ] (delete-agent-k8s-elastic-co-v1alpha1-namespaced-agent name namespace nil))
  ([name namespace optional-params]
   (:data (delete-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace optional-params))))

(defn list-agent-k8s-elastic-co-v1alpha1-agent-for-all-namespaces-with-http-info
  "
  list objects of kind Agent"
  ([] (list-agent-k8s-elastic-co-v1alpha1-agent-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/agents" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-agent-k8s-elastic-co-v1alpha1-agent-for-all-namespaces
  "
  list objects of kind Agent"
  ([] (list-agent-k8s-elastic-co-v1alpha1-agent-for-all-namespaces nil))
  ([optional-params]
   (:data (list-agent-k8s-elastic-co-v1alpha1-agent-for-all-namespaces-with-http-info optional-params))))

(defn list-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  list objects of kind Agent"
  ([namespace ] (list-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  list objects of kind Agent"
  ([namespace ] (list-agent-k8s-elastic-co-v1alpha1-namespaced-agent namespace nil))
  ([namespace optional-params]
   (:data (list-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info namespace optional-params))))

(defn patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  partially update the specified Agent"
  ([name namespace body ] (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  partially update the specified Agent"
  ([name namespace body ] (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace body optional-params))))

(defn patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info
  "
  partially update status of the specified Agent"
  ([name namespace body ] (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status
  "
  partially update status of the specified Agent"
  ([name namespace body ] (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace body optional-params))))

(defn read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  read the specified Agent"
  ([name namespace ] (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  read the specified Agent"
  ([name namespace ] (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent name namespace nil))
  ([name namespace optional-params]
   (:data (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace optional-params))))

(defn read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info
  "
  read status of the specified Agent"
  ([name namespace ] (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status
  "
  read status of the specified Agent"
  ([name namespace ] (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace optional-params))))

(defn replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info
  "
  replace the specified Agent"
  ([name namespace body ] (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent
  "
  replace the specified Agent"
  ([name namespace body ] (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-with-http-info name namespace body optional-params))))

(defn replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info
  "
  replace status of the specified Agent"
  ([name namespace body ] (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/agent.k8s.elastic.co/v1alpha1/namespaces/{namespace}/agents/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status
  "
  replace status of the specified Agent"
  ([name namespace body ] (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-agent-k8s-elastic-co-v1alpha1-namespaced-agent-status-with-http-info name namespace body optional-params))))

