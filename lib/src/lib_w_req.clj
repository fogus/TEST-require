(ns lib-w-req
  (:require lib.support))

(defmacro lib-macro [& args]
  (#'lib.support/do-macro-support args))
