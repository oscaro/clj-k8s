(ns kubernetes.api.extensions-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  create a DaemonSet"
  ([namespace body ] (create-extensions-v1beta1-namespaced-daemon-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-daemon-set
  "
  create a DaemonSet"
  ([namespace body ] (create-extensions-v1beta1-namespaced-daemon-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-daemon-set-with-http-info namespace body optional-params))))

(defn create-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  create a Deployment"
  ([namespace body ] (create-extensions-v1beta1-namespaced-deployment-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-deployment
  "
  create a Deployment"
  ([namespace body ] (create-extensions-v1beta1-namespaced-deployment namespace body nil))
  ([namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-deployment-with-http-info namespace body optional-params))))

(defn create-extensions-v1beta1-namespaced-deployment-rollback-with-http-info
  "
  create rollback of a Deployment"
  ([name namespace body ] (create-extensions-v1beta1-namespaced-deployment-rollback-with-http-info name namespace body nil))
  ([name namespace body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/rollback" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-deployment-rollback
  "
  create rollback of a Deployment"
  ([name namespace body ] (create-extensions-v1beta1-namespaced-deployment-rollback name namespace body nil))
  ([name namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-deployment-rollback-with-http-info name namespace body optional-params))))

(defn create-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  create an Ingress"
  ([namespace body ] (create-extensions-v1beta1-namespaced-ingress-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-ingress
  "
  create an Ingress"
  ([namespace body ] (create-extensions-v1beta1-namespaced-ingress namespace body nil))
  ([namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-ingress-with-http-info namespace body optional-params))))

(defn create-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  create a NetworkPolicy"
  ([namespace body ] (create-extensions-v1beta1-namespaced-network-policy-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-network-policy
  "
  create a NetworkPolicy"
  ([namespace body ] (create-extensions-v1beta1-namespaced-network-policy namespace body nil))
  ([namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-network-policy-with-http-info namespace body optional-params))))

(defn create-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  create a ReplicaSet"
  ([namespace body ] (create-extensions-v1beta1-namespaced-replica-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-namespaced-replica-set
  "
  create a ReplicaSet"
  ([namespace body ] (create-extensions-v1beta1-namespaced-replica-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-extensions-v1beta1-namespaced-replica-set-with-http-info namespace body optional-params))))

(defn create-extensions-v1beta1-pod-security-policy-with-http-info
  "
  create a PodSecurityPolicy"
  ([body ] (create-extensions-v1beta1-pod-security-policy-with-http-info body nil))
  ([body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-extensions-v1beta1-pod-security-policy
  "
  create a PodSecurityPolicy"
  ([body ] (create-extensions-v1beta1-pod-security-policy body nil))
  ([body optional-params]
   (:data (create-extensions-v1beta1-pod-security-policy-with-http-info body optional-params))))

(defn delete-extensions-v1beta1-collection-namespaced-daemon-set-with-http-info
  "
  delete collection of DaemonSet"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-namespaced-daemon-set
  "
  delete collection of DaemonSet"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-daemon-set namespace nil))
  ([namespace optional-params]
   (:data (delete-extensions-v1beta1-collection-namespaced-daemon-set-with-http-info namespace optional-params))))

(defn delete-extensions-v1beta1-collection-namespaced-deployment-with-http-info
  "
  delete collection of Deployment"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-namespaced-deployment
  "
  delete collection of Deployment"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (delete-extensions-v1beta1-collection-namespaced-deployment-with-http-info namespace optional-params))))

(defn delete-extensions-v1beta1-collection-namespaced-ingress-with-http-info
  "
  delete collection of Ingress"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-ingress-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-namespaced-ingress
  "
  delete collection of Ingress"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-ingress namespace nil))
  ([namespace optional-params]
   (:data (delete-extensions-v1beta1-collection-namespaced-ingress-with-http-info namespace optional-params))))

(defn delete-extensions-v1beta1-collection-namespaced-network-policy-with-http-info
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-namespaced-network-policy
  "
  delete collection of NetworkPolicy"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-network-policy namespace nil))
  ([namespace optional-params]
   (:data (delete-extensions-v1beta1-collection-namespaced-network-policy-with-http-info namespace optional-params))))

(defn delete-extensions-v1beta1-collection-namespaced-replica-set-with-http-info
  "
  delete collection of ReplicaSet"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-replica-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-namespaced-replica-set
  "
  delete collection of ReplicaSet"
  ([namespace ] (delete-extensions-v1beta1-collection-namespaced-replica-set namespace nil))
  ([namespace optional-params]
   (:data (delete-extensions-v1beta1-collection-namespaced-replica-set-with-http-info namespace optional-params))))

(defn delete-extensions-v1beta1-collection-pod-security-policy-with-http-info
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-extensions-v1beta1-collection-pod-security-policy-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-collection-pod-security-policy
  "
  delete collection of PodSecurityPolicy"
  ([] (delete-extensions-v1beta1-collection-pod-security-policy nil))
  ([optional-params]
   (:data (delete-extensions-v1beta1-collection-pod-security-policy-with-http-info optional-params))))

(defn delete-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  delete a DaemonSet"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-namespaced-daemon-set
  "
  delete a DaemonSet"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn delete-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  delete a Deployment"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-namespaced-deployment
  "
  delete a Deployment"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (delete-extensions-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn delete-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  delete an Ingress"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-namespaced-ingress
  "
  delete an Ingress"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (delete-extensions-v1beta1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn delete-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  delete a NetworkPolicy"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-namespaced-network-policy
  "
  delete a NetworkPolicy"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (delete-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn delete-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  delete a ReplicaSet"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-namespaced-replica-set
  "
  delete a ReplicaSet"
  ([name namespace ] (delete-extensions-v1beta1-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn delete-extensions-v1beta1-pod-security-policy-with-http-info
  "
  delete a PodSecurityPolicy"
  ([name ] (delete-extensions-v1beta1-pod-security-policy-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-extensions-v1beta1-pod-security-policy
  "
  delete a PodSecurityPolicy"
  ([name ] (delete-extensions-v1beta1-pod-security-policy name nil))
  ([name optional-params]
   (:data (delete-extensions-v1beta1-pod-security-policy-with-http-info name optional-params))))

(defn get-extensions-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/extensions/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-extensions-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-extensions-v1beta1-api-resources-with-http-info)))

(defn list-extensions-v1beta1-daemon-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind DaemonSet"
  ([] (list-extensions-v1beta1-daemon-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/daemonsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-daemon-set-for-all-namespaces
  "
  list or watch objects of kind DaemonSet"
  ([] (list-extensions-v1beta1-daemon-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-daemon-set-for-all-namespaces-with-http-info optional-params))))

(defn list-extensions-v1beta1-deployment-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Deployment"
  ([] (list-extensions-v1beta1-deployment-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-deployment-for-all-namespaces
  "
  list or watch objects of kind Deployment"
  ([] (list-extensions-v1beta1-deployment-for-all-namespaces nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-deployment-for-all-namespaces-with-http-info optional-params))))

(defn list-extensions-v1beta1-ingress-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Ingress"
  ([] (list-extensions-v1beta1-ingress-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-ingress-for-all-namespaces
  "
  list or watch objects of kind Ingress"
  ([] (list-extensions-v1beta1-ingress-for-all-namespaces nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-ingress-for-all-namespaces-with-http-info optional-params))))

(defn list-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  list or watch objects of kind DaemonSet"
  ([namespace ] (list-extensions-v1beta1-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-namespaced-daemon-set
  "
  list or watch objects of kind DaemonSet"
  ([namespace ] (list-extensions-v1beta1-namespaced-daemon-set namespace nil))
  ([namespace optional-params]
   (:data (list-extensions-v1beta1-namespaced-daemon-set-with-http-info namespace optional-params))))

(defn list-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-extensions-v1beta1-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-namespaced-deployment
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-extensions-v1beta1-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (list-extensions-v1beta1-namespaced-deployment-with-http-info namespace optional-params))))

(defn list-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  list or watch objects of kind Ingress"
  ([namespace ] (list-extensions-v1beta1-namespaced-ingress-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-namespaced-ingress
  "
  list or watch objects of kind Ingress"
  ([namespace ] (list-extensions-v1beta1-namespaced-ingress namespace nil))
  ([namespace optional-params]
   (:data (list-extensions-v1beta1-namespaced-ingress-with-http-info namespace optional-params))))

(defn list-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace ] (list-extensions-v1beta1-namespaced-network-policy-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-namespaced-network-policy
  "
  list or watch objects of kind NetworkPolicy"
  ([namespace ] (list-extensions-v1beta1-namespaced-network-policy namespace nil))
  ([namespace optional-params]
   (:data (list-extensions-v1beta1-namespaced-network-policy-with-http-info namespace optional-params))))

(defn list-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  list or watch objects of kind ReplicaSet"
  ([namespace ] (list-extensions-v1beta1-namespaced-replica-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-namespaced-replica-set
  "
  list or watch objects of kind ReplicaSet"
  ([namespace ] (list-extensions-v1beta1-namespaced-replica-set namespace nil))
  ([namespace optional-params]
   (:data (list-extensions-v1beta1-namespaced-replica-set-with-http-info namespace optional-params))))

(defn list-extensions-v1beta1-network-policy-for-all-namespaces-with-http-info
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-extensions-v1beta1-network-policy-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-network-policy-for-all-namespaces
  "
  list or watch objects of kind NetworkPolicy"
  ([] (list-extensions-v1beta1-network-policy-for-all-namespaces nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-network-policy-for-all-namespaces-with-http-info optional-params))))

(defn list-extensions-v1beta1-pod-security-policy-with-http-info
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-extensions-v1beta1-pod-security-policy-with-http-info nil))
  ([{:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-pod-security-policy
  "
  list or watch objects of kind PodSecurityPolicy"
  ([] (list-extensions-v1beta1-pod-security-policy nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-pod-security-policy-with-http-info optional-params))))

(defn list-extensions-v1beta1-replica-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-extensions-v1beta1-replica-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/replicasets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-extensions-v1beta1-replica-set-for-all-namespaces
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-extensions-v1beta1-replica-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-extensions-v1beta1-replica-set-for-all-namespaces-with-http-info optional-params))))

(defn patch-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  partially update the specified DaemonSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-daemon-set
  "
  partially update the specified DaemonSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-daemon-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-daemon-set-status-with-http-info
  "
  partially update status of the specified DaemonSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-daemon-set-status
  "
  partially update status of the specified DaemonSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-daemon-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-deployment
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-deployment-scale-with-http-info
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-deployment-scale
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-deployment-status-with-http-info
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-deployment-status
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  partially update the specified Ingress"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-ingress-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-ingress
  "
  partially update the specified Ingress"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-ingress name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-ingress-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-ingress-status-with-http-info
  "
  partially update status of the specified Ingress"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-ingress-status
  "
  partially update status of the specified Ingress"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-ingress-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-network-policy
  "
  partially update the specified NetworkPolicy"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-network-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  partially update the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-replica-set
  "
  partially update the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-replica-set-scale-with-http-info
  "
  partially update scale of the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-replica-set-scale
  "
  partially update scale of the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-replica-set-status-with-http-info
  "
  partially update status of the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-replica-set-status
  "
  partially update status of the specified ReplicaSet"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replica-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info
  "
  partially update scale of the specified ReplicationControllerDummy"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-namespaced-replication-controller-dummy-scale
  "
  partially update scale of the specified ReplicationControllerDummy"
  ([name namespace body ] (patch-extensions-v1beta1-namespaced-replication-controller-dummy-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace body optional-params))))

(defn patch-extensions-v1beta1-pod-security-policy-with-http-info
  "
  partially update the specified PodSecurityPolicy"
  ([name body ] (patch-extensions-v1beta1-pod-security-policy-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-extensions-v1beta1-pod-security-policy
  "
  partially update the specified PodSecurityPolicy"
  ([name body ] (patch-extensions-v1beta1-pod-security-policy name body nil))
  ([name body optional-params]
   (:data (patch-extensions-v1beta1-pod-security-policy-with-http-info name body optional-params))))

(defn read-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  read the specified DaemonSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-daemon-set
  "
  read the specified DaemonSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-daemon-set-status-with-http-info
  "
  read status of the specified DaemonSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-daemon-set-status
  "
  read status of the specified DaemonSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-daemon-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  read the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-deployment
  "
  read the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-deployment-scale-with-http-info
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-deployment-scale
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-deployment-status-with-http-info
  "
  read status of the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-deployment-status
  "
  read status of the specified Deployment"
  ([name namespace ] (read-extensions-v1beta1-namespaced-deployment-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  read the specified Ingress"
  ([name namespace ] (read-extensions-v1beta1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-ingress
  "
  read the specified Ingress"
  ([name namespace ] (read-extensions-v1beta1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-ingress-status-with-http-info
  "
  read status of the specified Ingress"
  ([name namespace ] (read-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-ingress-status
  "
  read status of the specified Ingress"
  ([name namespace ] (read-extensions-v1beta1-namespaced-ingress-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  read the specified NetworkPolicy"
  ([name namespace ] (read-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-network-policy
  "
  read the specified NetworkPolicy"
  ([name namespace ] (read-extensions-v1beta1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  read the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-replica-set
  "
  read the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-replica-set-scale-with-http-info
  "
  read scale of the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-replica-set-scale
  "
  read scale of the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-replica-set-status-with-http-info
  "
  read status of the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-replica-set-status
  "
  read status of the specified ReplicaSet"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replica-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info
  "
  read scale of the specified ReplicationControllerDummy"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-namespaced-replication-controller-dummy-scale
  "
  read scale of the specified ReplicationControllerDummy"
  ([name namespace ] (read-extensions-v1beta1-namespaced-replication-controller-dummy-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace optional-params))))

(defn read-extensions-v1beta1-pod-security-policy-with-http-info
  "
  read the specified PodSecurityPolicy"
  ([name ] (read-extensions-v1beta1-pod-security-policy-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-extensions-v1beta1-pod-security-policy
  "
  read the specified PodSecurityPolicy"
  ([name ] (read-extensions-v1beta1-pod-security-policy name nil))
  ([name optional-params]
   (:data (read-extensions-v1beta1-pod-security-policy-with-http-info name optional-params))))

(defn replace-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  replace the specified DaemonSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-daemon-set
  "
  replace the specified DaemonSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-daemon-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-daemon-set-status-with-http-info
  "
  replace status of the specified DaemonSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-daemon-set-status
  "
  replace status of the specified DaemonSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-daemon-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-daemon-set-status-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-deployment
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-deployment-scale-with-http-info
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-deployment-scale
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-deployment-status-with-http-info
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-deployment-status
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  replace the specified Ingress"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-ingress-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-ingress
  "
  replace the specified Ingress"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-ingress name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-ingress-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-ingress-status-with-http-info
  "
  replace status of the specified Ingress"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-ingress-status
  "
  replace status of the specified Ingress"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-ingress-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-ingress-status-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  replace the specified NetworkPolicy"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-network-policy
  "
  replace the specified NetworkPolicy"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-network-policy name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  replace the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-replica-set
  "
  replace the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-replica-set-scale-with-http-info
  "
  replace scale of the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-replica-set-scale
  "
  replace scale of the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-replica-set-scale-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-replica-set-status-with-http-info
  "
  replace status of the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-replica-set-status
  "
  replace status of the specified ReplicaSet"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replica-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-replica-set-status-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info
  "
  replace scale of the specified ReplicationControllerDummy"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-namespaced-replication-controller-dummy-scale
  "
  replace scale of the specified ReplicationControllerDummy"
  ([name namespace body ] (replace-extensions-v1beta1-namespaced-replication-controller-dummy-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-extensions-v1beta1-namespaced-replication-controller-dummy-scale-with-http-info name namespace body optional-params))))

(defn replace-extensions-v1beta1-pod-security-policy-with-http-info
  "
  replace the specified PodSecurityPolicy"
  ([name body ] (replace-extensions-v1beta1-pod-security-policy-with-http-info name body nil))
  ([name body {:keys [pretty dry-run ]}]
   (check-required-params name body)
   (call-api "/apis/extensions/v1beta1/podsecuritypolicies/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-extensions-v1beta1-pod-security-policy
  "
  replace the specified PodSecurityPolicy"
  ([name body ] (replace-extensions-v1beta1-pod-security-policy name body nil))
  ([name body optional-params]
   (:data (replace-extensions-v1beta1-pod-security-policy-with-http-info name body optional-params))))

(defn watch-extensions-v1beta1-daemon-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-daemon-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/daemonsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-daemon-set-list-for-all-namespaces
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-daemon-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-daemon-set-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-extensions-v1beta1-deployment-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-deployment-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-deployment-list-for-all-namespaces
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-deployment-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-deployment-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-extensions-v1beta1-ingress-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-ingress-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/ingresses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-ingress-list-for-all-namespaces
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-ingress-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-ingress-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-extensions-v1beta1-namespaced-daemon-set-with-http-info
  "
  watch changes to an object of kind DaemonSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/daemonsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-daemon-set
  "
  watch changes to an object of kind DaemonSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-daemon-set-list-with-http-info
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-daemon-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/daemonsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-daemon-set-list
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-daemon-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-daemon-set-list-with-http-info namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-deployment-with-http-info
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-deployment
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-deployment-list-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-deployment-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-deployment-list
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-deployment-list namespace nil))
  ([namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-deployment-list-with-http-info namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-ingress-with-http-info
  "
  watch changes to an object of kind Ingress. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-ingress-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/ingresses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-ingress
  "
  watch changes to an object of kind Ingress. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-ingress name namespace nil))
  ([name namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-ingress-with-http-info name namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-ingress-list-with-http-info
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-ingress-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/ingresses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-ingress-list
  "
  watch individual changes to a list of Ingress. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-ingress-list namespace nil))
  ([namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-ingress-list-with-http-info namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-network-policy-with-http-info
  "
  watch changes to an object of kind NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/networkpolicies/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-network-policy
  "
  watch changes to an object of kind NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-network-policy name namespace nil))
  ([name namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-network-policy-with-http-info name namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-network-policy-list-with-http-info
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-network-policy-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/networkpolicies" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-network-policy-list
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-network-policy-list namespace nil))
  ([namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-network-policy-list-with-http-info namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-replica-set-with-http-info
  "
  watch changes to an object of kind ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/replicasets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-replica-set
  "
  watch changes to an object of kind ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-extensions-v1beta1-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn watch-extensions-v1beta1-namespaced-replica-set-list-with-http-info
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-replica-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/extensions/v1beta1/watch/namespaces/{namespace}/replicasets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-namespaced-replica-set-list
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-extensions-v1beta1-namespaced-replica-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-extensions-v1beta1-namespaced-replica-set-list-with-http-info namespace optional-params))))

(defn watch-extensions-v1beta1-network-policy-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-network-policy-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/networkpolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-network-policy-list-for-all-namespaces
  "
  watch individual changes to a list of NetworkPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-network-policy-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-network-policy-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-extensions-v1beta1-pod-security-policy-with-http-info
  "
  watch changes to an object of kind PodSecurityPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-extensions-v1beta1-pod-security-policy-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/extensions/v1beta1/watch/podsecuritypolicies/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-pod-security-policy
  "
  watch changes to an object of kind PodSecurityPolicy. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-extensions-v1beta1-pod-security-policy name nil))
  ([name optional-params]
   (:data (watch-extensions-v1beta1-pod-security-policy-with-http-info name optional-params))))

(defn watch-extensions-v1beta1-pod-security-policy-list-with-http-info
  "
  watch individual changes to a list of PodSecurityPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-pod-security-policy-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/podsecuritypolicies" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-pod-security-policy-list
  "
  watch individual changes to a list of PodSecurityPolicy. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-pod-security-policy-list nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-pod-security-policy-list-with-http-info optional-params))))

(defn watch-extensions-v1beta1-replica-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-replica-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/extensions/v1beta1/watch/replicasets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-extensions-v1beta1-replica-set-list-for-all-namespaces
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-extensions-v1beta1-replica-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-extensions-v1beta1-replica-set-list-for-all-namespaces-with-http-info optional-params))))

