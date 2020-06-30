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

(ns cogset-common.app-namespaces)

(require '[clojure.tools.logging :as log])

(defn get-app-namespaces
  [namespaces module-name]
  (->> namespaces
       (map #(str % "." module-name))
       (map symbol)))

(defn load-selected-namespace
  [namespace]
  (try (log/info "Loading namespace" namespace)
       (require namespace)
       (catch java.io.FileNotFoundException e
         (log/error (str "Unable to load application " namespace))
         (log/error "Please read README.md how to add app properly")
         (System/exit 1))))

(defn load-app-namespaces
  [namespace-names module-names]
  (doseq [module-name module-names]
    (doseq [namespace (get-app-namespaces namespace-names module-name)]
      (load-selected-namespace namespace))))

