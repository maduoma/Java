package com.dodemy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {
    public static final byte MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    public static void main(String[] args) {
        double mortgage;
        int principal, numberOfPayments;
        float monthlyInterestRate, annualInterestRate;
        byte periodInYears;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualInterestRate = scanner.nextFloat();
        monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        periodInYears = scanner.nextByte();
        numberOfPayments = periodInYears * 12;
        mortgage = principal
                * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments)))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }
}
