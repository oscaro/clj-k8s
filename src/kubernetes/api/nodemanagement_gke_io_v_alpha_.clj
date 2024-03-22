(ns kubernetes.api.nodemanagement-gke-io-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  create an UpdateInfo"
  ([namespace body ] (create-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  create an UpdateInfo"
  ([namespace body ] (create-nodemanagement-gke-io-v1alpha1-namespaced-update-info namespace body nil))
  ([namespace body optional-params]
   (:data (create-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info namespace body optional-params))))

(defn delete-nodemanagement-gke-io-v1alpha1-collection-namespaced-update-info-with-http-info
  "
  delete collection of UpdateInfo"
  ([namespace ] (delete-nodemanagement-gke-io-v1alpha1-collection-namespaced-update-info-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-nodemanagement-gke-io-v1alpha1-collection-namespaced-update-info
  "
  delete collection of UpdateInfo"
  ([namespace ] (delete-nodemanagement-gke-io-v1alpha1-collection-namespaced-update-info namespace nil))
  ([namespace optional-params]
   (:data (delete-nodemanagement-gke-io-v1alpha1-collection-namespaced-update-info-with-http-info namespace optional-params))))

(defn delete-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  delete an UpdateInfo"
  ([name namespace ] (delete-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  delete an UpdateInfo"
  ([name namespace ] (delete-nodemanagement-gke-io-v1alpha1-namespaced-update-info name namespace nil))
  ([name namespace optional-params]
   (:data (delete-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace optional-params))))

(defn list-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  list objects of kind UpdateInfo"
  ([namespace ] (list-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  list objects of kind UpdateInfo"
  ([namespace ] (list-nodemanagement-gke-io-v1alpha1-namespaced-update-info namespace nil))
  ([namespace optional-params]
   (:data (list-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info namespace optional-params))))

(defn list-nodemanagement-gke-io-v1alpha1-update-info-for-all-namespaces-with-http-info
  "
  list objects of kind UpdateInfo"
  ([] (list-nodemanagement-gke-io-v1alpha1-update-info-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/updateinfos" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-nodemanagement-gke-io-v1alpha1-update-info-for-all-namespaces
  "
  list objects of kind UpdateInfo"
  ([] (list-nodemanagement-gke-io-v1alpha1-update-info-for-all-namespaces nil))
  ([optional-params]
   (:data (list-nodemanagement-gke-io-v1alpha1-update-info-for-all-namespaces-with-http-info optional-params))))

(defn patch-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  partially update the specified UpdateInfo"
  ([name namespace body ] (patch-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  partially update the specified UpdateInfo"
  ([name namespace body ] (patch-nodemanagement-gke-io-v1alpha1-namespaced-update-info name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace body optional-params))))

(defn read-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  read the specified UpdateInfo"
  ([name namespace ] (read-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  read the specified UpdateInfo"
  ([name namespace ] (read-nodemanagement-gke-io-v1alpha1-namespaced-update-info name namespace nil))
  ([name namespace optional-params]
   (:data (read-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace optional-params))))

(defn replace-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info
  "
  replace the specified UpdateInfo"
  ([name namespace body ] (replace-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/nodemanagement.gke.io/v1alpha1/namespaces/{namespace}/updateinfos/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-nodemanagement-gke-io-v1alpha1-namespaced-update-info
  "
  replace the specified UpdateInfo"
  ([name namespace body ] (replace-nodemanagement-gke-io-v1alpha1-namespaced-update-info name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-nodemanagement-gke-io-v1alpha1-namespaced-update-info-with-http-info name namespace body optional-params))))

