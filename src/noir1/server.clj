(ns noir1.server
  (:require [noir.server :as server]))

(server/load-views-ns 'noir1.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "9090"))]
    (server/start port {:mode mode
                        :ns 'noir1})))

