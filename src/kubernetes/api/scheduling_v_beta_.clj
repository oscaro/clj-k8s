(ns kubernetes.api.scheduling-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-scheduling-v1beta1-priority-class-with-http-info
  "
  create a PriorityClass"
  ([body ] (create-scheduling-v1beta1-priority-class-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-scheduling-v1beta1-priority-class
  "
  create a PriorityClass"
  ([body ] (create-scheduling-v1beta1-priority-class body nil))
  ([body optional-params]
   (:data (create-scheduling-v1beta1-priority-class-with-http-info body optional-params))))

(defn delete-scheduling-v1beta1-collection-priority-class-with-http-info
  "
  delete collection of PriorityClass"
  ([] (delete-scheduling-v1beta1-collection-priority-class-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-scheduling-v1beta1-collection-priority-class
  "
  delete collection of PriorityClass"
  ([] (delete-scheduling-v1beta1-collection-priority-class nil))
  ([optional-params]
   (:data (delete-scheduling-v1beta1-collection-priority-class-with-http-info optional-params))))

(defn delete-scheduling-v1beta1-priority-class-with-http-info
  "
  delete a PriorityClass"
  ([name ] (delete-scheduling-v1beta1-priority-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-scheduling-v1beta1-priority-class
  "
  delete a PriorityClass"
  ([name ] (delete-scheduling-v1beta1-priority-class name nil))
  ([name optional-params]
   (:data (delete-scheduling-v1beta1-priority-class-with-http-info name optional-params))))

(defn get-scheduling-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/scheduling.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-scheduling-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-scheduling-v1beta1-api-resources-with-http-info)))

(defn list-scheduling-v1beta1-priority-class-with-http-info
  "
  list or watch objects of kind PriorityClass"
  ([] (list-scheduling-v1beta1-priority-class-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-scheduling-v1beta1-priority-class
  "
  list or watch objects of kind PriorityClass"
  ([] (list-scheduling-v1beta1-priority-class nil))
  ([optional-params]
   (:data (list-scheduling-v1beta1-priority-class-with-http-info optional-params))))

(defn patch-scheduling-v1beta1-priority-class-with-http-info
  "
  partially update the specified PriorityClass"
  ([name body ] (patch-scheduling-v1beta1-priority-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-scheduling-v1beta1-priority-class
  "
  partially update the specified PriorityClass"
  ([name body ] (patch-scheduling-v1beta1-priority-class name body nil))
  ([name body optional-params]
   (:data (patch-scheduling-v1beta1-priority-class-with-http-info name body optional-params))))

(defn read-scheduling-v1beta1-priority-class-with-http-info
  "
  read the specified PriorityClass"
  ([name ] (read-scheduling-v1beta1-priority-class-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-scheduling-v1beta1-priority-class
  "
  read the specified PriorityClass"
  ([name ] (read-scheduling-v1beta1-priority-class name nil))
  ([name optional-params]
   (:data (read-scheduling-v1beta1-priority-class-with-http-info name optional-params))))

(defn replace-scheduling-v1beta1-priority-class-with-http-info
  "
  replace the specified PriorityClass"
  ([name body ] (replace-scheduling-v1beta1-priority-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/scheduling.k8s.io/v1beta1/priorityclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-scheduling-v1beta1-priority-class
  "
  replace the specified PriorityClass"
  ([name body ] (replace-scheduling-v1beta1-priority-class name body nil))
  ([name body optional-params]
   (:data (replace-scheduling-v1beta1-priority-class-with-http-info name body optional-params))))

(defn watch-scheduling-v1beta1-priority-class-with-http-info
  "
  watch changes to an object of kind PriorityClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-scheduling-v1beta1-priority-class-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/scheduling.k8s.io/v1beta1/watch/priorityclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-scheduling-v1beta1-priority-class
  "
  watch changes to an object of kind PriorityClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-scheduling-v1beta1-priority-class name nil))
  ([name optional-params]
   (:data (watch-scheduling-v1beta1-priority-class-with-http-info name optional-params))))

(defn watch-scheduling-v1beta1-priority-class-list-with-http-info
  "
  watch individual changes to a list of PriorityClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-scheduling-v1beta1-priority-class-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/scheduling.k8s.io/v1beta1/watch/priorityclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-scheduling-v1beta1-priority-class-list
  "
  watch individual changes to a list of PriorityClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-scheduling-v1beta1-priority-class-list nil))
  ([optional-params]
   (:data (watch-scheduling-v1beta1-priority-class-list-with-http-info optional-params))))

