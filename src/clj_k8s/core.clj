(ns clj-k8s.core
  (:require [clojure.string :as str]
            [kubernetes.core :as k]
            [kubernetes.api.core-v- :as core]))

;;; ==========================================
;;;                  Batch
;;; ==========================================

(defmacro not-found->nil
  [& body]
  `(try
     ~@body
     (catch Throwable t#
       (if (= 404 (-> t# ex-data :status))
         nil
         (throw t#)))))

(defn ->label-selector
  [labels]
  (if (string? labels)
    labels
    (->> labels
         (map (fn [[k v]] (format "%s=%s" (name k) v)))
         (str/join ","))))

(defn default-ns
  []
  (:namespace k/*api-context*))

(defmacro with-api-context
  "A helper macro to wrap *api-context* with default values."
  [api-context & body]
  `(let [api-context# ~api-context
         api-context# (-> k/*api-context*
                          (merge api-context#)
                          (assoc :auths (merge (:auths k/*api-context*) (:auths api-context#))))]
     (binding [k/*api-context* api-context#]
       ~@body)))

;; Namespaces

(defn get-namespace
  "Fetches the specified namespace or returns nil if not found"
  ([n] (get-namespace n {}))
  ([n opts]
   (not-found->nil
     (core/read-core-v1-namespace n opts))))

(defn create-namespace
  "Creates a namespace"
  ([spec] (create-namespace spec {}))
  ([spec opts]
   (let [spec (if (string? spec) {:metadata {:name spec}} spec)]
     (core/create-core-v1-namespace spec opts))))

(defn delete-namespace
  "Deletes a namespace"
  ([n] (delete-namespace n {}))
  ([n opts]
   (not-found->nil
     (core/delete-core-v1-namespace n opts))))

;; Pods

(defn list-pods
  "List or watch pods"
  ([] (list-pods {}))
  ([{:keys [namespace all-namespaces] :or {namespace (default-ns)} :as opts}]
   (let [opts (update opts :label-selector ->label-selector)]
     (:items
       (if all-namespaces
         (core/list-core-v1-pod-for-all-namespaces opts)
         (core/list-core-v1-namespaced-pod namespace opts))))))

(defn pod-logs
  "Reads the logs of a specific pod"
  ([n] (pod-logs n {}))
  ([n {:keys [namespace] :or {namespace (default-ns)} :as opts}]
   (core/read-core-v1-namespaced-pod-log n namespace opts)))

;; Services

(defn get-endpoints
  "Fetches the specified endpoints or returns nil if not found"
  ([n] (get-endpoints n {}))
  ([n {:keys [namespace] :or {namespace (default-ns)} :as opts}]
   (not-found->nil
     (core/read-core-v1-namespaced-endpoints n namespace opts))))
