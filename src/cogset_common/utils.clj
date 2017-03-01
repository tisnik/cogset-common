(ns cogset-common.utils)

(defn third
    [x]
    (nth x 2))

(defn api-endpoint?
    [request]
    (let [uri   (:uri request)
          parts (.split uri "/")]
          (= (last parts) "api")))

