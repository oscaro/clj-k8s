(ns kubernetes.api.core-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn connect-core-v1-delete-namespaced-pod-proxy-with-http-info
  "
  connect DELETE requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-delete-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-namespaced-pod-proxy
  "
  connect DELETE requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-delete-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-delete-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-delete-namespaced-pod-proxy-with-path-with-http-info
  "
  connect DELETE requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-delete-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-namespaced-pod-proxy-with-path
  "
  connect DELETE requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-delete-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-delete-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-delete-namespaced-service-proxy-with-http-info
  "
  connect DELETE requests to proxy of Service"
  ([name namespace ] (connect-core-v1-delete-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-namespaced-service-proxy
  "
  connect DELETE requests to proxy of Service"
  ([name namespace ] (connect-core-v1-delete-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-delete-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-delete-namespaced-service-proxy-with-path-with-http-info
  "
  connect DELETE requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-delete-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-namespaced-service-proxy-with-path
  "
  connect DELETE requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-delete-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-delete-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-delete-node-proxy-with-http-info
  "
  connect DELETE requests to proxy of Node"
  ([name ] (connect-core-v1-delete-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-node-proxy
  "
  connect DELETE requests to proxy of Node"
  ([name ] (connect-core-v1-delete-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-delete-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-delete-node-proxy-with-path-with-http-info
  "
  connect DELETE requests to proxy of Node"
  ([name path ] (connect-core-v1-delete-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :delete
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-delete-node-proxy-with-path
  "
  connect DELETE requests to proxy of Node"
  ([name path ] (connect-core-v1-delete-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-delete-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-get-namespaced-pod-attach-with-http-info
  "
  connect GET requests to attach of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-attach-with-http-info name namespace nil))
  ([name namespace {:keys [container stderr stdin stdout tty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-pod-attach
  "
  connect GET requests to attach of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-attach name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-get-namespaced-pod-attach-with-http-info name namespace optional-params))))

(defn connect-core-v1-get-namespaced-pod-exec-with-http-info
  "
  connect GET requests to exec of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-exec-with-http-info name namespace nil))
  ([name namespace {:keys [command container stderr stdin stdout tty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"command" command "container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-pod-exec
  "
  connect GET requests to exec of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-exec name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-get-namespaced-pod-exec-with-http-info name namespace optional-params))))

(defn connect-core-v1-get-namespaced-pod-portforward-with-http-info
  "
  connect GET requests to portforward of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-portforward-with-http-info name namespace nil))
  ([name namespace {:keys [ports ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"ports" ports }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-pod-portforward
  "
  connect GET requests to portforward of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-portforward name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-get-namespaced-pod-portforward-with-http-info name namespace optional-params))))

(defn connect-core-v1-get-namespaced-pod-proxy-with-http-info
  "
  connect GET requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-pod-proxy
  "
  connect GET requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-get-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-get-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-get-namespaced-pod-proxy-with-path-with-http-info
  "
  connect GET requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-get-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :get
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-pod-proxy-with-path
  "
  connect GET requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-get-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-get-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-get-namespaced-service-proxy-with-http-info
  "
  connect GET requests to proxy of Service"
  ([name namespace ] (connect-core-v1-get-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-service-proxy
  "
  connect GET requests to proxy of Service"
  ([name namespace ] (connect-core-v1-get-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-get-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-get-namespaced-service-proxy-with-path-with-http-info
  "
  connect GET requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-get-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :get
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-namespaced-service-proxy-with-path
  "
  connect GET requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-get-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-get-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-get-node-proxy-with-http-info
  "
  connect GET requests to proxy of Node"
  ([name ] (connect-core-v1-get-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-node-proxy
  "
  connect GET requests to proxy of Node"
  ([name ] (connect-core-v1-get-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-get-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-get-node-proxy-with-path-with-http-info
  "
  connect GET requests to proxy of Node"
  ([name path ] (connect-core-v1-get-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :get
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-get-node-proxy-with-path
  "
  connect GET requests to proxy of Node"
  ([name path ] (connect-core-v1-get-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-get-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-head-namespaced-pod-proxy-with-http-info
  "
  connect HEAD requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-head-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :head
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-namespaced-pod-proxy
  "
  connect HEAD requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-head-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-head-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-head-namespaced-pod-proxy-with-path-with-http-info
  "
  connect HEAD requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-head-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :head
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-namespaced-pod-proxy-with-path
  "
  connect HEAD requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-head-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-head-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-head-namespaced-service-proxy-with-http-info
  "
  connect HEAD requests to proxy of Service"
  ([name namespace ] (connect-core-v1-head-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :head
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-namespaced-service-proxy
  "
  connect HEAD requests to proxy of Service"
  ([name namespace ] (connect-core-v1-head-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-head-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-head-namespaced-service-proxy-with-path-with-http-info
  "
  connect HEAD requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-head-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :head
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-namespaced-service-proxy-with-path
  "
  connect HEAD requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-head-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-head-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-head-node-proxy-with-http-info
  "
  connect HEAD requests to proxy of Node"
  ([name ] (connect-core-v1-head-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :head
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-node-proxy
  "
  connect HEAD requests to proxy of Node"
  ([name ] (connect-core-v1-head-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-head-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-head-node-proxy-with-path-with-http-info
  "
  connect HEAD requests to proxy of Node"
  ([name path ] (connect-core-v1-head-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :head
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-head-node-proxy-with-path
  "
  connect HEAD requests to proxy of Node"
  ([name path ] (connect-core-v1-head-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-head-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-options-namespaced-pod-proxy-with-http-info
  "
  connect OPTIONS requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-options-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :options
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-namespaced-pod-proxy
  "
  connect OPTIONS requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-options-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-options-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-options-namespaced-pod-proxy-with-path-with-http-info
  "
  connect OPTIONS requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-options-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :options
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-namespaced-pod-proxy-with-path
  "
  connect OPTIONS requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-options-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-options-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-options-namespaced-service-proxy-with-http-info
  "
  connect OPTIONS requests to proxy of Service"
  ([name namespace ] (connect-core-v1-options-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :options
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-namespaced-service-proxy
  "
  connect OPTIONS requests to proxy of Service"
  ([name namespace ] (connect-core-v1-options-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-options-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-options-namespaced-service-proxy-with-path-with-http-info
  "
  connect OPTIONS requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-options-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :options
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-namespaced-service-proxy-with-path
  "
  connect OPTIONS requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-options-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-options-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-options-node-proxy-with-http-info
  "
  connect OPTIONS requests to proxy of Node"
  ([name ] (connect-core-v1-options-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :options
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-node-proxy
  "
  connect OPTIONS requests to proxy of Node"
  ([name ] (connect-core-v1-options-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-options-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-options-node-proxy-with-path-with-http-info
  "
  connect OPTIONS requests to proxy of Node"
  ([name path ] (connect-core-v1-options-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :options
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-options-node-proxy-with-path
  "
  connect OPTIONS requests to proxy of Node"
  ([name path ] (connect-core-v1-options-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-options-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-patch-namespaced-pod-proxy-with-http-info
  "
  connect PATCH requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-patch-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-namespaced-pod-proxy
  "
  connect PATCH requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-patch-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-patch-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-patch-namespaced-pod-proxy-with-path-with-http-info
  "
  connect PATCH requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-patch-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-namespaced-pod-proxy-with-path
  "
  connect PATCH requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-patch-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-patch-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-patch-namespaced-service-proxy-with-http-info
  "
  connect PATCH requests to proxy of Service"
  ([name namespace ] (connect-core-v1-patch-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-namespaced-service-proxy
  "
  connect PATCH requests to proxy of Service"
  ([name namespace ] (connect-core-v1-patch-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-patch-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-patch-namespaced-service-proxy-with-path-with-http-info
  "
  connect PATCH requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-patch-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-namespaced-service-proxy-with-path
  "
  connect PATCH requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-patch-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-patch-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-patch-node-proxy-with-http-info
  "
  connect PATCH requests to proxy of Node"
  ([name ] (connect-core-v1-patch-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-node-proxy
  "
  connect PATCH requests to proxy of Node"
  ([name ] (connect-core-v1-patch-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-patch-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-patch-node-proxy-with-path-with-http-info
  "
  connect PATCH requests to proxy of Node"
  ([name path ] (connect-core-v1-patch-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :patch
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-patch-node-proxy-with-path
  "
  connect PATCH requests to proxy of Node"
  ([name path ] (connect-core-v1-patch-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-patch-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-post-namespaced-pod-attach-with-http-info
  "
  connect POST requests to attach of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-attach-with-http-info name namespace nil))
  ([name namespace {:keys [container stderr stdin stdout tty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/attach" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-pod-attach
  "
  connect POST requests to attach of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-attach name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-post-namespaced-pod-attach-with-http-info name namespace optional-params))))

(defn connect-core-v1-post-namespaced-pod-exec-with-http-info
  "
  connect POST requests to exec of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-exec-with-http-info name namespace nil))
  ([name namespace {:keys [command container stderr stdin stdout tty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/exec" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"command" command "container" container "stderr" stderr "stdin" stdin "stdout" stdout "tty" tty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-pod-exec
  "
  connect POST requests to exec of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-exec name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-post-namespaced-pod-exec-with-http-info name namespace optional-params))))

(defn connect-core-v1-post-namespaced-pod-portforward-with-http-info
  "
  connect POST requests to portforward of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-portforward-with-http-info name namespace nil))
  ([name namespace {:keys [ports ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/portforward" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"ports" ports }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-pod-portforward
  "
  connect POST requests to portforward of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-portforward name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-post-namespaced-pod-portforward-with-http-info name namespace optional-params))))

(defn connect-core-v1-post-namespaced-pod-proxy-with-http-info
  "
  connect POST requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-pod-proxy
  "
  connect POST requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-post-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-post-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-post-namespaced-pod-proxy-with-path-with-http-info
  "
  connect POST requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-post-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :post
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-pod-proxy-with-path
  "
  connect POST requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-post-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-post-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-post-namespaced-service-proxy-with-http-info
  "
  connect POST requests to proxy of Service"
  ([name namespace ] (connect-core-v1-post-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-service-proxy
  "
  connect POST requests to proxy of Service"
  ([name namespace ] (connect-core-v1-post-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-post-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-post-namespaced-service-proxy-with-path-with-http-info
  "
  connect POST requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-post-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :post
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-namespaced-service-proxy-with-path
  "
  connect POST requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-post-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-post-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-post-node-proxy-with-http-info
  "
  connect POST requests to proxy of Node"
  ([name ] (connect-core-v1-post-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :post
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-node-proxy
  "
  connect POST requests to proxy of Node"
  ([name ] (connect-core-v1-post-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-post-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-post-node-proxy-with-path-with-http-info
  "
  connect POST requests to proxy of Node"
  ([name path ] (connect-core-v1-post-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :post
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-post-node-proxy-with-path
  "
  connect POST requests to proxy of Node"
  ([name path ] (connect-core-v1-post-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-post-node-proxy-with-path-with-http-info name path optional-params))))

(defn connect-core-v1-put-namespaced-pod-proxy-with-http-info
  "
  connect PUT requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-put-namespaced-pod-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-namespaced-pod-proxy
  "
  connect PUT requests to proxy of Pod"
  ([name namespace ] (connect-core-v1-put-namespaced-pod-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-put-namespaced-pod-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-put-namespaced-pod-proxy-with-path-with-http-info
  "
  connect PUT requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-put-namespaced-pod-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/proxy/{path}" :put
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-namespaced-pod-proxy-with-path
  "
  connect PUT requests to proxy of Pod"
  ([name namespace path ] (connect-core-v1-put-namespaced-pod-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-put-namespaced-pod-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-put-namespaced-service-proxy-with-http-info
  "
  connect PUT requests to proxy of Service"
  ([name namespace ] (connect-core-v1-put-namespaced-service-proxy-with-http-info name namespace nil))
  ([name namespace {:keys [path ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-namespaced-service-proxy
  "
  connect PUT requests to proxy of Service"
  ([name namespace ] (connect-core-v1-put-namespaced-service-proxy name namespace nil))
  ([name namespace optional-params]
   (:data (connect-core-v1-put-namespaced-service-proxy-with-http-info name namespace optional-params))))

(defn connect-core-v1-put-namespaced-service-proxy-with-path-with-http-info
  "
  connect PUT requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-put-namespaced-service-proxy-with-path-with-http-info name namespace path nil))
  ([name namespace path {:keys [path2 ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/proxy/{path}" :put
             {:path-params   {"name" name "namespace" namespace "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-namespaced-service-proxy-with-path
  "
  connect PUT requests to proxy of Service"
  ([name namespace path ] (connect-core-v1-put-namespaced-service-proxy-with-path name namespace path nil))
  ([name namespace path optional-params]
   (:data (connect-core-v1-put-namespaced-service-proxy-with-path-with-http-info name namespace path optional-params))))

(defn connect-core-v1-put-node-proxy-with-http-info
  "
  connect PUT requests to proxy of Node"
  ([name ] (connect-core-v1-put-node-proxy-with-http-info name nil))
  ([name {:keys [path ]}]
   (call-api "/api/v1/nodes/{name}/proxy" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"path" path }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-node-proxy
  "
  connect PUT requests to proxy of Node"
  ([name ] (connect-core-v1-put-node-proxy name nil))
  ([name optional-params]
   (:data (connect-core-v1-put-node-proxy-with-http-info name optional-params))))

(defn connect-core-v1-put-node-proxy-with-path-with-http-info
  "
  connect PUT requests to proxy of Node"
  ([name path ] (connect-core-v1-put-node-proxy-with-path-with-http-info name path nil))
  ([name path {:keys [path2 ]}]
   (call-api "/api/v1/nodes/{name}/proxy/{path}" :put
             {:path-params   {"name" name "path" path }
              :header-params {}
              :query-params  {"path" path2 }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["*/*"]
              :auth-names    ["BearerToken"]})))

(defn connect-core-v1-put-node-proxy-with-path
  "
  connect PUT requests to proxy of Node"
  ([name path ] (connect-core-v1-put-node-proxy-with-path name path nil))
  ([name path optional-params]
   (:data (connect-core-v1-put-node-proxy-with-path-with-http-info name path optional-params))))

(defn create-core-v1-namespace-with-http-info
  "
  create a Namespace"
  ([body ] (create-core-v1-namespace-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespace
  "
  create a Namespace"
  ([body ] (create-core-v1-namespace body nil))
  ([body optional-params]
   (:data (create-core-v1-namespace-with-http-info body optional-params))))

(defn create-core-v1-namespaced-binding-with-http-info
  "
  create a Binding"
  ([namespace body ] (create-core-v1-namespaced-binding-with-http-info namespace body nil))
  ([namespace body {:keys [dry-run field-manager field-validation pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/bindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-binding
  "
  create a Binding"
  ([namespace body ] (create-core-v1-namespaced-binding namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-binding-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-config-map-with-http-info
  "
  create a ConfigMap"
  ([namespace body ] (create-core-v1-namespaced-config-map-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-config-map
  "
  create a ConfigMap"
  ([namespace body ] (create-core-v1-namespaced-config-map namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-config-map-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-endpoints-with-http-info
  "
  create Endpoints"
  ([namespace body ] (create-core-v1-namespaced-endpoints-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-endpoints
  "
  create Endpoints"
  ([namespace body ] (create-core-v1-namespaced-endpoints namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-endpoints-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-event-with-http-info
  "
  create an Event"
  ([namespace body ] (create-core-v1-namespaced-event-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-event
  "
  create an Event"
  ([namespace body ] (create-core-v1-namespaced-event namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-event-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-limit-range-with-http-info
  "
  create a LimitRange"
  ([namespace body ] (create-core-v1-namespaced-limit-range-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-limit-range
  "
  create a LimitRange"
  ([namespace body ] (create-core-v1-namespaced-limit-range namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-limit-range-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  create a PersistentVolumeClaim"
  ([namespace body ] (create-core-v1-namespaced-persistent-volume-claim-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-persistent-volume-claim
  "
  create a PersistentVolumeClaim"
  ([namespace body ] (create-core-v1-namespaced-persistent-volume-claim namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-persistent-volume-claim-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-pod-with-http-info
  "
  create a Pod"
  ([namespace body ] (create-core-v1-namespaced-pod-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-pod
  "
  create a Pod"
  ([namespace body ] (create-core-v1-namespaced-pod namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-pod-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-pod-binding-with-http-info
  "
  create binding of a Pod"
  ([name namespace body ] (create-core-v1-namespaced-pod-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [dry-run field-manager field-validation pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/binding" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-pod-binding
  "
  create binding of a Pod"
  ([name namespace body ] (create-core-v1-namespaced-pod-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (create-core-v1-namespaced-pod-binding-with-http-info name namespace body optional-params))))

(defn create-core-v1-namespaced-pod-eviction-with-http-info
  "
  create eviction of a Pod"
  ([name namespace body ] (create-core-v1-namespaced-pod-eviction-with-http-info name namespace body nil))
  ([name namespace body {:keys [dry-run field-manager field-validation pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/eviction" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-pod-eviction
  "
  create eviction of a Pod"
  ([name namespace body ] (create-core-v1-namespaced-pod-eviction name namespace body nil))
  ([name namespace body optional-params]
   (:data (create-core-v1-namespaced-pod-eviction-with-http-info name namespace body optional-params))))

(defn create-core-v1-namespaced-pod-template-with-http-info
  "
  create a PodTemplate"
  ([namespace body ] (create-core-v1-namespaced-pod-template-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-pod-template
  "
  create a PodTemplate"
  ([namespace body ] (create-core-v1-namespaced-pod-template namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-pod-template-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-replication-controller-with-http-info
  "
  create a ReplicationController"
  ([namespace body ] (create-core-v1-namespaced-replication-controller-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-replication-controller
  "
  create a ReplicationController"
  ([namespace body ] (create-core-v1-namespaced-replication-controller namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-replication-controller-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-resource-quota-with-http-info
  "
  create a ResourceQuota"
  ([namespace body ] (create-core-v1-namespaced-resource-quota-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-resource-quota
  "
  create a ResourceQuota"
  ([namespace body ] (create-core-v1-namespaced-resource-quota namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-resource-quota-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-secret-with-http-info
  "
  create a Secret"
  ([namespace body ] (create-core-v1-namespaced-secret-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-secret
  "
  create a Secret"
  ([namespace body ] (create-core-v1-namespaced-secret namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-secret-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-service-with-http-info
  "
  create a Service"
  ([namespace body ] (create-core-v1-namespaced-service-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/services" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-service
  "
  create a Service"
  ([namespace body ] (create-core-v1-namespaced-service namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-service-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-service-account-with-http-info
  "
  create a ServiceAccount"
  ([namespace body ] (create-core-v1-namespaced-service-account-with-http-info namespace body nil))
  ([namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-service-account
  "
  create a ServiceAccount"
  ([namespace body ] (create-core-v1-namespaced-service-account namespace body nil))
  ([namespace body optional-params]
   (:data (create-core-v1-namespaced-service-account-with-http-info namespace body optional-params))))

(defn create-core-v1-namespaced-service-account-token-with-http-info
  "
  create token of a ServiceAccount"
  ([name namespace body ] (create-core-v1-namespaced-service-account-token-with-http-info name namespace body nil))
  ([name namespace body {:keys [dry-run field-manager field-validation pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}/token" :post
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-namespaced-service-account-token
  "
  create token of a ServiceAccount"
  ([name namespace body ] (create-core-v1-namespaced-service-account-token name namespace body nil))
  ([name namespace body optional-params]
   (:data (create-core-v1-namespaced-service-account-token-with-http-info name namespace body optional-params))))

(defn create-core-v1-node-with-http-info
  "
  create a Node"
  ([body ] (create-core-v1-node-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/nodes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-node
  "
  create a Node"
  ([body ] (create-core-v1-node body nil))
  ([body optional-params]
   (:data (create-core-v1-node-with-http-info body optional-params))))

(defn create-core-v1-persistent-volume-with-http-info
  "
  create a PersistentVolume"
  ([body ] (create-core-v1-persistent-volume-with-http-info body nil))
  ([body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/persistentvolumes" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn create-core-v1-persistent-volume
  "
  create a PersistentVolume"
  ([body ] (create-core-v1-persistent-volume body nil))
  ([body optional-params]
   (:data (create-core-v1-persistent-volume-with-http-info body optional-params))))

(defn delete-core-v1-collection-namespaced-config-map-with-http-info
  "
  delete collection of ConfigMap"
  ([namespace ] (delete-core-v1-collection-namespaced-config-map-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-config-map
  "
  delete collection of ConfigMap"
  ([namespace ] (delete-core-v1-collection-namespaced-config-map namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-config-map-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-endpoints-with-http-info
  "
  delete collection of Endpoints"
  ([namespace ] (delete-core-v1-collection-namespaced-endpoints-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-endpoints
  "
  delete collection of Endpoints"
  ([namespace ] (delete-core-v1-collection-namespaced-endpoints namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-endpoints-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-event-with-http-info
  "
  delete collection of Event"
  ([namespace ] (delete-core-v1-collection-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-event
  "
  delete collection of Event"
  ([namespace ] (delete-core-v1-collection-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-event-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-limit-range-with-http-info
  "
  delete collection of LimitRange"
  ([namespace ] (delete-core-v1-collection-namespaced-limit-range-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-limit-range
  "
  delete collection of LimitRange"
  ([namespace ] (delete-core-v1-collection-namespaced-limit-range namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-limit-range-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-persistent-volume-claim-with-http-info
  "
  delete collection of PersistentVolumeClaim"
  ([namespace ] (delete-core-v1-collection-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-persistent-volume-claim
  "
  delete collection of PersistentVolumeClaim"
  ([namespace ] (delete-core-v1-collection-namespaced-persistent-volume-claim namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-persistent-volume-claim-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-pod-with-http-info
  "
  delete collection of Pod"
  ([namespace ] (delete-core-v1-collection-namespaced-pod-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-pod
  "
  delete collection of Pod"
  ([namespace ] (delete-core-v1-collection-namespaced-pod namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-pod-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-pod-template-with-http-info
  "
  delete collection of PodTemplate"
  ([namespace ] (delete-core-v1-collection-namespaced-pod-template-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-pod-template
  "
  delete collection of PodTemplate"
  ([namespace ] (delete-core-v1-collection-namespaced-pod-template namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-pod-template-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-replication-controller-with-http-info
  "
  delete collection of ReplicationController"
  ([namespace ] (delete-core-v1-collection-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-replication-controller
  "
  delete collection of ReplicationController"
  ([namespace ] (delete-core-v1-collection-namespaced-replication-controller namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-replication-controller-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-resource-quota-with-http-info
  "
  delete collection of ResourceQuota"
  ([namespace ] (delete-core-v1-collection-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-resource-quota
  "
  delete collection of ResourceQuota"
  ([namespace ] (delete-core-v1-collection-namespaced-resource-quota namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-resource-quota-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-secret-with-http-info
  "
  delete collection of Secret"
  ([namespace ] (delete-core-v1-collection-namespaced-secret-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-secret
  "
  delete collection of Secret"
  ([namespace ] (delete-core-v1-collection-namespaced-secret namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-secret-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-service-with-http-info
  "
  delete collection of Service"
  ([namespace ] (delete-core-v1-collection-namespaced-service-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/services" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-service
  "
  delete collection of Service"
  ([namespace ] (delete-core-v1-collection-namespaced-service namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-service-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-namespaced-service-account-with-http-info
  "
  delete collection of ServiceAccount"
  ([namespace ] (delete-core-v1-collection-namespaced-service-account-with-http-info namespace nil))
  ([namespace {:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-namespaced-service-account
  "
  delete collection of ServiceAccount"
  ([namespace ] (delete-core-v1-collection-namespaced-service-account namespace nil))
  ([namespace optional-params]
   (:data (delete-core-v1-collection-namespaced-service-account-with-http-info namespace optional-params))))

(defn delete-core-v1-collection-node-with-http-info
  "
  delete collection of Node"
  ([] (delete-core-v1-collection-node-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/nodes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-node
  "
  delete collection of Node"
  ([] (delete-core-v1-collection-node nil))
  ([optional-params]
   (:data (delete-core-v1-collection-node-with-http-info optional-params))))

(defn delete-core-v1-collection-persistent-volume-with-http-info
  "
  delete collection of PersistentVolume"
  ([] (delete-core-v1-collection-persistent-volume-with-http-info nil))
  ([{:keys [pretty body continue dry-run field-selector grace-period-seconds label-selector limit orphan-dependents propagation-policy resource-version resource-version-match send-initial-events timeout-seconds ]}]
   (call-api "/api/v1/persistentvolumes" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "dryRun" dry-run "fieldSelector" field-selector "gracePeriodSeconds" grace-period-seconds "labelSelector" label-selector "limit" limit "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-collection-persistent-volume
  "
  delete collection of PersistentVolume"
  ([] (delete-core-v1-collection-persistent-volume nil))
  ([optional-params]
   (:data (delete-core-v1-collection-persistent-volume-with-http-info optional-params))))

(defn delete-core-v1-namespace-with-http-info
  "
  delete a Namespace"
  ([name ] (delete-core-v1-namespace-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespace
  "
  delete a Namespace"
  ([name ] (delete-core-v1-namespace name nil))
  ([name optional-params]
   (:data (delete-core-v1-namespace-with-http-info name optional-params))))

(defn delete-core-v1-namespaced-config-map-with-http-info
  "
  delete a ConfigMap"
  ([name namespace ] (delete-core-v1-namespaced-config-map-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-config-map
  "
  delete a ConfigMap"
  ([name namespace ] (delete-core-v1-namespaced-config-map name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-config-map-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-endpoints-with-http-info
  "
  delete Endpoints"
  ([name namespace ] (delete-core-v1-namespaced-endpoints-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-endpoints
  "
  delete Endpoints"
  ([name namespace ] (delete-core-v1-namespaced-endpoints name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-endpoints-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-event-with-http-info
  "
  delete an Event"
  ([name namespace ] (delete-core-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-event
  "
  delete an Event"
  ([name namespace ] (delete-core-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-limit-range-with-http-info
  "
  delete a LimitRange"
  ([name namespace ] (delete-core-v1-namespaced-limit-range-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-limit-range
  "
  delete a LimitRange"
  ([name namespace ] (delete-core-v1-namespaced-limit-range name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-limit-range-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  delete a PersistentVolumeClaim"
  ([name namespace ] (delete-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-persistent-volume-claim
  "
  delete a PersistentVolumeClaim"
  ([name namespace ] (delete-core-v1-namespaced-persistent-volume-claim name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-pod-with-http-info
  "
  delete a Pod"
  ([name namespace ] (delete-core-v1-namespaced-pod-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-pod
  "
  delete a Pod"
  ([name namespace ] (delete-core-v1-namespaced-pod name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-pod-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-pod-template-with-http-info
  "
  delete a PodTemplate"
  ([name namespace ] (delete-core-v1-namespaced-pod-template-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-pod-template
  "
  delete a PodTemplate"
  ([name namespace ] (delete-core-v1-namespaced-pod-template name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-pod-template-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-replication-controller-with-http-info
  "
  delete a ReplicationController"
  ([name namespace ] (delete-core-v1-namespaced-replication-controller-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-replication-controller
  "
  delete a ReplicationController"
  ([name namespace ] (delete-core-v1-namespaced-replication-controller name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-replication-controller-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-resource-quota-with-http-info
  "
  delete a ResourceQuota"
  ([name namespace ] (delete-core-v1-namespaced-resource-quota-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-resource-quota
  "
  delete a ResourceQuota"
  ([name namespace ] (delete-core-v1-namespaced-resource-quota name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-resource-quota-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-secret-with-http-info
  "
  delete a Secret"
  ([name namespace ] (delete-core-v1-namespaced-secret-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-secret
  "
  delete a Secret"
  ([name namespace ] (delete-core-v1-namespaced-secret name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-secret-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-service-with-http-info
  "
  delete a Service"
  ([name namespace ] (delete-core-v1-namespaced-service-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-service
  "
  delete a Service"
  ([name namespace ] (delete-core-v1-namespaced-service name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-service-with-http-info name namespace optional-params))))

(defn delete-core-v1-namespaced-service-account-with-http-info
  "
  delete a ServiceAccount"
  ([name namespace ] (delete-core-v1-namespaced-service-account-with-http-info name namespace nil))
  ([name namespace {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-namespaced-service-account
  "
  delete a ServiceAccount"
  ([name namespace ] (delete-core-v1-namespaced-service-account name namespace nil))
  ([name namespace optional-params]
   (:data (delete-core-v1-namespaced-service-account-with-http-info name namespace optional-params))))

(defn delete-core-v1-node-with-http-info
  "
  delete a Node"
  ([name ] (delete-core-v1-node-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/nodes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-node
  "
  delete a Node"
  ([name ] (delete-core-v1-node name nil))
  ([name optional-params]
   (:data (delete-core-v1-node-with-http-info name optional-params))))

(defn delete-core-v1-persistent-volume-with-http-info
  "
  delete a PersistentVolume"
  ([name ] (delete-core-v1-persistent-volume-with-http-info name nil))
  ([name {:keys [pretty body dry-run grace-period-seconds orphan-dependents propagation-policy ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn delete-core-v1-persistent-volume
  "
  delete a PersistentVolume"
  ([name ] (delete-core-v1-persistent-volume name nil))
  ([name optional-params]
   (:data (delete-core-v1-persistent-volume-with-http-info name optional-params))))

(defn get-core-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/api/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken"]}))

(defn get-core-v1-api-resources
  "
  get available resources"
  []
  (:data (get-core-v1-api-resources-with-http-info)))

(defn list-core-v1-component-status-with-http-info
  "
  list objects of kind ComponentStatus"
  ([] (list-core-v1-component-status-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/componentstatuses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-component-status
  "
  list objects of kind ComponentStatus"
  ([] (list-core-v1-component-status nil))
  ([optional-params]
   (:data (list-core-v1-component-status-with-http-info optional-params))))

(defn list-core-v1-config-map-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ConfigMap"
  ([] (list-core-v1-config-map-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/configmaps" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-config-map-for-all-namespaces
  "
  list or watch objects of kind ConfigMap"
  ([] (list-core-v1-config-map-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-config-map-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-endpoints-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Endpoints"
  ([] (list-core-v1-endpoints-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/endpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-endpoints-for-all-namespaces
  "
  list or watch objects of kind Endpoints"
  ([] (list-core-v1-endpoints-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-endpoints-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-event-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Event"
  ([] (list-core-v1-event-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-event-for-all-namespaces
  "
  list or watch objects of kind Event"
  ([] (list-core-v1-event-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-event-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-limit-range-for-all-namespaces-with-http-info
  "
  list or watch objects of kind LimitRange"
  ([] (list-core-v1-limit-range-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/limitranges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-limit-range-for-all-namespaces
  "
  list or watch objects of kind LimitRange"
  ([] (list-core-v1-limit-range-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-limit-range-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-namespace-with-http-info
  "
  list or watch objects of kind Namespace"
  ([] (list-core-v1-namespace-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespace
  "
  list or watch objects of kind Namespace"
  ([] (list-core-v1-namespace nil))
  ([optional-params]
   (:data (list-core-v1-namespace-with-http-info optional-params))))

(defn list-core-v1-namespaced-config-map-with-http-info
  "
  list or watch objects of kind ConfigMap"
  ([namespace ] (list-core-v1-namespaced-config-map-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-config-map
  "
  list or watch objects of kind ConfigMap"
  ([namespace ] (list-core-v1-namespaced-config-map namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-config-map-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-endpoints-with-http-info
  "
  list or watch objects of kind Endpoints"
  ([namespace ] (list-core-v1-namespaced-endpoints-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-endpoints
  "
  list or watch objects of kind Endpoints"
  ([namespace ] (list-core-v1-namespaced-endpoints namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-endpoints-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-event-with-http-info
  "
  list or watch objects of kind Event"
  ([namespace ] (list-core-v1-namespaced-event-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-event
  "
  list or watch objects of kind Event"
  ([namespace ] (list-core-v1-namespaced-event namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-event-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-limit-range-with-http-info
  "
  list or watch objects of kind LimitRange"
  ([namespace ] (list-core-v1-namespaced-limit-range-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-limit-range
  "
  list or watch objects of kind LimitRange"
  ([namespace ] (list-core-v1-namespaced-limit-range namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-limit-range-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([namespace ] (list-core-v1-namespaced-persistent-volume-claim-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-persistent-volume-claim
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([namespace ] (list-core-v1-namespaced-persistent-volume-claim namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-persistent-volume-claim-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-pod-with-http-info
  "
  list or watch objects of kind Pod"
  ([namespace ] (list-core-v1-namespaced-pod-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-pod
  "
  list or watch objects of kind Pod"
  ([namespace ] (list-core-v1-namespaced-pod namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-pod-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-pod-template-with-http-info
  "
  list or watch objects of kind PodTemplate"
  ([namespace ] (list-core-v1-namespaced-pod-template-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-pod-template
  "
  list or watch objects of kind PodTemplate"
  ([namespace ] (list-core-v1-namespaced-pod-template namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-pod-template-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-replication-controller-with-http-info
  "
  list or watch objects of kind ReplicationController"
  ([namespace ] (list-core-v1-namespaced-replication-controller-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-replication-controller
  "
  list or watch objects of kind ReplicationController"
  ([namespace ] (list-core-v1-namespaced-replication-controller namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-replication-controller-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-resource-quota-with-http-info
  "
  list or watch objects of kind ResourceQuota"
  ([namespace ] (list-core-v1-namespaced-resource-quota-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-resource-quota
  "
  list or watch objects of kind ResourceQuota"
  ([namespace ] (list-core-v1-namespaced-resource-quota namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-resource-quota-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-secret-with-http-info
  "
  list or watch objects of kind Secret"
  ([namespace ] (list-core-v1-namespaced-secret-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-secret
  "
  list or watch objects of kind Secret"
  ([namespace ] (list-core-v1-namespaced-secret namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-secret-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-service-with-http-info
  "
  list or watch objects of kind Service"
  ([namespace ] (list-core-v1-namespaced-service-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/services" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-service
  "
  list or watch objects of kind Service"
  ([namespace ] (list-core-v1-namespaced-service namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-service-with-http-info namespace optional-params))))

(defn list-core-v1-namespaced-service-account-with-http-info
  "
  list or watch objects of kind ServiceAccount"
  ([namespace ] (list-core-v1-namespaced-service-account-with-http-info namespace nil))
  ([namespace {:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-namespaced-service-account
  "
  list or watch objects of kind ServiceAccount"
  ([namespace ] (list-core-v1-namespaced-service-account namespace nil))
  ([namespace optional-params]
   (:data (list-core-v1-namespaced-service-account-with-http-info namespace optional-params))))

(defn list-core-v1-node-with-http-info
  "
  list or watch objects of kind Node"
  ([] (list-core-v1-node-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-node
  "
  list or watch objects of kind Node"
  ([] (list-core-v1-node nil))
  ([optional-params]
   (:data (list-core-v1-node-with-http-info optional-params))))

(defn list-core-v1-persistent-volume-with-http-info
  "
  list or watch objects of kind PersistentVolume"
  ([] (list-core-v1-persistent-volume-with-http-info nil))
  ([{:keys [pretty allow-watch-bookmarks continue field-selector label-selector limit resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/persistentvolumes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-persistent-volume
  "
  list or watch objects of kind PersistentVolume"
  ([] (list-core-v1-persistent-volume nil))
  ([optional-params]
   (:data (list-core-v1-persistent-volume-with-http-info optional-params))))

(defn list-core-v1-persistent-volume-claim-for-all-namespaces-with-http-info
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([] (list-core-v1-persistent-volume-claim-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/persistentvolumeclaims" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-persistent-volume-claim-for-all-namespaces
  "
  list or watch objects of kind PersistentVolumeClaim"
  ([] (list-core-v1-persistent-volume-claim-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-persistent-volume-claim-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-pod-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Pod"
  ([] (list-core-v1-pod-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-pod-for-all-namespaces
  "
  list or watch objects of kind Pod"
  ([] (list-core-v1-pod-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-pod-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-pod-template-for-all-namespaces-with-http-info
  "
  list or watch objects of kind PodTemplate"
  ([] (list-core-v1-pod-template-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/podtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-pod-template-for-all-namespaces
  "
  list or watch objects of kind PodTemplate"
  ([] (list-core-v1-pod-template-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-pod-template-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-replication-controller-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ReplicationController"
  ([] (list-core-v1-replication-controller-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/replicationcontrollers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-replication-controller-for-all-namespaces
  "
  list or watch objects of kind ReplicationController"
  ([] (list-core-v1-replication-controller-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-replication-controller-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-resource-quota-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ResourceQuota"
  ([] (list-core-v1-resource-quota-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/resourcequotas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-resource-quota-for-all-namespaces
  "
  list or watch objects of kind ResourceQuota"
  ([] (list-core-v1-resource-quota-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-resource-quota-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-secret-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Secret"
  ([] (list-core-v1-secret-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/secrets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-secret-for-all-namespaces
  "
  list or watch objects of kind Secret"
  ([] (list-core-v1-secret-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-secret-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-service-account-for-all-namespaces-with-http-info
  "
  list or watch objects of kind ServiceAccount"
  ([] (list-core-v1-service-account-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/serviceaccounts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-service-account-for-all-namespaces
  "
  list or watch objects of kind ServiceAccount"
  ([] (list-core-v1-service-account-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-service-account-for-all-namespaces-with-http-info optional-params))))

(defn list-core-v1-service-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Service"
  ([] (list-core-v1-service-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn list-core-v1-service-for-all-namespaces
  "
  list or watch objects of kind Service"
  ([] (list-core-v1-service-for-all-namespaces nil))
  ([optional-params]
   (:data (list-core-v1-service-for-all-namespaces-with-http-info optional-params))))

(defn patch-core-v1-namespace-with-http-info
  "
  partially update the specified Namespace"
  ([name body ] (patch-core-v1-namespace-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespace
  "
  partially update the specified Namespace"
  ([name body ] (patch-core-v1-namespace name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-namespace-with-http-info name body optional-params))))

(defn patch-core-v1-namespace-status-with-http-info
  "
  partially update status of the specified Namespace"
  ([name body ] (patch-core-v1-namespace-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespace-status
  "
  partially update status of the specified Namespace"
  ([name body ] (patch-core-v1-namespace-status name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-namespace-status-with-http-info name body optional-params))))

(defn patch-core-v1-namespaced-config-map-with-http-info
  "
  partially update the specified ConfigMap"
  ([name namespace body ] (patch-core-v1-namespaced-config-map-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-config-map
  "
  partially update the specified ConfigMap"
  ([name namespace body ] (patch-core-v1-namespaced-config-map name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-config-map-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-endpoints-with-http-info
  "
  partially update the specified Endpoints"
  ([name namespace body ] (patch-core-v1-namespaced-endpoints-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-endpoints
  "
  partially update the specified Endpoints"
  ([name namespace body ] (patch-core-v1-namespaced-endpoints name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-endpoints-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-event-with-http-info
  "
  partially update the specified Event"
  ([name namespace body ] (patch-core-v1-namespaced-event-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-event
  "
  partially update the specified Event"
  ([name namespace body ] (patch-core-v1-namespaced-event name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-event-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-limit-range-with-http-info
  "
  partially update the specified LimitRange"
  ([name namespace body ] (patch-core-v1-namespaced-limit-range-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-limit-range
  "
  partially update the specified LimitRange"
  ([name namespace body ] (patch-core-v1-namespaced-limit-range name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-limit-range-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  partially update the specified PersistentVolumeClaim"
  ([name namespace body ] (patch-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-persistent-volume-claim
  "
  partially update the specified PersistentVolumeClaim"
  ([name namespace body ] (patch-core-v1-namespaced-persistent-volume-claim name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-persistent-volume-claim-status-with-http-info
  "
  partially update status of the specified PersistentVolumeClaim"
  ([name namespace body ] (patch-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-persistent-volume-claim-status
  "
  partially update status of the specified PersistentVolumeClaim"
  ([name namespace body ] (patch-core-v1-namespaced-persistent-volume-claim-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-pod-with-http-info
  "
  partially update the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-pod
  "
  partially update the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-pod-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-pod-ephemeralcontainers-with-http-info
  "
  partially update ephemeralcontainers of the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/ephemeralcontainers" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-pod-ephemeralcontainers
  "
  partially update ephemeralcontainers of the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod-ephemeralcontainers name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-pod-status-with-http-info
  "
  partially update status of the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-pod-status
  "
  partially update status of the specified Pod"
  ([name namespace body ] (patch-core-v1-namespaced-pod-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-pod-status-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-pod-template-with-http-info
  "
  partially update the specified PodTemplate"
  ([name namespace body ] (patch-core-v1-namespaced-pod-template-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-pod-template
  "
  partially update the specified PodTemplate"
  ([name namespace body ] (patch-core-v1-namespaced-pod-template name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-pod-template-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-replication-controller-with-http-info
  "
  partially update the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-replication-controller
  "
  partially update the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-replication-controller-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-replication-controller-scale-with-http-info
  "
  partially update scale of the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-replication-controller-scale
  "
  partially update scale of the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-replication-controller-scale-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-replication-controller-status-with-http-info
  "
  partially update status of the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-replication-controller-status
  "
  partially update status of the specified ReplicationController"
  ([name namespace body ] (patch-core-v1-namespaced-replication-controller-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-replication-controller-status-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-resource-quota-with-http-info
  "
  partially update the specified ResourceQuota"
  ([name namespace body ] (patch-core-v1-namespaced-resource-quota-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-resource-quota
  "
  partially update the specified ResourceQuota"
  ([name namespace body ] (patch-core-v1-namespaced-resource-quota name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-resource-quota-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-resource-quota-status-with-http-info
  "
  partially update status of the specified ResourceQuota"
  ([name namespace body ] (patch-core-v1-namespaced-resource-quota-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-resource-quota-status
  "
  partially update status of the specified ResourceQuota"
  ([name namespace body ] (patch-core-v1-namespaced-resource-quota-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-resource-quota-status-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-secret-with-http-info
  "
  partially update the specified Secret"
  ([name namespace body ] (patch-core-v1-namespaced-secret-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-secret
  "
  partially update the specified Secret"
  ([name namespace body ] (patch-core-v1-namespaced-secret name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-secret-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-service-with-http-info
  "
  partially update the specified Service"
  ([name namespace body ] (patch-core-v1-namespaced-service-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-service
  "
  partially update the specified Service"
  ([name namespace body ] (patch-core-v1-namespaced-service name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-service-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-service-account-with-http-info
  "
  partially update the specified ServiceAccount"
  ([name namespace body ] (patch-core-v1-namespaced-service-account-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-service-account
  "
  partially update the specified ServiceAccount"
  ([name namespace body ] (patch-core-v1-namespaced-service-account name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-service-account-with-http-info name namespace body optional-params))))

(defn patch-core-v1-namespaced-service-status-with-http-info
  "
  partially update status of the specified Service"
  ([name namespace body ] (patch-core-v1-namespaced-service-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-namespaced-service-status
  "
  partially update status of the specified Service"
  ([name namespace body ] (patch-core-v1-namespaced-service-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-core-v1-namespaced-service-status-with-http-info name namespace body optional-params))))

(defn patch-core-v1-node-with-http-info
  "
  partially update the specified Node"
  ([name body ] (patch-core-v1-node-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/nodes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-node
  "
  partially update the specified Node"
  ([name body ] (patch-core-v1-node name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-node-with-http-info name body optional-params))))

(defn patch-core-v1-node-status-with-http-info
  "
  partially update status of the specified Node"
  ([name body ] (patch-core-v1-node-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/nodes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-node-status
  "
  partially update status of the specified Node"
  ([name body ] (patch-core-v1-node-status name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-node-status-with-http-info name body optional-params))))

(defn patch-core-v1-persistent-volume-with-http-info
  "
  partially update the specified PersistentVolume"
  ([name body ] (patch-core-v1-persistent-volume-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-persistent-volume
  "
  partially update the specified PersistentVolume"
  ([name body ] (patch-core-v1-persistent-volume name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-persistent-volume-with-http-info name body optional-params))))

(defn patch-core-v1-persistent-volume-status-with-http-info
  "
  partially update status of the specified PersistentVolume"
  ([name body ] (patch-core-v1-persistent-volume-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation force ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "force" force }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json" "application/apply-patch+yaml"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn patch-core-v1-persistent-volume-status
  "
  partially update status of the specified PersistentVolume"
  ([name body ] (patch-core-v1-persistent-volume-status name body nil))
  ([name body optional-params]
   (:data (patch-core-v1-persistent-volume-status-with-http-info name body optional-params))))

(defn read-core-v1-component-status-with-http-info
  "
  read the specified ComponentStatus"
  ([name ] (read-core-v1-component-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/componentstatuses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-component-status
  "
  read the specified ComponentStatus"
  ([name ] (read-core-v1-component-status name nil))
  ([name optional-params]
   (:data (read-core-v1-component-status-with-http-info name optional-params))))

(defn read-core-v1-namespace-with-http-info
  "
  read the specified Namespace"
  ([name ] (read-core-v1-namespace-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespace
  "
  read the specified Namespace"
  ([name ] (read-core-v1-namespace name nil))
  ([name optional-params]
   (:data (read-core-v1-namespace-with-http-info name optional-params))))

(defn read-core-v1-namespace-status-with-http-info
  "
  read status of the specified Namespace"
  ([name ] (read-core-v1-namespace-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespace-status
  "
  read status of the specified Namespace"
  ([name ] (read-core-v1-namespace-status name nil))
  ([name optional-params]
   (:data (read-core-v1-namespace-status-with-http-info name optional-params))))

(defn read-core-v1-namespaced-config-map-with-http-info
  "
  read the specified ConfigMap"
  ([name namespace ] (read-core-v1-namespaced-config-map-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-config-map
  "
  read the specified ConfigMap"
  ([name namespace ] (read-core-v1-namespaced-config-map name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-config-map-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-endpoints-with-http-info
  "
  read the specified Endpoints"
  ([name namespace ] (read-core-v1-namespaced-endpoints-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-endpoints
  "
  read the specified Endpoints"
  ([name namespace ] (read-core-v1-namespaced-endpoints name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-endpoints-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-event-with-http-info
  "
  read the specified Event"
  ([name namespace ] (read-core-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-event
  "
  read the specified Event"
  ([name namespace ] (read-core-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-limit-range-with-http-info
  "
  read the specified LimitRange"
  ([name namespace ] (read-core-v1-namespaced-limit-range-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-limit-range
  "
  read the specified LimitRange"
  ([name namespace ] (read-core-v1-namespaced-limit-range name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-limit-range-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  read the specified PersistentVolumeClaim"
  ([name namespace ] (read-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-persistent-volume-claim
  "
  read the specified PersistentVolumeClaim"
  ([name namespace ] (read-core-v1-namespaced-persistent-volume-claim name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-persistent-volume-claim-status-with-http-info
  "
  read status of the specified PersistentVolumeClaim"
  ([name namespace ] (read-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-persistent-volume-claim-status
  "
  read status of the specified PersistentVolumeClaim"
  ([name namespace ] (read-core-v1-namespaced-persistent-volume-claim-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-pod-with-http-info
  "
  read the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-pod
  "
  read the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-pod-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-pod-ephemeralcontainers-with-http-info
  "
  read ephemeralcontainers of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/ephemeralcontainers" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-pod-ephemeralcontainers
  "
  read ephemeralcontainers of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-ephemeralcontainers name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-pod-log-with-http-info
  "
  read log of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-log-with-http-info name namespace nil))
  ([name namespace {:keys [container follow insecure-skip-tls-verify-backend limit-bytes pretty previous since-seconds tail-lines timestamps ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/log" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"container" container "follow" follow "insecureSkipTLSVerifyBackend" insecure-skip-tls-verify-backend "limitBytes" limit-bytes "pretty" pretty "previous" previous "sinceSeconds" since-seconds "tailLines" tail-lines "timestamps" timestamps }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["text/plain" "application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-pod-log
  "
  read log of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-log name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-pod-log-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-pod-status-with-http-info
  "
  read status of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-pod-status
  "
  read status of the specified Pod"
  ([name namespace ] (read-core-v1-namespaced-pod-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-pod-status-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-pod-template-with-http-info
  "
  read the specified PodTemplate"
  ([name namespace ] (read-core-v1-namespaced-pod-template-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-pod-template
  "
  read the specified PodTemplate"
  ([name namespace ] (read-core-v1-namespaced-pod-template name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-pod-template-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-replication-controller-with-http-info
  "
  read the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-replication-controller
  "
  read the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-replication-controller-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-replication-controller-scale-with-http-info
  "
  read scale of the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller-scale-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-replication-controller-scale
  "
  read scale of the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller-scale name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-replication-controller-scale-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-replication-controller-status-with-http-info
  "
  read status of the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-replication-controller-status
  "
  read status of the specified ReplicationController"
  ([name namespace ] (read-core-v1-namespaced-replication-controller-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-replication-controller-status-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-resource-quota-with-http-info
  "
  read the specified ResourceQuota"
  ([name namespace ] (read-core-v1-namespaced-resource-quota-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-resource-quota
  "
  read the specified ResourceQuota"
  ([name namespace ] (read-core-v1-namespaced-resource-quota name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-resource-quota-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-resource-quota-status-with-http-info
  "
  read status of the specified ResourceQuota"
  ([name namespace ] (read-core-v1-namespaced-resource-quota-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-resource-quota-status
  "
  read status of the specified ResourceQuota"
  ([name namespace ] (read-core-v1-namespaced-resource-quota-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-resource-quota-status-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-secret-with-http-info
  "
  read the specified Secret"
  ([name namespace ] (read-core-v1-namespaced-secret-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-secret
  "
  read the specified Secret"
  ([name namespace ] (read-core-v1-namespaced-secret name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-secret-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-service-with-http-info
  "
  read the specified Service"
  ([name namespace ] (read-core-v1-namespaced-service-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-service
  "
  read the specified Service"
  ([name namespace ] (read-core-v1-namespaced-service name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-service-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-service-account-with-http-info
  "
  read the specified ServiceAccount"
  ([name namespace ] (read-core-v1-namespaced-service-account-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-service-account
  "
  read the specified ServiceAccount"
  ([name namespace ] (read-core-v1-namespaced-service-account name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-service-account-with-http-info name namespace optional-params))))

(defn read-core-v1-namespaced-service-status-with-http-info
  "
  read status of the specified Service"
  ([name namespace ] (read-core-v1-namespaced-service-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-namespaced-service-status
  "
  read status of the specified Service"
  ([name namespace ] (read-core-v1-namespaced-service-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-core-v1-namespaced-service-status-with-http-info name namespace optional-params))))

(defn read-core-v1-node-with-http-info
  "
  read the specified Node"
  ([name ] (read-core-v1-node-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-node
  "
  read the specified Node"
  ([name ] (read-core-v1-node name nil))
  ([name optional-params]
   (:data (read-core-v1-node-with-http-info name optional-params))))

(defn read-core-v1-node-status-with-http-info
  "
  read status of the specified Node"
  ([name ] (read-core-v1-node-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/nodes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-node-status
  "
  read status of the specified Node"
  ([name ] (read-core-v1-node-status name nil))
  ([name optional-params]
   (:data (read-core-v1-node-status-with-http-info name optional-params))))

(defn read-core-v1-persistent-volume-with-http-info
  "
  read the specified PersistentVolume"
  ([name ] (read-core-v1-persistent-volume-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-persistent-volume
  "
  read the specified PersistentVolume"
  ([name ] (read-core-v1-persistent-volume name nil))
  ([name optional-params]
   (:data (read-core-v1-persistent-volume-with-http-info name optional-params))))

(defn read-core-v1-persistent-volume-status-with-http-info
  "
  read status of the specified PersistentVolume"
  ([name ] (read-core-v1-persistent-volume-status-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn read-core-v1-persistent-volume-status
  "
  read status of the specified PersistentVolume"
  ([name ] (read-core-v1-persistent-volume-status name nil))
  ([name optional-params]
   (:data (read-core-v1-persistent-volume-status-with-http-info name optional-params))))

(defn replace-core-v1-namespace-with-http-info
  "
  replace the specified Namespace"
  ([name body ] (replace-core-v1-namespace-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespace
  "
  replace the specified Namespace"
  ([name body ] (replace-core-v1-namespace name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-namespace-with-http-info name body optional-params))))

(defn replace-core-v1-namespace-finalize-with-http-info
  "
  replace finalize of the specified Namespace"
  ([name body ] (replace-core-v1-namespace-finalize-with-http-info name body nil))
  ([name body {:keys [dry-run field-manager field-validation pretty ]}]
   (call-api "/api/v1/namespaces/{name}/finalize" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation "pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespace-finalize
  "
  replace finalize of the specified Namespace"
  ([name body ] (replace-core-v1-namespace-finalize name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-namespace-finalize-with-http-info name body optional-params))))

(defn replace-core-v1-namespace-status-with-http-info
  "
  replace status of the specified Namespace"
  ([name body ] (replace-core-v1-namespace-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespace-status
  "
  replace status of the specified Namespace"
  ([name body ] (replace-core-v1-namespace-status name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-namespace-status-with-http-info name body optional-params))))

(defn replace-core-v1-namespaced-config-map-with-http-info
  "
  replace the specified ConfigMap"
  ([name namespace body ] (replace-core-v1-namespaced-config-map-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/configmaps/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-config-map
  "
  replace the specified ConfigMap"
  ([name namespace body ] (replace-core-v1-namespaced-config-map name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-config-map-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-endpoints-with-http-info
  "
  replace the specified Endpoints"
  ([name namespace body ] (replace-core-v1-namespaced-endpoints-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/endpoints/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-endpoints
  "
  replace the specified Endpoints"
  ([name namespace body ] (replace-core-v1-namespaced-endpoints name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-endpoints-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-event-with-http-info
  "
  replace the specified Event"
  ([name namespace body ] (replace-core-v1-namespaced-event-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/events/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-event
  "
  replace the specified Event"
  ([name namespace body ] (replace-core-v1-namespaced-event name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-event-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-limit-range-with-http-info
  "
  replace the specified LimitRange"
  ([name namespace body ] (replace-core-v1-namespaced-limit-range-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/limitranges/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-limit-range
  "
  replace the specified LimitRange"
  ([name namespace body ] (replace-core-v1-namespaced-limit-range name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-limit-range-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  replace the specified PersistentVolumeClaim"
  ([name namespace body ] (replace-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-persistent-volume-claim
  "
  replace the specified PersistentVolumeClaim"
  ([name namespace body ] (replace-core-v1-namespaced-persistent-volume-claim name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-persistent-volume-claim-status-with-http-info
  "
  replace status of the specified PersistentVolumeClaim"
  ([name namespace body ] (replace-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-persistent-volume-claim-status
  "
  replace status of the specified PersistentVolumeClaim"
  ([name namespace body ] (replace-core-v1-namespaced-persistent-volume-claim-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-persistent-volume-claim-status-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-pod-with-http-info
  "
  replace the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-pod
  "
  replace the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-pod-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-pod-ephemeralcontainers-with-http-info
  "
  replace ephemeralcontainers of the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/ephemeralcontainers" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-pod-ephemeralcontainers
  "
  replace ephemeralcontainers of the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod-ephemeralcontainers name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-pod-ephemeralcontainers-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-pod-status-with-http-info
  "
  replace status of the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/pods/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-pod-status
  "
  replace status of the specified Pod"
  ([name namespace body ] (replace-core-v1-namespaced-pod-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-pod-status-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-pod-template-with-http-info
  "
  replace the specified PodTemplate"
  ([name namespace body ] (replace-core-v1-namespaced-pod-template-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/podtemplates/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-pod-template
  "
  replace the specified PodTemplate"
  ([name namespace body ] (replace-core-v1-namespaced-pod-template name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-pod-template-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-replication-controller-with-http-info
  "
  replace the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-replication-controller
  "
  replace the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-replication-controller-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-replication-controller-scale-with-http-info
  "
  replace scale of the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller-scale-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-replication-controller-scale
  "
  replace scale of the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller-scale name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-replication-controller-scale-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-replication-controller-status-with-http-info
  "
  replace status of the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-replication-controller-status
  "
  replace status of the specified ReplicationController"
  ([name namespace body ] (replace-core-v1-namespaced-replication-controller-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-replication-controller-status-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-resource-quota-with-http-info
  "
  replace the specified ResourceQuota"
  ([name namespace body ] (replace-core-v1-namespaced-resource-quota-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-resource-quota
  "
  replace the specified ResourceQuota"
  ([name namespace body ] (replace-core-v1-namespaced-resource-quota name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-resource-quota-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-resource-quota-status-with-http-info
  "
  replace status of the specified ResourceQuota"
  ([name namespace body ] (replace-core-v1-namespaced-resource-quota-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/resourcequotas/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-resource-quota-status
  "
  replace status of the specified ResourceQuota"
  ([name namespace body ] (replace-core-v1-namespaced-resource-quota-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-resource-quota-status-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-secret-with-http-info
  "
  replace the specified Secret"
  ([name namespace body ] (replace-core-v1-namespaced-secret-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/secrets/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-secret
  "
  replace the specified Secret"
  ([name namespace body ] (replace-core-v1-namespaced-secret name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-secret-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-service-with-http-info
  "
  replace the specified Service"
  ([name namespace body ] (replace-core-v1-namespaced-service-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-service
  "
  replace the specified Service"
  ([name namespace body ] (replace-core-v1-namespaced-service name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-service-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-service-account-with-http-info
  "
  replace the specified ServiceAccount"
  ([name namespace body ] (replace-core-v1-namespaced-service-account-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/serviceaccounts/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-service-account
  "
  replace the specified ServiceAccount"
  ([name namespace body ] (replace-core-v1-namespaced-service-account name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-service-account-with-http-info name namespace body optional-params))))

(defn replace-core-v1-namespaced-service-status-with-http-info
  "
  replace status of the specified Service"
  ([name namespace body ] (replace-core-v1-namespaced-service-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/namespaces/{namespace}/services/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-namespaced-service-status
  "
  replace status of the specified Service"
  ([name namespace body ] (replace-core-v1-namespaced-service-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-core-v1-namespaced-service-status-with-http-info name namespace body optional-params))))

(defn replace-core-v1-node-with-http-info
  "
  replace the specified Node"
  ([name body ] (replace-core-v1-node-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/nodes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-node
  "
  replace the specified Node"
  ([name body ] (replace-core-v1-node name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-node-with-http-info name body optional-params))))

(defn replace-core-v1-node-status-with-http-info
  "
  replace status of the specified Node"
  ([name body ] (replace-core-v1-node-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/nodes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-node-status
  "
  replace status of the specified Node"
  ([name body ] (replace-core-v1-node-status name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-node-status-with-http-info name body optional-params))))

(defn replace-core-v1-persistent-volume-with-http-info
  "
  replace the specified PersistentVolume"
  ([name body ] (replace-core-v1-persistent-volume-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/persistentvolumes/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-persistent-volume
  "
  replace the specified PersistentVolume"
  ([name body ] (replace-core-v1-persistent-volume name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-persistent-volume-with-http-info name body optional-params))))

(defn replace-core-v1-persistent-volume-status-with-http-info
  "
  replace status of the specified PersistentVolume"
  ([name body ] (replace-core-v1-persistent-volume-status-with-http-info name body nil))
  ([name body {:keys [pretty dry-run field-manager field-validation ]}]
   (call-api "/api/v1/persistentvolumes/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "dryRun" dry-run "fieldManager" field-manager "fieldValidation" field-validation }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken"]})))

(defn replace-core-v1-persistent-volume-status
  "
  replace status of the specified PersistentVolume"
  ([name body ] (replace-core-v1-persistent-volume-status name body nil))
  ([name body optional-params]
   (:data (replace-core-v1-persistent-volume-status-with-http-info name body optional-params))))

(defn watch-core-v1-config-map-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ConfigMap. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-config-map-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/configmaps" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-config-map-list-for-all-namespaces
  "
  watch individual changes to a list of ConfigMap. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-config-map-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-config-map-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-endpoints-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Endpoints. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-endpoints-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/endpoints" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-endpoints-list-for-all-namespaces
  "
  watch individual changes to a list of Endpoints. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-endpoints-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-endpoints-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-event-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-event-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/events" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-event-list-for-all-namespaces
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-event-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-event-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-limit-range-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of LimitRange. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-limit-range-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/limitranges" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-limit-range-list-for-all-namespaces
  "
  watch individual changes to a list of LimitRange. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-limit-range-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-limit-range-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-namespace-with-http-info
  "
  watch changes to an object of kind Namespace. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-namespace-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespace
  "
  watch changes to an object of kind Namespace. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-namespace name nil))
  ([name optional-params]
   (:data (watch-core-v1-namespace-with-http-info name optional-params))))

(defn watch-core-v1-namespace-list-with-http-info
  "
  watch individual changes to a list of Namespace. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-namespace-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespace-list
  "
  watch individual changes to a list of Namespace. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-namespace-list nil))
  ([optional-params]
   (:data (watch-core-v1-namespace-list-with-http-info optional-params))))

(defn watch-core-v1-namespaced-config-map-with-http-info
  "
  watch changes to an object of kind ConfigMap. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-config-map-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/configmaps/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-config-map
  "
  watch changes to an object of kind ConfigMap. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-config-map name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-config-map-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-config-map-list-with-http-info
  "
  watch individual changes to a list of ConfigMap. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-config-map-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/configmaps" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-config-map-list
  "
  watch individual changes to a list of ConfigMap. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-config-map-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-config-map-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-endpoints-with-http-info
  "
  watch changes to an object of kind Endpoints. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-endpoints-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/endpoints/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-endpoints
  "
  watch changes to an object of kind Endpoints. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-endpoints name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-endpoints-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-endpoints-list-with-http-info
  "
  watch individual changes to a list of Endpoints. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-endpoints-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/endpoints" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-endpoints-list
  "
  watch individual changes to a list of Endpoints. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-endpoints-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-endpoints-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-event-with-http-info
  "
  watch changes to an object of kind Event. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-event-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/events/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-event
  "
  watch changes to an object of kind Event. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-event name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-event-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-event-list-with-http-info
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-event-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/events" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-event-list
  "
  watch individual changes to a list of Event. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-event-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-event-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-limit-range-with-http-info
  "
  watch changes to an object of kind LimitRange. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-limit-range-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/limitranges/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-limit-range
  "
  watch changes to an object of kind LimitRange. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-limit-range name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-limit-range-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-limit-range-list-with-http-info
  "
  watch individual changes to a list of LimitRange. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-limit-range-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/limitranges" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-limit-range-list
  "
  watch individual changes to a list of LimitRange. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-limit-range-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-limit-range-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-persistent-volume-claim-with-http-info
  "
  watch changes to an object of kind PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/persistentvolumeclaims/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-persistent-volume-claim
  "
  watch changes to an object of kind PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-persistent-volume-claim name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-persistent-volume-claim-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-persistent-volume-claim-list-with-http-info
  "
  watch individual changes to a list of PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-persistent-volume-claim-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/persistentvolumeclaims" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-persistent-volume-claim-list
  "
  watch individual changes to a list of PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-persistent-volume-claim-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-persistent-volume-claim-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-pod-with-http-info
  "
  watch changes to an object of kind Pod. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-pod-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/pods/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-pod
  "
  watch changes to an object of kind Pod. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-pod name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-pod-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-pod-list-with-http-info
  "
  watch individual changes to a list of Pod. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-pod-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/pods" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-pod-list
  "
  watch individual changes to a list of Pod. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-pod-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-pod-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-pod-template-with-http-info
  "
  watch changes to an object of kind PodTemplate. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-pod-template-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/podtemplates/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-pod-template
  "
  watch changes to an object of kind PodTemplate. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-pod-template name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-pod-template-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-pod-template-list-with-http-info
  "
  watch individual changes to a list of PodTemplate. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-pod-template-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/podtemplates" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-pod-template-list
  "
  watch individual changes to a list of PodTemplate. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-pod-template-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-pod-template-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-replication-controller-with-http-info
  "
  watch changes to an object of kind ReplicationController. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-replication-controller-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/replicationcontrollers/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-replication-controller
  "
  watch changes to an object of kind ReplicationController. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-replication-controller name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-replication-controller-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-replication-controller-list-with-http-info
  "
  watch individual changes to a list of ReplicationController. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-replication-controller-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/replicationcontrollers" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-replication-controller-list
  "
  watch individual changes to a list of ReplicationController. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-replication-controller-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-replication-controller-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-resource-quota-with-http-info
  "
  watch changes to an object of kind ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-resource-quota-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/resourcequotas/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-resource-quota
  "
  watch changes to an object of kind ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-resource-quota name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-resource-quota-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-resource-quota-list-with-http-info
  "
  watch individual changes to a list of ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-resource-quota-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/resourcequotas" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-resource-quota-list
  "
  watch individual changes to a list of ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-resource-quota-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-resource-quota-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-secret-with-http-info
  "
  watch changes to an object of kind Secret. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-secret-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/secrets/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-secret
  "
  watch changes to an object of kind Secret. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-secret name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-secret-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-secret-list-with-http-info
  "
  watch individual changes to a list of Secret. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-secret-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/secrets" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-secret-list
  "
  watch individual changes to a list of Secret. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-secret-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-secret-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-service-with-http-info
  "
  watch changes to an object of kind Service. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-service-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/services/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-service
  "
  watch changes to an object of kind Service. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-service name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-service-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-service-account-with-http-info
  "
  watch changes to an object of kind ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-service-account-with-http-info name namespace nil))
  ([name namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/serviceaccounts/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-service-account
  "
  watch changes to an object of kind ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name namespace ] (watch-core-v1-namespaced-service-account name namespace nil))
  ([name namespace optional-params]
   (:data (watch-core-v1-namespaced-service-account-with-http-info name namespace optional-params))))

(defn watch-core-v1-namespaced-service-account-list-with-http-info
  "
  watch individual changes to a list of ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-service-account-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/serviceaccounts" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-service-account-list
  "
  watch individual changes to a list of ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-service-account-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-service-account-list-with-http-info namespace optional-params))))

(defn watch-core-v1-namespaced-service-list-with-http-info
  "
  watch individual changes to a list of Service. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-service-list-with-http-info namespace nil))
  ([namespace {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/namespaces/{namespace}/services" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-namespaced-service-list
  "
  watch individual changes to a list of Service. deprecated: use the 'watch' parameter with a list operation instead."
  ([namespace ] (watch-core-v1-namespaced-service-list namespace nil))
  ([namespace optional-params]
   (:data (watch-core-v1-namespaced-service-list-with-http-info namespace optional-params))))

(defn watch-core-v1-node-with-http-info
  "
  watch changes to an object of kind Node. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-node-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/nodes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-node
  "
  watch changes to an object of kind Node. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-node name nil))
  ([name optional-params]
   (:data (watch-core-v1-node-with-http-info name optional-params))))

(defn watch-core-v1-node-list-with-http-info
  "
  watch individual changes to a list of Node. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-node-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/nodes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-node-list
  "
  watch individual changes to a list of Node. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-node-list nil))
  ([optional-params]
   (:data (watch-core-v1-node-list-with-http-info optional-params))))

(defn watch-core-v1-persistent-volume-with-http-info
  "
  watch changes to an object of kind PersistentVolume. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-persistent-volume-with-http-info name nil))
  ([name {:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/persistentvolumes/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-persistent-volume
  "
  watch changes to an object of kind PersistentVolume. deprecated: use the 'watch' parameter with a list operation instead, filtered to a single item with the 'fieldSelector' parameter."
  ([name ] (watch-core-v1-persistent-volume name nil))
  ([name optional-params]
   (:data (watch-core-v1-persistent-volume-with-http-info name optional-params))))

(defn watch-core-v1-persistent-volume-claim-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-persistent-volume-claim-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/persistentvolumeclaims" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-persistent-volume-claim-list-for-all-namespaces
  "
  watch individual changes to a list of PersistentVolumeClaim. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-persistent-volume-claim-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-persistent-volume-claim-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-persistent-volume-list-with-http-info
  "
  watch individual changes to a list of PersistentVolume. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-persistent-volume-list-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/persistentvolumes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-persistent-volume-list
  "
  watch individual changes to a list of PersistentVolume. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-persistent-volume-list nil))
  ([optional-params]
   (:data (watch-core-v1-persistent-volume-list-with-http-info optional-params))))

(defn watch-core-v1-pod-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Pod. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-pod-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/pods" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-pod-list-for-all-namespaces
  "
  watch individual changes to a list of Pod. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-pod-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-pod-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-pod-template-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of PodTemplate. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-pod-template-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/podtemplates" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-pod-template-list-for-all-namespaces
  "
  watch individual changes to a list of PodTemplate. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-pod-template-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-pod-template-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-replication-controller-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ReplicationController. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-replication-controller-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/replicationcontrollers" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-replication-controller-list-for-all-namespaces
  "
  watch individual changes to a list of ReplicationController. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-replication-controller-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-replication-controller-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-resource-quota-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-resource-quota-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/resourcequotas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-resource-quota-list-for-all-namespaces
  "
  watch individual changes to a list of ResourceQuota. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-resource-quota-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-resource-quota-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-secret-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Secret. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-secret-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/secrets" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-secret-list-for-all-namespaces
  "
  watch individual changes to a list of Secret. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-secret-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-secret-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-service-account-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-service-account-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/serviceaccounts" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-service-account-list-for-all-namespaces
  "
  watch individual changes to a list of ServiceAccount. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-service-account-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-service-account-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-core-v1-service-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Service. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-service-list-for-all-namespaces-with-http-info nil))
  ([{:keys [allow-watch-bookmarks continue field-selector label-selector limit pretty resource-version resource-version-match send-initial-events timeout-seconds watch ]}]
   (call-api "/api/v1/watch/services" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"allowWatchBookmarks" allow-watch-bookmarks "continue" continue "fieldSelector" field-selector "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "resourceVersionMatch" resource-version-match "sendInitialEvents" send-initial-events "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken"]})))

(defn watch-core-v1-service-list-for-all-namespaces
  "
  watch individual changes to a list of Service. deprecated: use the 'watch' parameter with a list operation instead."
  ([] (watch-core-v1-service-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-core-v1-service-list-for-all-namespaces-with-http-info optional-params))))

