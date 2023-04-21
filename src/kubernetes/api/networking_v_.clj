(ns kubernetes.api.networking-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-networking-v1-namespaced-network-policy-with-http-info
  "
  create a NetworkPolicy"
  ([namespace body ] (create-networking-v1-namespaced-network-policy-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-v1-namespaced-network-policy
  "
  create a NetworkPolicy"
  ([namespace body ] (create-networking-v1-namespaced-network-policy namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-v1-namespaced-network-policy-with-http-info namespace body optional-params))))

(defn delete-networking-v1-collection-namespaced-network-policy-with-http-info
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-networking-v1-collection-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-collection-namespaced-network-policy
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-networking-v1-collection-namespaced-network-policy namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-v1-collection-namespaced-network-policy-with-http-info namespace optional-params))))

(defn delete-networking-v1-namespaced-network-policy-with-http-info
  "
  delete a NetworkPolicy"
  ([name namespace ] (delete-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-namespaced-network-policy
  "
  delete a NetworkPolicy"
  ([name namespace ] (delete-networking-v1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-v1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn get-networking-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/networking.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-networking-v1-api-resources
  "
  get available resources"
  []
  (:data (get-networking-v1-api-resources-with-http-info)))

(defn list-networking-v1-namespaced-network-policy-with-http-info
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace ] (list-networking-v1-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-v1-namespaced-network-policy
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace ] (list-networking-v1-namespaced-network-policy namespace nil))
  ([namespace optional-params]
   (:data (list-networking-v1-namespaced-network-policy-with-http-info namespace optional-params))))

(defn list-networking-v1-network-policy-for-all-namespaces-with-http-info
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-networking-v1-network-policy-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-v1-network-policy-for-all-namespaces
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-networking-v1-network-policy-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-v1-network-policy-for-all-namespaces-with-http-info optional-params))))

(defn patch-networking-v1-namespaced-network-policy-with-http-info
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-networking-v1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-v1-namespaced-network-policy
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-networking-v1-namespaced-network-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-v1-namespaced-network-policy-with-http-info name namespace body optional-params))))

(defn read-networking-v1-namespaced-network-policy-with-http-info
  "
  read the specified NetworkPolicy"
  ([name namespace ] (read-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-v1-namespaced-network-policy
  "
  read the specified NetworkPolicy"
  ([name namespace ] (read-networking-v1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-v1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn replace-networking-v1-namespaced-network-policy-with-http-info
  "
  replace the specified NetworkPolicy"
  ([name namespace body ] (replace-networking-v1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-v1-namespaced-network-policy
  "
  replace the specified NetworkPolicy"
  ([name namespace body ] (replace-networking-v1-namespaced-network-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-v1-namespaced-network-policy-with-http-info name namespace body optional-params))))

(defn watch-networking-v1-namespaced-network-policy-with-http-info
  "
  watch changes to an object of kind NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-namespaced-network-policy
  "
  watch changes to an object of kind NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-networking-v1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (watch-networking-v1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn watch-networking-v1-namespaced-network-policy-list-with-http-info
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-networking-v1-namespaced-network-policy-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-namespaced-network-policy-list
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-networking-v1-namespaced-network-policy-list namespace nil))
  ([namespace optional-params]
   (:data (watch-networking-v1-namespaced-network-policy-list-with-http-info namespace optional-params))))

(defn watch-networking-v1-network-policy-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-network-policy-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-network-policy-list-for-all-namespaces
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-network-policy-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-networking-v1-network-policy-list-for-all-namespaces-with-http-info optional-params))))

