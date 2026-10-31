(mapcat (fn [x] (map #(+ x %) (range 3))) (range 3))
(for [i (range 3)
      j (range 3)] (+ i j))

(map #(list % %) (filter #(== (mod % 3) 0) (range 10)))
(for [i (range 10)
      :when (== (mod i 3) 0)] (list i i))

(filter #(> (second %) (first %))
        (mapcat (fn [x] (map #(list x %) (range 4))) (range 4)))
(for [i (range 4)
      j (range 4)
      :when (> j i)] (list i j))