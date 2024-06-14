package org.client;

import org.example.provider.service.SomeService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        SomeService service = ServiceLoader.load(SomeService.class).findFirst().orElseThrow();
        service.doSomething();
    }
}