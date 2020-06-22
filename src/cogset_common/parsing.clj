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

(ns cogset-common.parsing)

(require '[clojure.tools.logging :as log])

(defn parse-int
    [string-value]
    (try
        (Integer/parseInt string-value)
        (catch Exception e
            (log/error (.getMessage e))
            nil)))

