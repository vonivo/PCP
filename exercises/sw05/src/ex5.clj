(defn diskriminante [a b c] (- (* b b) (* 4 a c)))

; a)
(defn mitternacht-solvable [a b c] (and (not= a 0) (>= (diskriminante a b c) 0)))
(mitternacht-solvable 1 5 2)

; b)
(defn solution-count [a b c] (cond
                               (not (mitternacht-solvable a b c)) 0
                               (zero? (Math/sqrt (diskriminante a b c))) 1
                               :else 2))
(solution-count 1 2 3)
(solution-count 1 2 1)
(solution-count 1 0 -4)

; c)
(defn mitternacht [a b c] (cond
                            (not (mitternacht-solvable a b c)) []
                            (== (Math/sqrt (diskriminante a b c)) 0) [(/ (- b) (* 2 a))]
                            :else [
                                   (/ (+ (- b) (Math/sqrt (diskriminante a b c))) (* 2 a))
                                   (/ (- (- b) (Math/sqrt (diskriminante a b c))) (* 2 a))
                                   ]))
(mitternacht 1 2 3)
(mitternacht 1 2 1)
(mitternacht 1 0 -4)