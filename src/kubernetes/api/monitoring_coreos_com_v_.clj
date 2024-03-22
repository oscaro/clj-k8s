(ns kubernetes.api.monitoring-coreos-com-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  create an Alertmanager"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  create an Alertmanager"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-alertmanager namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  create a PodMonitor"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  create a PodMonitor"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-pod-monitor namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  create a Probe"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-probe-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-probe
  "
  create a Probe"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-probe namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-probe-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  create Prometheus"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-prometheus
  "
  create Prometheus"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-prometheus namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  create a PrometheusRule"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  create a PrometheusRule"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-prometheus-rule namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  create a ServiceMonitor"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  create a ServiceMonitor"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-service-monitor namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info namespace body optional-params))))

(defn create-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  create a ThanosRuler"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn create-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  create a ThanosRuler"
  ([namespace body ] (create-monitoring-coreos-com-v1-namespaced-thanos-ruler namespace body nil))
  ([namespace body optional-params]
   (:data (create-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info namespace body optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-alertmanager-with-http-info
  "
  delete collection of Alertmanager"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-alertmanager-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-alertmanager
  "
  delete collection of Alertmanager"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-alertmanager namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-alertmanager-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-pod-monitor-with-http-info
  "
  delete collection of PodMonitor"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-pod-monitor-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-pod-monitor
  "
  delete collection of PodMonitor"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-pod-monitor namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-pod-monitor-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-probe-with-http-info
  "
  delete collection of Probe"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-probe-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-probe
  "
  delete collection of Probe"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-probe namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-probe-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-with-http-info
  "
  delete collection of Prometheus"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-prometheus
  "
  delete collection of Prometheus"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-rule-with-http-info
  "
  delete collection of PrometheusRule"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-rule-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-rule
  "
  delete collection of PrometheusRule"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-rule namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-prometheus-rule-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-service-monitor-with-http-info
  "
  delete collection of ServiceMonitor"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-service-monitor-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-service-monitor
  "
  delete collection of ServiceMonitor"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-service-monitor namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-service-monitor-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-thanos-ruler-with-http-info
  "
  delete collection of ThanosRuler"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-thanos-ruler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-collection-namespaced-thanos-ruler
  "
  delete collection of ThanosRuler"
  ([namespace ] (delete-monitoring-coreos-com-v1-collection-namespaced-thanos-ruler namespace nil))
  ([namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-collection-namespaced-thanos-ruler-with-http-info namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  delete an Alertmanager"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  delete an Alertmanager"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-alertmanager name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  delete a PodMonitor"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  delete a PodMonitor"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-pod-monitor name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  delete a Probe"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-probe
  "
  delete a Probe"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-probe name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  delete Prometheus"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-prometheus
  "
  delete Prometheus"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-prometheus name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  delete a PrometheusRule"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  delete a PrometheusRule"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-prometheus-rule name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  delete a ServiceMonitor"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  delete a ServiceMonitor"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-service-monitor name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace optional-params))))

(defn delete-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  delete a ThanosRuler"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn delete-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  delete a ThanosRuler"
  ([name namespace ] (delete-monitoring-coreos-com-v1-namespaced-thanos-ruler name namespace nil))
  ([name namespace optional-params]
   (:data (delete-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace optional-params))))

(defn list-monitoring-coreos-com-v1-alertmanager-for-all-namespaces-with-http-info
  "
  list objects of kind Alertmanager"
  ([] (list-monitoring-coreos-com-v1-alertmanager-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/alertmanagers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-alertmanager-for-all-namespaces
  "
  list objects of kind Alertmanager"
  ([] (list-monitoring-coreos-com-v1-alertmanager-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-alertmanager-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  list objects of kind Alertmanager"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  list objects of kind Alertmanager"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-alertmanager namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  list objects of kind PodMonitor"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  list objects of kind PodMonitor"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-pod-monitor namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  list objects of kind Probe"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-probe-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-probe
  "
  list objects of kind Probe"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-probe namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-probe-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  list objects of kind Prometheus"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-prometheus
  "
  list objects of kind Prometheus"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-prometheus namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  list objects of kind PrometheusRule"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  list objects of kind PrometheusRule"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-prometheus-rule namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  list objects of kind ServiceMonitor"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  list objects of kind ServiceMonitor"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-service-monitor namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  list objects of kind ThanosRuler"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  list objects of kind ThanosRuler"
  ([namespace ] (list-monitoring-coreos-com-v1-namespaced-thanos-ruler namespace nil))
  ([namespace optional-params]
   (:data (list-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info namespace optional-params))))

(defn list-monitoring-coreos-com-v1-pod-monitor-for-all-namespaces-with-http-info
  "
  list objects of kind PodMonitor"
  ([] (list-monitoring-coreos-com-v1-pod-monitor-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/podmonitors" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-pod-monitor-for-all-namespaces
  "
  list objects of kind PodMonitor"
  ([] (list-monitoring-coreos-com-v1-pod-monitor-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-pod-monitor-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-probe-for-all-namespaces-with-http-info
  "
  list objects of kind Probe"
  ([] (list-monitoring-coreos-com-v1-probe-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/probes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-probe-for-all-namespaces
  "
  list objects of kind Probe"
  ([] (list-monitoring-coreos-com-v1-probe-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-probe-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-prometheus-for-all-namespaces-with-http-info
  "
  list objects of kind Prometheus"
  ([] (list-monitoring-coreos-com-v1-prometheus-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/prometheuses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-prometheus-for-all-namespaces
  "
  list objects of kind Prometheus"
  ([] (list-monitoring-coreos-com-v1-prometheus-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-prometheus-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-prometheus-rule-for-all-namespaces-with-http-info
  "
  list objects of kind PrometheusRule"
  ([] (list-monitoring-coreos-com-v1-prometheus-rule-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/prometheusrules" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-prometheus-rule-for-all-namespaces
  "
  list objects of kind PrometheusRule"
  ([] (list-monitoring-coreos-com-v1-prometheus-rule-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-prometheus-rule-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-service-monitor-for-all-namespaces-with-http-info
  "
  list objects of kind ServiceMonitor"
  ([] (list-monitoring-coreos-com-v1-service-monitor-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/servicemonitors" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-service-monitor-for-all-namespaces
  "
  list objects of kind ServiceMonitor"
  ([] (list-monitoring-coreos-com-v1-service-monitor-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-service-monitor-for-all-namespaces-with-http-info optional-params))))

(defn list-monitoring-coreos-com-v1-thanos-ruler-for-all-namespaces-with-http-info
  "
  list objects of kind ThanosRuler"
  ([] (list-monitoring-coreos-com-v1-thanos-ruler-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/apis/monitoring.coreos.com/v1/thanosrulers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn list-monitoring-coreos-com-v1-thanos-ruler-for-all-namespaces
  "
  list objects of kind ThanosRuler"
  ([] (list-monitoring-coreos-com-v1-thanos-ruler-for-all-namespaces nil))
  ([optional-params]
   (:data (list-monitoring-coreos-com-v1-thanos-ruler-for-all-namespaces-with-http-info optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  partially update the specified Alertmanager"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  partially update the specified Alertmanager"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-alertmanager name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info
  "
  partially update status of the specified Alertmanager"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-alertmanager-status
  "
  partially update status of the specified Alertmanager"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-alertmanager-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  partially update the specified PodMonitor"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  partially update the specified PodMonitor"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-pod-monitor name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  partially update the specified Probe"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-probe
  "
  partially update the specified Probe"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-probe name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  partially update the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus
  "
  partially update the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  partially update the specified PrometheusRule"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  partially update the specified PrometheusRule"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-rule name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info
  "
  partially update scale of the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-scale
  "
  partially update scale of the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info
  "
  partially update status of the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-prometheus-status
  "
  partially update status of the specified Prometheus"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-prometheus-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  partially update the specified ServiceMonitor"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  partially update the specified ServiceMonitor"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-service-monitor name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  partially update the specified ThanosRuler"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  partially update the specified ThanosRuler"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace body optional-params))))

(defn patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info
  "
  partially update status of the specified ThanosRuler"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-status
  "
  partially update status of the specified ThanosRuler"
  ([name namespace body ] (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace body optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  read the specified Alertmanager"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  read the specified Alertmanager"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-alertmanager name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info
  "
  read status of the specified Alertmanager"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-alertmanager-status
  "
  read status of the specified Alertmanager"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-alertmanager-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  read the specified PodMonitor"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  read the specified PodMonitor"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-pod-monitor name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  read the specified Probe"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-probe
  "
  read the specified Probe"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-probe name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  read the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus
  "
  read the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  read the specified PrometheusRule"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  read the specified PrometheusRule"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-rule name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info
  "
  read scale of the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-scale
  "
  read scale of the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info
  "
  read status of the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-prometheus-status
  "
  read status of the specified Prometheus"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-prometheus-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  read the specified ServiceMonitor"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  read the specified ServiceMonitor"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-service-monitor name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  read the specified ThanosRuler"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  read the specified ThanosRuler"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-thanos-ruler name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace optional-params))))

(defn read-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info
  "
  read status of the specified ThanosRuler"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty resource-version ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "resourceVersion" resource-version }
              :form-params   {}
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn read-monitoring-coreos-com-v1-namespaced-thanos-ruler-status
  "
  read status of the specified ThanosRuler"
  ([name namespace ] (read-monitoring-coreos-com-v1-namespaced-thanos-ruler-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info
  "
  replace the specified Alertmanager"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-alertmanager
  "
  replace the specified Alertmanager"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-alertmanager name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-alertmanager-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info
  "
  replace status of the specified Alertmanager"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/alertmanagers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-alertmanager-status
  "
  replace status of the specified Alertmanager"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-alertmanager-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-alertmanager-status-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info
  "
  replace the specified PodMonitor"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/podmonitors/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-pod-monitor
  "
  replace the specified PodMonitor"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-pod-monitor name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-pod-monitor-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-probe-with-http-info
  "
  replace the specified Probe"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/probes/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-probe
  "
  replace the specified Probe"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-probe name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-probe-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info
  "
  replace the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus
  "
  replace the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-prometheus-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info
  "
  replace the specified PrometheusRule"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheusrules/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-rule
  "
  replace the specified PrometheusRule"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-rule name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-prometheus-rule-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info
  "
  replace scale of the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-scale
  "
  replace scale of the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-prometheus-scale-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info
  "
  replace status of the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheuses/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-prometheus-status
  "
  replace status of the specified Prometheus"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-prometheus-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-prometheus-status-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info
  "
  replace the specified ServiceMonitor"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/servicemonitors/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-service-monitor
  "
  replace the specified ServiceMonitor"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-service-monitor name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-service-monitor-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info
  "
  replace the specified ThanosRuler"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-thanos-ruler
  "
  replace the specified ThanosRuler"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-with-http-info name namespace body optional-params))))

(defn replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info
  "
  replace status of the specified ThanosRuler"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/apis/monitoring.coreos.com/v1/namespaces/{namespace}/thanosrulers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["application/json" "application/yaml"]
              :accepts       ["application/json" "application/yaml"]
              :auth-names    ["BearerToken"]})))

(defn replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-status
  "
  replace status of the specified ThanosRuler"
  ([name namespace body ] (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-monitoring-coreos-com-v1-namespaced-thanos-ruler-status-with-http-info name namespace body optional-params))))

