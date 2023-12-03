/*
* Given an Array as Input, find the largest element in it.
* Input: array[] = {23,53,83,39}
* Output: 83
* */

package main.java.randomPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargestElement {
    public static void main(String[] args) {
        int[] array = readArray();
        int largest = findLargestElementArray(array);
        System.out.println("\nLargest Element is " + largest);
    }

    private static int[] readArray(){
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        size = scanner.nextInt();

        int[] array = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the Element "+ (i+1) +" : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(Arrays.stream(array).toArray()));
        return array;
    }

    private static int findLargestElementArray(int[] array){
        int largest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > largest)
                largest = array[i];
        }
        return largest;
    }
}
