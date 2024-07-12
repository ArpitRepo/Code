package org.example;


/*

User
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */

public class indexOfString {


    static int meth() {
        String haystack = "sadbutsad";
        String needle = "sadi";

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) { // Check if first character matches
                String subHaystack = haystack.substring(i, i + needle.length());
                if (subHaystack.equalsIgnoreCase(needle)) {
                    return i; // Return index if substring matches needle
                }
            }
        }
        return -1; // Return -1 if no match is found
    }
    public static void main(String[] args) {
        int val =meth();
        System.out.println(val);
    }


}
