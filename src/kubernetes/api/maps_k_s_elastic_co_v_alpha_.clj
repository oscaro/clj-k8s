(ns kubernetes.api.maps-k-s-elastic-co-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  create an ElasticMapsServer"
  ([namespace body ] (create-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  create an ElasticMapsServer"
  ([namespace body ] (create-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server namespace body nil))
  ([namespace body optional-params]
   (:data (create-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info namespace body optional-params))))

(defn delete-maps-k8s-elastic-co-v1alpha1-collection-namespaced-elastic-maps-server-with-http-info
  "
  delete collection of ElasticMapsServer"
  ([namespace ] (delete-maps-k8s-elastic-co-v1alpha1-collection-namespaced-elastic-maps-server-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-maps-k8s-elastic-co-v1alpha1-collection-namespaced-elastic-maps-server
  "
  delete collection of ElasticMapsServer"
  ([namespace ] (delete-maps-k8s-elastic-co-v1alpha1-collection-namespaced-elastic-maps-server namespace nil))
  ([namespace optional-params]
   (:data (delete-maps-k8s-elastic-co-v1alpha1-collection-namespaced-elastic-maps-server-with-http-info namespace optional-params))))

(defn delete-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  delete an ElasticMapsServer"
  ([name namespace ] (delete-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  delete an ElasticMapsServer"
  ([name namespace ] (delete-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server name namespace nil))
  ([name namespace optional-params]
   (:data (delete-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace optional-params))))

(defn list-maps-k8s-elastic-co-v1alpha1-elastic-maps-server-for-all-namespaces-with-http-info
  "
  list objects of kind ElasticMapsServer"
  ([] (list-maps-k8s-elastic-co-v1alpha1-elastic-maps-server-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/elasticmapsservers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-maps-k8s-elastic-co-v1alpha1-elastic-maps-server-for-all-namespaces
  "
  list objects of kind ElasticMapsServer"
  ([] (list-maps-k8s-elastic-co-v1alpha1-elastic-maps-server-for-all-namespaces nil))
  ([optional-params]
   (:data (list-maps-k8s-elastic-co-v1alpha1-elastic-maps-server-for-all-namespaces-with-http-info optional-params))))

(defn list-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  list objects of kind ElasticMapsServer"
  ([namespace ] (list-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  list objects of kind ElasticMapsServer"
  ([namespace ] (list-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server namespace nil))
  ([namespace optional-params]
   (:data (list-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info namespace optional-params))))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  partially update the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  partially update the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace body optional-params))))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info
  "
  partially update scale of the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale
  "
  partially update scale of the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace body optional-params))))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info
  "
  partially update status of the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status
  "
  partially update status of the specified ElasticMapsServer"
  ([name namespace body ] (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace body optional-params))))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  read the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  read the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server name namespace nil))
  ([name namespace optional-params]
   (:data (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace optional-params))))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info
  "
  read scale of the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale
  "
  read scale of the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace optional-params))))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info
  "
  read status of the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status
  "
  read status of the specified ElasticMapsServer"
  ([name namespace ] (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace optional-params))))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info
  "
  replace the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server
  "
  replace the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-with-http-info name namespace body optional-params))))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info
  "
  replace scale of the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale
  "
  replace scale of the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-scale-with-http-info name namespace body optional-params))))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info
  "
  replace status of the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/maps.k8s.elastic.co/v1alpha1/namespaces/{namespace}/elasticmapsservers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status
  "
  replace status of the specified ElasticMapsServer"
  ([name namespace body ] (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-maps-k8s-elastic-co-v1alpha1-namespaced-elastic-maps-server-status-with-http-info name namespace body optional-params))))

