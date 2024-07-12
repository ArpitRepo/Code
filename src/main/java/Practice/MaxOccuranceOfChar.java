package Practice;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceOfChar {

        public static char findMaxOccurrence(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("Input string is null or empty");
            }

            Map<Character, Integer> charCountMap = new HashMap<>();
            int maxCount = 0;
            char maxChar = '\0'; // Initialize with null character

            // Iterate over each character in the string
            for (char c : str.toCharArray()) {
                // Update count in the map
                int count = charCountMap.getOrDefault(c, 0) + 1;
                charCountMap.put(c, count);

                // Update max count and max char if needed
                maxCount = Math.max(maxCount, count);
                if (count == maxCount) {
                    maxChar = c;
                }
            }

            return maxChar;
        }

        public static void main(String[] args) {
            String input = "hello";
            char maxChar = findMaxOccurrence(input);
            System.out.println("Character with maximum occurrence: " + maxChar);
        }
    }

