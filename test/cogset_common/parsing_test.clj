(ns cogset-common.parsing-test
  (:require [clojure.test :refer :all]
            [cogset-common.parsing :refer :all]))

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

(deftest test-parse-int-existence
    "Check that the cogset-common.parsing/parse-int definition exists."
    (testing "if the cogset-common.parsing/parse-int definition exists."
        (is (callable? 'cogset-common.parsing/parse-int))))

