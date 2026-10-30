; a)
(def length 4)
(def width 3)

(defn area [width length] (* width length))
(area length, width)

(defn line-length [width length] (+ (* 2 width) (* 2 length)))
(line-length length, width)

(defn hypot [width length] (Math/sqrt (+ (* width width) (* length length))))
(hypot length, width)

; b)
(def height 10)
(defn volume [width length height] (* width height length))
(volume width length height)

(defn surface [width length height] (* 2 (+ (* length width) (* length height) (* width height))))
(surface width length height)