(ns clj-k8s.utils
  (:require [clojure.string :as str]))

;;; =====================================
;;;  Utils
;;; ====================================

(defn find-named [x xs]
  (some #(when (= (:name %) x) %) xs))


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

;;; Kubernetes Related Predicates

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
