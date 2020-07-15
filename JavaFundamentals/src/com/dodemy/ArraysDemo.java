package com.dodemy;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][][] numbers2 = new int[2][3][4];
        numbers2[0][0][0] = 2;
        System.out.println(Arrays.deepToString(numbers2));

        Scanner scanner = new Scanner(System.in);
    }
}

