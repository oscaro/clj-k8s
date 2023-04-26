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
