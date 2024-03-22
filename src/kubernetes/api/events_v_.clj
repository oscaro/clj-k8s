(ns kubernetes.api.events-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-events-v1-namespaced-event-with-http-info
  "
  create an Event"
  ([namespace body ] (create-events-v1-namespaced-event-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-events-v1-namespaced-event
  "
  create an Event"
  ([namespace body ] (create-events-v1-namespaced-event namespace body nil))
  ([namespace body optional-params]
   (:data (create-events-v1-namespaced-event-with-http-info namespace body optional-params))))

(defn delete-events-v1-collection-namespaced-event-with-http-info
  "
  delete collection of Event"
  ([namespace ] (delete-events-v1-collection-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-events-v1-collection-namespaced-event
  "
  delete collection of Event"
  ([namespace ] (delete-events-v1-collection-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (delete-events-v1-collection-namespaced-event-with-http-info namespace optional-params))))

(defn delete-events-v1-namespaced-event-with-http-info
  "
  delete an Event"
  ([name namespace ] (delete-events-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-events-v1-namespaced-event
  "
  delete an Event"
  ([name namespace ] (delete-events-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (delete-events-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn get-events-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/events.k8s.io/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-events-v1-api-resources
  "
  get available resources"
  []
  (:data (get-events-v1-api-resources-with-http-info)))

(defn list-events-v1-event-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Event"
  ([] (list-events-v1-event-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/events.k8s.io/v1/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-events-v1-event-for-all-namespaces
  "
  list or watch objects of kind Event"
  ([] (list-events-v1-event-for-all-namespaces nil))
  ([optional-params]
   (:data (list-events-v1-event-for-all-namespaces-with-http-info optional-params))))

(defn list-events-v1-namespaced-event-with-http-info
  "
  list or watch objects of kind Event"
  ([namespace ] (list-events-v1-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-events-v1-namespaced-event
  "
  list or watch objects of kind Event"
  ([namespace ] (list-events-v1-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (list-events-v1-namespaced-event-with-http-info namespace optional-params))))

(defn patch-events-v1-namespaced-event-with-http-info
  "
  partially update the specified Event"
  ([name namespace body ] (patch-events-v1-namespaced-event-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-events-v1-namespaced-event
  "
  partially update the specified Event"
  ([name namespace body ] (patch-events-v1-namespaced-event name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-events-v1-namespaced-event-with-http-info name namespace body optional-params))))

(defn read-events-v1-namespaced-event-with-http-info
  "
  read the specified Event"
  ([name namespace ] (read-events-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-events-v1-namespaced-event
  "
  read the specified Event"
  ([name namespace ] (read-events-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (read-events-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn replace-events-v1-namespaced-event-with-http-info
  "
  replace the specified Event"
  ([name namespace body ] (replace-events-v1-namespaced-event-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/events.k8s.io/v1/namespaces/{namespace}/events/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-events-v1-namespaced-event
  "
  replace the specified Event"
  ([name namespace body ] (replace-events-v1-namespaced-event name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-events-v1-namespaced-event-with-http-info name namespace body optional-params))))

(defn watch-events-v1-event-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-events-v1-event-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/events.k8s.io/v1/watch/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-events-v1-event-list-for-all-namespaces
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-events-v1-event-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-events-v1-event-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-events-v1-namespaced-event-with-http-info
  "
  watch changes to an object of kind Event. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-events-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/events.k8s.io/v1/watch/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-events-v1-namespaced-event
  "
  watch changes to an object of kind Event. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-events-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (watch-events-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn watch-events-v1-namespaced-event-list-with-http-info
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-events-v1-namespaced-event-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/events.k8s.io/v1/watch/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-events-v1-namespaced-event-list
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-events-v1-namespaced-event-list namespace nil))
  ([namespace optional-params]
   (:data (watch-events-v1-namespaced-event-list-with-http-info namespace optional-params))))

