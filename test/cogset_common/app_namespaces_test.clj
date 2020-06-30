(ns cogset-common.app-namespaces-test
  (:require [clojure.test :refer :all]
            [cogset-common.app-namespaces :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
  "Test if given function-name is bound to the real function."
  [function-name]
  (clojure.test/function? function-name))

;
; Tests for function existence
;

(deftest test-get-app-namespaces-existence
  "Check that the cogset-common.app-namespaces/get-app-namespaces definition exists."
  (testing
    "if the cogset-common.app-namespaces/get-app-namespaces definition exists."
    (is (callable? 'cogset-common.app-namespaces/get-app-namespaces))))


(deftest test-load-selected-namespace-existence
  "Check that the cogset-common.app-namespaces/load-selected-namespace definition exists."
  (testing
    "if the cogset-common.app-namespaces/load-selected-namespace definition exists."
    (is (callable? 'cogset-common.app-namespaces/load-selected-namespace))))


(deftest test-load-app-namespaces-existence
  "Check that the cogset-common.app-namespaces/load-app-namespaces definition exists."
  (testing
    "if the cogset-common.app-namespaces/load-app-namespaces definition exists."
    (is (callable? 'cogset-common.app-namespaces/load-app-namespaces))))

