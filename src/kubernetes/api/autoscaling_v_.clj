(ns kubernetes.api.autoscaling-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1-namespaced-horizontal-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info namespace body optional-params))))

(defn create-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  create a VerticalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  create a VerticalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v1-namespaced-vertical-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info namespace body optional-params))))

(defn create-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  create a VerticalPodAutoscalerCheckpoint"
  ([namespace body ] (create-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  create a VerticalPodAutoscalerCheckpoint"
  ([namespace body ] (create-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace body optional-params))))

(defn create-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  create a HorizontalPodAutoscaler"
  ([namespace body ] (create-autoscaling-v2-namespaced-horizontal-pod-autoscaler namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info namespace body optional-params))))

(defn delete-autoscaling-v1-collection-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-collection-namespaced-horizontal-pod-autoscaler
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v1-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-with-http-info
  "
  delete collection of VerticalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler
  "
  delete collection of VerticalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  delete collection of VerticalPodAutoscalerCheckpoint"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-checkpoint
  "
  delete collection of VerticalPodAutoscalerCheckpoint"
  ([namespace ] (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-checkpoint namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v1-collection-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace optional-params))))

(defn delete-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  delete a VerticalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  delete a VerticalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace optional-params))))

(defn delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  delete a VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  delete a VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace optional-params))))

(defn delete-autoscaling-v2-collection-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v2-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v2-collection-namespaced-horizontal-pod-autoscaler
  "
  delete collection of HorizontalPodAutoscaler"
  ([namespace ] (delete-autoscaling-v2-collection-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-v2-collection-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn delete-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  delete a HorizontalPodAutoscaler"
  ([name namespace ] (delete-autoscaling-v2-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn get-autoscaling-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/autoscaling/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-autoscaling-v1-api-resources
  "
  get available resources"
  []
  (:data (get-autoscaling-v1-api-resources-with-http-info)))

(defn get-autoscaling-v2-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/autoscaling/v2/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-autoscaling-v2-api-resources
  "
  get available resources"
  []
  (:data (get-autoscaling-v2-api-resources-with-http-info)))

(defn list-autoscaling-v1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v1/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-horizontal-pod-autoscaler-for-all-namespaces
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v1-horizontal-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v1-horizontal-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn list-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  list objects of kind VerticalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  list objects of kind VerticalPodAutoscaler"
  ([namespace ] (list-autoscaling-v1-namespaced-vertical-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info namespace optional-params))))

(defn list-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([namespace ] (list-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([namespace ] (list-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info namespace optional-params))))

(defn list-autoscaling-v1-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([] (list-autoscaling-v1-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/verticalpodautoscalercheckpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-vertical-pod-autoscaler-checkpoint-for-all-namespaces
  "
  list objects of kind VerticalPodAutoscalerCheckpoint"
  ([] (list-autoscaling-v1-vertical-pod-autoscaler-checkpoint-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v1-vertical-pod-autoscaler-checkpoint-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v1-vertical-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list objects of kind VerticalPodAutoscaler"
  ([] (list-autoscaling-v1-vertical-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/verticalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v1-vertical-pod-autoscaler-for-all-namespaces
  "
  list objects of kind VerticalPodAutoscaler"
  ([] (list-autoscaling-v1-vertical-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v1-vertical-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v2-horizontal-pod-autoscaler-for-all-namespaces-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v2-horizontal-pod-autoscaler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v2-horizontal-pod-autoscaler-for-all-namespaces
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([] (list-autoscaling-v2-horizontal-pod-autoscaler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-v2-horizontal-pod-autoscaler-for-all-namespaces-with-http-info optional-params))))

(defn list-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  list or watch objects of kind HorizontalPodAutoscaler"
  ([namespace ] (list-autoscaling-v2-namespaced-horizontal-pod-autoscaler namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info namespace optional-params))))

(defn patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  partially update the specified VerticalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  partially update the specified VerticalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  partially update the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  partially update the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  partially update the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status
  "
  partially update status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace optional-params))))

(defn read-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  read the specified VerticalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  read the specified VerticalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v1-namespaced-vertical-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  read the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (read-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  read the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace ] (read-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace optional-params))))

(defn read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  read the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status
  "
  read status of the specified HorizontalPodAutoscaler"
  ([name namespace ] (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace optional-params))))

(defn replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info
  "
  replace the specified VerticalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1-namespaced-vertical-pod-autoscaler
  "
  replace the specified VerticalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info
  "
  replace the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.k8s.io/v1/namespaces/{namespace}/verticalpodautoscalercheckpoints/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint
  "
  replace the specified VerticalPodAutoscalerCheckpoint"
  ([name namespace body ] (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v1-namespaced-vertical-pod-autoscaler-checkpoint-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  replace the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling/v2/namespaces/{namespace}/horizontalpodautoscalers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status
  "
  replace status of the specified HorizontalPodAutoscaler"
  ([name namespace body ] (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-v2-namespaced-horizontal-pod-autoscaler-status-with-http-info name namespace body optional-params))))

(defn watch-autoscaling-v1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v1/watch/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v1-horizontal-pod-autoscaler-list-for-all-namespaces
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v1-horizontal-pod-autoscaler-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-autoscaling-v1-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-list-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-list
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-list namespace nil))
  ([namespace optional-params]
   (:data (watch-autoscaling-v1-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace optional-params))))

(defn watch-autoscaling-v2-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v2-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2/watch/horizontalpodautoscalers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2-horizontal-pod-autoscaler-list-for-all-namespaces
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-autoscaling-v2-horizontal-pod-autoscaler-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-autoscaling-v2-horizontal-pod-autoscaler-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2/watch/namespaces/{namespace}/horizontalpodautoscalers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler
  "
  watch changes to an object of kind HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler name namespace nil))
  ([name namespace optional-params]
   (:data (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-with-http-info name namespace optional-params))))

(defn watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-list-with-http-info
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling/v2/watch/namespaces/{namespace}/horizontalpodautoscalers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-list
  "
  watch individual changes to a list of HorizontalPodAutoscaler. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-list namespace nil))
  ([namespace optional-params]
   (:data (watch-autoscaling-v2-namespaced-horizontal-pod-autoscaler-list-with-http-info namespace optional-params))))

