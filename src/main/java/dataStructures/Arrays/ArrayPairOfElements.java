package main.java.dataStructures.Arrays;

public class ArrayPairOfElements {
    public static void main(String[] args) {
        ArrayPairOfElements arrayPairOfElements = new ArrayPairOfElements();
        arrayPairOfElements.printPairsArray(new int[]{1,2,3,4,5});
    }

    private void printPairsArray(int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.print(Integer.parseInt(k + "" + i)+" ");
            }
            System.out.println();
        }
    }
}
