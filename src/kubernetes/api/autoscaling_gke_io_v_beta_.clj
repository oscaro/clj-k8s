(ns kubernetes.api.autoscaling-gke-io-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  create a MultidimPodAutoscaler"
  ([namespace body ] (create-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  create a MultidimPodAutoscaler"
  ([namespace body ] (create-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info namespace body optional-params))))

(defn delete-autoscaling-gke-io-v1beta1-collection-namespaced-multidim-pod-autoscaler-with-http-info
  "
  delete collection of MultidimPodAutoscaler"
  ([namespace ] (delete-autoscaling-gke-io-v1beta1-collection-namespaced-multidim-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-gke-io-v1beta1-collection-namespaced-multidim-pod-autoscaler
  "
  delete collection of MultidimPodAutoscaler"
  ([namespace ] (delete-autoscaling-gke-io-v1beta1-collection-namespaced-multidim-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-gke-io-v1beta1-collection-namespaced-multidim-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  delete a MultidimPodAutoscaler"
  ([name namespace ] (delete-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  delete a MultidimPodAutoscaler"
  ([name namespace ] (delete-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace optional-params))))

(defn list-autoscaling-gke-io-v1beta1-multidim-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list objects of kind MultidimPodAutoscaler"
  ([] (list-autoscaling-gke-io-v1beta1-multidim-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/multidimpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-gke-io-v1beta1-multidim-pod-autoscaler-for-all-namespaces
  "
  list objects of kind MultidimPodAutoscaler"
  ([] (list-autoscaling-gke-io-v1beta1-multidim-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-gke-io-v1beta1-multidim-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  list objects of kind MultidimPodAutoscaler"
  ([namespace ] (list-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  list objects of kind MultidimPodAutoscaler"
  ([namespace ] (list-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info namespace optional-params))))

(defn patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  partially update the specified MultidimPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  partially update the specified MultidimPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info
  "
  partially update status of the specified MultidimPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status
  "
  partially update status of the specified MultidimPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  read the specified MultidimPodAutoscaler"
  ([name namespace ] (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  read the specified MultidimPodAutoscaler"
  ([name namespace ] (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info
  "
  read status of the specified MultidimPodAutoscaler"
  ([name namespace ] (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status
  "
  read status of the specified MultidimPodAutoscaler"
  ([name namespace ] (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace optional-params))))

(defn replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info
  "
  replace the specified MultidimPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler
  "
  replace the specified MultidimPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info
  "
  replace status of the specified MultidimPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.gke.io/v1beta1/namespaces/{namespace}/multidimpodautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status
  "
  replace status of the specified MultidimPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-gke-io-v1beta1-namespaced-multidim-pod-autoscaler-status-with-http-info name namespace body optional-params))))

