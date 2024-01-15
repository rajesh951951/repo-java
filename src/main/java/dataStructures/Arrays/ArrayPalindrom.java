package main.java.dataStructures.Arrays;

import java.util.Arrays;

public class ArrayPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindromeOne(-1001));
        System.out.println(isPalindromeOne(121));
        System.out.println(isPalindromeOne(1));
        System.out.println(isPalindromeOne(0));
        System.out.println(isPalindromeOne(10));
        System.out.println(isPalindromeOne(1312131));
        System.out.println(isPalindromeOne(11));
        System.out.println(isPalindromeOne(111));
        System.out.println(isPalindromeOne(2222));
    }

    public static boolean isPalindromeOne(int x) {
        int num = x;
        int sum = 0;
        int remainder;

        while(num > 0){
            remainder = num%10;
            sum = sum*10 + remainder;
            num = num/10;
        }

        if(x == sum)
            return true;
        else
            return false;
    }
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] strArray = str.toCharArray();
        boolean repeatElemt = true;
        int mid = strArray.length/2;

        for(int i = 0; i < strArray.length-1; i++){
            if(strArray[i]!= strArray[i+1])
                repeatElemt = false;
        }

        if (repeatElemt)
            return  true;

        if(mid % 2 == 0 || x < 0 && repeatElemt == false){
            return false;
        }else{
            int[] first = new int[mid];
            int[] second = new int[mid];
            for(int i = 0; i < mid ; i++){
                first[i] = Integer.parseInt(String.valueOf(strArray[i]));
            }
            int k = 0;
            for(int j = strArray.length-1; j > mid; j--){
                second[k] =Integer.parseInt(String.valueOf(strArray[j]));
                k++;
            }
            return Arrays.equals(first, second);
        }
    }
}
