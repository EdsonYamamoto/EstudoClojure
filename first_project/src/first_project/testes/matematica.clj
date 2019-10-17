(ns first-project.testes.matematica
    (:gen-class) 
)
(defn CalculosMatematicos []
				
	; Math is straightforward
	(println (+ 1 1) ); => 2
	(println (- 2 1) ) ; => 1
	(println (* 1 2) ) ; => 2
	(println (/ 2 1) ) ; => 2

	; Equality is =
	(println (= 1 1) ) ; => true
	(println (= 2 1) ) ; => false

	; You need not for logic, too
	(println (not true) ) ; => false

	; Nesting forms works as you expect
	(println (+ 1 (- 3 2)) ) ; = 1 + (3 - 2) => 2

)