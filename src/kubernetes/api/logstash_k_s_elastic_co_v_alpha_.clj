(ns kubernetes.api.logstash-k-s-elastic-co-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  create a Logstash"
  ([namespace body ] (create-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  create a Logstash"
  ([namespace body ] (create-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash namespace body nil))
  ([namespace body optional-params]
   (:data (create-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info namespace body optional-params))))

(defn delete-logstash-k8s-elastic-co-v1alpha1-collection-namespaced-logstash-with-http-info
  "
  delete collection of Logstash"
  ([namespace ] (delete-logstash-k8s-elastic-co-v1alpha1-collection-namespaced-logstash-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-logstash-k8s-elastic-co-v1alpha1-collection-namespaced-logstash
  "
  delete collection of Logstash"
  ([namespace ] (delete-logstash-k8s-elastic-co-v1alpha1-collection-namespaced-logstash namespace nil))
  ([namespace optional-params]
   (:data (delete-logstash-k8s-elastic-co-v1alpha1-collection-namespaced-logstash-with-http-info namespace optional-params))))

(defn delete-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  delete a Logstash"
  ([name namespace ] (delete-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  delete a Logstash"
  ([name namespace ] (delete-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash name namespace nil))
  ([name namespace optional-params]
   (:data (delete-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace optional-params))))

(defn list-logstash-k8s-elastic-co-v1alpha1-logstash-for-all-namespaces-with-http-info
  "
  list objects of kind Logstash"
  ([] (list-logstash-k8s-elastic-co-v1alpha1-logstash-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/logstashes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-logstash-k8s-elastic-co-v1alpha1-logstash-for-all-namespaces
  "
  list objects of kind Logstash"
  ([] (list-logstash-k8s-elastic-co-v1alpha1-logstash-for-all-namespaces nil))
  ([optional-params]
   (:data (list-logstash-k8s-elastic-co-v1alpha1-logstash-for-all-namespaces-with-http-info optional-params))))

(defn list-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  list objects of kind Logstash"
  ([namespace ] (list-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  list objects of kind Logstash"
  ([namespace ] (list-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash namespace nil))
  ([namespace optional-params]
   (:data (list-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info namespace optional-params))))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  partially update the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  partially update the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace body optional-params))))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info
  "
  partially update scale of the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale
  "
  partially update scale of the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace body optional-params))))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info
  "
  partially update status of the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status
  "
  partially update status of the specified Logstash"
  ([name namespace body ] (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace body optional-params))))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  read the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  read the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash name namespace nil))
  ([name namespace optional-params]
   (:data (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace optional-params))))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info
  "
  read scale of the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale
  "
  read scale of the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace optional-params))))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info
  "
  read status of the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status
  "
  read status of the specified Logstash"
  ([name namespace ] (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace optional-params))))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info
  "
  replace the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash
  "
  replace the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-with-http-info name namespace body optional-params))))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info
  "
  replace scale of the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale
  "
  replace scale of the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-scale-with-http-info name namespace body optional-params))))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info
  "
  replace status of the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/logstash.k8s.elastic.co/v1alpha1/namespaces/{namespace}/logstashes/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status
  "
  replace status of the specified Logstash"
  ([name namespace body ] (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-logstash-k8s-elastic-co-v1alpha1-namespaced-logstash-status-with-http-info name namespace body optional-params))))

