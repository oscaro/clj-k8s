(ns kubernetes.api.autoscaling-xk-s-io-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  create a ProvisioningRequest"
  ([namespace body ] (create-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  create a ProvisioningRequest"
  ([namespace body ] (create-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request namespace body nil))
  ([namespace body optional-params]
   (:data (create-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info namespace body optional-params))))

(defn delete-autoscaling-xk8s-io-v1beta1-collection-namespaced-provisioning-request-with-http-info
  "
  delete collection of ProvisioningRequest"
  ([namespace ] (delete-autoscaling-xk8s-io-v1beta1-collection-namespaced-provisioning-request-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-xk8s-io-v1beta1-collection-namespaced-provisioning-request
  "
  delete collection of ProvisioningRequest"
  ([namespace ] (delete-autoscaling-xk8s-io-v1beta1-collection-namespaced-provisioning-request namespace nil))
  ([namespace optional-params]
   (:data (delete-autoscaling-xk8s-io-v1beta1-collection-namespaced-provisioning-request-with-http-info namespace optional-params))))

(defn delete-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  delete a ProvisioningRequest"
  ([name namespace ] (delete-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  delete a ProvisioningRequest"
  ([name namespace ] (delete-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request name namespace nil))
  ([name namespace optional-params]
   (:data (delete-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace optional-params))))

(defn list-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  list objects of kind ProvisioningRequest"
  ([namespace ] (list-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  list objects of kind ProvisioningRequest"
  ([namespace ] (list-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request namespace nil))
  ([namespace optional-params]
   (:data (list-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info namespace optional-params))))

(defn list-autoscaling-xk8s-io-v1beta1-provisioning-request-for-all-namespaces-with-http-info
  "
  list objects of kind ProvisioningRequest"
  ([] (list-autoscaling-xk8s-io-v1beta1-provisioning-request-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/provisioningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-autoscaling-xk8s-io-v1beta1-provisioning-request-for-all-namespaces
  "
  list objects of kind ProvisioningRequest"
  ([] (list-autoscaling-xk8s-io-v1beta1-provisioning-request-for-all-namespaces nil))
  ([optional-params]
   (:data (list-autoscaling-xk8s-io-v1beta1-provisioning-request-for-all-namespaces-with-http-info optional-params))))

(defn patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  partially update the specified ProvisioningRequest"
  ([name namespace body ] (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  partially update the specified ProvisioningRequest"
  ([name namespace body ] (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace body optional-params))))

(defn patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info
  "
  partially update status of the specified ProvisioningRequest"
  ([name namespace body ] (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status
  "
  partially update status of the specified ProvisioningRequest"
  ([name namespace body ] (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace body optional-params))))

(defn read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  read the specified ProvisioningRequest"
  ([name namespace ] (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  read the specified ProvisioningRequest"
  ([name namespace ] (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace optional-params))))

(defn read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info
  "
  read status of the specified ProvisioningRequest"
  ([name namespace ] (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status
  "
  read status of the specified ProvisioningRequest"
  ([name namespace ] (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace optional-params))))

(defn replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info
  "
  replace the specified ProvisioningRequest"
  ([name namespace body ] (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request
  "
  replace the specified ProvisioningRequest"
  ([name namespace body ] (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-with-http-info name namespace body optional-params))))

(defn replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info
  "
  replace status of the specified ProvisioningRequest"
  ([name namespace body ] (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/autoscaling.x-k8s.io/v1beta1/namespaces/{namespace}/provisioningrequests/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status
  "
  replace status of the specified ProvisioningRequest"
  ([name namespace body ] (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-autoscaling-xk8s-io-v1beta1-namespaced-provisioning-request-status-with-http-info name namespace body optional-params))))

