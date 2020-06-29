(ns cogset-common.response-test
  (:require [clojure.test :refer :all]
            [cogset-common.response :refer :all]))

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

(deftest test-send-json-response-existence
    "Check that the cogset-common.response/send-json-response definition exists."
    (testing "if the cogset-common.response/send-json-response definition exists."
        (is (callable? 'cogset-common.response/send-json-response))))


(deftest test-send-html-response-existence
    "Check that the cogset-common.response/send-html-response definition exists."
    (testing "if the cogset-common.response/send-html-response definition exists."
        (is (callable? 'cogset-common.response/send-html-response))))


(deftest test-send-error-response-existence
    "Check that the cogset-common.response/send-error-response definition exists."
    (testing "if the cogset-common.response/send-error-response definition exists."
        (is (callable? 'cogset-common.response/send-error-response))))

