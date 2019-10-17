(ns first-project.model.pessoa)

(deftype Pessoa [])

(defmulti person class)

(defmethod person Pessoa []
    ;(* Math/PI (* (.radius c) (.radius c)))
)