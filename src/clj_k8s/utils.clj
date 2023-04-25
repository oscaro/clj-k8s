(ns clj-k8s.utils)

;;; =====================================
;;;  Utils
;;; ====================================

(defn find-named [x xs]
  (some #(when (= (:name %) x) %) xs))
