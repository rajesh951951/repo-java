/*
 * Given two Arrays as Input, find & print the common elements in them.
 * Input: array1[] = {23,53,83,39}, array2 = {21,23,83}
 * Output: 23 83
 * */

package main.java.dataStructures.Arrays;

import java.util.*;

public class ArrayCommonElements {
    public static void main(String[] args) {
        String[] array1 = readyArray();
        String[] array2 = readyArray();
        printCommonElements(array1, array2);
    }

    private static void printCommonElements(String[] array1, String[] array2) {
        Set<String> commonElements = new HashSet<>();

        for (String s : array1) {
            for (String string : array2) {
                if (Objects.equals(s, string)) {
                    commonElements.add(s);
                    break;
                }
            }
        }

        System.out.println("Common Elements: ");
        for (String element : commonElements) {
            System.out.print(element + " ");
        }
    }

    private static String[] readyArray() {
        System.out.print("Enter the size of Array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter Array Elements");
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element " + (i + 1) + " : ");
            array[i] = scanner.next();
        }
        System.out.println("Array: " + Arrays.toString(Arrays.stream(array).toArray()));
        return array;
    }
}
