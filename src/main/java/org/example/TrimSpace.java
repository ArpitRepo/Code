package org.example;

public class TrimSpace {
    public static void main(String[] args) {
        String var = " This    is   something      special ";
        String var2 = var.trim();
        System.out.println(var2);
        String[] words = var2.split("\\s+");

        System.out.println("\'hello\'");
        // Get the last word from the array
        String lastWord = words[words.length - 1];
        System.out.println(lastWord.length());
    }
}
