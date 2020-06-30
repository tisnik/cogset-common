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

