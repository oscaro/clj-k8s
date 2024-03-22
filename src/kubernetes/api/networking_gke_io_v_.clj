(ns kubernetes.api.networking-gke-io-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  create a GKENetworkParamSet"
  ([body ] (create-networking-gke-io-v1-gke-network-param-set-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1-gke-network-param-set
  "
  create a GKENetworkParamSet"
  ([body ] (create-networking-gke-io-v1-gke-network-param-set body nil))
  ([body optional-params]
   (:data (create-networking-gke-io-v1-gke-network-param-set-with-http-info body optional-params))))

(defn create-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1-namespaced-managed-certificate-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1-namespaced-managed-certificate
  "
  create a ManagedCertificate"
  ([namespace body ] (create-networking-gke-io-v1-namespaced-managed-certificate namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1-namespaced-managed-certificate-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  create a ServiceAttachment"
  ([namespace body ] (create-networking-gke-io-v1-namespaced-service-attachment-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1-namespaced-service-attachment
  "
  create a ServiceAttachment"
  ([namespace body ] (create-networking-gke-io-v1-namespaced-service-attachment namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-gke-io-v1-namespaced-service-attachment-with-http-info namespace body optional-params))))

(defn create-networking-gke-io-v1-network-with-http-info
  "
  create a Network"
  ([body ] (create-networking-gke-io-v1-network-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/networks" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-gke-io-v1-network
  "
  create a Network"
  ([body ] (create-networking-gke-io-v1-network body nil))
  ([body optional-params]
   (:data (create-networking-gke-io-v1-network-with-http-info body optional-params))))

(defn delete-networking-gke-io-v1-collection-gke-network-param-set-with-http-info
  "
  delete collection of GKENetworkParamSet"
  ([] (delete-networking-gke-io-v1-collection-gke-network-param-set-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-collection-gke-network-param-set
  "
  delete collection of GKENetworkParamSet"
  ([] (delete-networking-gke-io-v1-collection-gke-network-param-set nil))
  ([optional-params]
   (:data (delete-networking-gke-io-v1-collection-gke-network-param-set-with-http-info optional-params))))

(defn delete-networking-gke-io-v1-collection-namespaced-managed-certificate-with-http-info
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1-collection-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-collection-namespaced-managed-certificate
  "
  delete collection of ManagedCertificate"
  ([namespace ] (delete-networking-gke-io-v1-collection-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1-collection-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1-collection-namespaced-service-attachment-with-http-info
  "
  delete collection of ServiceAttachment"
  ([namespace ] (delete-networking-gke-io-v1-collection-namespaced-service-attachment-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-collection-namespaced-service-attachment
  "
  delete collection of ServiceAttachment"
  ([namespace ] (delete-networking-gke-io-v1-collection-namespaced-service-attachment namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-gke-io-v1-collection-namespaced-service-attachment-with-http-info namespace optional-params))))

(defn delete-networking-gke-io-v1-collection-network-with-http-info
  "
  delete collection of Network"
  ([] (delete-networking-gke-io-v1-collection-network-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/networks" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-collection-network
  "
  delete collection of Network"
  ([] (delete-networking-gke-io-v1-collection-network nil))
  ([optional-params]
   (:data (delete-networking-gke-io-v1-collection-network-with-http-info optional-params))))

(defn delete-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  delete a GKENetworkParamSet"
  ([name ] (delete-networking-gke-io-v1-gke-network-param-set-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-gke-network-param-set
  "
  delete a GKENetworkParamSet"
  ([name ] (delete-networking-gke-io-v1-gke-network-param-set name nil))
  ([name optional-params]
   (:data (delete-networking-gke-io-v1-gke-network-param-set-with-http-info name optional-params))))

(defn delete-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-namespaced-managed-certificate
  "
  delete a ManagedCertificate"
  ([name namespace ] (delete-networking-gke-io-v1-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  delete a ServiceAttachment"
  ([name namespace ] (delete-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-namespaced-service-attachment
  "
  delete a ServiceAttachment"
  ([name namespace ] (delete-networking-gke-io-v1-namespaced-service-attachment name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace optional-params))))

(defn delete-networking-gke-io-v1-network-with-http-info
  "
  delete a Network"
  ([name ] (delete-networking-gke-io-v1-network-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-gke-io-v1-network
  "
  delete a Network"
  ([name ] (delete-networking-gke-io-v1-network name nil))
  ([name optional-params]
   (:data (delete-networking-gke-io-v1-network-with-http-info name optional-params))))

(defn list-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  list objects of kind GKENetworkParamSet"
  ([] (list-networking-gke-io-v1-gke-network-param-set-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-gke-network-param-set
  "
  list objects of kind GKENetworkParamSet"
  ([] (list-networking-gke-io-v1-gke-network-param-set nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1-gke-network-param-set-with-http-info optional-params))))

(defn list-networking-gke-io-v1-managed-certificate-for-all-namespaces-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1-managed-certificate-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/managedcertificates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-managed-certificate-for-all-namespaces
  "
  list objects of kind ManagedCertificate"
  ([] (list-networking-gke-io-v1-managed-certificate-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1-managed-certificate-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1-namespaced-managed-certificate-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-namespaced-managed-certificate
  "
  list objects of kind ManagedCertificate"
  ([namespace ] (list-networking-gke-io-v1-namespaced-managed-certificate namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1-namespaced-managed-certificate-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  list objects of kind ServiceAttachment"
  ([namespace ] (list-networking-gke-io-v1-namespaced-service-attachment-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-namespaced-service-attachment
  "
  list objects of kind ServiceAttachment"
  ([namespace ] (list-networking-gke-io-v1-namespaced-service-attachment namespace nil))
  ([namespace optional-params]
   (:data (list-networking-gke-io-v1-namespaced-service-attachment-with-http-info namespace optional-params))))

(defn list-networking-gke-io-v1-network-with-http-info
  "
  list objects of kind Network"
  ([] (list-networking-gke-io-v1-network-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/networks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-network
  "
  list objects of kind Network"
  ([] (list-networking-gke-io-v1-network nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1-network-with-http-info optional-params))))

(defn list-networking-gke-io-v1-service-attachment-for-all-namespaces-with-http-info
  "
  list objects of kind ServiceAttachment"
  ([] (list-networking-gke-io-v1-service-attachment-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.gke.io/v1/serviceattachments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-gke-io-v1-service-attachment-for-all-namespaces
  "
  list objects of kind ServiceAttachment"
  ([] (list-networking-gke-io-v1-service-attachment-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-gke-io-v1-service-attachment-for-all-namespaces-with-http-info optional-params))))

(defn patch-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  partially update the specified GKENetworkParamSet"
  ([name body ] (patch-networking-gke-io-v1-gke-network-param-set-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-gke-network-param-set
  "
  partially update the specified GKENetworkParamSet"
  ([name body ] (patch-networking-gke-io-v1-gke-network-param-set name body nil))
  ([name body optional-params]
   (:data (patch-networking-gke-io-v1-gke-network-param-set-with-http-info name body optional-params))))

(defn patch-networking-gke-io-v1-gke-network-param-set-status-with-http-info
  "
  partially update status of the specified GKENetworkParamSet"
  ([name body ] (patch-networking-gke-io-v1-gke-network-param-set-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-gke-network-param-set-status
  "
  partially update status of the specified GKENetworkParamSet"
  ([name body ] (patch-networking-gke-io-v1-gke-network-param-set-status name body nil))
  ([name body optional-params]
   (:data (patch-networking-gke-io-v1-gke-network-param-set-status-with-http-info name body optional-params))))

(defn patch-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-namespaced-managed-certificate
  "
  partially update the specified ManagedCertificate"
  ([name namespace body ] (patch-networking-gke-io-v1-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  partially update the specified ServiceAttachment"
  ([name namespace body ] (patch-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-namespaced-service-attachment
  "
  partially update the specified ServiceAttachment"
  ([name namespace body ] (patch-networking-gke-io-v1-namespaced-service-attachment name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace body optional-params))))

(defn patch-networking-gke-io-v1-network-with-http-info
  "
  partially update the specified Network"
  ([name body ] (patch-networking-gke-io-v1-network-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-network
  "
  partially update the specified Network"
  ([name body ] (patch-networking-gke-io-v1-network name body nil))
  ([name body optional-params]
   (:data (patch-networking-gke-io-v1-network-with-http-info name body optional-params))))

(defn patch-networking-gke-io-v1-network-status-with-http-info
  "
  partially update status of the specified Network"
  ([name body ] (patch-networking-gke-io-v1-network-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-gke-io-v1-network-status
  "
  partially update status of the specified Network"
  ([name body ] (patch-networking-gke-io-v1-network-status name body nil))
  ([name body optional-params]
   (:data (patch-networking-gke-io-v1-network-status-with-http-info name body optional-params))))

(defn read-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  read the specified GKENetworkParamSet"
  ([name ] (read-networking-gke-io-v1-gke-network-param-set-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-gke-network-param-set
  "
  read the specified GKENetworkParamSet"
  ([name ] (read-networking-gke-io-v1-gke-network-param-set name nil))
  ([name optional-params]
   (:data (read-networking-gke-io-v1-gke-network-param-set-with-http-info name optional-params))))

(defn read-networking-gke-io-v1-gke-network-param-set-status-with-http-info
  "
  read status of the specified GKENetworkParamSet"
  ([name ] (read-networking-gke-io-v1-gke-network-param-set-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-gke-network-param-set-status
  "
  read status of the specified GKENetworkParamSet"
  ([name ] (read-networking-gke-io-v1-gke-network-param-set-status name nil))
  ([name optional-params]
   (:data (read-networking-gke-io-v1-gke-network-param-set-status-with-http-info name optional-params))))

(defn read-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-namespaced-managed-certificate
  "
  read the specified ManagedCertificate"
  ([name namespace ] (read-networking-gke-io-v1-namespaced-managed-certificate name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  read the specified ServiceAttachment"
  ([name namespace ] (read-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-namespaced-service-attachment
  "
  read the specified ServiceAttachment"
  ([name namespace ] (read-networking-gke-io-v1-namespaced-service-attachment name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace optional-params))))

(defn read-networking-gke-io-v1-network-with-http-info
  "
  read the specified Network"
  ([name ] (read-networking-gke-io-v1-network-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-network
  "
  read the specified Network"
  ([name ] (read-networking-gke-io-v1-network name nil))
  ([name optional-params]
   (:data (read-networking-gke-io-v1-network-with-http-info name optional-params))))

(defn read-networking-gke-io-v1-network-status-with-http-info
  "
  read status of the specified Network"
  ([name ] (read-networking-gke-io-v1-network-status-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-gke-io-v1-network-status
  "
  read status of the specified Network"
  ([name ] (read-networking-gke-io-v1-network-status name nil))
  ([name optional-params]
   (:data (read-networking-gke-io-v1-network-status-with-http-info name optional-params))))

(defn replace-networking-gke-io-v1-gke-network-param-set-with-http-info
  "
  replace the specified GKENetworkParamSet"
  ([name body ] (replace-networking-gke-io-v1-gke-network-param-set-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-gke-network-param-set
  "
  replace the specified GKENetworkParamSet"
  ([name body ] (replace-networking-gke-io-v1-gke-network-param-set name body nil))
  ([name body optional-params]
   (:data (replace-networking-gke-io-v1-gke-network-param-set-with-http-info name body optional-params))))

(defn replace-networking-gke-io-v1-gke-network-param-set-status-with-http-info
  "
  replace status of the specified GKENetworkParamSet"
  ([name body ] (replace-networking-gke-io-v1-gke-network-param-set-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/gkenetworkparamsets/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-gke-network-param-set-status
  "
  replace status of the specified GKENetworkParamSet"
  ([name body ] (replace-networking-gke-io-v1-gke-network-param-set-status name body nil))
  ([name body optional-params]
   (:data (replace-networking-gke-io-v1-gke-network-param-set-status-with-http-info name body optional-params))))

(defn replace-networking-gke-io-v1-namespaced-managed-certificate-with-http-info
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/managedcertificates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-namespaced-managed-certificate
  "
  replace the specified ManagedCertificate"
  ([name namespace body ] (replace-networking-gke-io-v1-namespaced-managed-certificate name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1-namespaced-managed-certificate-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1-namespaced-service-attachment-with-http-info
  "
  replace the specified ServiceAttachment"
  ([name namespace body ] (replace-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/namespaces/{namespace}/serviceattachments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-namespaced-service-attachment
  "
  replace the specified ServiceAttachment"
  ([name namespace body ] (replace-networking-gke-io-v1-namespaced-service-attachment name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-gke-io-v1-namespaced-service-attachment-with-http-info name namespace body optional-params))))

(defn replace-networking-gke-io-v1-network-with-http-info
  "
  replace the specified Network"
  ([name body ] (replace-networking-gke-io-v1-network-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-network
  "
  replace the specified Network"
  ([name body ] (replace-networking-gke-io-v1-network name body nil))
  ([name body optional-params]
   (:data (replace-networking-gke-io-v1-network-with-http-info name body optional-params))))

(defn replace-networking-gke-io-v1-network-status-with-http-info
  "
  replace status of the specified Network"
  ([name body ] (replace-networking-gke-io-v1-network-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.gke.io/v1/networks/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-gke-io-v1-network-status
  "
  replace status of the specified Network"
  ([name body ] (replace-networking-gke-io-v1-network-status name body nil))
  ([name body optional-params]
   (:data (replace-networking-gke-io-v1-network-status-with-http-info name body optional-params))))

