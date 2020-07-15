package com.dodemy;

import java.util.Scanner;

final class DivisibleDemo {
    Scanner scanner = new Scanner(System.in);

    public String scanDemo() {
        System.out.print("Enter a number: ");
        int inputNum = scanner.nextInt();
        if (inputNum % 5 == 0 && inputNum % 3 == 0)
            System.out.println("FizzBuzz");
        else if (inputNum % 5 == 0)
            System.out.println("Fizz");
        else if (inputNum % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(inputNum);
        return "Thank you!";
    }

    public String scanDemo2() {
        System.out.print("Number: ");
        int inputNum = scanner.nextInt();
        if (inputNum % 5 == 0) {
            if (inputNum % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        } else if (inputNum % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(inputNum);
        return "Thank you!";
    }
}