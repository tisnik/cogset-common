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

(defproject org.clojars.tisnik/cogset-common "0.6.0-SNAPSHOT"
  :description "Common functions used by the cogset"
  :url "https://github.com/tisnik/cogset-common"
  :license {:name "Eclipse Public License",
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.json "0.2.5"]
                 [clj-http "2.0.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ring/ring-core "1.3.2"]
                 [log4j/log4j "1.2.17" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jmdk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [comb "0.1.0"]
                 [org.slf4j/slf4j-log4j12 "1.6.6"]]
  :plugins [[test2junit "1.1.0"]
            [codox "0.8.11"]
            [lein-cloverage "1.0.6"]]
  :main ^:skip-aot cogset-common.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
