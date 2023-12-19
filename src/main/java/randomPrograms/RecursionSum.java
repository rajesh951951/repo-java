/*
* Program to print sum of array elements using Recursion
* */
package main.java.randomPrograms;

public class RecursionSum {
    public static void main(String[] args) {
        int[] array = {2,6,3,4,8};
        System.out.println("Sum of Array Elements : "+ arraySumRecursion(array, array.length-1));
    }

    private static int arraySumRecursion(int[] array, int n) {
        if(n == 0)
            return array[n];
        else
            return array[n] + arraySumRecursion(array, n-1);
    }

}
