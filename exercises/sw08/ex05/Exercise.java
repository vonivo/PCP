package sw08.ex05;

import java.util.stream.IntStream;

public class Exercise {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 1)
                .limit(100)
                .forEach(i -> System.out.print(i + ", "));
        System.out.println("\n");
        IntStream.iterate(0, i -> i + 1)
                .parallel()
                .limit(100)
                .forEach(i -> System.out.print(i + ", "));
    }
}

// ---------- b) ------------
// Da nun ein Paralleler Stream verwendet wird,
// ist der Stream nach .parallel() nicht mehr geordnet.
// Auch die Implementation von .forEach() ist nicht
// deterministisch um die Vorteile der Parallelität zu halten.
//
// Javadoc:
// For parallel stream pipelines, this operation does not guarantee
// to respect the encounter order of the stream, as doing so would
// sacrifice the benefit of parallelism. For any given element, the action may
// be performed at whatever time and in whatever thread the library chooses.
// If the action accesses shared state, it is responsible for providing the required synchronization.