(ns cogset-common.template-test
  (:require [clojure.test :refer :all]
            [cogset-common.template :refer :all]))

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

(deftest test-load-template-existence
  "Check that the cogset-common.template/load-template definition exists."
  (testing "if the cogset-common.template/load-template definition exists."
           (is (callable? 'cogset-common.template/load-template))))


(deftest test-eval-template-existence
  "Check that the cogset-common.template/eval-template definition exists."
  (testing "if the cogset-common.template/eval-template definition exists."
           (is (callable? 'cogset-common.template/eval-template))))

