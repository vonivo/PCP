package sw08.ex02;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {
        var numbers = new Integer[] {1, 2, 3, 5, 8};

        new Exercise().printNumbersAndSquares(numbers);

    }

    public void printNumbersAndSquares(Integer[] numbers) {
        Arrays.asList(numbers).forEach(i -> System.out.println(i + ": " + i * i));
    }
}
