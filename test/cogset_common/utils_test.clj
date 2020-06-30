(ns cogset-common.utils-test
  (:require [clojure.test :refer :all]
            [cogset-common.utils :refer :all]))

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

(deftest test-third-existence
  "Check that the cogset-common.utils/third definition exists."
  (testing "if the cogset-common.utils/third definition exists."
           (is (callable? 'cogset-common.utils/third))))


(deftest test-api-endpoint?-existence
  "Check that the cogset-common.utils/api-endpoint? definition exists."
  (testing "if the cogset-common.utils/api-endpoint? definition exists."
           (is (callable? 'cogset-common.utils/api-endpoint?))))

