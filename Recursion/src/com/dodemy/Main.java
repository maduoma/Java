package com.dodemy;

import static com.dodemy.Recursion.sum1;
import static com.dodemy.Recursion2.sum2;

public class Main {
    public static void main(String[] args) {
        //From class Recursion
        System.out.println("Use recursion to add all of the numbers up to 10.");
        int result = sum1(10);
        System.out.println(result);

        //From class Recursion2
        System.out.println("Use recursion to add all of the numbers between 5 to 10");
        int result2 = sum2(5, 10);
        System.out.println(result2);
    }
}
