(ns first-project.core
  (:gen-class))

(deftype Circle [radius])
(deftype Square [length width])

;; multimethod to calculate the area of a shape
(defmulti area class)
(defmethod area Circle [c]
           (* Math/PI (* (.radius c) (.radius c))))
(defmethod area Square [s]
           (* (.length s) (.width s)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "teste")

      ;; Criando uma funcao
      ;;    nome   param  body
      (defn greet [name]
            (str "Hello ", name)
      )
      ;; Executando uma funcao
  (println (greet "student"))

      ;; create a couple shapes and get their area
      (def myCircle (Circle. 10))
      (def mySquare (Square. 5 11))

      (println (area myCircle))
      (println (area mySquare))
)