/*
 * Ref: GFG
 * Print all the permutations of the given string.
 * */
package main.java.randomPrograms;

import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        String s = new Scanner(System.in).next();
        permutation(s, 0, s.length() - 1);
    }

    private static void permutation(String s, int start, int end) {
        if (start == end)
            System.out.println(s);
        else {
            for (int i = start; i <= end; i++) {
                s = swapChar(s, start, i);
                permutation(s, start + 1, end);
                s = swapChar(s, start, i);
            }
        }
    }

    private static String swapChar(String s, int start, int end) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        return String.valueOf(charArray);
    }

}
