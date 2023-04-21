(ns kubernetes.api.authorization-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-authorization-v1beta1-namespaced-local-subject-access-review-with-http-info
  "
  create a LocalSubjectAccessReview"
  ([namespace body ] (create-authorization-v1beta1-namespaced-local-subject-access-review-with-http-info namespace body nil))
  ([namespace body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params namespace body)
   (call-api "/apis/authorization.k8s.io/v1beta1/namespaces/{namespace}/localsubjectaccessreviews" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-authorization-v1beta1-namespaced-local-subject-access-review
  "
  create a LocalSubjectAccessReview"
  ([namespace body ] (create-authorization-v1beta1-namespaced-local-subject-access-review namespace body nil))
  ([namespace body optional-params]
   (:data (create-authorization-v1beta1-namespaced-local-subject-access-review-with-http-info namespace body optional-params))))

(defn create-authorization-v1beta1-self-subject-access-review-with-http-info
  "
  create a SelfSubjectAccessReview"
  ([body ] (create-authorization-v1beta1-self-subject-access-review-with-http-info body nil))
  ([body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1beta1/selfsubjectaccessreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-authorization-v1beta1-self-subject-access-review
  "
  create a SelfSubjectAccessReview"
  ([body ] (create-authorization-v1beta1-self-subject-access-review body nil))
  ([body optional-params]
   (:data (create-authorization-v1beta1-self-subject-access-review-with-http-info body optional-params))))

(defn create-authorization-v1beta1-self-subject-rules-review-with-http-info
  "
  create a SelfSubjectRulesReview"
  ([body ] (create-authorization-v1beta1-self-subject-rules-review-with-http-info body nil))
  ([body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1beta1/selfsubjectrulesreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-authorization-v1beta1-self-subject-rules-review
  "
  create a SelfSubjectRulesReview"
  ([body ] (create-authorization-v1beta1-self-subject-rules-review body nil))
  ([body optional-params]
   (:data (create-authorization-v1beta1-self-subject-rules-review-with-http-info body optional-params))))

(defn create-authorization-v1beta1-subject-access-review-with-http-info
  "
  create a SubjectAccessReview"
  ([body ] (create-authorization-v1beta1-subject-access-review-with-http-info body nil))
  ([body {:keys [dry-run include-uninitialized pretty ]}]
   (check-required-params body)
   (call-api "/apis/authorization.k8s.io/v1beta1/subjectaccessreviews" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"dryRun" dry-run "includeUninitialized" include-uninitialized "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-authorization-v1beta1-subject-access-review
  "
  create a SubjectAccessReview"
  ([body ] (create-authorization-v1beta1-subject-access-review body nil))
  ([body optional-params]
   (:data (create-authorization-v1beta1-subject-access-review-with-http-info body optional-params))))

(defn get-authorization-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/authorization.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-authorization-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-authorization-v1beta1-api-resources-with-http-info)))

