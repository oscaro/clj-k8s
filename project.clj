(defproject com.oscaro/clj-k8s "1.25.8.2"
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
                 [clj-http                                        "3.12.3"]
                 [cheshire                                        "5.11.0"]
                 [io.forward/yaml                                 "1.0.11"]
                 [prismatic/schema                                "1.4.1"]
                 [org.flatland/ordered                            "1.15.11"]
                 [com.google.auth/google-auth-library-oauth2-http "1.16.1"]
                 ;; The dependencies below were carefully added and excluded
                 ;; in order to remove all confusing warnings.
                 [org.apache.httpcomponents/httpclient            "4.5.14"]
                 [org.apache.httpcomponents/httpcore              "4.4.16"]
                 [com.fasterxml.jackson.core/jackson-core         "2.15.0"]]
  :min-lein-version "2.8.0"
  :resource-paths ["resources"]
  :plugins [[lein-marginalia "0.9.1"]
            [lein-cloverage  "1.2.2"]
            [lein-shell      "0.5.0"]]
  :profiles {:dev {:dependencies   [[org.clojure/tools.namespace "1.4.4"]]
                   :source-paths   ["dev"]
                   :resource-paths ["dev-resources"]}}
  :aliases {"coverage" ["do" ["cloverage" "--coveralls"]
                        ["shell" "curl" "-F"
                         "json_file=@target/coverage/coveralls.json"
                         "https://coveralls.io/api/v1/jobs"]]}
  :global-vars {*warn-on-reflection* true})
