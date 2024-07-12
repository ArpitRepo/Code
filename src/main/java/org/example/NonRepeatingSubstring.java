package org.example;

import java.util.HashMap;

public class NonRepeatingSubstring {
    public static int lengthOfLongestSubstring(String s) {


        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currensChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currensChar)) {
                startIndex = Math.max(startIndex, charIndexMap.get(currensChar) + 1);
            }

            charIndexMap.put(currensChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}

