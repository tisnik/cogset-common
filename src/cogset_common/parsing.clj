(ns cogset-common.parsing)

(require '[clojure.tools.logging :as log])

(defn parse-int
    [string-value]
    (try
        (Integer/parseInt string-value)
        (catch Exception e
            (log/error (.getMessage e))
            nil)))

