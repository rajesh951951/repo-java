package main.java.randomPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringSplitMaxScore {

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
    }

    // Input: s = "011101"
    // Output: 5
    // Explanation:
    // All possible ways of splitting s into two non-empty substrings are:

    // left = "0" and right = "11101", score = 1 + 4 = 5
    // left = "01" and right = "1101", score = 1 + 3 = 4
    // left = "011" and right = "101", score = 1 + 2 = 3
    // left = "0111" and right = "01", score = 1 + 1 = 2
    // left = "01110" and right = "1", score = 2 + 1 = 3

    // count 0 frm left and count 1 from right while incrmenting left and decremnting right

    public static int maxScore(String string){
        // score to hold the score value
        int score = Integer.MIN_VALUE;
        int strLen = string.length();
        int countZeroLeft = Integer.MIN_VALUE;
        int countOneRight = Integer.MIN_VALUE;

        for(int i = 1 ; i <  strLen; i++){
            // string left to hold the left substring for count 0
            String left = string.substring(0,i);

            // string right to hold the right substring for count 1
            String right = string.substring(i, strLen);

            // Map to hold unique char counts
            /*IntStream leftStream = left.chars();
            Map<Character, Long> streamMap = leftStream.mapToObj((c) -> (char)c)
                            .collect(Collectors.groupingBy(
                                    Function.identity(), Collectors.counting()
                            ));*/

            char charZero = '0';
            countZeroLeft = Collections.frequency(
                    Arrays.asList(
                            left.split("")),
                    String.valueOf(charZero)
            );

            char charOne = '1';
            countOneRight = Collections.frequency(
                    Arrays.asList(
                            right.split("")),
                    String.valueOf(charOne)
            );

            int sumCount = countZeroLeft + countOneRight;

            if(sumCount > score)
                score = sumCount;
        }
        return score;
    }
}

