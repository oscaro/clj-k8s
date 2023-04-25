(ns kubernetes.api.openid
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-service-account-issuer-open-id-keyset-with-http-info
  "
  get service account issuer OpenID JSON Web Key Set (contains public token verification keys)"
  []
  (call-api "/openid/v1/jwks/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/jwk-set+json"]
             :auth-names    ["BearerToken"]}))

(defn get-service-account-issuer-open-id-keyset
  "
  get service account issuer OpenID JSON Web Key Set (contains public token verification keys)"
  []
  (:data (get-service-account-issuer-open-id-keyset-with-http-info)))

