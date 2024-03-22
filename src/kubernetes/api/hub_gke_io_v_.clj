(ns kubernetes.api.hub-gke-io-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-hub-gke-io-v1-membership-with-http-info
  "
  create a Membership"
  ([body ] (create-hub-gke-io-v1-membership-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/hub.gke.io/v1/memberships" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-hub-gke-io-v1-membership
  "
  create a Membership"
  ([body ] (create-hub-gke-io-v1-membership body nil))
  ([body optional-params]
   (:data (create-hub-gke-io-v1-membership-with-http-info body optional-params))))

(defn delete-hub-gke-io-v1-collection-membership-with-http-info
  "
  delete collection of Membership"
  ([] (delete-hub-gke-io-v1-collection-membership-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/hub.gke.io/v1/memberships" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-hub-gke-io-v1-collection-membership
  "
  delete collection of Membership"
  ([] (delete-hub-gke-io-v1-collection-membership nil))
  ([optional-params]
   (:data (delete-hub-gke-io-v1-collection-membership-with-http-info optional-params))))

(defn delete-hub-gke-io-v1-membership-with-http-info
  "
  delete a Membership"
  ([name ] (delete-hub-gke-io-v1-membership-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/hub.gke.io/v1/memberships/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-hub-gke-io-v1-membership
  "
  delete a Membership"
  ([name ] (delete-hub-gke-io-v1-membership name nil))
  ([name optional-params]
   (:data (delete-hub-gke-io-v1-membership-with-http-info name optional-params))))

(defn list-hub-gke-io-v1-membership-with-http-info
  "
  list objects of kind Membership"
  ([] (list-hub-gke-io-v1-membership-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/hub.gke.io/v1/memberships" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-hub-gke-io-v1-membership
  "
  list objects of kind Membership"
  ([] (list-hub-gke-io-v1-membership nil))
  ([optional-params]
   (:data (list-hub-gke-io-v1-membership-with-http-info optional-params))))

(defn patch-hub-gke-io-v1-membership-with-http-info
  "
  partially update the specified Membership"
  ([name body ] (patch-hub-gke-io-v1-membership-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/hub.gke.io/v1/memberships/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-hub-gke-io-v1-membership
  "
  partially update the specified Membership"
  ([name body ] (patch-hub-gke-io-v1-membership name body nil))
  ([name body optional-params]
   (:data (patch-hub-gke-io-v1-membership-with-http-info name body optional-params))))

(defn read-hub-gke-io-v1-membership-with-http-info
  "
  read the specified Membership"
  ([name ] (read-hub-gke-io-v1-membership-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/hub.gke.io/v1/memberships/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-hub-gke-io-v1-membership
  "
  read the specified Membership"
  ([name ] (read-hub-gke-io-v1-membership name nil))
  ([name optional-params]
   (:data (read-hub-gke-io-v1-membership-with-http-info name optional-params))))

(defn replace-hub-gke-io-v1-membership-with-http-info
  "
  replace the specified Membership"
  ([name body ] (replace-hub-gke-io-v1-membership-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/hub.gke.io/v1/memberships/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-hub-gke-io-v1-membership
  "
  replace the specified Membership"
  ([name body ] (replace-hub-gke-io-v1-membership name body nil))
  ([name body optional-params]
   (:data (replace-hub-gke-io-v1-membership-with-http-info name body optional-params))))

