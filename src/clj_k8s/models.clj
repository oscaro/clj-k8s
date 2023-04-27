(ns clj-k8s.models
  (:require [schema.core :as s]))

;;; ==========================================
;;;                 Models
;;; ==========================================

(s/defschema KubeClientSpec
  {:token s/Str
   :base-url s/Str
   (s/optional-key :namespace) s/Str})

(s/defschema KubeClient
  {:base-url s/Str
   :auths {s/Str s/Str}
   :namespace s/Str})
