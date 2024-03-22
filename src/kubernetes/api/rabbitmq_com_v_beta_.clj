(ns kubernetes.api.rabbitmq-com-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  create a RabbitmqCluster"
  ([namespace body ] (create-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  create a RabbitmqCluster"
  ([namespace body ] (create-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster namespace body nil))
  ([namespace body optional-params]
   (:data (create-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info namespace body optional-params))))

(defn delete-rabbitmq-com-v1beta1-collection-namespaced-rabbitmq-cluster-with-http-info
  "
  delete collection of RabbitmqCluster"
  ([namespace ] (delete-rabbitmq-com-v1beta1-collection-namespaced-rabbitmq-cluster-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-rabbitmq-com-v1beta1-collection-namespaced-rabbitmq-cluster
  "
  delete collection of RabbitmqCluster"
  ([namespace ] (delete-rabbitmq-com-v1beta1-collection-namespaced-rabbitmq-cluster namespace nil))
  ([namespace optional-params]
   (:data (delete-rabbitmq-com-v1beta1-collection-namespaced-rabbitmq-cluster-with-http-info namespace optional-params))))

(defn delete-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  delete a RabbitmqCluster"
  ([name namespace ] (delete-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  delete a RabbitmqCluster"
  ([name namespace ] (delete-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster name namespace nil))
  ([name namespace optional-params]
   (:data (delete-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace optional-params))))

(defn list-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  list objects of kind RabbitmqCluster"
  ([namespace ] (list-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  list objects of kind RabbitmqCluster"
  ([namespace ] (list-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster namespace nil))
  ([namespace optional-params]
   (:data (list-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info namespace optional-params))))

(defn list-rabbitmq-com-v1beta1-rabbitmq-cluster-for-all-namespaces-with-http-info
  "
  list objects of kind RabbitmqCluster"
  ([] (list-rabbitmq-com-v1beta1-rabbitmq-cluster-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/rabbitmqclusters" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-rabbitmq-com-v1beta1-rabbitmq-cluster-for-all-namespaces
  "
  list objects of kind RabbitmqCluster"
  ([] (list-rabbitmq-com-v1beta1-rabbitmq-cluster-for-all-namespaces nil))
  ([optional-params]
   (:data (list-rabbitmq-com-v1beta1-rabbitmq-cluster-for-all-namespaces-with-http-info optional-params))))

(defn patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  partially update the specified RabbitmqCluster"
  ([name namespace body ] (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  partially update the specified RabbitmqCluster"
  ([name namespace body ] (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace body optional-params))))

(defn patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info
  "
  partially update status of the specified RabbitmqCluster"
  ([name namespace body ] (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status
  "
  partially update status of the specified RabbitmqCluster"
  ([name namespace body ] (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace body optional-params))))

(defn read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  read the specified RabbitmqCluster"
  ([name namespace ] (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  read the specified RabbitmqCluster"
  ([name namespace ] (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster name namespace nil))
  ([name namespace optional-params]
   (:data (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace optional-params))))

(defn read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info
  "
  read status of the specified RabbitmqCluster"
  ([name namespace ] (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status
  "
  read status of the specified RabbitmqCluster"
  ([name namespace ] (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace optional-params))))

(defn replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info
  "
  replace the specified RabbitmqCluster"
  ([name namespace body ] (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster
  "
  replace the specified RabbitmqCluster"
  ([name namespace body ] (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-with-http-info name namespace body optional-params))))

(defn replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info
  "
  replace status of the specified RabbitmqCluster"
  ([name namespace body ] (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/rabbitmq.com/v1beta1/namespaces/{namespace}/rabbitmqclusters/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status
  "
  replace status of the specified RabbitmqCluster"
  ([name namespace body ] (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-rabbitmq-com-v1beta1-namespaced-rabbitmq-cluster-status-with-http-info name namespace body optional-params))))

