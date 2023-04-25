(ns kubernetes.api.auto-gke-io-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  create an AllowlistedWorkload"
  ([body ] (create-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-auto-gke-io-v1alpha1-allowlisted-workload
  "
  create an AllowlistedWorkload"
  ([body ] (create-auto-gke-io-v1alpha1-allowlisted-workload body nil))
  ([body optional-params]
   (:data (create-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info body optional-params))))

(defn delete-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  delete an AllowlistedWorkload"
  ([name ] (delete-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-auto-gke-io-v1alpha1-allowlisted-workload
  "
  delete an AllowlistedWorkload"
  ([name ] (delete-auto-gke-io-v1alpha1-allowlisted-workload name nil))
  ([name optional-params]
   (:data (delete-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name optional-params))))

(defn delete-auto-gke-io-v1alpha1-collection-allowlisted-workload-with-http-info
  "
  delete collection of AllowlistedWorkload"
  ([] (delete-auto-gke-io-v1alpha1-collection-allowlisted-workload-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-auto-gke-io-v1alpha1-collection-allowlisted-workload
  "
  delete collection of AllowlistedWorkload"
  ([] (delete-auto-gke-io-v1alpha1-collection-allowlisted-workload nil))
  ([optional-params]
   (:data (delete-auto-gke-io-v1alpha1-collection-allowlisted-workload-with-http-info optional-params))))

(defn list-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  list objects of kind AllowlistedWorkload"
  ([] (list-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-auto-gke-io-v1alpha1-allowlisted-workload
  "
  list objects of kind AllowlistedWorkload"
  ([] (list-auto-gke-io-v1alpha1-allowlisted-workload nil))
  ([optional-params]
   (:data (list-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info optional-params))))

(defn patch-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  partially update the specified AllowlistedWorkload"
  ([name body ] (patch-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-auto-gke-io-v1alpha1-allowlisted-workload
  "
  partially update the specified AllowlistedWorkload"
  ([name body ] (patch-auto-gke-io-v1alpha1-allowlisted-workload name body nil))
  ([name body optional-params]
   (:data (patch-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name body optional-params))))

(defn read-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  read the specified AllowlistedWorkload"
  ([name ] (read-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-auto-gke-io-v1alpha1-allowlisted-workload
  "
  read the specified AllowlistedWorkload"
  ([name ] (read-auto-gke-io-v1alpha1-allowlisted-workload name nil))
  ([name optional-params]
   (:data (read-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name optional-params))))

(defn replace-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info
  "
  replace the specified AllowlistedWorkload"
  ([name body ] (replace-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/auto.gke.io/v1alpha1/allowlistedworkloads/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-auto-gke-io-v1alpha1-allowlisted-workload
  "
  replace the specified AllowlistedWorkload"
  ([name body ] (replace-auto-gke-io-v1alpha1-allowlisted-workload name body nil))
  ([name body optional-params]
   (:data (replace-auto-gke-io-v1alpha1-allowlisted-workload-with-http-info name body optional-params))))

