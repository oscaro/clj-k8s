(ns kubernetes.api.apiextensions-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  create a CustomResourceDefinition"
  ([body ] (create-apiextensions-v1beta1-custom-resource-definition-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apiextensions-v1beta1-custom-resource-definition
  "
  create a CustomResourceDefinition"
  ([body ] (create-apiextensions-v1beta1-custom-resource-definition body nil))
  ([body optional-params]
   (:data (create-apiextensions-v1beta1-custom-resource-definition-with-http-info body optional-params))))

(defn delete-apiextensions-v1beta1-collection-custom-resource-definition-with-http-info
  "
  delete collection of CustomResourceDefinition"
  ([] (delete-apiextensions-v1beta1-collection-custom-resource-definition-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apiextensions-v1beta1-collection-custom-resource-definition
  "
  delete collection of CustomResourceDefinition"
  ([] (delete-apiextensions-v1beta1-collection-custom-resource-definition nil))
  ([optional-params]
   (:data (delete-apiextensions-v1beta1-collection-custom-resource-definition-with-http-info optional-params))))

(defn delete-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  delete a CustomResourceDefinition"
  ([name ] (delete-apiextensions-v1beta1-custom-resource-definition-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apiextensions-v1beta1-custom-resource-definition
  "
  delete a CustomResourceDefinition"
  ([name ] (delete-apiextensions-v1beta1-custom-resource-definition name nil))
  ([name optional-params]
   (:data (delete-apiextensions-v1beta1-custom-resource-definition-with-http-info name optional-params))))

(defn get-apiextensions-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/apiextensions.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-apiextensions-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-apiextensions-v1beta1-api-resources-with-http-info)))

(defn list-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  list or watch objects of kind CustomResourceDefinition"
  ([] (list-apiextensions-v1beta1-custom-resource-definition-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apiextensions-v1beta1-custom-resource-definition
  "
  list or watch objects of kind CustomResourceDefinition"
  ([] (list-apiextensions-v1beta1-custom-resource-definition nil))
  ([optional-params]
   (:data (list-apiextensions-v1beta1-custom-resource-definition-with-http-info optional-params))))

(defn patch-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  partially update the specified CustomResourceDefinition"
  ([name body ] (patch-apiextensions-v1beta1-custom-resource-definition-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apiextensions-v1beta1-custom-resource-definition
  "
  partially update the specified CustomResourceDefinition"
  ([name body ] (patch-apiextensions-v1beta1-custom-resource-definition name body nil))
  ([name body optional-params]
   (:data (patch-apiextensions-v1beta1-custom-resource-definition-with-http-info name body optional-params))))

(defn patch-apiextensions-v1beta1-custom-resource-definition-status-with-http-info
  "
  partially update status of the specified CustomResourceDefinition"
  ([name body ] (patch-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apiextensions-v1beta1-custom-resource-definition-status
  "
  partially update status of the specified CustomResourceDefinition"
  ([name body ] (patch-apiextensions-v1beta1-custom-resource-definition-status name body nil))
  ([name body optional-params]
   (:data (patch-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name body optional-params))))

(defn read-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  read the specified CustomResourceDefinition"
  ([name ] (read-apiextensions-v1beta1-custom-resource-definition-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apiextensions-v1beta1-custom-resource-definition
  "
  read the specified CustomResourceDefinition"
  ([name ] (read-apiextensions-v1beta1-custom-resource-definition name nil))
  ([name optional-params]
   (:data (read-apiextensions-v1beta1-custom-resource-definition-with-http-info name optional-params))))

(defn read-apiextensions-v1beta1-custom-resource-definition-status-with-http-info
  "
  read status of the specified CustomResourceDefinition"
  ([name ] (read-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apiextensions-v1beta1-custom-resource-definition-status
  "
  read status of the specified CustomResourceDefinition"
  ([name ] (read-apiextensions-v1beta1-custom-resource-definition-status name nil))
  ([name optional-params]
   (:data (read-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name optional-params))))

(defn replace-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  replace the specified CustomResourceDefinition"
  ([name body ] (replace-apiextensions-v1beta1-custom-resource-definition-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apiextensions-v1beta1-custom-resource-definition
  "
  replace the specified CustomResourceDefinition"
  ([name body ] (replace-apiextensions-v1beta1-custom-resource-definition name body nil))
  ([name body optional-params]
   (:data (replace-apiextensions-v1beta1-custom-resource-definition-with-http-info name body optional-params))))

(defn replace-apiextensions-v1beta1-custom-resource-definition-status-with-http-info
  "
  replace status of the specified CustomResourceDefinition"
  ([name body ] (replace-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/customresourcedefinitions/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apiextensions-v1beta1-custom-resource-definition-status
  "
  replace status of the specified CustomResourceDefinition"
  ([name body ] (replace-apiextensions-v1beta1-custom-resource-definition-status name body nil))
  ([name body optional-params]
   (:data (replace-apiextensions-v1beta1-custom-resource-definition-status-with-http-info name body optional-params))))

(defn watch-apiextensions-v1beta1-custom-resource-definition-with-http-info
  "
  watch changes to an object of kind CustomResourceDefinition. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-apiextensions-v1beta1-custom-resource-definition-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/apiextensions.k8s.io/v1beta1/watch/customresourcedefinitions/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apiextensions-v1beta1-custom-resource-definition
  "
  watch changes to an object of kind CustomResourceDefinition. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-apiextensions-v1beta1-custom-resource-definition name nil))
  ([name optional-params]
   (:data (watch-apiextensions-v1beta1-custom-resource-definition-with-http-info name optional-params))))

(defn watch-apiextensions-v1beta1-custom-resource-definition-list-with-http-info
  "
  watch individual changes to a list of CustomResourceDefinition. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apiextensions-v1beta1-custom-resource-definition-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apiextensions.k8s.io/v1beta1/watch/customresourcedefinitions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apiextensions-v1beta1-custom-resource-definition-list
  "
  watch individual changes to a list of CustomResourceDefinition. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apiextensions-v1beta1-custom-resource-definition-list nil))
  ([optional-params]
   (:data (watch-apiextensions-v1beta1-custom-resource-definition-list-with-http-info optional-params))))

