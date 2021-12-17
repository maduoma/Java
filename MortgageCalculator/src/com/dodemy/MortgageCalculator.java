package com.dodemy;

import java.text.NumberFormat;

public class MortgageCalculator {
    //M = P[r(1 + r)power n  / (1 + r) power n - 1]
    /* B = L[(1 + c)power n - (1 + c)power p] / [(1 + c)power n - 1]
    The following formula is used to calculate the fixed monthly payment (P) required to fully amortize a loan of
    L dollars over a term of n months at a monthly interest rate of c.
    L = Loan amount/P
            P = Monthly payment, total no of payments made
            c = monthly interest
            n = No of payments, if we 10 years, we have 120 number of payments
            n = Month when the balance is paid in full */
    static final byte PERCENT = 100;
    static final byte MONTHS_IN_YEAR = 12;

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = MortgageCalculator.calculateMortgage(principal, annualInterest, years);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Mortgage - Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }

    public static double calculateBalance(double principal, float annualInterest, byte years,
                                          short numberOfPaymentsMade) {
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        return principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest,
                numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateMortgage(double principal, float annualInterest, byte years) {
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

}
