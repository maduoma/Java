package com.dodemy;


import java.util.Scanner;

public class WhenToUseWhileLoop {
    String input = "";
    Scanner scanner = new Scanner(System.in);

    protected void checkInput() {
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
