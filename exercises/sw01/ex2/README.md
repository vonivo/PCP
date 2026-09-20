# Aufgabe C

*Man könnte für diesen Stack auch eine Operation clear definieren, welche den Stack leert.
Macht es Sinn, für diese C-Implementierung von einem Stack eine clear-Operation zu
implementieren? Begründen Sie ihre Antwort.*

Nein, das macht keinen Sinn. Der Code würde dann etwa so aussehen:
```c
mystack = clear(mystack)
```

Mit dem Zuweisungsopertar `=` wird der Speicherplatz, welcher `mystack` besitzt einfach *überschrieben* mit dem Return-Wert von `clear(myStack)`. Sprich `mystack = init(stack)` hätte genau denselben Effekt.