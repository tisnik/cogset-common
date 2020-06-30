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

(ns cogset-common.response)

(require '[ring.util.response :as http-response])
(require '[clojure.data.json  :as json])

; HTTP codes used by several REST API responses
(def http-codes
  {:ok                    200,
   :bad-request           400,
   :not-found             404,
   :internal-server-error 500,
   :not-implemented       501})

(defn send-json-response
  "Send normal response (with application/json MIME type) back to the client."
  [response]
  (-> (http-response/response (json/write-str response))
      (http-response/content-type "application/json")))

(defn send-html-response
  "Send normal response (with text/html MIME type) back to the client."
  [response]
  (-> (http-response/response response)
      (http-response/content-type "text/html")))

(defn send-error-response
  "Send error response (with application/json MIME type) back to the client."
  [response http-code]
  (-> (http-response/response (json/write-str response))
      (http-response/content-type "application/json")
      (http-response/status (get http-codes http-code))))

