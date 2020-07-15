package com.dodemy;

import java.util.Scanner;

public class WhileDemo {
    Scanner scanner = new Scanner(System.in);

    public String whileDem() {
        String myInput = "";
        while (!myInput.equals("quit")) {
            System.out.print("Input: ");
            myInput = scanner.next().toLowerCase();
            if (myInput.equals("pass"))
                continue;
            if (myInput.equals("quit"))
                break;
            System.out.println(myInput);
        }
        return "Thank you!";
    }

    public String whileDem2() {
        String myInput = "";
        while (true) {
            System.out.print("Input: ");
            myInput = scanner.next().toLowerCase();
            if (myInput.equals("pass"))
                continue;
            if (myInput.equals("quit"))
                break;
            System.out.println(myInput);
        }
        return "Thank you!";
    }
}
