package com.dodemy;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    /*
    A program that demonstrates single and multi-dimensional arrays
     */

    public static void main(String[] args) {
        //1-dimensional array
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        System.out.println(Arrays.toString(numbers1));

        //2-dimensional array: 2 rows and each has 3 columns (2 by 3 matrix).
        int[][] numbers2 = new int[2][3];
        numbers2[0][0] = 2;
        System.out.println(Arrays.deepToString(numbers2));

        //
        int[][][] numbers3 = new int[2][4][5];
        numbers3[0][0][0] = 3;
        System.out.println(Arrays.deepToString(numbers3));
    }
}

