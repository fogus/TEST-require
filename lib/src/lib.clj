(ns lib
  (:require [lib.support :as s] :when-providing-macros))

(comment
  (require 'lib.support :when-providing-macros)
)

(defmacro lib-macro [& args]
  (s/do-macro-support args))

(comment
  (lib-macro ":foo")
)
