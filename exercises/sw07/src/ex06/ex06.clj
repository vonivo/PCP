(ns ex06.ex06
  (:require [ex06.parser :refer [parse]])
  (:import [ex06.parser Op Val]))

; Beispiel: Baum für (2+3) * 4
(def expr1 (Op. * (Op. + (Val. 2) (Val. 3)) (Val. 4)))

; Beispiel: Baum für (2+3) * 4, aber mit parse
(def expr2 (parse "(2+3) * 4"))

(= expr1 expr2) ; sollte true ergeben

; ------------------------------------------------
; TODO - Implementieren Sie die Funktion eval-expr
; 
; Tipp: Im Input wurde gezeigt, wie man nach Typ
; verzweigen kann (Folie 20)
; 
; In dieser Aufgabe brauchen Sie nur die Typen
; Op und Val. Sie können davon ausgehen, dass
; nur mit Ganzahlen gerechnet wird, die Division
; ist also auch immer ganzzahlig.
; ------------------------------------------------



(defn eval-expr [expr]
  (cond
    (instance? Val expr) (:value expr)
    (instance? Op  expr) (let [left-side  (eval-expr (:left expr))
                               right-side (eval-expr (:right expr))]
                           ((:op expr) left-side right-side))))

; ------------------------------------------------
; TODO: Compilieren Sie eine Expression für unsere
; Stackmaschine aus der letzten Übung
; ------------------------------------------------
(defn compile-expr [expr]
  (cond
    (instance? Val expr) [(str "LOAD " (:value expr))]
    (instance? Op  expr) (concat
                          (compile-expr (:left expr))
                          (compile-expr (:right expr))
                          [(cond
                             (= (:op expr) *) "MUL"
                             (= (:op expr) +) "ADD"
                             (= (:op expr) -) "SUB"
                             (= (:op expr) /) "DIV")])))

(compile-expr (Val. 4))
(compile-expr (Op. + (Op. * (Val. 2) (Op. - (Val. 4) (Val. 2))) (Op. / (Val. 6) (Val. 3))))
(compile-expr (Op. * (Op. + (Val. 2) (Val. 3)) (Val. 4)))

; ------------------------------------------------
; TODO: Testen Sie an einem Ausdruck, ob die
; Stack-Maschine das gleiche Ergebnis liefert
; wie die eval-expr-Funktion
; ------------------------------------------------

; (run-program (compile-expr ...))



; -------------------- a) --------------------------
;                       +
;                   /       \ 
;                  *         /
;                /  \      /   \
;               2    -    6     3
;                  /   \
;                 4     2


; -------------------- b) --------------------------
(def exprB (Op. + (Op. * (Val. 2) (Op. - (Val. 4) (Val. 2))) (Op. / (Val. 6) (Val. 3))))
(= exprB (parse "2 * (4-2) + (6/3)"))
(parse "2 * (4-2) + (6/3)")
(eval-expr exprB)