package com.dodemy;

/*
Remitano:
Number of Bitcoins bought in Remitano = 100
Price of each Bitcoin = $11,561
Total expenses = ($11,561 * 100) = $1,156,100

Luno:
Number of Bitcoins sold on Luno = 100
Price of each Bitcoin = $11,645
Total revenue = ($11,645 * 100) = $1,164,500

total profit = $1,164,500 - $1,156,100 = $8,400


Remitano:
int numberOfBitcoinReadyToBuy
int priceOfEachBitcoin //bitcoinCurrentPrice
int totalExpenses = numberOfBitcoinReadyToBuy * priceOfEachBitcoin
int remiBitcoinBalance = totalExpenses - remiTransactionCharges

Luno:
int numberOfBitcoinReadyToSell (balanceFromRemitanoInLunoToSell): int remiBitcoinBalance
int priceOfEachBitcoin
int totalRevenue = priceOfEachBitcoin * remiBitcoinBalance
int lunoProfit = totalRevenue - lunoTransactionCharges

Profit:
int lunoProfit = totalRevenue - lunoTransactionCharges
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class BitcoinArbitrageCalculator {
    public static void main(String[] args) {

    }

    //Remitano
    public int calculateCoinArbitrageBuy
    (int numberOfBitcoinReadyToBuy,
     int bitcoinCurrentPrice,
     int remiTransactionCharges) {

        int totalExpenses = numberOfBitcoinReadyToBuy * bitcoinCurrentPrice;
        int remiBitcoinBalance = totalExpenses - remiTransactionCharges;
        return remiBitcoinBalance;
    }

    //Luno
    public int calculateCoinArbitrageSell
    (int remiBitcoinBalance,
     int bitcoinCurrentPrice,
     int lunoTransactionCharges) {

        int totalRevenue = bitcoinCurrentPrice * remiBitcoinBalance;
        int lunoProfit = totalRevenue - lunoTransactionCharges;
        return lunoProfit;
    }

    int readNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of coin (Bitcoin, Etherum, etc) ready to buy: ");
        int numberOfBitcoinReadyToBuy = scanner.nextInt();

        System.out.print("Coin (Bitcoin, Etherum, etc) current  price: ");
        int bitcoinCurrentPrice = scanner.nextInt();

        return 0;
    }
}


//package com.dodemy;
//
//        import java.text.NumberFormat;
//        import java.util.Scanner;
//
//public class MortgageCalculator {
//    public static final byte MONTHS_IN_YEAR = 12;
//    public static final byte PERCENT = 100;
//
//    public static void main(String[] args) {
//        int principal = 0;
//        float annualInterestRate;
//        byte periodInYears;
//
//        principal = (int) readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
//        annualInterestRate = (float) readNumber("Annual Interest Rate: ", 1, 30);
//        periodInYears = (byte) readNumber("Period (Years): ", 1, 30);
//
////        Scanner scanner = new Scanner(System.in);
////        while (true) {
////            System.out.print("Principal ($1K - $1M): ");
////            principal = scanner.nextInt();
////            if (principal >= 1000 && principal <= 1_000_000)
////                break;
////            System.out.println("Enter a number between 1,000 and 1,000,000");
////        }
//
////        while (true) {
////            System.out.print("Annual Interest Rate: ");
////            annualInterestRate = scanner.nextFloat();
////            if (annualInterestRate >= 1 && annualInterestRate <= 30)
////                break;
////            System.out.println("Enter interest rate between 1 and 30");
////
////        }
//
////        while (true) {
////            System.out.print("Period (Years): ");
////            periodInYears = scanner.nextByte();
////            if (periodInYears >= 1 && periodInYears <= 30)
////                break;
////            System.out.println("Enter a period in years between 1 and 30");
////        }
//
//        double mortgage = calculateMortgage(principal, annualInterestRate, periodInYears);
//        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage (monthly payment): " + formattedMortgage);
//    }
//
//    public static double calculateMortgage(int principal, float annualInterestRate, byte periodInYears) {
//        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
//        short numberOfPayments = (short) (periodInYears * MONTHS_IN_YEAR);
//        double mortgage = principal
//                * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfPayments)))
//                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1);
//
//        return mortgage;
//    }
//
//    public static double readNumber(String prompt, int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        double value;
//        while (true) {
//            System.out.print(prompt);
//            value = scanner.nextFloat();
//            if (value >= min && value <= max)
//                break;
//            System.out.println("Enter a number between " + min + " and " + max);
//        }
//        return value;
//    }
//}
