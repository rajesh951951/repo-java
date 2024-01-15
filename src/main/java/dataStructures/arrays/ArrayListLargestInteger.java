package main.java.dataStructures.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListLargestInteger {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 12, 34, 51, 22, 63, 71, 6, 98, 460, 349);
        int maxInt = findMaxIntForLoop(integerList);
        System.out.println("Max Int using Loop : " + maxInt);

        maxInt = findMaxIntListIterator(integerList);
        System.out.println("Max Int using List Iterator : " + maxInt);

        maxInt = findMaxIntJavaStream(integerList);
        System.out.println("Max Int using Java Stream : " + maxInt);
    }

    private static int findMaxIntJavaStream(List<Integer> integerList) {
        return integerList.stream().max(Integer::compareTo).get();
    }

    private static int findMaxIntListIterator(List<Integer> integerList) {
        int maxInt = Integer.MIN_VALUE;
        Iterator<Integer> iterator = integerList.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            if(i > maxInt)
                maxInt = i;
        }
        return maxInt;
    }

    private static int findMaxIntForLoop(List<Integer> integerList) {
        int maxInt = Integer.MIN_VALUE;
        for (int i : integerList) {
            if (i > maxInt)
                maxInt = i;
        }
        return maxInt;
    }
}
