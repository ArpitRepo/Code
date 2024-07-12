package org.example;

import java.util.HashMap;
import java.util.Map;

public class PalindromeSubstring {

/*
IF map contains the key then check for isPalimdrome(you need substring) and longest Palimdromw
 */
/*
return;
Since the return type of the method is String, you should return a string value, not void. To handle the case
where the input string is null or empty, you can return an empty string ("") instead. Here's the corrected version:

 */
    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Initialize variables
        String longest = "";
        Map<Character, Integer> seen = new HashMap<>();

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char currensChar = s.charAt(end);
            // If the character is already in the seen map, update the start index
            if (seen.containsKey(currensChar)) {
                 int start = seen.get(currensChar);
                String currentSubstring = s.substring(start, end + 1);
                if (isPalindrome(currentSubstring) && currentSubstring.length() > longest.length()) {
                    longest = currentSubstring;
                }
            }
            // Update the index of the current character in the seen map
            seen.put(currensChar, end);
        }

        return longest;
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bagad";
        System.out.println(longestPalindromeSubstring(s)); // Output: "bab" or "aba"
    }
}