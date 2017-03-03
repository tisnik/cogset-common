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

