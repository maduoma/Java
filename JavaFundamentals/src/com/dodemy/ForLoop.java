package com.dodemy;

public class ForLoop {
    public static void main(String[] args) {
        //Forward from 0 - 4
        System.out.println("//Forward from 0 - 4");
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to the world of Java programming! " + i);
        }

        //Backward from 5 - 1
        System.out.println("//Backward from 5 - 1");
        for (int i = 5; i > 0; i--) {
            System.out.println("Welcome to the world of Java programming! " + i);
        }
        //Even number from 1 to 10
        System.out.println("//Even number from 1 to 10");
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println("Even number: " + i);
        }
        //Even number from 1 to 10
        System.out.println("//Even number from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println("Even number: " + i);
        }
    }
}
