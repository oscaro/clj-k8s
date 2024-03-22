(ns kubernetes.api.networking-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-networking-v1-ingress-class-with-http-info
  "
  create an IngressClass"
  ([body ] (create-networking-v1-ingress-class-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-v1-ingress-class
  "
  create an IngressClass"
  ([body ] (create-networking-v1-ingress-class body nil))
  ([body optional-params]
   (:data (create-networking-v1-ingress-class-with-http-info body optional-params))))

(defn create-networking-v1-namespaced-ingress-with-http-info
  "
  create an Ingress"
  ([namespace body ] (create-networking-v1-namespaced-ingress-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-networking-v1-namespaced-ingress
  "
  create an Ingress"
  ([namespace body ] (create-networking-v1-namespaced-ingress namespace body nil))
  ([namespace body optional-params]
   (:data (create-networking-v1-namespaced-ingress-with-http-info namespace body optional-params))))

(defn create-networking-v1-namespaced-network-policy-with-http-info
  "
  create a NetworkPolicy"
  ([namespace body ] (create-networking-v1-namespaced-network-policy-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
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

(defn delete-networking-v1-collection-ingress-class-with-http-info
  "
  delete collection of IngressClass"
  ([] (delete-networking-v1-collection-ingress-class-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-collection-ingress-class
  "
  delete collection of IngressClass"
  ([] (delete-networking-v1-collection-ingress-class nil))
  ([optional-params]
   (:data (delete-networking-v1-collection-ingress-class-with-http-info optional-params))))

(defn delete-networking-v1-collection-namespaced-ingress-with-http-info
  "
  delete collection of Ingress"
  ([namespace ] (delete-networking-v1-collection-namespaced-ingress-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-collection-namespaced-ingress
  "
  delete collection of Ingress"
  ([namespace ] (delete-networking-v1-collection-namespaced-ingress namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-v1-collection-namespaced-ingress-with-http-info namespace optional-params))))

(defn delete-networking-v1-collection-namespaced-network-policy-with-http-info
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-networking-v1-collection-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-collection-namespaced-network-policy
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-networking-v1-collection-namespaced-network-policy namespace nil))
  ([namespace optional-params]
   (:data (delete-networking-v1-collection-namespaced-network-policy-with-http-info namespace optional-params))))

(defn delete-networking-v1-ingress-class-with-http-info
  "
  delete an IngressClass"
  ([name ] (delete-networking-v1-ingress-class-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-ingress-class
  "
  delete an IngressClass"
  ([name ] (delete-networking-v1-ingress-class name nil))
  ([name optional-params]
   (:data (delete-networking-v1-ingress-class-with-http-info name optional-params))))

(defn delete-networking-v1-namespaced-ingress-with-http-info
  "
  delete an Ingress"
  ([name namespace ] (delete-networking-v1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-networking-v1-namespaced-ingress
  "
  delete an Ingress"
  ([name namespace ] (delete-networking-v1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (delete-networking-v1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn delete-networking-v1-namespaced-network-policy-with-http-info
  "
  delete a NetworkPolicy"
  ([name namespace ] (delete-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
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

(defn list-networking-v1-ingress-class-with-http-info
  "
  list or watch objects of kind IngressClass"
  ([] (list-networking-v1-ingress-class-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-v1-ingress-class
  "
  list or watch objects of kind IngressClass"
  ([] (list-networking-v1-ingress-class nil))
  ([optional-params]
   (:data (list-networking-v1-ingress-class-with-http-info optional-params))))

(defn list-networking-v1-ingress-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Ingress"
  ([] (list-networking-v1-ingress-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-v1-ingress-for-all-namespaces
  "
  list or watch objects of kind Ingress"
  ([] (list-networking-v1-ingress-for-all-namespaces nil))
  ([optional-params]
   (:data (list-networking-v1-ingress-for-all-namespaces-with-http-info optional-params))))

(defn list-networking-v1-namespaced-ingress-with-http-info
  "
  list or watch objects of kind Ingress"
  ([namespace ] (list-networking-v1-namespaced-ingress-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-networking-v1-namespaced-ingress
  "
  list or watch objects of kind Ingress"
  ([namespace ] (list-networking-v1-namespaced-ingress namespace nil))
  ([namespace optional-params]
   (:data (list-networking-v1-namespaced-ingress-with-http-info namespace optional-params))))

(defn list-networking-v1-namespaced-network-policy-with-http-info
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace ] (list-networking-v1-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
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
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
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

(defn patch-networking-v1-ingress-class-with-http-info
  "
  partially update the specified IngressClass"
  ([name body ] (patch-networking-v1-ingress-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-v1-ingress-class
  "
  partially update the specified IngressClass"
  ([name body ] (patch-networking-v1-ingress-class name body nil))
  ([name body optional-params]
   (:data (patch-networking-v1-ingress-class-with-http-info name body optional-params))))

(defn patch-networking-v1-namespaced-ingress-with-http-info
  "
  partially update the specified Ingress"
  ([name namespace body ] (patch-networking-v1-namespaced-ingress-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-v1-namespaced-ingress
  "
  partially update the specified Ingress"
  ([name namespace body ] (patch-networking-v1-namespaced-ingress name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-v1-namespaced-ingress-with-http-info name namespace body optional-params))))

(defn patch-networking-v1-namespaced-ingress-status-with-http-info
  "
  partially update status of the specified Ingress"
  ([name namespace body ] (patch-networking-v1-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-v1-namespaced-ingress-status
  "
  partially update status of the specified Ingress"
  ([name namespace body ] (patch-networking-v1-namespaced-ingress-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-v1-namespaced-ingress-status-with-http-info name namespace body optional-params))))

(defn patch-networking-v1-namespaced-network-policy-with-http-info
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-networking-v1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-networking-v1-namespaced-network-policy
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-networking-v1-namespaced-network-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-networking-v1-namespaced-network-policy-with-http-info name namespace body optional-params))))

(defn read-networking-v1-ingress-class-with-http-info
  "
  read the specified IngressClass"
  ([name ] (read-networking-v1-ingress-class-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-v1-ingress-class
  "
  read the specified IngressClass"
  ([name ] (read-networking-v1-ingress-class name nil))
  ([name optional-params]
   (:data (read-networking-v1-ingress-class-with-http-info name optional-params))))

(defn read-networking-v1-namespaced-ingress-with-http-info
  "
  read the specified Ingress"
  ([name namespace ] (read-networking-v1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-v1-namespaced-ingress
  "
  read the specified Ingress"
  ([name namespace ] (read-networking-v1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-v1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn read-networking-v1-namespaced-ingress-status-with-http-info
  "
  read status of the specified Ingress"
  ([name namespace ] (read-networking-v1-namespaced-ingress-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-networking-v1-namespaced-ingress-status
  "
  read status of the specified Ingress"
  ([name namespace ] (read-networking-v1-namespaced-ingress-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-networking-v1-namespaced-ingress-status-with-http-info name namespace optional-params))))

(defn read-networking-v1-namespaced-network-policy-with-http-info
  "
  read the specified NetworkPolicy"
  ([name namespace ] (read-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
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

(defn replace-networking-v1-ingress-class-with-http-info
  "
  replace the specified IngressClass"
  ([name body ] (replace-networking-v1-ingress-class-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/ingressclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-v1-ingress-class
  "
  replace the specified IngressClass"
  ([name body ] (replace-networking-v1-ingress-class name body nil))
  ([name body optional-params]
   (:data (replace-networking-v1-ingress-class-with-http-info name body optional-params))))

(defn replace-networking-v1-namespaced-ingress-with-http-info
  "
  replace the specified Ingress"
  ([name namespace body ] (replace-networking-v1-namespaced-ingress-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-v1-namespaced-ingress
  "
  replace the specified Ingress"
  ([name namespace body ] (replace-networking-v1-namespaced-ingress name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-v1-namespaced-ingress-with-http-info name namespace body optional-params))))

(defn replace-networking-v1-namespaced-ingress-status-with-http-info
  "
  replace status of the specified Ingress"
  ([name namespace body ] (replace-networking-v1-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/ingresses/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-networking-v1-namespaced-ingress-status
  "
  replace status of the specified Ingress"
  ([name namespace body ] (replace-networking-v1-namespaced-ingress-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-networking-v1-namespaced-ingress-status-with-http-info name namespace body optional-params))))

(defn replace-networking-v1-namespaced-network-policy-with-http-info
  "
  replace the specified NetworkPolicy"
  ([name namespace body ] (replace-networking-v1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/networking.k8s.io/v1/namespaces/{namespace}/networkpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
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

(defn watch-networking-v1-ingress-class-with-http-info
  "
  watch changes to an object of kind IngressClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-networking-v1-ingress-class-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/ingressclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-ingress-class
  "
  watch changes to an object of kind IngressClass. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-networking-v1-ingress-class name nil))
  ([name optional-params]
   (:data (watch-networking-v1-ingress-class-with-http-info name optional-params))))

(defn watch-networking-v1-ingress-class-list-with-http-info
  "
  watch individual changes to a list of IngressClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-ingress-class-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/ingressclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-ingress-class-list
  "
  watch individual changes to a list of IngressClass. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-ingress-class-list nil))
  ([optional-params]
   (:data (watch-networking-v1-ingress-class-list-with-http-info optional-params))))

(defn watch-networking-v1-ingress-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-ingress-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-ingress-list-for-all-namespaces
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-networking-v1-ingress-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-networking-v1-ingress-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-networking-v1-namespaced-ingress-with-http-info
  "
  watch changes to an object of kind Ingress. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-networking-v1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-namespaced-ingress
  "
  watch changes to an object of kind Ingress. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-networking-v1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (watch-networking-v1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn watch-networking-v1-namespaced-ingress-list-with-http-info
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-networking-v1-namespaced-ingress-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-networking-v1-namespaced-ingress-list
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-networking-v1-namespaced-ingress-list namespace nil))
  ([namespace optional-params]
   (:data (watch-networking-v1-namespaced-ingress-list-with-http-info namespace optional-params))))

(defn watch-networking-v1-namespaced-network-policy-with-http-info
  "
  watch changes to an object of kind NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-networking-v1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
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
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
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
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/networking.k8s.io/v1/watch/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
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

