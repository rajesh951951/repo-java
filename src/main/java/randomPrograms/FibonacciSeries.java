package main.java.randomPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci Series using Loop
        System.out.print("Enter a number: ");
        int nthNumber = new Scanner(System.in).nextInt();

        if (nthNumber >= 0) {
            System.out.print("Fibonacci Series till " + nthNumber + " :: ");
            for (int i = 0; i <= nthNumber; i++) {
                System.out.print(checkFibonacci(i) + " ");
            }
        } else
            System.out.print("Number should not be negative.");
    }

    private static int checkFibonacci(int nthNumber) {
        int num0 = 0;
        int num1 = 1;

        if (nthNumber == num0)
            return num0;
        else if (nthNumber == num1)
            return num1;
        else {
            int num2 = 0;
            for (int i = 2; i <= nthNumber; i++) {
                num2 = num0 + num1;
                num0 = num1;
                num1 = num2;
            }
            return num2;
        }
    }

}
