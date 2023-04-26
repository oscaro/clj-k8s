(ns test-helper
  (:require [clj-k8s.api :as k]
            [clojure.walk :as w]
            [kubernetes.core :as kc])
  (:import (java.util.concurrent TimeUnit)
           (java.util UUID)))

(def ^:dynamic *namespace* nil)

(defn with-context
  "Fixture for initializing the k8s context"
  ([f] (with-context false f))
  ([debug? f]
   (let [ctx (cond-> (k/mk-client)
               debug? (assoc :debug true))]
     (k/with-api-context ctx
       (f)))))


(defn with-namespace
  "Fixture for creating a test namespace"
  [f]
  (binding [*namespace* (str "test-" (UUID/randomUUID))]
    (try
      (k/create-namespace *namespace*)
      (binding [kc/*api-context* (assoc kc/*api-context* :namespace *namespace*)]
        (f))
      (finally
        (k/delete-namespace *namespace*)))))


(def excludes
  [:creationTimestamp
   :deletionTimestamp
   :resourceVersion
   :uid])


(defn clean-response
  [r & more-excludes]
  (w/postwalk (fn [x] (if (map? x)
                       (apply dissoc x (concat excludes more-excludes))
                       x)) r))


(defn sleep-secs [secs] (.sleep TimeUnit/SECONDS secs))
(defn secs->nanos [secs] (.toNanos TimeUnit/SECONDS secs))
(defn now-nanos [] (System/nanoTime))
(defmacro wait-for
  "Invoke body every interval (default 1) seconds until it returns something truthy,
   or timeout (default 10) seconds have elapsed. E.g.:
       (wait-for #(< (rand) 0.2) :interval 1 :timeout 10)
   Returns nil if the timeout elapses before the predicate becomes true, otherwise
   the value of the predicate on its last evaluation."
  [body & {:keys [interval timeout] :or {interval 1 timeout 10}}]
  `(let [end-time# (+ (now-nanos) (secs->nanos ~timeout))]
     (loop []
       (if-let [result# ~body]
         result#
         (do
           (sleep-secs ~interval)
           (if (< (now-nanos) end-time#)
             (recur)))))))
