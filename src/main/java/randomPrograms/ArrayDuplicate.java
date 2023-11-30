/*
* Check if Array contains the duplicate numbers
* */

package main.java.randomPrograms;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {

    public static void main(String[] args) {
        System.out.println("Array has duplicate - "+checkArrayDuplicate(new int[]{1,2,2,3}));
        System.out.println("Array has duplicate - "+checkArrayDuplicate(new int[]{1,2,3}));
    }
    public static boolean checkArrayDuplicate(int[] arrayInt){
        Set<Integer> integerSet = new HashSet<>();
        for(int integer: arrayInt){
            if(integerSet.contains(integer))
                return true;
            integerSet.add(integer);
        }
        return false;
    }
}
