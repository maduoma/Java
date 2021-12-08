package com.dodemy;

import java.text.NumberFormat;

public class NumberFormatting {
    protected String currencyFormat() {
        System.out.println("================= CURRENCY FORMATTING======================");
/*
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(1234567.675);
*/
        return NumberFormat.getCurrencyInstance().format(1234567.675);
    }

    protected String percentFormat() {
        System.out.println("================= PERCENT FORMATTING======================");
        return NumberFormat.getPercentInstance().format(0.2);
    }
}
