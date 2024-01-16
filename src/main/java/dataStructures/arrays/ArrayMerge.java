package main.java.dataStructures.arrays;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        mergeIntArray(new int[]{3,2,4,0,0,0},3,new int[]{4,5,6},2);
    }

    public static void mergeIntArray(int[] array1,int noEleToMerge1, int[] array2, int noEleToMerge2){
        /*int startIndex = (array1.length - eleToMerge1 - 1);
        for(int i = 0; i < array1.length; i++){
            if(i > eleToMerge1 - 1 )
                array1[i] = 0;
        }
        for(int i = startIndex; i < array1.length-1; i++){
            for (int k : array2) {
                array1[startIndex] = k;
            }
        }*/
        int j = noEleToMerge1;
        for (int i = 0; i < noEleToMerge2; i++) {
            array1[j] = array2[i];
            j++;
        }
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
