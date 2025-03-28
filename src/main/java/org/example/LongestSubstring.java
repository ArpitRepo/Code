package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static String longestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Initialize variables
        String longest = "";
        int start = 0;
        Map<Character, Integer> seen = new HashMap<>();

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currensChar = s.charAt(end);
            // If the character is already in the seen map and its index is greater than or equal to the start,
            // update the start index to the next index of the repeating character
            if (seen.containsKey(currensChar) && seen.get(currensChar) >= start) {
                start = seen.get(currensChar) + 1;
            }
            // Update the index of the current character in the seen map
            seen.put(currensChar, end);
            // Update the longest substring if necessary
            String currentSubstring = s.substring(start, end + 1);
            if (currentSubstring.length() > longest.length()) {
                longest = currentSubstring;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s)); // Output: "abc"
    }
}
