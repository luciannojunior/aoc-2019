(ns aoc-2019.core
  (:require [aoc-2019.day1 :as day1])
  (:gen-class))

(def funcoes (hash-map :1 day1/run))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [day (first args)] 
    (println (str "Running the code for day " (first args)))
    (((keyword day) funcoes))))
    
    

  
