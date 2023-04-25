(ns kubernetes.api.metrics-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-metrics-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/metrics.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-metrics-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-metrics-v1beta1-api-resources-with-http-info)))

(defn list-metrics-v1beta1-namespaced-pod-metrics-with-http-info
  "
  list objects of kind PodMetrics"
  ([namespace ] (list-metrics-v1beta1-namespaced-pod-metrics-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/metrics.k8s.io/v1beta1/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-metrics-v1beta1-namespaced-pod-metrics
  "
  list objects of kind PodMetrics"
  ([namespace ] (list-metrics-v1beta1-namespaced-pod-metrics namespace nil))
  ([namespace optional-params]
   (:data (list-metrics-v1beta1-namespaced-pod-metrics-with-http-info namespace optional-params))))

(defn list-metrics-v1beta1-node-metrics-with-http-info
  "
  list objects of kind NodeMetrics"
  ([] (list-metrics-v1beta1-node-metrics-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/metrics.k8s.io/v1beta1/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-metrics-v1beta1-node-metrics
  "
  list objects of kind NodeMetrics"
  ([] (list-metrics-v1beta1-node-metrics nil))
  ([optional-params]
   (:data (list-metrics-v1beta1-node-metrics-with-http-info optional-params))))

(defn list-metrics-v1beta1-pod-metrics-for-all-namespaces-with-http-info
  "
  list objects of kind PodMetrics"
  ([] (list-metrics-v1beta1-pod-metrics-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/metrics.k8s.io/v1beta1/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-metrics-v1beta1-pod-metrics-for-all-namespaces
  "
  list objects of kind PodMetrics"
  ([] (list-metrics-v1beta1-pod-metrics-for-all-namespaces nil))
  ([optional-params]
   (:data (list-metrics-v1beta1-pod-metrics-for-all-namespaces-with-http-info optional-params))))

(defn read-metrics-v1beta1-namespaced-pod-metrics-with-http-info
  "
  read the specified PodMetrics"
  ([name namespace ] (read-metrics-v1beta1-namespaced-pod-metrics-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/metrics.k8s.io/v1beta1/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-metrics-v1beta1-namespaced-pod-metrics
  "
  read the specified PodMetrics"
  ([name namespace ] (read-metrics-v1beta1-namespaced-pod-metrics name namespace nil))
  ([name namespace optional-params]
   (:data (read-metrics-v1beta1-namespaced-pod-metrics-with-http-info name namespace optional-params))))

(defn read-metrics-v1beta1-node-metrics-with-http-info
  "
  read the specified NodeMetrics"
  ([name ] (read-metrics-v1beta1-node-metrics-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/metrics.k8s.io/v1beta1/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-metrics-v1beta1-node-metrics
  "
  read the specified NodeMetrics"
  ([name ] (read-metrics-v1beta1-node-metrics name nil))
  ([name optional-params]
   (:data (read-metrics-v1beta1-node-metrics-with-http-info name optional-params))))

