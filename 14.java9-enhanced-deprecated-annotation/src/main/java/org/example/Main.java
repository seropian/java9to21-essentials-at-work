package org.example;

public class Main {
    public static void main(String[] args) {
        DeprecatedClass deprecatedClass = new DeprecatedClass();
        deprecatedClass.deprecatedMethod();
    }
}

@Deprecated(since = "1.1", forRemoval = true)
class DeprecatedClass {
    @Deprecated(since = "1.2", forRemoval = true)
    public void deprecatedMethod() {
        System.out.println("This method is deprecated and it may be removed in future versions.");
    }
}