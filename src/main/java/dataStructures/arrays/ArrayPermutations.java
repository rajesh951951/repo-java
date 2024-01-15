package main.java.dataStructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutations {
    public static void main(String[] args) {
        System.out.println("Approach One");
        permuteOne(new int[]{1,2,3},0);

        System.out.println("Approach Two (Using List)");
        List<List<Integer>> list = new ArrayList<>();
        permuteTwo(new int[]{1,2,3},0,list);
        System.out.println(list);
    }

    private static void permuteOne(int[] ints, int start) {
        if(start == ints.length){
            System.out.println(Arrays.toString(ints));
        }else {
            for (int i = start; i < ints.length; i++) {
                int temp = ints[start];
                ints[start] = ints[i];
                ints[i] = temp;
                permuteOne(ints, start + 1);
                temp = ints[start];
                ints[start] = ints[i];
                ints[i] = temp;
            }
        }
    }

    private static List<List<Integer>> permuteTwo(int[] ints, int start, List<List<Integer>> listOfList) {
        if(start == ints.length){
            List<Integer> list = new ArrayList<>();
            for(int i : ints)
                list.add(i);
            listOfList.add(list);
        }else{
            for (int i = start; i < ints.length; i++) {
                int temp = ints[start];
                ints[start] = ints[i];
                ints[i] = temp;
                permuteTwo(ints, start + 1,listOfList);
                temp = ints[start];
                ints[start] = ints[i];
                ints[i] = temp;
            }
        }
        return listOfList;
    }
}
