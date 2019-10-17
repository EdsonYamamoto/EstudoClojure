(ns first-project.testes.types
				(:gen-class)
)
(defn ObjectTypes []
	; Clojure uses Java's object types for booleans, strings and numbers.
	; Use `class` to inspect them.
	(println (class 1) ) ; Integer literals are java.lang.Long by default
	(println (class 1.) ); Float literals are java.lang.Double
	(println (class "") ); Strings always double-quoted, and are java.lang.String
	(println (class false) ) ; Booleans are java.lang.Boolean
	(println (class nil) ); The "null" value is called nil

	; If you want to create a literal list of data, use ' to stop it from
	; being evaluated
	(println '(+ 1 2) ) ; => (+ 1 2)
	; (shorthand for (quote (+ 1 2)))

	; You can eval a quoted list
	(println (eval '(+ 1 2)) ) ; => 3
)
