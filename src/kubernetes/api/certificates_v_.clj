(ns kubernetes.api.certificates-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-certificates-v1-certificate-signing-request-with-http-info
  "
  create a CertificateSigningRequest"
  ([body ] (create-certificates-v1-certificate-signing-request-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-certificates-v1-certificate-signing-request
  "
  create a CertificateSigningRequest"
  ([body ] (create-certificates-v1-certificate-signing-request body nil))
  ([body optional-params]
   (:data (create-certificates-v1-certificate-signing-request-with-http-info body optional-params))))

(defn delete-certificates-v1-certificate-signing-request-with-http-info
  "
  delete a CertificateSigningRequest"
  ([name ] (delete-certificates-v1-certificate-signing-request-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-certificates-v1-certificate-signing-request
  "
  delete a CertificateSigningRequest"
  ([name ] (delete-certificates-v1-certificate-signing-request name nil))
  ([name optional-params]
   (:data (delete-certificates-v1-certificate-signing-request-with-http-info name optional-params))))

(defn delete-certificates-v1-collection-certificate-signing-request-with-http-info
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-certificates-v1-collection-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-certificates-v1-collection-certificate-signing-request
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-certificates-v1-collection-certificate-signing-request nil))
  ([optional-params]
   (:data (delete-certificates-v1-collection-certificate-signing-request-with-http-info optional-params))))

(defn get-certificates-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/certificates.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-certificates-v1-api-resources
  "
  get available resources"
  []
  (:data (get-certificates-v1-api-resources-with-http-info)))

(defn list-certificates-v1-certificate-signing-request-with-http-info
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificates-v1-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-certificates-v1-certificate-signing-request
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificates-v1-certificate-signing-request nil))
  ([optional-params]
   (:data (list-certificates-v1-certificate-signing-request-with-http-info optional-params))))

(defn patch-certificates-v1-certificate-signing-request-with-http-info
  "
  partially update the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-certificates-v1-certificate-signing-request
  "
  partially update the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request name body nil))
  ([name body optional-params]
   (:data (patch-certificates-v1-certificate-signing-request-with-http-info name body optional-params))))

(defn patch-certificates-v1-certificate-signing-request-approval-with-http-info
  "
  partially update approval of the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request-approval-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/approval" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-certificates-v1-certificate-signing-request-approval
  "
  partially update approval of the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request-approval name body nil))
  ([name body optional-params]
   (:data (patch-certificates-v1-certificate-signing-request-approval-with-http-info name body optional-params))))

(defn patch-certificates-v1-certificate-signing-request-status-with-http-info
  "
  partially update status of the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-certificates-v1-certificate-signing-request-status
  "
  partially update status of the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1-certificate-signing-request-status name body nil))
  ([name body optional-params]
   (:data (patch-certificates-v1-certificate-signing-request-status-with-http-info name body optional-params))))

(defn read-certificates-v1-certificate-signing-request-with-http-info
  "
  read the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-certificates-v1-certificate-signing-request
  "
  read the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request name nil))
  ([name optional-params]
   (:data (read-certificates-v1-certificate-signing-request-with-http-info name optional-params))))

(defn read-certificates-v1-certificate-signing-request-approval-with-http-info
  "
  read approval of the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request-approval-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/approval" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-certificates-v1-certificate-signing-request-approval
  "
  read approval of the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request-approval name nil))
  ([name optional-params]
   (:data (read-certificates-v1-certificate-signing-request-approval-with-http-info name optional-params))))

(defn read-certificates-v1-certificate-signing-request-status-with-http-info
  "
  read status of the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-certificates-v1-certificate-signing-request-status
  "
  read status of the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1-certificate-signing-request-status name nil))
  ([name optional-params]
   (:data (read-certificates-v1-certificate-signing-request-status-with-http-info name optional-params))))

(defn replace-certificates-v1-certificate-signing-request-with-http-info
  "
  replace the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-certificates-v1-certificate-signing-request
  "
  replace the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1-certificate-signing-request-with-http-info name body optional-params))))

(defn replace-certificates-v1-certificate-signing-request-approval-with-http-info
  "
  replace approval of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request-approval-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/approval" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-certificates-v1-certificate-signing-request-approval
  "
  replace approval of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request-approval name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1-certificate-signing-request-approval-with-http-info name body optional-params))))

(defn replace-certificates-v1-certificate-signing-request-status-with-http-info
  "
  replace status of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/certificates.k8s.io/v1/certificatesigningrequests/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-certificates-v1-certificate-signing-request-status
  "
  replace status of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1-certificate-signing-request-status name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1-certificate-signing-request-status-with-http-info name body optional-params))))

(defn watch-certificates-v1-certificate-signing-request-with-http-info
  "
  watch changes to an object of kind CertificateSigningRequest. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-certificates-v1-certificate-signing-request-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1/watch/certificatesigningrequests/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-certificates-v1-certificate-signing-request
  "
  watch changes to an object of kind CertificateSigningRequest. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-certificates-v1-certificate-signing-request name nil))
  ([name optional-params]
   (:data (watch-certificates-v1-certificate-signing-request-with-http-info name optional-params))))

(defn watch-certificates-v1-certificate-signing-request-list-with-http-info
  "
  watch individual changes to a list of CertificateSigningRequest. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-certificates-v1-certificate-signing-request-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1/watch/certificatesigningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-certificates-v1-certificate-signing-request-list
  "
  watch individual changes to a list of CertificateSigningRequest. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-certificates-v1-certificate-signing-request-list nil))
  ([optional-params]
   (:data (watch-certificates-v1-certificate-signing-request-list-with-http-info optional-params))))

