package com.dodemy;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        MathClass mathClass = new MathClass();
        System.out.println(mathClass.ceilMethod());
        System.out.println(mathClass.floorMethod());
        System.out.println(mathClass.roundMethod());
        System.out.println(mathClass.maxMethod());
        System.out.println(mathClass.minMethod());
        System.out.println(mathClass.randomMethod());
        System.out.println(mathClass.randomMethod2());

        NumberFormatting numberFormatting = new NumberFormatting();
        System.out.println(numberFormatting.currencyFormat());
        System.out.println(numberFormatting.percentFormat());

        ScannerClass scannerClass = new ScannerClass();
        System.out.println(scannerClass.nameInput());
        System.out.println(scannerClass.numberInput());

//        String str = "java";
//        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
//        System.out.println(cap);

    }
}
