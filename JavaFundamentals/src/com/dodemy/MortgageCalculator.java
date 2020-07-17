package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        //Method that reads user's input
        int principal = (int) readNumber("Principal from $1K - $1M: ", 1_000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual Interest Rate from 1 - 30: ", 1, 30);
        byte periodInYears = (byte) readNumber("Period in years from 1 - 30: ", 1, 30);

        //Method that calculate mortgage
        double mortgage = calculateMortgage(principal, annualInterestRate, periodInYears);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage (your monthly repayment): " + formattedMortgage);
    }

    //Method that calculate mortgage
    public static double calculateMortgage(int principal, float annualInterestRate, byte periodInYears) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (periodInYears * MONTHS_IN_YEAR);
        double mortgage = principal
                * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments)))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);

        return mortgage;
    }

    //Method that reads user's input
    public static double readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }
}