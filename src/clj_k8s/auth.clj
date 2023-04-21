(ns clj-k8s.auth
  (:require [yaml.core :as yaml])
  (:import (com.google.auth.oauth2 GoogleCredentials)
           (java.util List)))

(def default-k8s-svc-host (System/getenv "KUBERNETES_SERVICE_HOST"))
(def default-k8s-svc-port (System/getenv "KUBERNETES_SERVICE_PORT"))
(def default-cluster-service-account-dir "/var/run/secrets/kubernetes.io/serviceaccount")

(defn from-service-account
  "Creates a context from within a cluster"
  ([]
   (from-service-account
     default-k8s-svc-host
     default-k8s-svc-port
     default-cluster-service-account-dir))
  ([svc-host svc-port sa-path]
   (letfn [(read-utf8 [n] (slurp (str sa-path "/" n) :encoding "UTF-8"))]
     {:base-url  (format "https://%s:%s" svc-host svc-port)
      :auths     {"BearerToken" (str "Bearer " (read-utf8 "token"))}
      :namespace (read-utf8 "namespace")})))

(def gke-scopes
  "see https://developers.google.com/identity/protocols/googlescopes#containerv1"
  ["https://www.googleapis.com/auth/cloud-platform"])
(def ^GoogleCredentials creds
  (delay
    (let [app-creds (GoogleCredentials/getApplicationDefault)]
      (if (.createScopedRequired app-creds)
        (.createScoped app-creds ^List gke-scopes)
        app-creds))))

(defn- ^GoogleCredentials refresh-token
  "Refresh the token by discarding the cached token and metadata and requesting the new ones if expired"
  [^GoogleCredentials creds]
  (.refreshIfExpired creds)
  creds)

(defn get-google-access-token
  "Fetches the google access token"
  []
  (-> @creds
      refresh-token
      .getAccessToken
      .getTokenValue))

(def default-kube-config-path
  "Honor env variable before retrieving the home one"
  (if-let [honored-path (System/getenv "KUBECONFIG")] honored-path
          (str (System/getenv "HOME") "/.kube/config")))

(defn- find-named [x xs] (some #(when (= (:name %) x) %) xs))
(defn from-gcp-kube-config
  "Creates a context from the kubectl config file"
  ([] (from-gcp-kube-config default-kube-config-path))
  ([cfg-path]
   (let [{:keys [clusters contexts current-context]} (yaml/from-file cfg-path)
         context      (find-named current-context contexts)
         cluster      (find-named (get-in context [:context :cluster]) clusters)
         access-token (get-google-access-token)]
     {:base-url  (get-in cluster [:cluster :server])
      :auths     {"BearerToken" (str "Bearer " access-token)}
      :namespace (get-in context [:context :namespace] "default")})))

(def token-from-env
  "Token from environnement"
  (str (System/getenv "K8S_TOKEN")))

(defn from-token
  "Creates a context from the kubectl config file"
  ([] (from-token default-kube-config-path token-from-env))
  ([cfg-path] (from-token cfg-path token-from-env))
  ([cfg-path token]
   (let [{:keys [clusters contexts current-context]} (yaml/from-file cfg-path)
         context      (find-named current-context contexts)
         cluster      (find-named (get-in context [:context :cluster]) clusters)]
     {:base-url  (get-in cluster [:cluster :server])
      :auths     {"BearerToken" (str "Bearer " token)}
      :namespace (get-in context [:context :namespace] "default")})))
