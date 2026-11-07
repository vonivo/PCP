package sw08.ex06;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise {
    public static void main(String[] args) {
        var rand = new Random();
        var x = rand.ints()
                .anyMatch(i -> i >= 10_000 && i <= 12_000);
        System.out.println("Number Found");

        var counter = new AtomicInteger();
        var y = rand.ints()
                .peek(_ -> counter.incrementAndGet())
                .anyMatch(i -> i >= 10_000 && i <= 12_000);

        System.out.println("Found suitable number at stream position " + counter.get());
    }
}
