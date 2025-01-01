package main.java.dataStructures.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{2}));
    }

    public static int singleNumber(int[] nums) {
        int uniqueNum = Integer.MIN_VALUE;
        Map<Integer,Integer> numMap = new HashMap<>();

        for (int num : nums) {
            int c = numMap.getOrDefault(num, 0);
            if (c > 0)
                numMap.put(num, c + 1);
            else
                numMap.put(num, 1);
        }
        for(Map.Entry<Integer, Integer> entry: numMap.entrySet()){
            if(entry.getValue() == 1){
                uniqueNum = entry.getKey();
            }
        }
        return uniqueNum;
    }
}
