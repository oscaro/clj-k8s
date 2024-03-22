(ns kubernetes.api.apm-k-s-elastic-co-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  create an ApmServer"
  ([namespace body ] (create-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  create an ApmServer"
  ([namespace body ] (create-apm-k8s-elastic-co-v1beta1-namespaced-apm-server namespace body nil))
  ([namespace body optional-params]
   (:data (create-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info namespace body optional-params))))

(defn delete-apm-k8s-elastic-co-v1beta1-collection-namespaced-apm-server-with-http-info
  "
  delete collection of ApmServer"
  ([namespace ] (delete-apm-k8s-elastic-co-v1beta1-collection-namespaced-apm-server-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-apm-k8s-elastic-co-v1beta1-collection-namespaced-apm-server
  "
  delete collection of ApmServer"
  ([namespace ] (delete-apm-k8s-elastic-co-v1beta1-collection-namespaced-apm-server namespace nil))
  ([namespace optional-params]
   (:data (delete-apm-k8s-elastic-co-v1beta1-collection-namespaced-apm-server-with-http-info namespace optional-params))))

(defn delete-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  delete an ApmServer"
  ([name namespace ] (delete-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  delete an ApmServer"
  ([name namespace ] (delete-apm-k8s-elastic-co-v1beta1-namespaced-apm-server name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace optional-params))))

(defn list-apm-k8s-elastic-co-v1beta1-apm-server-for-all-namespaces-with-http-info
  "
  list objects of kind ApmServer"
  ([] (list-apm-k8s-elastic-co-v1beta1-apm-server-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/apmservers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-apm-k8s-elastic-co-v1beta1-apm-server-for-all-namespaces
  "
  list objects of kind ApmServer"
  ([] (list-apm-k8s-elastic-co-v1beta1-apm-server-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apm-k8s-elastic-co-v1beta1-apm-server-for-all-namespaces-with-http-info optional-params))))

(defn list-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  list objects of kind ApmServer"
  ([namespace ] (list-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  list objects of kind ApmServer"
  ([namespace ] (list-apm-k8s-elastic-co-v1beta1-namespaced-apm-server namespace nil))
  ([namespace optional-params]
   (:data (list-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info namespace optional-params))))

(defn patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  partially update the specified ApmServer"
  ([name namespace body ] (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  partially update the specified ApmServer"
  ([name namespace body ] (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace body optional-params))))

(defn patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info
  "
  partially update status of the specified ApmServer"
  ([name namespace body ] (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status
  "
  partially update status of the specified ApmServer"
  ([name namespace body ] (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace body optional-params))))

(defn read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  read the specified ApmServer"
  ([name namespace ] (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  read the specified ApmServer"
  ([name namespace ] (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server name namespace nil))
  ([name namespace optional-params]
   (:data (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace optional-params))))

(defn read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info
  "
  read status of the specified ApmServer"
  ([name namespace ] (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status
  "
  read status of the specified ApmServer"
  ([name namespace ] (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace optional-params))))

(defn replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info
  "
  replace the specified ApmServer"
  ([name namespace body ] (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server
  "
  replace the specified ApmServer"
  ([name namespace body ] (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-with-http-info name namespace body optional-params))))

(defn replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info
  "
  replace status of the specified ApmServer"
  ([name namespace body ] (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/apm.k8s.elastic.co/v1beta1/namespaces/{namespace}/apmservers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status
  "
  replace status of the specified ApmServer"
  ([name namespace body ] (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apm-k8s-elastic-co-v1beta1-namespaced-apm-server-status-with-http-info name namespace body optional-params))))

