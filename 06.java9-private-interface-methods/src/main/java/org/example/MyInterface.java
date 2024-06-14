package org.example;

public interface MyInterface {
    default void method1() {
        commonMethod();
    }

    default void method2() {
        commonMethod();
    }

    private void commonMethod() {
        System.out.println("Common method called");
    }
}
