package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    //M = P[r(1 + r)power n  / (1 + r) power n - 1]

    public static final byte PERCENT = 100;
    public static final byte MONTHS_IN_YEAR = 12;
    Scanner scanner = new Scanner(System.in);
    int principal = 0;
    float monthlyRate = 0;
    int numberOfPayments = 0;

    protected void CalculateMortgage() {
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("You must enter a value between 1,000 and 1,000,000!");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            monthlyRate = scanner.nextFloat();
            if (monthlyRate >= 1 && monthlyRate <= 30) {
                monthlyRate = (monthlyRate / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("You must enter a value between 1 and 30!");
        }
        while (true) {
            System.out.print("Period in years: ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("You must enter a value between 1 and 30!");
        }
        double mortgage = principal * (monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
