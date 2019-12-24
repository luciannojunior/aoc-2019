(ns aoc-2019.core
  (:require [aoc-2019.day1 :as day1])
  (:gen-class))

(def functions (hash-map :1 day1/run))

(defn -main
  "I don't do a lot, but what I do is atmost important"
  [& args]
  (let [day (first args)] 
    (println (str "Running the code for day " (first args)))
    (((keyword day) functions))))
    
    

  
