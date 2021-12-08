package com.dodemy;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ScannerClass {
    protected String nameInput() {
        System.out.println("==============================Reading Text from system console===========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        // return "Welcome " + scanner.nextLine().substring(0, 1).toUpperCase() + scanner.nextLine().substring(1) + "!";
        return "Welcome " + StringUtils.capitalize(scanner.nextLine().trim())  + "!";
    }

    protected void capitaliseFirstLetter() {
        System.out.println("Enter the sentence to capitalize the first letter : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Scanner stringScanner = new Scanner(string);
        StringBuilder resultString = new StringBuilder();
        while (stringScanner.hasNext()) {
            String str = stringScanner.next();
            resultString.append(str.substring(0, 1).toUpperCase()).append(str.substring(1)).append(" ");
        }
        System.out.println("After capitalizing the first letter in each word, result is : " + resultString);
    }

    protected String numberInput() {
        System.out.println("==============================Reading Number from system console===========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        // return "Welcome " + scanner.nextLine().substring(0, 1).toUpperCase() + scanner.nextLine().substring(1) + "!";
        return "Your age is " + scanner.nextInt() + "!";
    }
}
