package org.example;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        // Create a Subscriber and register it with the Publisher
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("Subscribing... ");
                this.subscription = subscription;
                subscription.request(1);
            }
            @Override
            public void onNext(String item) {
                System.out.println("Received item: " + item);
                subscription.request(1);
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };
        publisher.subscribe(subscriber);

        // Publish items
        System.out.println("Publishing items...");
        String[] items = {"item1", "item2", "item3"};
        for (String item : items) {
            publisher.submit(item);
        }

        // while subscriber is still processing wait
        while (publisher.hasSubscribers()) {
            Thread.sleep(1000);
        }

        // Close the Publisher
        publisher.close();
    }
}