(ns aoc-2019.util)

(defn file->vec [filename]
  (vec (map #(Integer/parseInt %) (clojure.string/split (slurp filename) #"\n"))))
