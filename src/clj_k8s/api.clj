(ns clj-k8s.api
  (:require [yaml.core :as yaml]
            [schema.core :as s]
            [clj-k8s.gke :as gke]
            [clj-k8s.utils :refer [find-named]]))

;;; =====================================
;;;  Public API
;;; ====================================

;;; Constants

(defonce default-ns "default")


;;; For application running in Kubernetes context only
(defonce default-k8s-svc-host (System/getenv "KUBERNETES_SERVICE_HOST"))
(defonce default-k8s-svc-port (System/getenv "KUBERNETES_SERVICE_PORT"))


;;; See: https://cloud.google.com/docs/authentication/application-default-credentials?hl=fr
(defonce default-cluster-service-account-dir
  (or (System/getenv "GOOGLE_APPLICATION_CREDENTIALS")
      "/var/run/secrets/kubernetes.io/serviceaccount"))

;;; Kubernetes Token
(defonce token-from-env (str (System/getenv "K8S_TOKEN")))

;;; Honor `KUBECONFIG` before generating fallback one from
;;; the user `HOME`
(defonce default-kube-config-path
  (or (System/getenv "KUBECONFIG")
      (str (System/getenv "HOME") "/.kube/config")))

;;; Authentification

(defn mk-client
  ""
  {:added "1.25.8.2"}
  ([] (mk-client default-kube-config-path token-from-env))
  ([kube-config] (mk-client kube-config token-from-env))
  ([kube-config token]
   (let [{:keys [clusters contexts current-context] :as conf}
         (yaml/from-file kube-config)
         context (find-named current-context contexts)
         cluster (find-named (get-in context [:context :cluster]) clusters)
         ;; TODO: Detect if current context is from GKE or not
         token (if false
                 (or token token-from-env)
                 (gke/get-google-access-token))]
     {:base-url  (get-in cluster [:cluster :server])
      :auths     {"BearerToken" (str "Bearer " token)}
      :namespace (get-in context [:context :namespace] default-ns)})))
