package main.java.randomPrograms;

import java.util.*;

public class StringAnagramGrouping {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> retStrList = new ArrayList<>();
        //Set<Set<String>> retStrSet = new HashSet<>();

        for(int i = 0; i< strs.length; i++){
            Set<String> temp = new HashSet<>();
            for(int j = i; j< strs.length; j++) {
                if (isAnagramString(strs[i], strs[j])) {
                    temp.add(strs[i]);
                    temp.add(strs[j]);
                }
            }
            retStrList.add(temp.stream().toList());
        }
        return  retStrList;
    }

    public static boolean isAnagramString(String one, String two){
        //check str length same or not
        if(one.length() == two.length()){
            // convert to lowercase, then charArray and sort & compare
            one = one.toLowerCase();
            two = two.toLowerCase();
            char[] oneCharArray = one.toCharArray();
            char[] twoCharArray = two.toCharArray();
            Arrays.sort(oneCharArray);
            Arrays.sort(twoCharArray);
            return Arrays.equals(oneCharArray, twoCharArray);
        }else{
            return false;
        }
    }

}
