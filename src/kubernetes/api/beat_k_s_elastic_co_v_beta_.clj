(ns kubernetes.api.beat-k-s-elastic-co-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  create a Beat"
  ([namespace body ] (create-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  create a Beat"
  ([namespace body ] (create-beat-k8s-elastic-co-v1beta1-namespaced-beat namespace body nil))
  ([namespace body optional-params]
   (:data (create-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info namespace body optional-params))))

(defn delete-beat-k8s-elastic-co-v1beta1-collection-namespaced-beat-with-http-info
  "
  delete collection of Beat"
  ([namespace ] (delete-beat-k8s-elastic-co-v1beta1-collection-namespaced-beat-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-beat-k8s-elastic-co-v1beta1-collection-namespaced-beat
  "
  delete collection of Beat"
  ([namespace ] (delete-beat-k8s-elastic-co-v1beta1-collection-namespaced-beat namespace nil))
  ([namespace optional-params]
   (:data (delete-beat-k8s-elastic-co-v1beta1-collection-namespaced-beat-with-http-info namespace optional-params))))

(defn delete-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  delete a Beat"
  ([name namespace ] (delete-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  delete a Beat"
  ([name namespace ] (delete-beat-k8s-elastic-co-v1beta1-namespaced-beat name namespace nil))
  ([name namespace optional-params]
   (:data (delete-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace optional-params))))

(defn list-beat-k8s-elastic-co-v1beta1-beat-for-all-namespaces-with-http-info
  "
  list objects of kind Beat"
  ([] (list-beat-k8s-elastic-co-v1beta1-beat-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/beats" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-beat-k8s-elastic-co-v1beta1-beat-for-all-namespaces
  "
  list objects of kind Beat"
  ([] (list-beat-k8s-elastic-co-v1beta1-beat-for-all-namespaces nil))
  ([optional-params]
   (:data (list-beat-k8s-elastic-co-v1beta1-beat-for-all-namespaces-with-http-info optional-params))))

(defn list-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  list objects of kind Beat"
  ([namespace ] (list-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  list objects of kind Beat"
  ([namespace ] (list-beat-k8s-elastic-co-v1beta1-namespaced-beat namespace nil))
  ([namespace optional-params]
   (:data (list-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info namespace optional-params))))

(defn patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  partially update the specified Beat"
  ([name namespace body ] (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  partially update the specified Beat"
  ([name namespace body ] (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace body optional-params))))

(defn patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info
  "
  partially update status of the specified Beat"
  ([name namespace body ] (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-status
  "
  partially update status of the specified Beat"
  ([name namespace body ] (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace body optional-params))))

(defn read-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  read the specified Beat"
  ([name namespace ] (read-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  read the specified Beat"
  ([name namespace ] (read-beat-k8s-elastic-co-v1beta1-namespaced-beat name namespace nil))
  ([name namespace optional-params]
   (:data (read-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace optional-params))))

(defn read-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info
  "
  read status of the specified Beat"
  ([name namespace ] (read-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-beat-k8s-elastic-co-v1beta1-namespaced-beat-status
  "
  read status of the specified Beat"
  ([name namespace ] (read-beat-k8s-elastic-co-v1beta1-namespaced-beat-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace optional-params))))

(defn replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info
  "
  replace the specified Beat"
  ([name namespace body ] (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-beat-k8s-elastic-co-v1beta1-namespaced-beat
  "
  replace the specified Beat"
  ([name namespace body ] (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-with-http-info name namespace body optional-params))))

(defn replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info
  "
  replace status of the specified Beat"
  ([name namespace body ] (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/beat.k8s.elastic.co/v1beta1/namespaces/{namespace}/beats/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-status
  "
  replace status of the specified Beat"
  ([name namespace body ] (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-beat-k8s-elastic-co-v1beta1-namespaced-beat-status-with-http-info name namespace body optional-params))))

