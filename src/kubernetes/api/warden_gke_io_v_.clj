(ns kubernetes.api.warden-gke-io-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-warden-gke-io-v1-audit-with-http-info
  "
  create an Audit"
  ([body ] (create-warden-gke-io-v1-audit-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/warden.gke.io/v1/audits" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-warden-gke-io-v1-audit
  "
  create an Audit"
  ([body ] (create-warden-gke-io-v1-audit body nil))
  ([body optional-params]
   (:data (create-warden-gke-io-v1-audit-with-http-info body optional-params))))

(defn delete-warden-gke-io-v1-audit-with-http-info
  "
  delete an Audit"
  ([name ] (delete-warden-gke-io-v1-audit-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-warden-gke-io-v1-audit
  "
  delete an Audit"
  ([name ] (delete-warden-gke-io-v1-audit name nil))
  ([name optional-params]
   (:data (delete-warden-gke-io-v1-audit-with-http-info name optional-params))))

(defn delete-warden-gke-io-v1-collection-audit-with-http-info
  "
  delete collection of Audit"
  ([] (delete-warden-gke-io-v1-collection-audit-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/warden.gke.io/v1/audits" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-warden-gke-io-v1-collection-audit
  "
  delete collection of Audit"
  ([] (delete-warden-gke-io-v1-collection-audit nil))
  ([optional-params]
   (:data (delete-warden-gke-io-v1-collection-audit-with-http-info optional-params))))

(defn list-warden-gke-io-v1-audit-with-http-info
  "
  list objects of kind Audit"
  ([] (list-warden-gke-io-v1-audit-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/warden.gke.io/v1/audits" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-warden-gke-io-v1-audit
  "
  list objects of kind Audit"
  ([] (list-warden-gke-io-v1-audit nil))
  ([optional-params]
   (:data (list-warden-gke-io-v1-audit-with-http-info optional-params))))

(defn patch-warden-gke-io-v1-audit-with-http-info
  "
  partially update the specified Audit"
  ([name body ] (patch-warden-gke-io-v1-audit-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-warden-gke-io-v1-audit
  "
  partially update the specified Audit"
  ([name body ] (patch-warden-gke-io-v1-audit name body nil))
  ([name body optional-params]
   (:data (patch-warden-gke-io-v1-audit-with-http-info name body optional-params))))

(defn patch-warden-gke-io-v1-audit-status-with-http-info
  "
  partially update status of the specified Audit"
  ([name body ] (patch-warden-gke-io-v1-audit-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-warden-gke-io-v1-audit-status
  "
  partially update status of the specified Audit"
  ([name body ] (patch-warden-gke-io-v1-audit-status name body nil))
  ([name body optional-params]
   (:data (patch-warden-gke-io-v1-audit-status-with-http-info name body optional-params))))

(defn read-warden-gke-io-v1-audit-with-http-info
  "
  read the specified Audit"
  ([name ] (read-warden-gke-io-v1-audit-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-warden-gke-io-v1-audit
  "
  read the specified Audit"
  ([name ] (read-warden-gke-io-v1-audit name nil))
  ([name optional-params]
   (:data (read-warden-gke-io-v1-audit-with-http-info name optional-params))))

(defn read-warden-gke-io-v1-audit-status-with-http-info
  "
  read status of the specified Audit"
  ([name ] (read-warden-gke-io-v1-audit-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-warden-gke-io-v1-audit-status
  "
  read status of the specified Audit"
  ([name ] (read-warden-gke-io-v1-audit-status name nil))
  ([name optional-params]
   (:data (read-warden-gke-io-v1-audit-status-with-http-info name optional-params))))

(defn replace-warden-gke-io-v1-audit-with-http-info
  "
  replace the specified Audit"
  ([name body ] (replace-warden-gke-io-v1-audit-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-warden-gke-io-v1-audit
  "
  replace the specified Audit"
  ([name body ] (replace-warden-gke-io-v1-audit name body nil))
  ([name body optional-params]
   (:data (replace-warden-gke-io-v1-audit-with-http-info name body optional-params))))

(defn replace-warden-gke-io-v1-audit-status-with-http-info
  "
  replace status of the specified Audit"
  ([name body ] (replace-warden-gke-io-v1-audit-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/warden.gke.io/v1/audits/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-warden-gke-io-v1-audit-status
  "
  replace status of the specified Audit"
  ([name body ] (replace-warden-gke-io-v1-audit-status name body nil))
  ([name body optional-params]
   (:data (replace-warden-gke-io-v1-audit-status-with-http-info name body optional-params))))

