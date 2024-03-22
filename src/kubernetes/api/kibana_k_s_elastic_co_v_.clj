(ns kubernetes.api.kibana-k-s-elastic-co-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  create a Kibana"
  ([namespace body ] (create-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  create a Kibana"
  ([namespace body ] (create-kibana-k8s-elastic-co-v1-namespaced-kibana namespace body nil))
  ([namespace body optional-params]
   (:data (create-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info namespace body optional-params))))

(defn delete-kibana-k8s-elastic-co-v1-collection-namespaced-kibana-with-http-info
  "
  delete collection of Kibana"
  ([namespace ] (delete-kibana-k8s-elastic-co-v1-collection-namespaced-kibana-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-kibana-k8s-elastic-co-v1-collection-namespaced-kibana
  "
  delete collection of Kibana"
  ([namespace ] (delete-kibana-k8s-elastic-co-v1-collection-namespaced-kibana namespace nil))
  ([namespace optional-params]
   (:data (delete-kibana-k8s-elastic-co-v1-collection-namespaced-kibana-with-http-info namespace optional-params))))

(defn delete-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  delete a Kibana"
  ([name namespace ] (delete-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  delete a Kibana"
  ([name namespace ] (delete-kibana-k8s-elastic-co-v1-namespaced-kibana name namespace nil))
  ([name namespace optional-params]
   (:data (delete-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace optional-params))))

(defn list-kibana-k8s-elastic-co-v1-kibana-for-all-namespaces-with-http-info
  "
  list objects of kind Kibana"
  ([] (list-kibana-k8s-elastic-co-v1-kibana-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/kibanas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-kibana-k8s-elastic-co-v1-kibana-for-all-namespaces
  "
  list objects of kind Kibana"
  ([] (list-kibana-k8s-elastic-co-v1-kibana-for-all-namespaces nil))
  ([optional-params]
   (:data (list-kibana-k8s-elastic-co-v1-kibana-for-all-namespaces-with-http-info optional-params))))

(defn list-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  list objects of kind Kibana"
  ([namespace ] (list-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  list objects of kind Kibana"
  ([namespace ] (list-kibana-k8s-elastic-co-v1-namespaced-kibana namespace nil))
  ([namespace optional-params]
   (:data (list-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info namespace optional-params))))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  partially update the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  partially update the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace body optional-params))))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info
  "
  partially update scale of the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana-scale
  "
  partially update scale of the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace body optional-params))))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info
  "
  partially update status of the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-kibana-k8s-elastic-co-v1-namespaced-kibana-status
  "
  partially update status of the specified Kibana"
  ([name namespace body ] (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace body optional-params))))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  read the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  read the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana name namespace nil))
  ([name namespace optional-params]
   (:data (read-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace optional-params))))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info
  "
  read scale of the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana-scale
  "
  read scale of the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace optional-params))))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info
  "
  read status of the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-kibana-k8s-elastic-co-v1-namespaced-kibana-status
  "
  read status of the specified Kibana"
  ([name namespace ] (read-kibana-k8s-elastic-co-v1-namespaced-kibana-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace optional-params))))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info
  "
  replace the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana
  "
  replace the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-with-http-info name namespace body optional-params))))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info
  "
  replace scale of the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana-scale
  "
  replace scale of the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-scale-with-http-info name namespace body optional-params))))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info
  "
  replace status of the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/kibana.k8s.elastic.co/v1/namespaces/{namespace}/kibanas/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-kibana-k8s-elastic-co-v1-namespaced-kibana-status
  "
  replace status of the specified Kibana"
  ([name namespace body ] (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-kibana-k8s-elastic-co-v1-namespaced-kibana-status-with-http-info name namespace body optional-params))))

