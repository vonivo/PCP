(take 10 (iterate (partial * 2) 2))

(take 10 (iterate (partial * 3) 3))

(take 10 (iterate #(+ (* 2 %) 1) 1))

(take 10 (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))