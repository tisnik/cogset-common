(ns cogset-common.template)

; simple templating engine
(require '[comb.template :as comb-template])

(require '[cogset-common.io :as io])

(defn load-template
    [filename template-var]
    (reset! template-var (io/slurp- filename))
    @template-var)

(defn eval-template
    [template-page template-data]
    (comb-template/eval @template-page template-data))

