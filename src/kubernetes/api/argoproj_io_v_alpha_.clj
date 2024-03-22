(ns kubernetes.api.argoproj-io-v-alpha-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  create a ClusterWorkflowTemplate"
  ([body ] (create-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-cluster-workflow-template
  "
  create a ClusterWorkflowTemplate"
  ([body ] (create-argoproj-io-v1alpha1-cluster-workflow-template body nil))
  ([body optional-params]
   (:data (create-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  create a CronWorkflow"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  create a CronWorkflow"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-cron-workflow namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  create a Workflow"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow
  "
  create a Workflow"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  create a WorkflowArtifactGCTask"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  create a WorkflowArtifactGCTask"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  create a WorkflowEventBinding"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  create a WorkflowEventBinding"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-event-binding namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  create a WorkflowTaskResult"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  create a WorkflowTaskResult"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-task-result namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  create a WorkflowTaskSet"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  create a WorkflowTaskSet"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-task-set namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info namespace body optional-params))))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  create a WorkflowTemplate"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  create a WorkflowTemplate"
  ([namespace body ] (create-argoproj-io-v1alpha1-namespaced-workflow-template namespace body nil))
  ([namespace body optional-params]
   (:data (create-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info namespace body optional-params))))

(defn delete-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  delete a ClusterWorkflowTemplate"
  ([name ] (delete-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-cluster-workflow-template
  "
  delete a ClusterWorkflowTemplate"
  ([name ] (delete-argoproj-io-v1alpha1-cluster-workflow-template name nil))
  ([name optional-params]
   (:data (delete-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-cluster-workflow-template-with-http-info
  "
  delete collection of ClusterWorkflowTemplate"
  ([] (delete-argoproj-io-v1alpha1-collection-cluster-workflow-template-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-cluster-workflow-template
  "
  delete collection of ClusterWorkflowTemplate"
  ([] (delete-argoproj-io-v1alpha1-collection-cluster-workflow-template nil))
  ([optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-cluster-workflow-template-with-http-info optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-cron-workflow-with-http-info
  "
  delete collection of CronWorkflow"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-cron-workflow-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-cron-workflow
  "
  delete collection of CronWorkflow"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-cron-workflow namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-cron-workflow-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-with-http-info
  "
  delete collection of Workflow"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow
  "
  delete collection of Workflow"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-artifact-gc-task-with-http-info
  "
  delete collection of WorkflowArtifactGCTask"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-artifact-gc-task-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-artifact-gc-task
  "
  delete collection of WorkflowArtifactGCTask"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-artifact-gc-task namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-artifact-gc-task-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-event-binding-with-http-info
  "
  delete collection of WorkflowEventBinding"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-event-binding-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-event-binding
  "
  delete collection of WorkflowEventBinding"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-event-binding namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-event-binding-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-result-with-http-info
  "
  delete collection of WorkflowTaskResult"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-result-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-result
  "
  delete collection of WorkflowTaskResult"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-result namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-result-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-set-with-http-info
  "
  delete collection of WorkflowTaskSet"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-set-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-set
  "
  delete collection of WorkflowTaskSet"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-set namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-task-set-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-template-with-http-info
  "
  delete collection of WorkflowTemplate"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-template-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-collection-namespaced-workflow-template
  "
  delete collection of WorkflowTemplate"
  ([namespace ] (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-template namespace nil))
  ([namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-collection-namespaced-workflow-template-with-http-info namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  delete a CronWorkflow"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  delete a CronWorkflow"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-cron-workflow name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  delete a Workflow"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow
  "
  delete a Workflow"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  delete a WorkflowArtifactGCTask"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  delete a WorkflowArtifactGCTask"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  delete a WorkflowEventBinding"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  delete a WorkflowEventBinding"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-event-binding name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  delete a WorkflowTaskResult"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  delete a WorkflowTaskResult"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-task-result name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  delete a WorkflowTaskSet"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  delete a WorkflowTaskSet"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-task-set name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace optional-params))))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  delete a WorkflowTemplate"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  delete a WorkflowTemplate"
  ([name namespace ] (delete-argoproj-io-v1alpha1-namespaced-workflow-template name namespace nil))
  ([name namespace optional-params]
   (:data (delete-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace optional-params))))

(defn list-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  list objects of kind ClusterWorkflowTemplate"
  ([] (list-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-cluster-workflow-template
  "
  list objects of kind ClusterWorkflowTemplate"
  ([] (list-argoproj-io-v1alpha1-cluster-workflow-template nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-cron-workflow-for-all-namespaces-with-http-info
  "
  list objects of kind CronWorkflow"
  ([] (list-argoproj-io-v1alpha1-cron-workflow-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/cronworkflows" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-cron-workflow-for-all-namespaces
  "
  list objects of kind CronWorkflow"
  ([] (list-argoproj-io-v1alpha1-cron-workflow-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-cron-workflow-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  list objects of kind CronWorkflow"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  list objects of kind CronWorkflow"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-cron-workflow namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  list objects of kind Workflow"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow
  "
  list objects of kind Workflow"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  list objects of kind WorkflowArtifactGCTask"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  list objects of kind WorkflowArtifactGCTask"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  list objects of kind WorkflowEventBinding"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  list objects of kind WorkflowEventBinding"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-event-binding namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  list objects of kind WorkflowTaskResult"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  list objects of kind WorkflowTaskResult"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-task-result namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  list objects of kind WorkflowTaskSet"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  list objects of kind WorkflowTaskSet"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-task-set namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  list objects of kind WorkflowTemplate"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  list objects of kind WorkflowTemplate"
  ([namespace ] (list-argoproj-io-v1alpha1-namespaced-workflow-template namespace nil))
  ([namespace optional-params]
   (:data (list-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info namespace optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-artifact-gc-task-for-all-namespaces-with-http-info
  "
  list objects of kind WorkflowArtifactGCTask"
  ([] (list-argoproj-io-v1alpha1-workflow-artifact-gc-task-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workflowartifactgctasks" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-artifact-gc-task-for-all-namespaces
  "
  list objects of kind WorkflowArtifactGCTask"
  ([] (list-argoproj-io-v1alpha1-workflow-artifact-gc-task-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-artifact-gc-task-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-event-binding-for-all-namespaces-with-http-info
  "
  list objects of kind WorkflowEventBinding"
  ([] (list-argoproj-io-v1alpha1-workflow-event-binding-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workfloweventbindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-event-binding-for-all-namespaces
  "
  list objects of kind WorkflowEventBinding"
  ([] (list-argoproj-io-v1alpha1-workflow-event-binding-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-event-binding-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-for-all-namespaces-with-http-info
  "
  list objects of kind Workflow"
  ([] (list-argoproj-io-v1alpha1-workflow-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workflows" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-for-all-namespaces
  "
  list objects of kind Workflow"
  ([] (list-argoproj-io-v1alpha1-workflow-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-task-result-for-all-namespaces-with-http-info
  "
  list objects of kind WorkflowTaskResult"
  ([] (list-argoproj-io-v1alpha1-workflow-task-result-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workflowtaskresults" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-task-result-for-all-namespaces
  "
  list objects of kind WorkflowTaskResult"
  ([] (list-argoproj-io-v1alpha1-workflow-task-result-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-task-result-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-task-set-for-all-namespaces-with-http-info
  "
  list objects of kind WorkflowTaskSet"
  ([] (list-argoproj-io-v1alpha1-workflow-task-set-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workflowtasksets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-task-set-for-all-namespaces
  "
  list objects of kind WorkflowTaskSet"
  ([] (list-argoproj-io-v1alpha1-workflow-task-set-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-task-set-for-all-namespaces-with-http-info optional-params))))

(defn list-argoproj-io-v1alpha1-workflow-template-for-all-namespaces-with-http-info
  "
  list objects of kind WorkflowTemplate"
  ([] (list-argoproj-io-v1alpha1-workflow-template-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/argoproj.io/v1alpha1/workflowtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-argoproj-io-v1alpha1-workflow-template-for-all-namespaces
  "
  list objects of kind WorkflowTemplate"
  ([] (list-argoproj-io-v1alpha1-workflow-template-for-all-namespaces nil))
  ([optional-params]
   (:data (list-argoproj-io-v1alpha1-workflow-template-for-all-namespaces-with-http-info optional-params))))

(defn patch-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  partially update the specified ClusterWorkflowTemplate"
  ([name body ] (patch-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-cluster-workflow-template
  "
  partially update the specified ClusterWorkflowTemplate"
  ([name body ] (patch-argoproj-io-v1alpha1-cluster-workflow-template name body nil))
  ([name body optional-params]
   (:data (patch-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  partially update the specified CronWorkflow"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  partially update the specified CronWorkflow"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-cron-workflow name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  partially update the specified Workflow"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow
  "
  partially update the specified Workflow"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  partially update the specified WorkflowArtifactGCTask"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  partially update the specified WorkflowArtifactGCTask"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info
  "
  partially update status of the specified WorkflowArtifactGCTask"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status
  "
  partially update status of the specified WorkflowArtifactGCTask"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  partially update the specified WorkflowEventBinding"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  partially update the specified WorkflowEventBinding"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-event-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  partially update the specified WorkflowTaskResult"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  partially update the specified WorkflowTaskResult"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-result name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  partially update the specified WorkflowTaskSet"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  partially update the specified WorkflowTaskSet"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info
  "
  partially update status of the specified WorkflowTaskSet"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-status
  "
  partially update status of the specified WorkflowTaskSet"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace body optional-params))))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  partially update the specified WorkflowTemplate"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  partially update the specified WorkflowTemplate"
  ([name namespace body ] (patch-argoproj-io-v1alpha1-namespaced-workflow-template name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace body optional-params))))

(defn read-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  read the specified ClusterWorkflowTemplate"
  ([name ] (read-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name nil))
  ([name {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-cluster-workflow-template
  "
  read the specified ClusterWorkflowTemplate"
  ([name ] (read-argoproj-io-v1alpha1-cluster-workflow-template name nil))
  ([name optional-params]
   (:data (read-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  read the specified CronWorkflow"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  read the specified CronWorkflow"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-cron-workflow name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  read the specified Workflow"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow
  "
  read the specified Workflow"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  read the specified WorkflowArtifactGCTask"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  read the specified WorkflowArtifactGCTask"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info
  "
  read status of the specified WorkflowArtifactGCTask"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status
  "
  read status of the specified WorkflowArtifactGCTask"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  read the specified WorkflowEventBinding"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  read the specified WorkflowEventBinding"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-event-binding name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  read the specified WorkflowTaskResult"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  read the specified WorkflowTaskResult"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-result name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  read the specified WorkflowTaskSet"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  read the specified WorkflowTaskSet"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-set name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info
  "
  read status of the specified WorkflowTaskSet"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-task-set-status
  "
  read status of the specified WorkflowTaskSet"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-task-set-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace optional-params))))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  read the specified WorkflowTemplate"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  read the specified WorkflowTemplate"
  ([name namespace ] (read-argoproj-io-v1alpha1-namespaced-workflow-template name namespace nil))
  ([name namespace optional-params]
   (:data (read-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace optional-params))))

(defn replace-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info
  "
  replace the specified ClusterWorkflowTemplate"
  ([name body ] (replace-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/clusterworkflowtemplates/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-cluster-workflow-template
  "
  replace the specified ClusterWorkflowTemplate"
  ([name body ] (replace-argoproj-io-v1alpha1-cluster-workflow-template name body nil))
  ([name body optional-params]
   (:data (replace-argoproj-io-v1alpha1-cluster-workflow-template-with-http-info name body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info
  "
  replace the specified CronWorkflow"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/cronworkflows/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-cron-workflow
  "
  replace the specified CronWorkflow"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-cron-workflow name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-cron-workflow-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-with-http-info
  "
  replace the specified Workflow"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflows/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow
  "
  replace the specified Workflow"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info
  "
  replace the specified WorkflowArtifactGCTask"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task
  "
  replace the specified WorkflowArtifactGCTask"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info
  "
  replace status of the specified WorkflowArtifactGCTask"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowartifactgctasks/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status
  "
  replace status of the specified WorkflowArtifactGCTask"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-artifact-gc-task-status-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info
  "
  replace the specified WorkflowEventBinding"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workfloweventbindings/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-event-binding
  "
  replace the specified WorkflowEventBinding"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-event-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-event-binding-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info
  "
  replace the specified WorkflowTaskResult"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtaskresults/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-result
  "
  replace the specified WorkflowTaskResult"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-result name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-task-result-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info
  "
  replace the specified WorkflowTaskSet"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-set
  "
  replace the specified WorkflowTaskSet"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info
  "
  replace status of the specified WorkflowTaskSet"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtasksets/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-status
  "
  replace status of the specified WorkflowTaskSet"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-task-set-status-with-http-info name namespace body optional-params))))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info
  "
  replace the specified WorkflowTemplate"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/argoproj.io/v1alpha1/namespaces/{namespace}/workflowtemplates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-argoproj-io-v1alpha1-namespaced-workflow-template
  "
  replace the specified WorkflowTemplate"
  ([name namespace body ] (replace-argoproj-io-v1alpha1-namespaced-workflow-template name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-argoproj-io-v1alpha1-namespaced-workflow-template-with-http-info name namespace body optional-params))))

