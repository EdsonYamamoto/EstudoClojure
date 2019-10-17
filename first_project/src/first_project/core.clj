(ns first-project.core
    (:gen-class) 

    (:use [first-project.testes.matematica])
    (:use [first-project.testes.types])
    (:use [first-project.testes.collectionssequences])
    (:use [first-project.testes.funcao])
)

(defn -main [& args]
	(println "Hello World")

	(CalculosMatematicos)
	(ObjectTypes)
	(ColSeq)


	
)
