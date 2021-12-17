package com.dodemy;

public class Main {
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Interest: ", 1, 30);
        byte years = (byte) Console.readNumber("Period in year(s): ", 1, 30);

        MortgageCalculator.printMortgage(principal, annualInterest, years);
        MortgageCalculator.printPaymentSchedule(principal, annualInterest, years);
    }
}
