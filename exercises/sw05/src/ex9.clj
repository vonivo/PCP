(defn x [n]
  (when (> n 1)
    (println n)
    (if (zero? (rem n 2))
      (x (/ n 2))
      (x (+ (* 3 n) 1)))))

(x 3)
(x 7)