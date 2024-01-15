/*
* Ref: LeetCode
* Running Sum of 1D Array
*
* */
package main.java.dataStructures.arrays;

import java.util.Arrays;

public class ArrayRunningSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayRunningSum(array)));
    }

    private static int[] arrayRunningSum(int[] array) {
        int[] results = new int[array.length];
        results[0] = array[0];
        for(int i = 1; i < array.length; i++){
            results[i] = results[i-1] + array[i];
        }
        return results;
    }
}
