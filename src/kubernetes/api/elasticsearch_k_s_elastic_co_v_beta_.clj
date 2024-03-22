(ns kubernetes.api.elasticsearch-k-s-elastic-co-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  create an Elasticsearch"
  ([namespace body ] (create-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  create an Elasticsearch"
  ([namespace body ] (create-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch namespace body nil))
  ([namespace body optional-params]
   (:data (create-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info namespace body optional-params))))

(defn delete-elasticsearch-k8s-elastic-co-v1beta1-collection-namespaced-elasticsearch-with-http-info
  "
  delete collection of Elasticsearch"
  ([namespace ] (delete-elasticsearch-k8s-elastic-co-v1beta1-collection-namespaced-elasticsearch-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-elasticsearch-k8s-elastic-co-v1beta1-collection-namespaced-elasticsearch
  "
  delete collection of Elasticsearch"
  ([namespace ] (delete-elasticsearch-k8s-elastic-co-v1beta1-collection-namespaced-elasticsearch namespace nil))
  ([namespace optional-params]
   (:data (delete-elasticsearch-k8s-elastic-co-v1beta1-collection-namespaced-elasticsearch-with-http-info namespace optional-params))))

(defn delete-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  delete an Elasticsearch"
  ([name namespace ] (delete-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  delete an Elasticsearch"
  ([name namespace ] (delete-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch name namespace nil))
  ([name namespace optional-params]
   (:data (delete-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace optional-params))))

(defn list-elasticsearch-k8s-elastic-co-v1beta1-elasticsearch-for-all-namespaces-with-http-info
  "
  list objects of kind Elasticsearch"
  ([] (list-elasticsearch-k8s-elastic-co-v1beta1-elasticsearch-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/elasticsearches" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-elasticsearch-k8s-elastic-co-v1beta1-elasticsearch-for-all-namespaces
  "
  list objects of kind Elasticsearch"
  ([] (list-elasticsearch-k8s-elastic-co-v1beta1-elasticsearch-for-all-namespaces nil))
  ([optional-params]
   (:data (list-elasticsearch-k8s-elastic-co-v1beta1-elasticsearch-for-all-namespaces-with-http-info optional-params))))

(defn list-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  list objects of kind Elasticsearch"
  ([namespace ] (list-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  list objects of kind Elasticsearch"
  ([namespace ] (list-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch namespace nil))
  ([namespace optional-params]
   (:data (list-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info namespace optional-params))))

(defn patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  partially update the specified Elasticsearch"
  ([name namespace body ] (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  partially update the specified Elasticsearch"
  ([name namespace body ] (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace body optional-params))))

(defn patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info
  "
  partially update status of the specified Elasticsearch"
  ([name namespace body ] (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status
  "
  partially update status of the specified Elasticsearch"
  ([name namespace body ] (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace body optional-params))))

(defn read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  read the specified Elasticsearch"
  ([name namespace ] (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  read the specified Elasticsearch"
  ([name namespace ] (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch name namespace nil))
  ([name namespace optional-params]
   (:data (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace optional-params))))

(defn read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info
  "
  read status of the specified Elasticsearch"
  ([name namespace ] (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status
  "
  read status of the specified Elasticsearch"
  ([name namespace ] (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace optional-params))))

(defn replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info
  "
  replace the specified Elasticsearch"
  ([name namespace body ] (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch
  "
  replace the specified Elasticsearch"
  ([name namespace body ] (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-with-http-info name namespace body optional-params))))

(defn replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info
  "
  replace status of the specified Elasticsearch"
  ([name namespace body ] (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/elasticsearch.k8s.elastic.co/v1beta1/namespaces/{namespace}/elasticsearches/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status
  "
  replace status of the specified Elasticsearch"
  ([name namespace body ] (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-elasticsearch-k8s-elastic-co-v1beta1-namespaced-elasticsearch-status-with-http-info name namespace body optional-params))))

