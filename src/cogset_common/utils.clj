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

(ns cogset-common.utils)

(defn third
  [x]
  (nth x 2))

(defn api-endpoint?
  [request]
  (let [uri   (:uri request)
        parts (.split uri "/")]
    (= (last parts) "api")))

