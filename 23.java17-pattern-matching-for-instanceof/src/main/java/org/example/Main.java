package org.example;

public class Main {
    public static void main(String[] args) {

        Object obj = "Hello, world!";

        //old way
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }

        //new way
        if (obj instanceof String str) {
            System.out.println("The length of the string is: " + str.length());
        } else {
            System.out.println("The object is not a string.");
        }
    }
}