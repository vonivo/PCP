; a)
(def temperatur 37)

(cond
  (> temperatur 35) "heiss"
  (> temperatur 25) "warm"
  (> temperatur 15) "mittel"
  :else "kalt")

; Nein die Reihenfolge darf nicht vertauscht werden
; Clojure nimmt die erste Matching Condition -> early-return

; b)
(def zahl 6)
(cond
  (zero? (rem zahl 2)) "durch 2 teilbar"
  (zero? (rem zahl 3)) "durch 3 teilbar"
  :else "weder durch 2 noch durch 3 teilbar")
; Die Reihenfolge darf auch nicht geändert werden, da 
; die Conditions nicht gegenseitig ausshliessbar sind.

; c)
(if (> temperatur 35)
  "heiss"
  (if (> temperatur 25)
    "warm"
    (if (> temperatur 15)
      "mittel"
      "kalt")))

; d)
; Nein das funktioniert nicht, da case auf Werte-Gleicheit
; überprüft wir aber bei a) eine Bereich haben und bei b) sich der
; Teiler verändert.