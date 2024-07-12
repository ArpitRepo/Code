package org.example;

import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Trim the input to remove leading and trailing whitespace
        input = input.trim();

        // Split the input string into words using whitespace as the delimiter
        String[] words = input.split("\\s+");

        // Get the length of the last word
        int lastWordLength = words.length > 0 ? words[words.length - 1].length() : 0;

        // Print the length of the last word
        System.out.println("Length of the last word: " + lastWordLength);
    }
}

