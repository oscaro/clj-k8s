(ns kubernetes.api.admissionregistration-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  create a MutatingWebhookConfiguration"
  ([body ] (create-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  create a MutatingWebhookConfiguration"
  ([body ] (create-admissionregistration-v1beta1-mutating-webhook-configuration body nil))
  ([body optional-params]
   (:data (create-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info body optional-params))))

(defn create-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  create a ValidatingWebhookConfiguration"
  ([body ] (create-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-admissionregistration-v1beta1-validating-webhook-configuration
  "
  create a ValidatingWebhookConfiguration"
  ([body ] (create-admissionregistration-v1beta1-validating-webhook-configuration body nil))
  ([body optional-params]
   (:data (create-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info body optional-params))))

(defn delete-admissionregistration-v1beta1-collection-mutating-webhook-configuration-with-http-info
  "
  delete collection of MutatingWebhookConfiguration"
  ([] (delete-admissionregistration-v1beta1-collection-mutating-webhook-configuration-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-admissionregistration-v1beta1-collection-mutating-webhook-configuration
  "
  delete collection of MutatingWebhookConfiguration"
  ([] (delete-admissionregistration-v1beta1-collection-mutating-webhook-configuration nil))
  ([optional-params]
   (:data (delete-admissionregistration-v1beta1-collection-mutating-webhook-configuration-with-http-info optional-params))))

(defn delete-admissionregistration-v1beta1-collection-validating-webhook-configuration-with-http-info
  "
  delete collection of ValidatingWebhookConfiguration"
  ([] (delete-admissionregistration-v1beta1-collection-validating-webhook-configuration-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-admissionregistration-v1beta1-collection-validating-webhook-configuration
  "
  delete collection of ValidatingWebhookConfiguration"
  ([] (delete-admissionregistration-v1beta1-collection-validating-webhook-configuration nil))
  ([optional-params]
   (:data (delete-admissionregistration-v1beta1-collection-validating-webhook-configuration-with-http-info optional-params))))

(defn delete-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  delete a MutatingWebhookConfiguration"
  ([name ] (delete-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  delete a MutatingWebhookConfiguration"
  ([name ] (delete-admissionregistration-v1beta1-mutating-webhook-configuration name nil))
  ([name optional-params]
   (:data (delete-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name optional-params))))

(defn delete-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  delete a ValidatingWebhookConfiguration"
  ([name ] (delete-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-admissionregistration-v1beta1-validating-webhook-configuration
  "
  delete a ValidatingWebhookConfiguration"
  ([name ] (delete-admissionregistration-v1beta1-validating-webhook-configuration name nil))
  ([name optional-params]
   (:data (delete-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name optional-params))))

(defn get-admissionregistration-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/admissionregistration.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-admissionregistration-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-admissionregistration-v1beta1-api-resources-with-http-info)))

(defn list-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  list or watch objects of kind MutatingWebhookConfiguration"
  ([] (list-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  list or watch objects of kind MutatingWebhookConfiguration"
  ([] (list-admissionregistration-v1beta1-mutating-webhook-configuration nil))
  ([optional-params]
   (:data (list-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info optional-params))))

(defn list-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  list or watch objects of kind ValidatingWebhookConfiguration"
  ([] (list-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-admissionregistration-v1beta1-validating-webhook-configuration
  "
  list or watch objects of kind ValidatingWebhookConfiguration"
  ([] (list-admissionregistration-v1beta1-validating-webhook-configuration nil))
  ([optional-params]
   (:data (list-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info optional-params))))

(defn patch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  partially update the specified MutatingWebhookConfiguration"
  ([name body ] (patch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  partially update the specified MutatingWebhookConfiguration"
  ([name body ] (patch-admissionregistration-v1beta1-mutating-webhook-configuration name body nil))
  ([name body optional-params]
   (:data (patch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name body optional-params))))

(defn patch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  partially update the specified ValidatingWebhookConfiguration"
  ([name body ] (patch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-admissionregistration-v1beta1-validating-webhook-configuration
  "
  partially update the specified ValidatingWebhookConfiguration"
  ([name body ] (patch-admissionregistration-v1beta1-validating-webhook-configuration name body nil))
  ([name body optional-params]
   (:data (patch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name body optional-params))))

(defn read-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  read the specified MutatingWebhookConfiguration"
  ([name ] (read-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  read the specified MutatingWebhookConfiguration"
  ([name ] (read-admissionregistration-v1beta1-mutating-webhook-configuration name nil))
  ([name optional-params]
   (:data (read-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name optional-params))))

(defn read-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  read the specified ValidatingWebhookConfiguration"
  ([name ] (read-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-admissionregistration-v1beta1-validating-webhook-configuration
  "
  read the specified ValidatingWebhookConfiguration"
  ([name ] (read-admissionregistration-v1beta1-validating-webhook-configuration name nil))
  ([name optional-params]
   (:data (read-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name optional-params))))

(defn replace-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  replace the specified MutatingWebhookConfiguration"
  ([name body ] (replace-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/mutatingwebhookconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  replace the specified MutatingWebhookConfiguration"
  ([name body ] (replace-admissionregistration-v1beta1-mutating-webhook-configuration name body nil))
  ([name body optional-params]
   (:data (replace-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name body optional-params))))

(defn replace-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  replace the specified ValidatingWebhookConfiguration"
  ([name body ] (replace-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/validatingwebhookconfigurations/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-admissionregistration-v1beta1-validating-webhook-configuration
  "
  replace the specified ValidatingWebhookConfiguration"
  ([name body ] (replace-admissionregistration-v1beta1-validating-webhook-configuration name body nil))
  ([name body optional-params]
   (:data (replace-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name body optional-params))))

(defn watch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info
  "
  watch changes to an object of kind MutatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/watch/mutatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-admissionregistration-v1beta1-mutating-webhook-configuration
  "
  watch changes to an object of kind MutatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-admissionregistration-v1beta1-mutating-webhook-configuration name nil))
  ([name optional-params]
   (:data (watch-admissionregistration-v1beta1-mutating-webhook-configuration-with-http-info name optional-params))))

(defn watch-admissionregistration-v1beta1-mutating-webhook-configuration-list-with-http-info
  "
  watch individual changes to a list of MutatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-admissionregistration-v1beta1-mutating-webhook-configuration-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/watch/mutatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-admissionregistration-v1beta1-mutating-webhook-configuration-list
  "
  watch individual changes to a list of MutatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-admissionregistration-v1beta1-mutating-webhook-configuration-list nil))
  ([optional-params]
   (:data (watch-admissionregistration-v1beta1-mutating-webhook-configuration-list-with-http-info optional-params))))

(defn watch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info
  "
  watch changes to an object of kind ValidatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/watch/validatingwebhookconfigurations/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-admissionregistration-v1beta1-validating-webhook-configuration
  "
  watch changes to an object of kind ValidatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-admissionregistration-v1beta1-validating-webhook-configuration name nil))
  ([name optional-params]
   (:data (watch-admissionregistration-v1beta1-validating-webhook-configuration-with-http-info name optional-params))))

(defn watch-admissionregistration-v1beta1-validating-webhook-configuration-list-with-http-info
  "
  watch individual changes to a list of ValidatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-admissionregistration-v1beta1-validating-webhook-configuration-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/admissionregistration.k8s.io/v1beta1/watch/validatingwebhookconfigurations" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-admissionregistration-v1beta1-validating-webhook-configuration-list
  "
  watch individual changes to a list of ValidatingWebhookConfiguration. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-admissionregistration-v1beta1-validating-webhook-configuration-list nil))
  ([optional-params]
   (:data (watch-admissionregistration-v1beta1-validating-webhook-configuration-list-with-http-info optional-params))))

