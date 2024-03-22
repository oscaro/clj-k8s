(ns kubernetes.api.stackconfigpolicy-k-s-elastic-co-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  create a StackConfigPolicy"
  ([namespace body ] (create-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  create a StackConfigPolicy"
  ([namespace body ] (create-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy namespace body nil))
  ([namespace body optional-params]
   (:data (create-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info namespace body optional-params))))

(defn delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-collection-namespaced-stack-config-policy-with-http-info
  "
  delete collection of StackConfigPolicy"
  ([namespace ] (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-collection-namespaced-stack-config-policy-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-collection-namespaced-stack-config-policy
  "
  delete collection of StackConfigPolicy"
  ([namespace ] (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-collection-namespaced-stack-config-policy namespace nil))
  ([namespace optional-params]
   (:data (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-collection-namespaced-stack-config-policy-with-http-info namespace optional-params))))

(defn delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  delete a StackConfigPolicy"
  ([name namespace ] (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  delete a StackConfigPolicy"
  ([name namespace ] (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy name namespace nil))
  ([name namespace optional-params]
   (:data (delete-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace optional-params))))

(defn list-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  list objects of kind StackConfigPolicy"
  ([namespace ] (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  list objects of kind StackConfigPolicy"
  ([namespace ] (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy namespace nil))
  ([namespace optional-params]
   (:data (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info namespace optional-params))))

(defn list-stackconfigpolicy-k8s-elastic-co-v1alpha1-stack-config-policy-for-all-namespaces-with-http-info
  "
  list objects of kind StackConfigPolicy"
  ([] (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-stack-config-policy-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/stackconfigpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-stackconfigpolicy-k8s-elastic-co-v1alpha1-stack-config-policy-for-all-namespaces
  "
  list objects of kind StackConfigPolicy"
  ([] (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-stack-config-policy-for-all-namespaces nil))
  ([optional-params]
   (:data (list-stackconfigpolicy-k8s-elastic-co-v1alpha1-stack-config-policy-for-all-namespaces-with-http-info optional-params))))

(defn patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  partially update the specified StackConfigPolicy"
  ([name namespace body ] (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  partially update the specified StackConfigPolicy"
  ([name namespace body ] (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace body optional-params))))

(defn patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info
  "
  partially update status of the specified StackConfigPolicy"
  ([name namespace body ] (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status
  "
  partially update status of the specified StackConfigPolicy"
  ([name namespace body ] (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace body optional-params))))

(defn read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  read the specified StackConfigPolicy"
  ([name namespace ] (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  read the specified StackConfigPolicy"
  ([name namespace ] (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy name namespace nil))
  ([name namespace optional-params]
   (:data (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace optional-params))))

(defn read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info
  "
  read status of the specified StackConfigPolicy"
  ([name namespace ] (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status
  "
  read status of the specified StackConfigPolicy"
  ([name namespace ] (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace optional-params))))

(defn replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info
  "
  replace the specified StackConfigPolicy"
  ([name namespace body ] (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy
  "
  replace the specified StackConfigPolicy"
  ([name namespace body ] (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-with-http-info name namespace body optional-params))))

(defn replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info
  "
  replace status of the specified StackConfigPolicy"
  ([name namespace body ] (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/stackconfigpolicy.k8s.elastic.co/v1alpha1/namespaces/{namespace}/stackconfigpolicies/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status
  "
  replace status of the specified StackConfigPolicy"
  ([name namespace body ] (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-stackconfigpolicy-k8s-elastic-co-v1alpha1-namespaced-stack-config-policy-status-with-http-info name namespace body optional-params))))

