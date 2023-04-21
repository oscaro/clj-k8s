(ns kubernetes.api.apps-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  create a ControllerRevision"
  ([namespace body ] (create-apps-v1beta1-namespaced-controller-revision-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta1-namespaced-controller-revision
  "
  create a ControllerRevision"
  ([namespace body ] (create-apps-v1beta1-namespaced-controller-revision namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta1-namespaced-controller-revision-with-http-info namespace body optional-params))))

(defn create-apps-v1beta1-namespaced-deployment-with-http-info
  "
  create a Deployment"
  ([namespace body ] (create-apps-v1beta1-namespaced-deployment-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta1-namespaced-deployment
  "
  create a Deployment"
  ([namespace body ] (create-apps-v1beta1-namespaced-deployment namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta1-namespaced-deployment-with-http-info namespace body optional-params))))

(defn create-apps-v1beta1-namespaced-deployment-rollback-with-http-info
  "
  create rollback of a Deployment"
  ([name namespace body ] (create-apps-v1beta1-namespaced-deployment-rollback-with-http-info name namespace body nil))
  ([name namespace body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/rollback" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta1-namespaced-deployment-rollback
  "
  create rollback of a Deployment"
  ([name namespace body ] (create-apps-v1beta1-namespaced-deployment-rollback name namespace body nil))
  ([name namespace body optional-params]
   (:data (create-apps-v1beta1-namespaced-deployment-rollback-with-http-info name namespace body optional-params))))

(defn create-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  create a StatefulSet"
  ([namespace body ] (create-apps-v1beta1-namespaced-stateful-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta1-namespaced-stateful-set
  "
  create a StatefulSet"
  ([namespace body ] (create-apps-v1beta1-namespaced-stateful-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta1-namespaced-stateful-set-with-http-info namespace body optional-params))))

(defn create-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  create a ControllerRevision"
  ([namespace body ] (create-apps-v1beta2-namespaced-controller-revision-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta2-namespaced-controller-revision
  "
  create a ControllerRevision"
  ([namespace body ] (create-apps-v1beta2-namespaced-controller-revision namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta2-namespaced-controller-revision-with-http-info namespace body optional-params))))

(defn create-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  create a DaemonSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-daemon-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta2-namespaced-daemon-set
  "
  create a DaemonSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-daemon-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta2-namespaced-daemon-set-with-http-info namespace body optional-params))))

(defn create-apps-v1beta2-namespaced-deployment-with-http-info
  "
  create a Deployment"
  ([namespace body ] (create-apps-v1beta2-namespaced-deployment-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta2-namespaced-deployment
  "
  create a Deployment"
  ([namespace body ] (create-apps-v1beta2-namespaced-deployment namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta2-namespaced-deployment-with-http-info namespace body optional-params))))

(defn create-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  create a ReplicaSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-replica-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta2-namespaced-replica-set
  "
  create a ReplicaSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-replica-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta2-namespaced-replica-set-with-http-info namespace body optional-params))))

(defn create-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  create a StatefulSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-stateful-set-with-http-info namespace body nil))
  ([namespace body {:keys [include-uninitialized pretty dry-run ]}]
   (check-required-params namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-apps-v1beta2-namespaced-stateful-set
  "
  create a StatefulSet"
  ([namespace body ] (create-apps-v1beta2-namespaced-stateful-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-apps-v1beta2-namespaced-stateful-set-with-http-info namespace body optional-params))))

(defn delete-apps-v1beta1-collection-namespaced-controller-revision-with-http-info
  "
  delete collection of ControllerRevision"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-collection-namespaced-controller-revision
  "
  delete collection of ControllerRevision"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-controller-revision namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta1-collection-namespaced-controller-revision-with-http-info namespace optional-params))))

(defn delete-apps-v1beta1-collection-namespaced-deployment-with-http-info
  "
  delete collection of Deployment"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-collection-namespaced-deployment
  "
  delete collection of Deployment"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta1-collection-namespaced-deployment-with-http-info namespace optional-params))))

(defn delete-apps-v1beta1-collection-namespaced-stateful-set-with-http-info
  "
  delete collection of StatefulSet"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-collection-namespaced-stateful-set
  "
  delete collection of StatefulSet"
  ([namespace ] (delete-apps-v1beta1-collection-namespaced-stateful-set namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta1-collection-namespaced-stateful-set-with-http-info namespace optional-params))))

(defn delete-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  delete a ControllerRevision"
  ([name namespace ] (delete-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-namespaced-controller-revision
  "
  delete a ControllerRevision"
  ([name namespace ] (delete-apps-v1beta1-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta1-namespaced-deployment-with-http-info
  "
  delete a Deployment"
  ([name namespace ] (delete-apps-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-namespaced-deployment
  "
  delete a Deployment"
  ([name namespace ] (delete-apps-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  delete a StatefulSet"
  ([name namespace ] (delete-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta1-namespaced-stateful-set
  "
  delete a StatefulSet"
  ([name namespace ] (delete-apps-v1beta1-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta2-collection-namespaced-controller-revision-with-http-info
  "
  delete collection of ControllerRevision"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-collection-namespaced-controller-revision
  "
  delete collection of ControllerRevision"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-controller-revision namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta2-collection-namespaced-controller-revision-with-http-info namespace optional-params))))

(defn delete-apps-v1beta2-collection-namespaced-daemon-set-with-http-info
  "
  delete collection of DaemonSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-collection-namespaced-daemon-set
  "
  delete collection of DaemonSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-daemon-set namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta2-collection-namespaced-daemon-set-with-http-info namespace optional-params))))

(defn delete-apps-v1beta2-collection-namespaced-deployment-with-http-info
  "
  delete collection of Deployment"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-collection-namespaced-deployment
  "
  delete collection of Deployment"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta2-collection-namespaced-deployment-with-http-info namespace optional-params))))

(defn delete-apps-v1beta2-collection-namespaced-replica-set-with-http-info
  "
  delete collection of ReplicaSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-replica-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-collection-namespaced-replica-set
  "
  delete collection of ReplicaSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-replica-set namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta2-collection-namespaced-replica-set-with-http-info namespace optional-params))))

(defn delete-apps-v1beta2-collection-namespaced-stateful-set-with-http-info
  "
  delete collection of StatefulSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-collection-namespaced-stateful-set
  "
  delete collection of StatefulSet"
  ([namespace ] (delete-apps-v1beta2-collection-namespaced-stateful-set namespace nil))
  ([namespace optional-params]
   (:data (delete-apps-v1beta2-collection-namespaced-stateful-set-with-http-info namespace optional-params))))

(defn delete-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  delete a ControllerRevision"
  ([name namespace ] (delete-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-namespaced-controller-revision
  "
  delete a ControllerRevision"
  ([name namespace ] (delete-apps-v1beta2-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  delete a DaemonSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-namespaced-daemon-set
  "
  delete a DaemonSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta2-namespaced-deployment-with-http-info
  "
  delete a Deployment"
  ([name namespace ] (delete-apps-v1beta2-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-namespaced-deployment
  "
  delete a Deployment"
  ([name namespace ] (delete-apps-v1beta2-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta2-namespaced-deployment-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  delete a ReplicaSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-namespaced-replica-set
  "
  delete a ReplicaSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta2-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn delete-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  delete a StatefulSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-apps-v1beta2-namespaced-stateful-set
  "
  delete a StatefulSet"
  ([name namespace ] (delete-apps-v1beta2-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn get-apps-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/apps/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-apps-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-apps-v1beta1-api-resources-with-http-info)))

(defn get-apps-v1beta2-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/apps/v1beta2/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-apps-v1beta2-api-resources
  "
  get available resources"
  []
  (:data (get-apps-v1beta2-api-resources-with-http-info)))

(defn list-apps-v1beta1-controller-revision-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-apps-v1beta1-controller-revision-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/controllerrevisions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-controller-revision-for-all-namespaces
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-apps-v1beta1-controller-revision-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta1-controller-revision-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta1-deployment-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Deployment"
  ([] (list-apps-v1beta1-deployment-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-deployment-for-all-namespaces
  "
  list or watch objects of kind Deployment"
  ([] (list-apps-v1beta1-deployment-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta1-deployment-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  list or watch objects of kind ControllerRevision"
  ([namespace ] (list-apps-v1beta1-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-namespaced-controller-revision
  "
  list or watch objects of kind ControllerRevision"
  ([namespace ] (list-apps-v1beta1-namespaced-controller-revision namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta1-namespaced-controller-revision-with-http-info namespace optional-params))))

(defn list-apps-v1beta1-namespaced-deployment-with-http-info
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-apps-v1beta1-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-namespaced-deployment
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-apps-v1beta1-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta1-namespaced-deployment-with-http-info namespace optional-params))))

(defn list-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  list or watch objects of kind StatefulSet"
  ([namespace ] (list-apps-v1beta1-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-namespaced-stateful-set
  "
  list or watch objects of kind StatefulSet"
  ([namespace ] (list-apps-v1beta1-namespaced-stateful-set namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta1-namespaced-stateful-set-with-http-info namespace optional-params))))

(defn list-apps-v1beta1-stateful-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind StatefulSet"
  ([] (list-apps-v1beta1-stateful-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/statefulsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta1-stateful-set-for-all-namespaces
  "
  list or watch objects of kind StatefulSet"
  ([] (list-apps-v1beta1-stateful-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta1-stateful-set-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta2-controller-revision-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-apps-v1beta2-controller-revision-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/controllerrevisions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-controller-revision-for-all-namespaces
  "
  list or watch objects of kind ControllerRevision"
  ([] (list-apps-v1beta2-controller-revision-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta2-controller-revision-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta2-daemon-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind DaemonSet"
  ([] (list-apps-v1beta2-daemon-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/daemonsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-daemon-set-for-all-namespaces
  "
  list or watch objects of kind DaemonSet"
  ([] (list-apps-v1beta2-daemon-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta2-daemon-set-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta2-deployment-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Deployment"
  ([] (list-apps-v1beta2-deployment-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-deployment-for-all-namespaces
  "
  list or watch objects of kind Deployment"
  ([] (list-apps-v1beta2-deployment-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta2-deployment-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  list or watch objects of kind ControllerRevision"
  ([namespace ] (list-apps-v1beta2-namespaced-controller-revision-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-namespaced-controller-revision
  "
  list or watch objects of kind ControllerRevision"
  ([namespace ] (list-apps-v1beta2-namespaced-controller-revision namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta2-namespaced-controller-revision-with-http-info namespace optional-params))))

(defn list-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  list or watch objects of kind DaemonSet"
  ([namespace ] (list-apps-v1beta2-namespaced-daemon-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-namespaced-daemon-set
  "
  list or watch objects of kind DaemonSet"
  ([namespace ] (list-apps-v1beta2-namespaced-daemon-set namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta2-namespaced-daemon-set-with-http-info namespace optional-params))))

(defn list-apps-v1beta2-namespaced-deployment-with-http-info
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-apps-v1beta2-namespaced-deployment-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-namespaced-deployment
  "
  list or watch objects of kind Deployment"
  ([namespace ] (list-apps-v1beta2-namespaced-deployment namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta2-namespaced-deployment-with-http-info namespace optional-params))))

(defn list-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  list or watch objects of kind ReplicaSet"
  ([namespace ] (list-apps-v1beta2-namespaced-replica-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-namespaced-replica-set
  "
  list or watch objects of kind ReplicaSet"
  ([namespace ] (list-apps-v1beta2-namespaced-replica-set namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta2-namespaced-replica-set-with-http-info namespace optional-params))))

(defn list-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  list or watch objects of kind StatefulSet"
  ([namespace ] (list-apps-v1beta2-namespaced-stateful-set-with-http-info namespace nil))
  ([namespace {:keys [include-uninitialized pretty continue field-selector label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"includeUninitialized" include-uninitialized "pretty" pretty "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-namespaced-stateful-set
  "
  list or watch objects of kind StatefulSet"
  ([namespace ] (list-apps-v1beta2-namespaced-stateful-set namespace nil))
  ([namespace optional-params]
   (:data (list-apps-v1beta2-namespaced-stateful-set-with-http-info namespace optional-params))))

(defn list-apps-v1beta2-replica-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-apps-v1beta2-replica-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/replicasets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-replica-set-for-all-namespaces
  "
  list or watch objects of kind ReplicaSet"
  ([] (list-apps-v1beta2-replica-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta2-replica-set-for-all-namespaces-with-http-info optional-params))))

(defn list-apps-v1beta2-stateful-set-for-all-namespaces-with-http-info
  "
  list or watch objects of kind StatefulSet"
  ([] (list-apps-v1beta2-stateful-set-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/statefulsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-apps-v1beta2-stateful-set-for-all-namespaces
  "
  list or watch objects of kind StatefulSet"
  ([] (list-apps-v1beta2-stateful-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-apps-v1beta2-stateful-set-for-all-namespaces-with-http-info optional-params))))

(defn patch-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  partially update the specified ControllerRevision"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-controller-revision
  "
  partially update the specified ControllerRevision"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-controller-revision name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-deployment-with-http-info
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-deployment
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-deployment-scale-with-http-info
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-deployment-scale
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-deployment-status-with-http-info
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-deployment-status
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  partially update the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-stateful-set
  "
  partially update the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-stateful-set-scale-with-http-info
  "
  partially update scale of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-stateful-set-scale
  "
  partially update scale of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta1-namespaced-stateful-set-status-with-http-info
  "
  partially update status of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta1-namespaced-stateful-set-status
  "
  partially update status of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta1-namespaced-stateful-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  partially update the specified ControllerRevision"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-controller-revision
  "
  partially update the specified ControllerRevision"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-controller-revision name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  partially update the specified DaemonSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-daemon-set
  "
  partially update the specified DaemonSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-daemon-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-daemon-set-status-with-http-info
  "
  partially update status of the specified DaemonSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-daemon-set-status
  "
  partially update status of the specified DaemonSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-daemon-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-deployment-with-http-info
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-deployment
  "
  partially update the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-deployment-scale-with-http-info
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-deployment-scale
  "
  partially update scale of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-deployment-status-with-http-info
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-deployment-status
  "
  partially update status of the specified Deployment"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  partially update the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-replica-set
  "
  partially update the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-replica-set-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-replica-set-scale-with-http-info
  "
  partially update scale of the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-replica-set-scale
  "
  partially update scale of the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-replica-set-status-with-http-info
  "
  partially update status of the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-replica-set-status
  "
  partially update status of the specified ReplicaSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-replica-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  partially update the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-stateful-set
  "
  partially update the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-stateful-set-scale-with-http-info
  "
  partially update scale of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-stateful-set-scale
  "
  partially update scale of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))))

(defn patch-apps-v1beta2-namespaced-stateful-set-status-with-http-info
  "
  partially update status of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-apps-v1beta2-namespaced-stateful-set-status
  "
  partially update status of the specified StatefulSet"
  ([name namespace body ] (patch-apps-v1beta2-namespaced-stateful-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace body optional-params))))

(defn read-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  read the specified ControllerRevision"
  ([name namespace ] (read-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-controller-revision
  "
  read the specified ControllerRevision"
  ([name namespace ] (read-apps-v1beta1-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-deployment-with-http-info
  "
  read the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-deployment
  "
  read the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-deployment-scale-with-http-info
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-deployment-scale
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-deployment-status-with-http-info
  "
  read status of the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-deployment-status
  "
  read status of the specified Deployment"
  ([name namespace ] (read-apps-v1beta1-namespaced-deployment-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  read the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-stateful-set
  "
  read the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-stateful-set-scale-with-http-info
  "
  read scale of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-stateful-set-scale
  "
  read scale of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace optional-params))))

(defn read-apps-v1beta1-namespaced-stateful-set-status-with-http-info
  "
  read status of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta1-namespaced-stateful-set-status
  "
  read status of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta1-namespaced-stateful-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  read the specified ControllerRevision"
  ([name namespace ] (read-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-controller-revision
  "
  read the specified ControllerRevision"
  ([name namespace ] (read-apps-v1beta2-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  read the specified DaemonSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-daemon-set
  "
  read the specified DaemonSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-daemon-set-status-with-http-info
  "
  read status of the specified DaemonSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-daemon-set-status
  "
  read status of the specified DaemonSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-daemon-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-deployment-with-http-info
  "
  read the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-deployment
  "
  read the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-deployment-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-deployment-scale-with-http-info
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-deployment-scale
  "
  read scale of the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-deployment-status-with-http-info
  "
  read status of the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-deployment-status
  "
  read status of the specified Deployment"
  ([name namespace ] (read-apps-v1beta2-namespaced-deployment-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  read the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-replica-set
  "
  read the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-replica-set-scale-with-http-info
  "
  read scale of the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-replica-set-scale
  "
  read scale of the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-replica-set-status-with-http-info
  "
  read status of the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-replica-set-status
  "
  read status of the specified ReplicaSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-replica-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  read the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-stateful-set
  "
  read the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-stateful-set-scale-with-http-info
  "
  read scale of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-stateful-set-scale
  "
  read scale of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace optional-params))))

(defn read-apps-v1beta2-namespaced-stateful-set-status-with-http-info
  "
  read status of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-apps-v1beta2-namespaced-stateful-set-status
  "
  read status of the specified StatefulSet"
  ([name namespace ] (read-apps-v1beta2-namespaced-stateful-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace optional-params))))

(defn replace-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  replace the specified ControllerRevision"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/controllerrevisions/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-controller-revision
  "
  replace the specified ControllerRevision"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-controller-revision name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-deployment-with-http-info
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-deployment
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-deployment-scale-with-http-info
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-deployment-scale
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-deployment-status-with-http-info
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/deployments/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-deployment-status
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  replace the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-stateful-set
  "
  replace the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-stateful-set-scale-with-http-info
  "
  replace scale of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-stateful-set-scale
  "
  replace scale of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta1-namespaced-stateful-set-status-with-http-info
  "
  replace status of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta1/namespaces/{namespace}/statefulsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta1-namespaced-stateful-set-status
  "
  replace status of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta1-namespaced-stateful-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta1-namespaced-stateful-set-status-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  replace the specified ControllerRevision"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/controllerrevisions/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-controller-revision
  "
  replace the specified ControllerRevision"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-controller-revision name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  replace the specified DaemonSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-daemon-set
  "
  replace the specified DaemonSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-daemon-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-daemon-set-status-with-http-info
  "
  replace status of the specified DaemonSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/daemonsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-daemon-set-status
  "
  replace status of the specified DaemonSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-daemon-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-daemon-set-status-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-deployment-with-http-info
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-deployment
  "
  replace the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-deployment-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-deployment-scale-with-http-info
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-deployment-scale
  "
  replace scale of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-deployment-scale-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-deployment-status-with-http-info
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/deployments/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-deployment-status
  "
  replace status of the specified Deployment"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-deployment-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-deployment-status-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  replace the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-replica-set
  "
  replace the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-replica-set-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-replica-set-scale-with-http-info
  "
  replace scale of the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-replica-set-scale
  "
  replace scale of the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-replica-set-scale-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-replica-set-status-with-http-info
  "
  replace status of the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/replicasets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-replica-set-status
  "
  replace status of the specified ReplicaSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-replica-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-replica-set-status-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  replace the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-stateful-set
  "
  replace the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-stateful-set-scale-with-http-info
  "
  replace scale of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-stateful-set-scale
  "
  replace scale of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-stateful-set-scale-with-http-info name namespace body optional-params))))

(defn replace-apps-v1beta2-namespaced-stateful-set-status-with-http-info
  "
  replace status of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run ]}]
   (check-required-params name namespace body)
   (call-api "/apis/apps/v1beta2/namespaces/{namespace}/statefulsets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-apps-v1beta2-namespaced-stateful-set-status
  "
  replace status of the specified StatefulSet"
  ([name namespace body ] (replace-apps-v1beta2-namespaced-stateful-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-apps-v1beta2-namespaced-stateful-set-status-with-http-info name namespace body optional-params))))

(defn watch-apps-v1beta1-controller-revision-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-controller-revision-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/watch/controllerrevisions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-controller-revision-list-for-all-namespaces
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-controller-revision-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta1-controller-revision-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta1-deployment-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-deployment-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/watch/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-deployment-list-for-all-namespaces
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-deployment-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta1-deployment-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta1-namespaced-controller-revision-with-http-info
  "
  watch changes to an object of kind ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/controllerrevisions/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-controller-revision
  "
  watch changes to an object of kind ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta1-namespaced-controller-revision-list-with-http-info
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-controller-revision-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/controllerrevisions" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-controller-revision-list
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-controller-revision-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-controller-revision-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta1-namespaced-deployment-with-http-info
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-deployment
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-deployment-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta1-namespaced-deployment-list-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-deployment-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-deployment-list
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-deployment-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-deployment-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta1-namespaced-stateful-set-with-http-info
  "
  watch changes to an object of kind StatefulSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/statefulsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-stateful-set
  "
  watch changes to an object of kind StatefulSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta1-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta1-namespaced-stateful-set-list-with-http-info
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-stateful-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta1/watch/namespaces/{namespace}/statefulsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-namespaced-stateful-set-list
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta1-namespaced-stateful-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta1-namespaced-stateful-set-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta1-stateful-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-stateful-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta1/watch/statefulsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta1-stateful-set-list-for-all-namespaces
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta1-stateful-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta1-stateful-set-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta2-controller-revision-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-controller-revision-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/watch/controllerrevisions" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-controller-revision-list-for-all-namespaces
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-controller-revision-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta2-controller-revision-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta2-daemon-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-daemon-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/watch/daemonsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-daemon-set-list-for-all-namespaces
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-daemon-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta2-daemon-set-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta2-deployment-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-deployment-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/watch/deployments" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-deployment-list-for-all-namespaces
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-deployment-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta2-deployment-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta2-namespaced-controller-revision-with-http-info
  "
  watch changes to an object of kind ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/controllerrevisions/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-controller-revision
  "
  watch changes to an object of kind ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-controller-revision name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-controller-revision-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-controller-revision-list-with-http-info
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-controller-revision-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/controllerrevisions" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-controller-revision-list
  "
  watch individual changes to a list of ControllerRevision. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-controller-revision-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-controller-revision-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-daemon-set-with-http-info
  "
  watch changes to an object of kind DaemonSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/daemonsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-daemon-set
  "
  watch changes to an object of kind DaemonSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-daemon-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-daemon-set-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-daemon-set-list-with-http-info
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-daemon-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/daemonsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-daemon-set-list
  "
  watch individual changes to a list of DaemonSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-daemon-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-daemon-set-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-deployment-with-http-info
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-deployment-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/deployments/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-deployment
  "
  watch changes to an object of kind Deployment. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-deployment name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-deployment-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-deployment-list-with-http-info
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-deployment-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/deployments" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-deployment-list
  "
  watch individual changes to a list of Deployment. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-deployment-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-deployment-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-replica-set-with-http-info
  "
  watch changes to an object of kind ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-replica-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/replicasets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-replica-set
  "
  watch changes to an object of kind ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-replica-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-replica-set-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-replica-set-list-with-http-info
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-replica-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/replicasets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-replica-set-list
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-replica-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-replica-set-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-stateful-set-with-http-info
  "
  watch changes to an object of kind StatefulSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/statefulsets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-stateful-set
  "
  watch changes to an object of kind StatefulSet. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-apps-v1beta2-namespaced-stateful-set name namespace nil))
  ([name namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-stateful-set-with-http-info name namespace optional-params))))

(defn watch-apps-v1beta2-namespaced-stateful-set-list-with-http-info
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-stateful-set-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/apps/v1beta2/watch/namespaces/{namespace}/statefulsets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-namespaced-stateful-set-list
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-apps-v1beta2-namespaced-stateful-set-list namespace nil))
  ([namespace optional-params]
   (:data (watch-apps-v1beta2-namespaced-stateful-set-list-with-http-info namespace optional-params))))

(defn watch-apps-v1beta2-replica-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-replica-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/watch/replicasets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-replica-set-list-for-all-namespaces
  "
  watch individual changes to a list of ReplicaSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-replica-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta2-replica-set-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-apps-v1beta2-stateful-set-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-stateful-set-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/apps/v1beta2/watch/statefulsets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-apps-v1beta2-stateful-set-list-for-all-namespaces
  "
  watch individual changes to a list of StatefulSet. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-apps-v1beta2-stateful-set-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-apps-v1beta2-stateful-set-list-for-all-namespaces-with-http-info optional-params))))

