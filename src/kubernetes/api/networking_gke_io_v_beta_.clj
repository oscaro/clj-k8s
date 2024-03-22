(ns kubernetes.api.networking-gke-io-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  create a FrontendConfig"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  create a FrontendConfig"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-frontend-config namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-managed-certificate namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  create a ServiceAttachment"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  create a ServiceAttachment"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-service-attachment namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  create a ServiceNetworkEndpointGroup"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  create a ServiceNetworkEndpointGroup"
  ([namespace body ] (create-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1beta2-namespaced-managed-certificate namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info namespace body optional-params))))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-frontend-config-with-http-info
  "
  delete collection of FrontendConfig"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-frontend-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-frontend-config
  "
  delete collection of FrontendConfig"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-frontend-config namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-collection-namespaced-frontend-config-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-managed-certificate-with-http-info
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-managed-certificate
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-collection-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-service-attachment-with-http-info
  "
  delete collection of ServiceAttachment"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-service-attachment-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-service-attachment
  "
  delete collection of ServiceAttachment"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-service-attachment namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-collection-namespaced-service-attachment-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-service-network-endpoint-group-with-http-info
  "
  delete collection of ServiceNetworkEndpointGroup"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-service-network-endpoint-group-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-collection-namespaced-service-network-endpoint-group
  "
  delete collection of ServiceNetworkEndpointGroup"
  ([namespace ] (delete-networking-gke-io-v1beta1-collection-namespaced-service-network-endpoint-group namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-collection-namespaced-service-network-endpoint-group-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  delete a FrontendConfig"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  delete a FrontendConfig"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-frontend-config name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  delete a ServiceAttachment"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  delete a ServiceAttachment"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-service-attachment name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  delete a ServiceNetworkEndpointGroup"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  delete a ServiceNetworkEndpointGroup"
  ([name namespace ] (delete-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1beta2-collection-namespaced-managed-certificate-with-http-info
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1beta2-collection-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta2-collection-namespaced-managed-certificate
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1beta2-collection-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1beta2-collection-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1beta2-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn list-networking-gke-io-v1beta1-frontend-config-for-all-namespaces-with-http-info
  "
  list objects of kind FrontendConfig"
  ([] (list-networking-gke-io-v1beta1-frontend-config-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/frontendconfigs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-frontend-config-for-all-namespaces
  "
  list objects of kind FrontendConfig"
  ([] (list-networking-gke-io-v1beta1-frontend-config-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1beta1-frontend-config-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1beta1-managed-certificate-for-all-namespaces-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1beta1-managed-certificate-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/managedcertificates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-managed-certificate-for-all-namespaces
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1beta1-managed-certificate-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1beta1-managed-certificate-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  list objects of kind FrontendConfig"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  list objects of kind FrontendConfig"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-frontend-config namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  list objects of kind ServiceAttachment"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  list objects of kind ServiceAttachment"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-service-attachment namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  list objects of kind ServiceNetworkEndpointGroup"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  list objects of kind ServiceNetworkEndpointGroup"
  ([namespace ] (list-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1beta1-service-attachment-for-all-namespaces-with-http-info
  "
  list objects of kind ServiceAttachment"
  ([] (list-networking-gke-io-v1beta1-service-attachment-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/serviceattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-service-attachment-for-all-namespaces
  "
  list objects of kind ServiceAttachment"
  ([] (list-networking-gke-io-v1beta1-service-attachment-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1beta1-service-attachment-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1beta1-service-network-endpoint-group-for-all-namespaces-with-http-info
  "
  list objects of kind ServiceNetworkEndpointGroup"
  ([] (list-networking-gke-io-v1beta1-service-network-endpoint-group-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta1/servicenetworkendpointgroups" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta1-service-network-endpoint-group-for-all-namespaces
  "
  list objects of kind ServiceNetworkEndpointGroup"
  ([] (list-networking-gke-io-v1beta1-service-network-endpoint-group-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1beta1-service-network-endpoint-group-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1beta2-managed-certificate-for-all-namespaces-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1beta2-managed-certificate-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta2/managedcertificates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta2-managed-certificate-for-all-namespaces
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1beta2-managed-certificate-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1beta2-managed-certificate-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1beta2-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn patch-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  partially update the specified FrontendConfig"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  partially update the specified FrontendConfig"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-frontend-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  partially update the specified ServiceAttachment"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  partially update the specified ServiceAttachment"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-service-attachment name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  partially update the specified ServiceNetworkEndpointGroup"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  partially update the specified ServiceNetworkEndpointGroup"
  ([name namespace body ] (patch-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1beta2-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

(defn read-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  read the specified FrontendConfig"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  read the specified FrontendConfig"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-frontend-config name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  read the specified ServiceAttachment"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  read the specified ServiceAttachment"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-service-attachment name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  read the specified ServiceNetworkEndpointGroup"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  read the specified ServiceNetworkEndpointGroup"
  ([name namespace ] (read-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1beta2-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn replace-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info
  "
  replace the specified FrontendConfig"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/frontendconfigs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1beta1-namespaced-frontend-config
  "
  replace the specified FrontendConfig"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-frontend-config name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1beta1-namespaced-frontend-config-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/managedcertificates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1beta1-namespaced-managed-certificate
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1beta1-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info
  "
  replace the specified ServiceAttachment"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/serviceattachments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1beta1-namespaced-service-attachment
  "
  replace the specified ServiceAttachment"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-service-attachment name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1beta1-namespaced-service-attachment-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info
  "
  replace the specified ServiceNetworkEndpointGroup"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta1/namespaces/{namespace}/servicenetworkendpointgroups/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group
  "
  replace the specified ServiceNetworkEndpointGroup"
  ([name namespace body ] (replace-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1beta1-namespaced-service-network-endpoint-group-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1beta2/namespaces/{namespace}/managedcertificates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1beta2-namespaced-managed-certificate
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1beta2-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1beta2-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

