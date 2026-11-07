package sw08.ex03;

public class Exercise {
    public static void main(String[] args) {
        TripleIntOperator tio = (a, b, c) -> a + b + c;

        System.out.println(tio.applyAsInt(1, 2, 3));
    }
}
