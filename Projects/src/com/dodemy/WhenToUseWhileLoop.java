package com.dodemy;


import java.util.Scanner;

public class WhenToUseWhileLoop {
    String input = "";
    Scanner scanner = new Scanner(System.in);

    protected void checkInput() {
        System.out.println("The use of While Loop");
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(!input.equals("quit"))
                System.out.println(input);
        }
    }

    protected void checkInput2() {
        System.out.println("The use of While Loop");
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }

    protected void checkInput3() {
        System.out.println("The use of While Loop");
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
