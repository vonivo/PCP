package sw08.ex03;

@FunctionalInterface
public interface TripleIntOperator {
    int applyAsInt(int operand1, int operand2, int operand3);
}

//---------- b) ------------
// Gemäss Konvention  von IntUnaryOperator applyAsInt


//---------- c) ------------
// Vom Typ int. Ein Operator gibt denselben Typen zurück, welchen
// er als Parameter erhält.