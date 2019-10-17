(ns first-project.testes.geometry
				(:gen-class)
)


(defn TestandoGeometry []

				(defn Circle [radius])
				(defn Square [length width])

				;; multimethod to calculate the area of a shape
				(defmulti area class)

				(defmethod area Circle [c]
				    (* Math/PI (* (.radius c) (.radius c))))

				(defmethod area Square [s]
    (* (.length s) (.width s)))

				(def myCircle (Circle. 10))
				(def mySquare (Square. 5 11))

				(area myCircle)
				(area mySquare)
)