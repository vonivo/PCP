package sw09.ex03;

import java.util.concurrent.CompletableFuture;

public class Exercise {
    private static final int HALF_SECOND = 500;

    public static void main(String[] args) {
        var longLastingTaskFuture = CompletableFuture.supplyAsync(() -> {
            int waitingTime = 3_000;
            doBlockingWait(waitingTime);
            System.out.print(waitingTime);
            return waitingTime;
        });

        var evenLongerLastingTaskFuture = CompletableFuture.supplyAsync(() -> {
            int waitingTime = 6_000;
            doBlockingWait(waitingTime);
            System.out.print(waitingTime);
            return waitingTime;
        });

        var lastTaskFuture = longLastingTaskFuture.thenCombineAsync(evenLongerLastingTaskFuture, (s, t) -> {
            doBlockingWait(2_000);
            return "was waiting for " + (s + t + 2_000);
        });

        lastTaskFuture.thenAccept(System.out::print);

        System.out.println("-> Now waiting for things to happen!");
        for (int i = 0; i < 20; i++) {
            System.out.print(".");
            doBlockingWait(HALF_SECOND);
        }
        System.out.println();
        System.out.println("-> Done.");
    }

    public static void doBlockingWait(long waitingTimeMillis) {
        try {
            Thread.sleep(waitingTimeMillis);
        } catch (InterruptedException ie) {
            // nop.
        }
    }
}
