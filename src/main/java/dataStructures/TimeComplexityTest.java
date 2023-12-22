/*
*   Time Complexity
*   The amount of time taken by an algorithm to run, as a function of the length of the input.
*   It measures the time taken to execute each statement of code in an algorithm. It is not going to examine the total
*   execution time of an algorithm.
*   Also, the results are different on different machines, and network load too considered. Even when we run same code
*   few times, we may get different results.
 * */
package main.java.dataStructures;

public class TimeComplexityTest {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        //System.out.println("Sum using formula - "+findSumUsingFormula(10000));
        System.out.println("Sum using Loop - "+findSumUsingLoop(10000));
        System.out.println("Time Taken : "+ (System.currentTimeMillis()-now) + " milliseconds");
    }

    private static int findSumUsingFormula(int n) {
        return n * (n+1) / 2;
    }

    private static int findSumUsingLoop(int n) {
        int sum = 0;
        for(int i = 0 ; i <= n ; i++){
            sum = sum + i ;
        }
        return sum;
    }
}
