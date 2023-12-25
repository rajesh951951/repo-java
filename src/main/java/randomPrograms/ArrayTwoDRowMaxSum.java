/*
 *  Find Sum for a Row in 2-D Array who has max sum value.
 * */

package main.java.randomPrograms;

public class ArrayTwoDRowMaxSum {
    public static void main(String[] args) {
        int[][] arrayTwoD = {
                {2, 3, 4, 5},
                {3, 5, 1, 2},
                {2, 3, 7, 6}
        };

        findMaxSumRow(arrayTwoD);
    }

    private static void findMaxSumRow(int[][] arrayTwoD) {
        int maxSum = 0;
        for (int[] row : arrayTwoD) {
            int rowSum = 0;
            for (int element : row) {
                rowSum += element;
            }
            maxSum = Math.max(rowSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
