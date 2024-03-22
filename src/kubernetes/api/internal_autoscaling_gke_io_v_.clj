(ns kubernetes.api.internal-autoscaling-gke-io-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  create a CapacityRequest"
  ([namespace body ] (create-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  create a CapacityRequest"
  ([namespace body ] (create-internal-autoscaling-gke-io-v1-namespaced-capacity-request namespace body nil))
  ([namespace body optional-params]
   (:data (create-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info namespace body optional-params))))

(defn delete-internal-autoscaling-gke-io-v1-collection-namespaced-capacity-request-with-http-info
  "
  delete collection of CapacityRequest"
  ([namespace ] (delete-internal-autoscaling-gke-io-v1-collection-namespaced-capacity-request-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-internal-autoscaling-gke-io-v1-collection-namespaced-capacity-request
  "
  delete collection of CapacityRequest"
  ([namespace ] (delete-internal-autoscaling-gke-io-v1-collection-namespaced-capacity-request namespace nil))
  ([namespace optional-params]
   (:data (delete-internal-autoscaling-gke-io-v1-collection-namespaced-capacity-request-with-http-info namespace optional-params))))

(defn delete-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  delete a CapacityRequest"
  ([name namespace ] (delete-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  delete a CapacityRequest"
  ([name namespace ] (delete-internal-autoscaling-gke-io-v1-namespaced-capacity-request name namespace nil))
  ([name namespace optional-params]
   (:data (delete-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace optional-params))))

(defn list-internal-autoscaling-gke-io-v1-capacity-request-for-all-namespaces-with-http-info
  "
  list objects of kind CapacityRequest"
  ([] (list-internal-autoscaling-gke-io-v1-capacity-request-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/capacityrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-internal-autoscaling-gke-io-v1-capacity-request-for-all-namespaces
  "
  list objects of kind CapacityRequest"
  ([] (list-internal-autoscaling-gke-io-v1-capacity-request-for-all-namespaces nil))
  ([optional-params]
   (:data (list-internal-autoscaling-gke-io-v1-capacity-request-for-all-namespaces-with-http-info optional-params))))

(defn list-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  list objects of kind CapacityRequest"
  ([namespace ] (list-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  list objects of kind CapacityRequest"
  ([namespace ] (list-internal-autoscaling-gke-io-v1-namespaced-capacity-request namespace nil))
  ([namespace optional-params]
   (:data (list-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info namespace optional-params))))

(defn patch-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  partially update the specified CapacityRequest"
  ([name namespace body ] (patch-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  partially update the specified CapacityRequest"
  ([name namespace body ] (patch-internal-autoscaling-gke-io-v1-namespaced-capacity-request name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace body optional-params))))

(defn read-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  read the specified CapacityRequest"
  ([name namespace ] (read-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  read the specified CapacityRequest"
  ([name namespace ] (read-internal-autoscaling-gke-io-v1-namespaced-capacity-request name namespace nil))
  ([name namespace optional-params]
   (:data (read-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace optional-params))))

(defn replace-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info
  "
  replace the specified CapacityRequest"
  ([name namespace body ] (replace-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/internal.autoscaling.gke.io/v1/namespaces/{namespace}/capacityrequests/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-internal-autoscaling-gke-io-v1-namespaced-capacity-request
  "
  replace the specified CapacityRequest"
  ([name namespace body ] (replace-internal-autoscaling-gke-io-v1-namespaced-capacity-request name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-internal-autoscaling-gke-io-v1-namespaced-capacity-request-with-http-info name namespace body optional-params))))

