package com.dodemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    protected void CalculateMortgage() {
        Scanner scanner = new Scanner(System.in);
        //M = P[r(1 + r)power n  / (1 + r) power n - 1]
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double monthlyRate = scanner.nextDouble();
        monthlyRate = (monthlyRate / 100) / 12;
        System.out.print("Period in years: ");
        byte period = scanner.nextByte();
        int numberOfRepayment = period * 12;
        double mortgage = principal * (monthlyRate * Math.pow((1 + monthlyRate), numberOfRepayment)) / (Math.pow(1 + monthlyRate, numberOfRepayment) - 1 );
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}
