(ns kubernetes.api.monitoring-coreos-com-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  create an AlertmanagerConfig"
  ([namespace body ] (create-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  create an AlertmanagerConfig"
  ([namespace body ] (create-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info namespace body optional-params))))

(defn delete-monitoring-coreos-com-v1alpha1-collection-namespaced-alertmanager-config-with-http-info
  "
  delete collection of AlertmanagerConfig"
  ([namespace ] (delete-monitoring-coreos-com-v1alpha1-collection-namespaced-alertmanager-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1alpha1-collection-namespaced-alertmanager-config
  "
  delete collection of AlertmanagerConfig"
  ([namespace ] (delete-monitoring-coreos-com-v1alpha1-collection-namespaced-alertmanager-config namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1alpha1-collection-namespaced-alertmanager-config-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  delete an AlertmanagerConfig"
  ([name namespace ] (delete-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  delete an AlertmanagerConfig"
  ([name namespace ] (delete-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace optional-params))))

(defn list-monitoring-coreos-com-v1alpha1-alertmanager-config-for-all-namespaces-with-http-info
  "
  list objects of kind AlertmanagerConfig"
  ([] (list-monitoring-coreos-com-v1alpha1-alertmanager-config-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/alertmanagerconfigs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1alpha1-alertmanager-config-for-all-namespaces
  "
  list objects of kind AlertmanagerConfig"
  ([] (list-monitoring-coreos-com-v1alpha1-alertmanager-config-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1alpha1-alertmanager-config-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  list objects of kind AlertmanagerConfig"
  ([namespace ] (list-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  list objects of kind AlertmanagerConfig"
  ([namespace ] (list-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info namespace optional-params))))

(defn patch-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  partially update the specified AlertmanagerConfig"
  ([name namespace body ] (patch-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  partially update the specified AlertmanagerConfig"
  ([name namespace body ] (patch-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace body optional-params))))

(defn read-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  read the specified AlertmanagerConfig"
  ([name namespace ] (read-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  read the specified AlertmanagerConfig"
  ([name namespace ] (read-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace optional-params))))

(defn replace-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info
  "
  replace the specified AlertmanagerConfig"
  ([name namespace body ] (replace-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1alpha1/namespaces/{namespace}/alertmanagerconfigs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config
  "
  replace the specified AlertmanagerConfig"
  ([name namespace body ] (replace-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1alpha1-namespaced-alertmanager-config-with-http-info name namespace body optional-params))))

