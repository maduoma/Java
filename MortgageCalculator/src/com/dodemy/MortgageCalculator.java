package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
// No Data validation here
    public static final byte PERCENT = 100;
    public static final byte MONTHS_IN_YEAR = 12;

    protected void CalculateMortgage() {
        Scanner scanner = new Scanner(System.in);
        //M = P[r(1 + r)power n  / (1 + r) power n - 1]
        System.out.print("Principal: ");
        //Receives
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float monthlyRate = scanner.nextFloat();
        monthlyRate = (monthlyRate / PERCENT) / MONTHS_IN_YEAR;
        System.out.print("Period in years: ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyRate * Math.pow((1 + monthlyRate), numberOfPayment)) / (Math.pow(1 + monthlyRate, numberOfPayment) - 1 );
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
