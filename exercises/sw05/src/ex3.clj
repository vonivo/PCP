; a)
(type (+ (* 2 3) (/ 3 4)))
; berechnet (2 * 3) + (3/4) = 27/4
; liefert 'clojure.lang.Ratio' 

; b)
(+ - * /)
; -> Execution error ClassCastException
; die Symbole - * / können nicht in Numbers umgewandet werden für die Addition

; c)
'(+ - * /)
; Ausgabe: (+ - * /)
; liefert clojure.lang.PersistentList

; d)
(str 1.0 2 true)
; Ausgabe "1.02true"
; liefert java.lang.String

; e)
(+ (parse-long "123") (parse-double "0.45"))
; Berechnet 123 + 0.45 => 123.45
; liefert java.lang.Double

; f)
(or "this" "is" "crazy")
; Ausgabe: this
; liefert java.lang.String

; g)
(and "this" "is" "crazy")
; Ausgabe: crazy
; liefert java.lang.String

; h)
(not "this" "is" "crazy")
; Execution error (ArityException)
; Da zu viele Argumente

; i)
((fn [x] (/ 1 x)) (/ 5 2))
; 5/2
; Type: clojure.lang.Ratio
; Lambda wird durch die äusseren Klammern direkt ausgeführt

; j)
(int? 3000000000)
; true
; java.lang.Boolean