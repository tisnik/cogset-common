(ns cogset-common.io)

(require '[clojure.tools.logging :as log])

(defn slurp-
    [filename]
    (try
        (slurp filename)
        (catch Exception e
            (log/error (.getMessage e))
            nil)))

(defn load-text
    [filename]
    (try
        (-> (slurp filename)
            (clojure.string/split-lines))
        (catch Exception e
            (log/error (.getMessage e))
            nil)))

(defn load-and-parse-text
    [filename parse-function]
    (if-let [lines (load-text filename)]
             (into {}
                 (for [line lines]
                     (parse-function line)))))

