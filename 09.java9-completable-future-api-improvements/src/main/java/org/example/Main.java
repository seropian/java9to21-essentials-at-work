package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        orTimeout();
        TimeUnit.SECONDS.sleep(5);

        completeOnTimeout();
        TimeUnit.SECONDS.sleep(5);

        delayedExecutor();
        TimeUnit.SECONDS.sleep(5);
    }

    static void orTimeout() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result";
        });

        // This will complete exceptionally with TimeoutException after 2 seconds
        future.orTimeout(2, TimeUnit.SECONDS)
                .thenAccept(System.out::println)
                .exceptionally(ex -> {
                    System.out.println("Exception: " + ex.getMessage());
                    return null;
                });

    }

    static void completeOnTimeout() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate long running task
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result";
        });

        // This will complete with the value "Timeout" after 1 second
        future.completeOnTimeout("Timeout", 1, TimeUnit.SECONDS).thenAccept(System.out::println);
    }

    static void delayedExecutor() {
        Executor delayed = CompletableFuture.delayedExecutor(1, TimeUnit.SECONDS);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello World!", delayed);
        future.thenAccept(System.out::println);
    }
}