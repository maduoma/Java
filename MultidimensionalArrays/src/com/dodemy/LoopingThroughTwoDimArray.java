package com.dodemy;

/*
We can also use a for loop inside another for loop to get the elements of a two-dimensional array
(we still have to point to the two indexes)
 */
public class LoopingThroughTwoDimArray {
    public static void TwoDimArrayLooping() {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
