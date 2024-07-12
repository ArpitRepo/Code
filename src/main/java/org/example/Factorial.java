package org.example;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this to any number for which you want to calculate factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

    }
//n Java, when a method returns the integer value 1, it typically indicates that the method has completed successfully and is returning a specific result
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            //System.out.println(n * calculateFactorial(n - 1));
            return n * calculateFactorial(n - 1);

        }
    }
}
