(ns kubernetes.api.enterprisesearch-k-s-elastic-co-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  create an EnterpriseSearch"
  ([namespace body ] (create-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  create an EnterpriseSearch"
  ([namespace body ] (create-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search namespace body nil))
  ([namespace body optional-params]
   (:data (create-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info namespace body optional-params))))

(defn delete-enterprisesearch-k8s-elastic-co-v1-collection-namespaced-enterprise-search-with-http-info
  "
  delete collection of EnterpriseSearch"
  ([namespace ] (delete-enterprisesearch-k8s-elastic-co-v1-collection-namespaced-enterprise-search-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-enterprisesearch-k8s-elastic-co-v1-collection-namespaced-enterprise-search
  "
  delete collection of EnterpriseSearch"
  ([namespace ] (delete-enterprisesearch-k8s-elastic-co-v1-collection-namespaced-enterprise-search namespace nil))
  ([namespace optional-params]
   (:data (delete-enterprisesearch-k8s-elastic-co-v1-collection-namespaced-enterprise-search-with-http-info namespace optional-params))))

(defn delete-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  delete an EnterpriseSearch"
  ([name namespace ] (delete-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  delete an EnterpriseSearch"
  ([name namespace ] (delete-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search name namespace nil))
  ([name namespace optional-params]
   (:data (delete-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace optional-params))))

(defn list-enterprisesearch-k8s-elastic-co-v1-enterprise-search-for-all-namespaces-with-http-info
  "
  list objects of kind EnterpriseSearch"
  ([] (list-enterprisesearch-k8s-elastic-co-v1-enterprise-search-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/enterprisesearches" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-enterprisesearch-k8s-elastic-co-v1-enterprise-search-for-all-namespaces
  "
  list objects of kind EnterpriseSearch"
  ([] (list-enterprisesearch-k8s-elastic-co-v1-enterprise-search-for-all-namespaces nil))
  ([optional-params]
   (:data (list-enterprisesearch-k8s-elastic-co-v1-enterprise-search-for-all-namespaces-with-http-info optional-params))))

(defn list-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  list objects of kind EnterpriseSearch"
  ([namespace ] (list-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  list objects of kind EnterpriseSearch"
  ([namespace ] (list-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search namespace nil))
  ([namespace optional-params]
   (:data (list-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info namespace optional-params))))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  partially update the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  partially update the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace body optional-params))))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info
  "
  partially update scale of the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale
  "
  partially update scale of the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace body optional-params))))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info
  "
  partially update status of the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status
  "
  partially update status of the specified EnterpriseSearch"
  ([name namespace body ] (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace body optional-params))))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  read the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  read the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search name namespace nil))
  ([name namespace optional-params]
   (:data (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace optional-params))))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info
  "
  read scale of the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale
  "
  read scale of the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace optional-params))))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info
  "
  read status of the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status
  "
  read status of the specified EnterpriseSearch"
  ([name namespace ] (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace optional-params))))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info
  "
  replace the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search
  "
  replace the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-with-http-info name namespace body optional-params))))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info
  "
  replace scale of the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale
  "
  replace scale of the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-scale-with-http-info name namespace body optional-params))))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info
  "
  replace status of the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/enterprisesearch.k8s.elastic.co/v1/namespaces/{namespace}/enterprisesearches/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status
  "
  replace status of the specified EnterpriseSearch"
  ([name namespace body ] (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-enterprisesearch-k8s-elastic-co-v1-namespaced-enterprise-search-status-with-http-info name namespace body optional-params))))

