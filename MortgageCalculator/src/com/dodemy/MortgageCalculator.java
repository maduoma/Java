package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static final byte PERCENT = 100;
    public static final byte MONTHS_IN_YEAR = 12;

    protected void CalculateMortgage() {
        Scanner scanner = new Scanner(System.in);
        //M = P[r(1 + r)power n  / (1 + r) power n - 1]
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float monthlyRate = scanner.nextFloat();
        monthlyRate = (monthlyRate / PERCENT) / MONTHS_IN_YEAR;
        System.out.print("Period in years: ");
        byte years = scanner.nextByte();
        int numberOfRepayment = years * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyRate * Math.pow((1 + monthlyRate), numberOfRepayment)) / (Math.pow(1 + monthlyRate, numberOfRepayment) - 1 );
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
