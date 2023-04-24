(defproject com.oscaro/clj-k8s "1.21.14.1-SNAPSHOT"
  :description "Clojure kubernetes client API stub"
  :url "https://github.com/oscaro/clj-k8s"
  :deploy-repositories [["snapshots" {:url "https://repo.clojars.org"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://repo.clojars.org"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]]
  :dependencies [[org.clojure/clojure                             "1.10.1"
                  :scope "provided"]
                 [clj-http                                        "3.10.0"]
                 [cheshire                                        "5.9.0"]
                 [io.forward/yaml                                 "1.0.9"]
                 [org.flatland/ordered                            "1.5.7"]
                 [com.google.auth/google-auth-library-oauth2-http "0.19.0"]
                 ;; The dependencies below were carefully added and excluded
                 ;; in order to remove all confusing warnings.
                 [org.apache.httpcomponents/httpclient            "4.5.10"]
                 [org.apache.httpcomponents/httpcore              "4.4.12"]
                 [com.fasterxml.jackson.core/jackson-core         "2.10.0"]]
  :min-lein-version "2.8.0"
  :resource-paths ["resources"]
  :plugins [[lein-marginalia "0.9.1"]]
  :profiles {:dev {:dependencies   [[org.clojure/tools.namespace "0.3.1"]]
                   :source-paths   ["dev"]
                   :resource-paths ["dev-resources"]}}
  :global-vars {*warn-on-reflection* true})
