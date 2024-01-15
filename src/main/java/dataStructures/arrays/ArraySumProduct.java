package main.java.dataStructures.arrays;

public class ArraySumProduct {
    public static void main(String[] args) {
        ArraySumProduct arraySumProduct = new ArraySumProduct();
        int[] array = new int[]{1,2,3,4,5};
        int sum = arraySumProduct.getSum(array);
        int product = arraySumProduct.getProduct(array);
        System.out.println("Sum: "+sum + " Product: "+product);
    }

    private int getProduct(int[] array) {
        int product = 1;            // ---> Time Complexity O(1)
        for (int j : array)         // ---> Time Complexity O(N)
            product *= j;           // ---> Time Complexity O(1) ---> Time Complexity: O(N)
        return  product;
    }

    private int getSum(int[] array) {
        int sum = 0;                // ---> Time Complexity O(1)
        for (int j : array)         // ---> Time Complexity O(N)
            sum += j;               // ---> Time Complexity O(1) ---> Time Complexity: O(N)
        return sum;
    }
}
