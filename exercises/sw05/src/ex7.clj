; a)
(def chf-2-euro-rate 1.08)
(defn chf-2-euro [chf] (* chf chf-2-euro-rate))

(chf-2-euro 20)

; b)
(defn celsius-to-fahrenheit [clesius]
  (+ (* clesius (/ 9.0 5)) 32))

(celsius-to-fahrenheit 5)

; c)
(defn scale [x1 x2 y1 y2 x]
  (+ y1 (* (/ (- y2 y1) (- x2 x1)) (- x x1))))

; y = ax + b -> a = (y2 - y1)/(x2 - x1); b = (x - x1)
(scale 0.0 100.0 32.0 212.0 100.0)