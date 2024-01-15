package main.java.dataStructures.arrays;

import java.util.Arrays;

public class ArraySortedMedian {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedLen = nums1.length + nums2.length;
        int[] merged = new int[mergedLen];
        for(int i = 0; i < mergedLen; i++){
            if(i < nums1.length)
                merged[i] = nums1[i];
            else if (i < mergedLen )
                merged[i] = nums2[i-nums1.length];
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        if(mergedLen <= 1)
            return (double) merged[0];

        if(mergedLen/2 % 2 != 0)
            return (double) merged[mergedLen/2];
        else {
            return ((double) merged[mergedLen / 2 - 1] + merged[mergedLen / 2]) / 2;
        }
    }
}
