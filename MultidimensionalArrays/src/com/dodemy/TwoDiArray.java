package com.dodemy;

import java.util.Arrays;

public class TwoDiArray {
    public void twoDiArray() {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        System.out.println(Arrays.deepToString(numbers));
    }
}
