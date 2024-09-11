(ns app)

(comment
  ;; fail
  (require '[lib :as lib])

  ;; succeed
  (require '[lib-w-req :as lib])
)

(defn frobnicate []
  (lib/lib-macro 1 2 3))

(comment
  (frobnicate)
)
