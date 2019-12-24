(ns aoc-2019.day1 (:require [aoc-2019.util :as util]))

(defn fuel-needed "Calcutes the needed fuel based on the mass" [mass]
  (->>
    mass
    (#(/ % 3))
    Math/floor
    int
    (#(- % 2))))

(defn run "This functions just fetches the input file and process it accordingly" []
    (->> (util/file->vec "1.txt")
         (map fuel-needed)
         (reduce +)
         println))

         
         
    
