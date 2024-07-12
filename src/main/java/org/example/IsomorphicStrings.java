package org.example;

import java.util.HashMap;
import java.util.Map;

/*
An isomorphic string is a term used in computer science to describe two strings that have a one-to-one mapping of
characters between them. In other words, if you replace all occurrences of characters in one string with corresponding
characters from the other string, you would get the same result.

For example, consider the strings "egg" and "add":
|e|a|
|g|d|
aab
gjh
key <--> v
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {


        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char fChar = s.charAt(i);
            char sChar = t.charAt(i);

            // Check if the mappings are consistent


            if (m1.containsKey(fChar) && m1.get(fChar) != sChar ||
                    m2.containsKey(sChar) && m2.get(sChar) != fChar) {
                return false;
            }

            // Update the mappings
            m1.put(fChar, sChar);
            m2.put(sChar, fChar);
            char a = m1.get(fChar);
            char b= m2.get(sChar);
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        //System.out.println(isIsomorphic("egg", "add"));    // Output: true
        System.out.println(isIsomorphic("foo", "bar"));    // Output: false
        System.out.println(isIsomorphic("paper", "title"));// Output: true
    }
}
