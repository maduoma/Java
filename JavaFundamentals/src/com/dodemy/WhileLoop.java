package com.dodemy;

import java.util.Scanner;

public class WhileLoop {
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

    public String whileDem3() {
        //Even number from 1 to 10
        System.out.println("//Even number from 1 to 10");
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0)
                System.out.println("Even number: " + i);
            i++;
        }
        return "Thank you!";
    }
}
