(ns kubernetes.api.autoscaling-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  create a VerticalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  create a VerticalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info namespace body optional-params))))

(defn create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  create a VerticalPodAutoscalerCheckpoint"
  ([namespace body ] (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  create a VerticalPodAutoscalerCheckpoint"
  ([namespace body ] (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace body optional-params))))

(defn delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-with-http-info
  "
  delete collection of VerticalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler
  "
  delete collection of VerticalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  delete collection of VerticalPodAutoscalerCheckpoint"
  ([namespace ] (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-checkpoint
  "
  delete collection of VerticalPodAutoscalerCheckpoint"
  ([namespace ] (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-checkpoint namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v1beta2-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace optional-params))))

(defn delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  delete a VerticalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  delete a VerticalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace optional-params))))

(defn delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  delete a VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  delete a VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace optional-params))))

(defn list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  list objects of kind VerticalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  list objects of kind VerticalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info namespace optional-params))))

(defn list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([namespace ] (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([namespace ] (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace optional-params))))

(defn list-autoscaling-v1beta2-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([] (list-autoscaling-v1beta2-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/verticalpodautoscalercheckpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1beta2-vertical-pod-autoscaler-checkpoint-for-all-namespaces
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([] (list-autoscaling-v1beta2-vertical-pod-autoscaler-checkpoint-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v1beta2-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v1beta2-vertical-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list objects of kind VerticalPodAutoscaler"
  ([] (list-autoscaling-v1beta2-vertical-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/verticalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1beta2-vertical-pod-autoscaler-for-all-namespaces
  "
  list objects of kind VerticalPodAutoscaler"
  ([] (list-autoscaling-v1beta2-vertical-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v1beta2-vertical-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  partially update the specified VerticalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  partially update the specified VerticalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  partially update the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  partially update the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body optional-params))))

(defn read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  read the specified VerticalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  read the specified VerticalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  read the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  read the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace optional-params))))

(defn replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info
  "
  replace the specified VerticalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler
  "
  replace the specified VerticalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  replace the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1beta2/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint
  "
  replace the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1beta2-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body optional-params))))

