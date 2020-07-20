package com.dodemy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Two dimensional array: int[][]");
        TwoDimArray.TwoDim();
        System.out.println("Looping through two dimensional array");
        TwoDimArrayLooping.TwoDimArrayLoop();

        SimpleArray simpleArray = new SimpleArray();
        System.out.println("===================Simple Arrays============================");
        simpleArray.SimpleDimArray();
    }
}
