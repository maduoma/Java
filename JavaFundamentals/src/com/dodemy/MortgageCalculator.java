package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static final byte MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    public static void main(String[] args) {
        double mortgage = 0;
        int principal = 0, numberOfPayments;
        float monthlyInterestRate = 0, annualInterestRate;
        byte periodInYears;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter interest rate between 1 and 30");

        }

        while (true) {
            System.out.print("Period (Years): ");
            periodInYears = scanner.nextByte();
            if (periodInYears >= 1 && periodInYears <= 30) {
                numberOfPayments = periodInYears * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a period in years between 1 and 30");
        }
        mortgage = principal
                * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments)))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage (monthly payment): " + formattedMortgage);
    }
}