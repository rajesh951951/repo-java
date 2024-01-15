package main.java.dataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPushZeroToEnd {
    public static void main(String[] args) {
        int[] givenArray = new int[]{0,32,5,74,0,2,0,21,0,0,90,0};
        System.out.println("Given Array  : "+Arrays.toString(Arrays.stream(givenArray).toArray()));
        pushZeroToEnd(givenArray);
        pushZeroToEnd1(givenArray);
    }

    private static void pushZeroToEnd1(int[] givenArray) {
        int i = 0;
        for(int ele : givenArray){
            if(givenArray[i] != 0){
                givenArray[i] = ele;
                i++;
            }
        }
        while(i < givenArray.length){
            givenArray[i] = 0;
            i++;
        }
        System.out.println("Approach Two : "+Arrays.toString(Arrays.stream(givenArray).toArray()));
    }

    private static void pushZeroToEnd(int[] givenArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < givenArray.length; i++){
            if(givenArray[i]==0)
                arrayList.add(i);
            if(arrayList.isEmpty())
                continue;
            if(givenArray[i] != 0){
                int temp = givenArray[i];
                givenArray[i] = givenArray[arrayList.get(j)];
                givenArray[arrayList.get(j)] = temp;
                arrayList.add(i);
                j++;
            }
        }
        System.out.println("Approach one : "+Arrays.toString(Arrays.stream(givenArray).toArray()));
    }
}
