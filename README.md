# clj-k8s [![Clojure With Minikube](https://github.com/oscaro/clj-k8s/actions/workflows/clojure.yml/badge.svg?branch=master)](https://github.com/oscaro/clj-k8s/actions/workflows/clojure.yml) 

<a href="https://github.com/oscaro/clj-k8s"><img
  src="https://raw.githubusercontent.com/oscaro/clj-k8s/master/.github/logo.png?token=GHSAT0AAAAAABPEZ3KWWLL3OT6CE54XM4IQZCCXZVQ"
  height="180" align="right"></a>


A Clojure Wrapper for the [kubernetes](https://kubernetes.io/) API.

## API Usage

### Creating client instance

### Managing Kubernetes Objects

#### Namespaces

#### Pods

#### Jobs

#### Services

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
