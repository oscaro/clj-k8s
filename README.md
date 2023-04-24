# clj-k8s [![Clojure With Minikube](https://github.com/oscaro/clj-k8s/actions/workflows/clojure.yml/badge.svg?branch=master)](https://github.com/oscaro/clj-k8s/actions/workflows/clojure.yml) [![Clojars Project](https://img.shields.io/clojars/v/com.oscaro/clj-k8s.svg)](https://clojars.org/com.oscaro/clj-k8s)


<a href="https://github.com/oscaro/clj-k8s"><img
  src="https://raw.githubusercontent.com/oscaro/clj-k8s/master/.github/logo.png?token=GHSAT0AAAAAABPEZ3KWWLL3OT6CE54XM4IQZCCXZVQ"
  height="180" align="right"></a>


A Clojure Wrapper for the [kubernetes](https://kubernetes.io/) API.

## API Usage

### Creating client instance

Client is modelized by a map, initialization function depend of your Kubernetes distribution.


```clojure
(ns test
  (:require [clj-k8s.auth :as ka]))

;; From ServiceAccount
(def client (ka/from-service-account))

;; From GKE
(def client (ka/from-gcp-kube-config))

;; From Env
(def client (ka/from-token))

;; The default & Generic way
(def client (ka/from-spec {:base-url "https://localhost:6443"
                           :token "eyGteo8o..."
                           :namespace "wilkins"}))
```

#### Special Notes
- For GKE, the `KUBECONFIG` env variable is honored and `~/.kube/config` used as fallback if path isn't set via argv.
- For environment variable, the `K8S_TOKEN` should be setup if not provided by argument

The Authentification method is subjected to change in the future, with a generic function for context resolving. We recommand using the `from-spec` method for the moment.

### Managing Kubernetes Objects

TBD

#### Namespaces

TBD

#### Pods

TBD

#### Jobs

TBD

#### Services

TBD

## Testing

### Setup Minikube

```bash
minikube start --driver=podman
```

### Create API Token

```bash
kubectl -n kube-system create serviceaccount toast
kubectl -n kube-system create clusterrolebinding toast-bind --clusterrole=cluster-admin --serviceaccount=kube-system:toast
export K8S_TOKEN=$(kubectl -n kube-system create token toast)
```

### Lauching tests

When token is properly exported, run tests as follow:

```
lein test
```

## License

Copyright © 2019-2023 Oscaro

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

[kubernetes]: https://kubernetes.io/
