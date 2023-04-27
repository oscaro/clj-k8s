(ns clj-k8s.gke
  (:import (com.google.auth.oauth2 GoogleCredentials)
           (java.util List)))

;;; =====================================
;;;  Google Kubernetes Engine
;;; ====================================

;;; See: https://developers.google.com/identity/protocols/googlescopes#containerv1
(defonce gke-scopes
  ["https://www.googleapis.com/auth/cloud-platform"])

(def ^GoogleCredentials creds
  (delay
    (let [app-creds (GoogleCredentials/getApplicationDefault)]
      (if (.createScopedRequired app-creds)
        (.createScoped app-creds ^List gke-scopes)
        app-creds))))

(defn refresh-goog-token!
  "Refresh the token by discarding the cached token and
   metadata and requesting the new ones if expired"
  [^GoogleCredentials creds]
  (.refreshIfExpired creds)
  creds)


(def get-google-access-token
  "Fetches the google access token"
  (fn []
    (some-> @creds
            refresh-goog-token!
            .getAccessToken
            .getTokenValue)))
