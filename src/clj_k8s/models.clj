(ns clj-k8s.models
  (:require [schema.core :as s]))

;;; ==========================================
;;;                 Models
;;; ==========================================

(s/defschema KubeClientSpec
  {:token s/Str
   :base-url s/Str
   (s/optional-key :namespace) s/Str})
