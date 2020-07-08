package com.dodemy;

/*
To access the elements of the myNumbers array, specify two indexes: one for the array,
and one for the element inside that array. This example accesses the third element (2)
in the second array (1) of myNumbers:
 */
public class TwoDimArray {
    public static void TwoDim() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x);
    }
}
