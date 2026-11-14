package sw09.ex02;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise {

    public static void main(String[] args) {
        generateSortAndPrintRandomInts(7, 100);
    }

    public static void generateSortAndPrintRandomInts(int numberOfVals, int maxValueExc) {
        var rand = new Random();
        List<Integer> ints = rand.ints(0, maxValueExc)
                .distinct()
                .limit(numberOfVals)
                .boxed()
                .collect(Collectors.toList());

        // ints.sort(Comparator.<Integer>naturalOrder().reversed());
        ints.sort(Comparator.reverseOrder());

        var stringJoiner = new StringJoiner(" > ", "reverse ordered list = { " , " }");
        ints.forEach(i -> stringJoiner.add(i.toString()));

        System.out.println(stringJoiner);
    }
}
