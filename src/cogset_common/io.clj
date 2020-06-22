;
;  (C) Copyright 2017, 2020  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

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

