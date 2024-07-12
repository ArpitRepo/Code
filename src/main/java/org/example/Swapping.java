package org.example;


// Swap without using third variable
public class Swapping {

    static void intSwap(){
        int a=5; int b=10;
        a=a+b; //15
        b=a-b; //5
        a=a-b; //10

        System.out.println("a =" +a + " and b = "+b);
    }

    static void swapString(){
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swap without using a third variable
        str1 = str1 + str2;
        System.out.println(str1.length());
        System.out.println(str2.length());
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

    public static void main(String[] args) {
        Swapping.intSwap();
        Swapping.swapString();
    }
}
