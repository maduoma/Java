package com.dodemy;

public class Main {
    public static void main(String[] args) {
        int principal = (int) MortgageCalculator.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) MortgageCalculator.readNumber("Interest: ", 1, 30);
        byte years = (byte) MortgageCalculator.readNumber("Period in year(s): ", 1, 30);

        MortgageCalculator.printMortgage(principal, annualInterest, years);
        MortgageCalculator.printPaymentSchedule(principal, annualInterest, years);
    }
}
