package com.dodemy;

import java.util.Scanner;

public class MortgageCalculator {
    //M = P[r(1 + r)power n  / (1 + r) power n - 1]
    public static double calculateMortgage(double principal, float annualInterest, byte years) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        short numberOfPayment = (short) (years * MONTHS_IN_YEAR);
        return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("You must enter a value between " + min + " and " + max + "!");
        }
        return value;
    }
}
