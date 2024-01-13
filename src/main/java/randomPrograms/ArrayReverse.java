package main.java.randomPrograms;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.printReverseOne(new int[]{1,2,3,4,5});
    }

    private void printReverseOne(int[] ints) {
        for(int i = 0; i < ints.length/2;  i++){    // ---> Time Complexity : O(N/2) --> O(N)
            int last = ints.length-i-1;             // ---> Time Complexity : O(1)
            int swap = ints[i];                     // ---> Time Complexity : O(1)
            ints[i] = ints[last];                   // ---> Time Complexity : O(1)
            ints[last] = swap;                      // ---> Time Complexity : O(1)
        }
        System.out.println(Arrays.toString(ints));  // ---> Time Complexity : O(N) --- Total Time Complexity O(N)
    }

}
