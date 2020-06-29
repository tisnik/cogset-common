(ns cogset-common.app-list-test
  (:require [clojure.test :refer :all]
            [cogset-common.app-list :refer :all]))

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

(deftest test-load-app-list-existence
    "Check that the cogset-common.app-list/load-app-list definition exists."
    (testing "if the cogset-common.app-list/load-app-list definition exists."
        (is (callable? 'cogset-common.app-list/load-app-list))))


(deftest test-filter-app-existence
    "Check that the cogset-common.app-list/filter-app definition exists."
    (testing "if the cogset-common.app-list/filter-app definition exists."
        (is (callable? 'cogset-common.app-list/filter-app))))


(deftest test-read-app-list-existence
    "Check that the cogset-common.app-list/read-app-list definition exists."
    (testing "if the cogset-common.app-list/read-app-list definition exists."
        (is (callable? 'cogset-common.app-list/read-app-list))))

