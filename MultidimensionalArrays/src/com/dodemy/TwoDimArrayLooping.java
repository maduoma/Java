package com.dodemy;

/*
We can also use a for loop inside another for loop to get the elements of a two-dimensional array
(we still have to point to the two indexes)
 */

/*
public static void TwoDimArrayLoop() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
 */
public class TwoDimArrayLooping {
    public static void TwoDimArrayLoop() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }
    }
}
