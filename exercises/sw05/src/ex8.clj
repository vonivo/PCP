; a)
(defn sum-range [a b]
  (if (>= b a)
    (+ b (sum-range a (dec b)))
    0))

(sum-range 1 5)
(sum-range 3 9)

; b)
(defn sum-square [a b]
  (if (>= b a)
    (+ (* b b) (sum-square a (dec b)))
    0))
(sum-square 1 4)