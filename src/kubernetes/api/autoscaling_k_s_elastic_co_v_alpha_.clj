(ns kubernetes.api.autoscaling-k-s-elastic-co-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  create an ElasticsearchAutoscaler"
  ([namespace body ] (create-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  create an ElasticsearchAutoscaler"
  ([namespace body ] (create-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info namespace body optional-params))))

(defn delete-autoscaling-k8s-elastic-co-v1alpha1-collection-namespaced-elasticsearch-autoscaler-with-http-info
  "
  delete collection of ElasticsearchAutoscaler"
  ([namespace ] (delete-autoscaling-k8s-elastic-co-v1alpha1-collection-namespaced-elasticsearch-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-k8s-elastic-co-v1alpha1-collection-namespaced-elasticsearch-autoscaler
  "
  delete collection of ElasticsearchAutoscaler"
  ([namespace ] (delete-autoscaling-k8s-elastic-co-v1alpha1-collection-namespaced-elasticsearch-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-k8s-elastic-co-v1alpha1-collection-namespaced-elasticsearch-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  delete an ElasticsearchAutoscaler"
  ([name namespace ] (delete-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  delete an ElasticsearchAutoscaler"
  ([name namespace ] (delete-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace optional-params))))

(defn list-autoscaling-k8s-elastic-co-v1alpha1-elasticsearch-autoscaler-for-all-namespaces-with-http-info
  "
  list objects of kind ElasticsearchAutoscaler"
  ([] (list-autoscaling-k8s-elastic-co-v1alpha1-elasticsearch-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/elasticsearchautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-k8s-elastic-co-v1alpha1-elasticsearch-autoscaler-for-all-namespaces
  "
  list objects of kind ElasticsearchAutoscaler"
  ([] (list-autoscaling-k8s-elastic-co-v1alpha1-elasticsearch-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-k8s-elastic-co-v1alpha1-elasticsearch-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  list objects of kind ElasticsearchAutoscaler"
  ([namespace ] (list-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  list objects of kind ElasticsearchAutoscaler"
  ([namespace ] (list-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info namespace optional-params))))

(defn patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  partially update the specified ElasticsearchAutoscaler"
  ([name namespace body ] (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  partially update the specified ElasticsearchAutoscaler"
  ([name namespace body ] (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info
  "
  partially update status of the specified ElasticsearchAutoscaler"
  ([name namespace body ] (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status
  "
  partially update status of the specified ElasticsearchAutoscaler"
  ([name namespace body ] (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace body optional-params))))

(defn read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  read the specified ElasticsearchAutoscaler"
  ([name namespace ] (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  read the specified ElasticsearchAutoscaler"
  ([name namespace ] (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info
  "
  read status of the specified ElasticsearchAutoscaler"
  ([name namespace ] (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status
  "
  read status of the specified ElasticsearchAutoscaler"
  ([name namespace ] (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace optional-params))))

(defn replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info
  "
  replace the specified ElasticsearchAutoscaler"
  ([name namespace body ] (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler
  "
  replace the specified ElasticsearchAutoscaler"
  ([name namespace body ] (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info
  "
  replace status of the specified ElasticsearchAutoscaler"
  ([name namespace body ] (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticsearchautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status
  "
  replace status of the specified ElasticsearchAutoscaler"
  ([name namespace body ] (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-k8s-elastic-co-v1alpha1-namespaced-elasticsearch-autoscaler-status-with-http-info name namespace body optional-params))))

