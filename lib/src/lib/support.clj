(ns lib.support
  (:require [clojure.edn :as edn]))

(defn do-macro-support [s]
  (edn/read-string (first s)))
