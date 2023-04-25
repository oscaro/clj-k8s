(ns kubernetes.api.well-known
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-service-account-issuer-open-id-configuration-with-http-info
  "
  get service account issuer OpenID configuration, also known as the 'OIDC discovery doc'"
  []
  (call-api "/.well-known/openid-configuration/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["BearerToken"]}))

(defn get-service-account-issuer-open-id-configuration
  "
  get service account issuer OpenID configuration, also known as the 'OIDC discovery doc'"
  []
  (:data (get-service-account-issuer-open-id-configuration-with-http-info)))

