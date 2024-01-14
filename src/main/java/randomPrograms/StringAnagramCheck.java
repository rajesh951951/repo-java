/*
* Check if given two strings are Anagram or not.
* Anagram is word or phrase formed by rearranging the letters of different word or phrase.
* e.g. abcd & dcab
* */

package main.java.randomPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramCheck {
    public static void main(String[] args) {
        String stringOne = inputString();
        System.out.println("String One: "+stringOne);
        String stringTwo = inputString();
        System.out.println("String Two: "+stringTwo);
        checkAnagram(stringOne,stringTwo);
    }

    private static void checkAnagram(String stringOne, String stringTwo) {
        // check Length of String
        if(stringOne.length() == stringTwo.length()){
            stringOne = stringOne.toLowerCase();
            stringTwo = stringTwo.toLowerCase();

            // convert to char array
            char[] strinOneChars = stringOne.toCharArray();
            char[] strinTwoChars = stringTwo.toCharArray();

            // sort char array
            Arrays.sort(strinOneChars);
            Arrays.sort(strinTwoChars);

            // if sorted arrays are same then string anagram
            boolean isAnagram = Arrays.equals(strinOneChars, strinTwoChars);

            if(isAnagram)
                System.out.println("String One: "+stringOne+" and String Two: "+stringTwo+ " are anagram.");
            else
                System.out.println("String One: "+stringOne+" and String Two: "+stringTwo+ " are not anagram.");
        } else{
            System.out.println("String One: "+stringOne+" and String Two: "+stringTwo+ " are not anagram.");
        }

    }

    private static String inputString() {
        System.out.print("Enter String : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}


