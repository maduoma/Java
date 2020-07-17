package com.dodemy;

import static com.dodemy.Recursion.sum1;
import static com.dodemy.Recursion2.sum2;
import static com.dodemy.Recursion31.p;
import static com.dodemy.Recursion4.factorial;
import static com.dodemy.Recursion5.*;

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

        //From class Recursion30
        //p();

        //From class Recursion31
        p();

        //From class Recursion4
        System.out.println("Factorial of 5 is: " + factorial(5));

        //From class Recursion5
        int count = 15;
        System.out.print(n1 + " " + n2);//printing 0 and 1
        printFibo(count - 2);//n-2 because 2 numbers are already printed
    }
}
