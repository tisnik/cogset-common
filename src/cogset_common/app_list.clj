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

(ns cogset-common.app-list)

(require '[cogset-common.io :as io])

(declare app-list)

(defn load-app-list
    [filename]
    (let [al (io/load-text filename)]
         (def app-list al)
         app-list))

(defn filter-app
    [app-name]
    (some #{app-name} app-list))

(defn read-app-list
    []
    (let [cwd         (System/getProperty "user.dir")
          dirinfo     (new java.io.File (str cwd "/src"))
          filelist    (.listFiles dirinfo)
          al          (->> filelist
                          (filter #(.isDirectory %))
                          (map #(.getPath %))
                          (map #(subs % (inc (.lastIndexOf % "/"))))
                          (remove #{"interface" "cogset"})
                          (map #(.replaceAll % "_" "-")))]
         (def app-list al)
         app-list))

