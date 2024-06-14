package org.example;

/**
 * This class provides a method to say hello.
 */
public class Greeting {

    /**
     * Says hello to the user.
     *
     * Here's an example of how to use this method:
     *
     * {@snippet :
     * Greeting greeting = new Greeting();
     * greeting.sayHello("John");
     * }
     *
     * @param name the name of the user
     */
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}