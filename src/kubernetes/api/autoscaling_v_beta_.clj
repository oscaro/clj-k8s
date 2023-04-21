(ns kubernetes.api.autoscaling-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info namespace body optional-params))))

(defn delete-autoscaling-v2beta1-collection-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v2beta1-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v2beta1-collection-namespaced-horizontal-pod-autoscaler
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v2beta1-collection-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v2beta1-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn get-autoscaling-v2beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/autoscaling/v2beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-autoscaling-v2beta1-api-resources
  "
  get available resources"
  []
  (:data (get-autoscaling-v2beta1-api-resources-with-http-info)))

(defn list-autoscaling-v2beta1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v2beta1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2beta1/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v2beta1-horizontal-pod-autoscaler-for-all-namespaces
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v2beta1-horizontal-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v2beta1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace optional-params))))

(defn replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/autoscaling/v2beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn watch-autoscaling-v2beta1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v2beta1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2beta1/watch/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2beta1-horizontal-pod-autoscaler-list-for-all-namespaces
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v2beta1-horizontal-pod-autoscaler-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-autoscaling-v2beta1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/autoscaling/v2beta1/watch/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-list-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/autoscaling/v2beta1/watch/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-list
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-list namespace nil))
  ([namespace optional-params]
   (:data (watch-autoscaling-v2beta1-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace optional-params))))

