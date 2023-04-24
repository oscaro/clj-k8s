(ns clj-k8s.batch
  (:require [clj-k8s.core :as c]
            [kubernetes.core :as k]
            [kubernetes.api
             [batch-v- :as batch]
             [core-v- :as core]]))

;;; ==========================================
;;;                  Batch
;;; ==========================================

(defn get-job
  "Fetches the specified job or returns nil if not found"
  ([n] (get-job n {}))
  ([n {:keys [namespace] :or {namespace (c/default-ns)} :as opts}]
   (c/not-found->nil
    (batch/read-batch-v1-namespaced-job n namespace opts))))


(defn list-jobs
  "List or watch jobs"
  ([] (list-jobs {}))
  ([{:keys [namespace all-namespaces] :or {namespace (c/default-ns)} :as opts}]
   (let [opts (update opts :label-selector c/->label-selector)]
     (:items
      (if all-namespaces
        (batch/list-batch-v1-job-for-all-namespaces opts)
        (batch/list-batch-v1-namespaced-job namespace opts))))))


(defn submit-job
  "Submits a job for execution"
  ([spec] (submit-job spec {}))
  ([spec opts]
   (let [job-ns (get-in spec [:metadata :namespace] (c/default-ns))]
     (batch/create-batch-v1-namespaced-job job-ns spec opts))))


(defn delete-job
  "Deletes a job"
  ([n] (delete-job n {}))
  ([n {:keys [namespace] :or {namespace (c/default-ns)} :as opts}]
   (let [opts (merge {:propagation-policy "Foreground"} opts)]
     (batch/delete-batch-v1-namespaced-job n namespace opts))))


(defn job-pods
  "Fetches all of the pods belonging to a specific job"
  ([n] (job-pods n {}))
  ([n opts]
   (if-let [job (get-job n opts)]
     (->> (get-in job [:spec :selector :matchLabels :controller-uid])
          (str "controller-uid=")
          (assoc opts :label-selector)
          (core/list-core-v1-namespaced-pod (get-in job [:metadata :namespace]))
          :items)
     [])))


(defn- current-condition
  [{:keys [conditions]}]
  (->> conditions
       (filter #(= (:status %) "True"))
       first))


(defn running?
  "Returns true if the job is still running"
  [{:keys [status]}]
  (boolean (and status (nil? (current-condition status)))))


(defn succeeded?
  "Returns true if the job was successful"
  [{:keys [status]}]
  (= (:type (current-condition status)) "Complete"))


(defn failed?
  "Returns true if the job failed"
  [{:keys [status]}]
  (or (nil? status) (= (:type (current-condition status)) "Failed")))
