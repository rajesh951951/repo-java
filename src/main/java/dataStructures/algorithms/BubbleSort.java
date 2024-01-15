/**
 * Ref: GFG
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in the wrong order. This algorithm is not suitable for large data sets as its average and worst-case
 * time complexity is quite high.
 *
 * In Bubble Sort algorithm,
 * - Traverse from left and compare adjacent elements and the higher one is placed at right side.
 * - In this way, the largest element is moved to the rightmost end at first.
 * - This process is then continued to find the second largest and place it and so on until the data is sorted.
 */

package main.java.dataStructures.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {11,9,12,5,44,38,53};
        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
    int len = array.length;
        for(int i = 0; i< len-1; i++){
            for(int j = 0; j< len- i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(array));
    }

}
