package main.java.randomPrograms;

import java.util.Arrays;

public class ArrayPermutations {
    public static void main(String[] args) {
        permuteOne(new int[]{1,2,3},0);
    }

    private static void permuteOne(int[] ints, int start) {
        if(start == ints.length){
            System.out.println("Approach One"+Arrays.toString(ints));
        }
        for(int i = start; i < ints.length; i++){
            int temp = ints[start];
            ints[start] =  ints[i];
            ints[i] = temp;
            permuteOne(ints, start+1);
            temp = ints[start];
            ints[start] =  ints[i];
            ints[i] = temp;
        }
    }
}
