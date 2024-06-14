package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();

//        //create 100000 threads
//        for (int i = 0; i < 100000; i++) {
//            Thread thread = new Thread(() -> {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//            thread.start();
//            thread.join();
//        }
//        System.out.println("threads started in: " + (System.nanoTime() - start) / 1_000_000 + "ms");

        start = System.nanoTime();
        //create 100000 virtual threads
        for (int i = 0; i < 100000; i++) {
            Thread thread = Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.join();
        }
        System.out.println("virtual threads started in: " + (System.nanoTime() - start) / 1_000_000 + "ms");
    }
}