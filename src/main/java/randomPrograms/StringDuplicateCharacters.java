package main.java.randomPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringDuplicateCharacters {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String string = new Scanner(System.in).next();
        printDuplicateCharacters(string);
    }

    private static void printDuplicateCharacters(String string) {
        char[] chars = string.toCharArray();

        //Create a map for characters with occurrences
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();
        for (Character ch : chars) {
            if (characterIntegerMap.containsKey(ch))
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            else
                characterIntegerMap.put(ch, 1);
        }

        Set<Map.Entry<Character, Integer>> charEntrySet = characterIntegerMap.entrySet();
        System.out.println("Duplicate Characters in String " + string + " are as follows,");
        for (Map.Entry<Character, Integer> entry : charEntrySet) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
