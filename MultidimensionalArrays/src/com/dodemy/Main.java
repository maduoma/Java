package com.dodemy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Two dimensional array: int[][]");
        TwoDimArray.TwoDim();
        System.out.println("Looping through two dimensional array");
        TwoDimArrayLooping.TwoDimArrayLoop();

        SimpleArray simpleArray = new SimpleArray();
        System.out.println("===================Simple Array============================");
        simpleArray.SimpleDimArray();
        System.out.println("===================Two Dim Array============================");
        TwoDiArray twoDiArray = new TwoDiArray();
        twoDiArray.twoDiArray();

        System.out.println("===================Lopping through a 2-dimensional array===========================");
        Loop2DimArray loop2DimArray = new Loop2DimArray();
        loop2DimArray.loop2DimArray();
        System.out.println("===================Lopping through a 3-dimensional array===========================");
        ThreeArray threeArray = new ThreeArray();
        threeArray.threeArray();
        System.out.println("===================Length of 2-dimensional Array===========================");
        int[][] a = { {1, -2, 3}, {-4, -5, 6, 9}, {7} };
        System.out.println(a.length); //The arrays in the array are treated as elements each, therefore the length is 3.
    }
}
