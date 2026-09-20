 ## Aufgabe b

*Man könnte für diesen Stack auch eine Operation clear definieren, welche den Stack leert.
Macht es Sinn, für diese Java-Implementierung von einem Stack eine clear-Operation zu
implementieren? Begründen Sie ihre Antwort.*

Ja, dass kann durchaus Sinn machen.
Wenn in Java folgendes gemacht wird:
```java
myStack.push(...);
mayStack = new Stack();
```
Wird die Referenz auf welche `myStack` Zeigt fallengelassen und auf durch die neue Referenz von `new Stack()` ersetzt. Die alte Referenz ist dann qualifiziert für die Garbage-Collection und wird dann irgendwann mal aufgeräumt. 
Wenn man nun einen `myStack.clear()`-Methode hat, könnte man die Referenz wiederverwenden.