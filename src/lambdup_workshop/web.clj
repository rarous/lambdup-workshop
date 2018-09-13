(ns lambdup-workshop.web
  (:require
    [ring.adapter.jetty :refer [run-jetty]]
    [ring.util.response :refer [response resource-response status-code header]]))

(defn handler [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello #lambdup!"})

(defn run-handler []
  (run-jetty handler {:port 3000}))

(defn handler [req]
  (->
    (response "Hello #lambdup!")
    (header "Content-Type" "text/plain")))
