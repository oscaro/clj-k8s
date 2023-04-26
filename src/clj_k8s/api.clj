(ns clj-k8s.api
  (:require [yaml.core :as yaml]
            [schema.core :as s]
            [clj-k8s.gke :as gke]
            [clj-k8s.utils :refer [find-named]]
            [clj-k8s.models :refer :all]
            [clojure.java.io :as io]
            [clojure.string :as str]))

;;; =====================================
;;;  Public API
;;; ====================================

;;; Constants

(defonce ^:private default-ns "default")


;;; For application running in Kubernetes context only
(defonce ^:private default-k8s-svc-host (System/getenv "KUBERNETES_SERVICE_HOST"))
(defonce ^:private default-k8s-svc-port (System/getenv "KUBERNETES_SERVICE_PORT"))


;;; See: https://cloud.google.com/docs/authentication/application-default-credentials?hl=fr
(defonce ^:private default-cluster-service-account-dir
  (or (System/getenv "GOOGLE_APPLICATION_CREDENTIALS")
      "/var/run/secrets/kubernetes.io/serviceaccount"))

;;; Kubernetes Token
(defonce ^:private token-from-env (str (System/getenv "KUBERNETES_TOKEN")))

;;; Honor `KUBECONFIG` before generating fallback one from
;;; the user `HOME`
(defonce ^:private default-kube-config-path
  (or (System/getenv "KUBECONFIG")
      (str (System/getenv "HOME") "/.kube/config")))

(def running-from-kube?
  "Detect if the application is currently running on k8s
   platform, or not"
  (and (.exists (io/file "/var/run/secrets/kubernetes.io/serviceaccount"))
       (every? some? [default-k8s-svc-host default-k8s-svc-port])))

(defn- is-current-gke?
  "Detect if the current context is a GKE cluster.
   Logic is based on `gke_*` naming scheme"
  [current-context]
  (str/starts-with? current-context "gke_"))

;;; Authentification

(defn mk-client
  "Generic client builder

   There is several ways to instantiate the client:

   1. Without any arguments, the function will fetch several env variables
      to build the client. This method is useful for applications that run directly
      in a Kubernetes Pod, or for executions context where env variables are used for
      configurations, required env variables are:

      - `KUBERNETES_SERVICE_HOST` - the Kubernetes Service Endpoint
      - `KUBERNETES_SERVICE_HOST` - the Kubernetes Service Endpoint Port
      - `KUBERNETES_TOKEN`        - the actual Kubernetes token to be used
         See: https://docs.selectel.com/cloud/managed-kubernetes/instructions/service-account-token

   2. The more straightforward, and easy to setup is from a map spec directly, every
      elements are explicitly used for client building (probably this will be fetched
      from your component management system like Integrant.

   3. The last one is from, configuration file directly. The builder will auto-detect
      if the current context is a GKE cluster. If so, you'll need to be sure that the
      `GOOGLE_APPLICATION_CREDENTIALS` variable is set and corretly pointing to your SA
      for fetching token from API.

      WARN: If not running on GKE, you'll need to explicitly setup your token variable to use
      with your current context.

      Note: This methods is used by default if the builder isn't call with arguments
            AND all variables are not satisfied."
  {:added "1.25.8.2"}
  ([]
   (if (and default-k8s-svc-host default-k8s-svc-port (not-empty token-from-env))
     (s/validate KubeClient
                 {:base-url default-k8s-svc-host
                  :auths     {"BearerToken" (str "Bearer " token-from-env)}
                  :namespace default-ns})
     (mk-client default-kube-config-path)))
  ([kube-config]
   (if (map? kube-config)
     (let [{:keys [base-url token namespace]} (s/validate KubeClientSpec kube-config)]
       (s/validate KubeClient {:base-url base-url
                               :auths     {"BearerToken" (str "Bearer " token)}
                               :namespace (or namespace default-ns)}))
     (mk-client kube-config token-from-env)))
  ([kube-config token]
   (let [{:keys [clusters contexts current-context] :as conf}
         (yaml/from-file kube-config)
         context (find-named current-context contexts)
         cluster (find-named (get-in context [:context :cluster]) clusters)
         token (if (is-current-gke? current-context)
                 (gke/get-google-access-token)
                 token)]
     {:base-url  (get-in cluster [:cluster :server])
      :auths     {"BearerToken" (str "Bearer " token)}
      :namespace (get-in context [:context :namespace] default-ns)})))
