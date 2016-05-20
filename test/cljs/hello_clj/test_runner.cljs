(ns hello-clj.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [hello-clj.core-test]))

(enable-console-print!)

(doo-tests 'hello-clj.core-test)
