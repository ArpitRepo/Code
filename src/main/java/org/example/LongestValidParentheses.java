package org.example;



/*

Valid parenthesis
Use Stack
then check if it's opening bracket, insert them in Stack
else
take the top one store in var and then pop it
then compare the closing bracket with the var
 return stack.isEmpty();

 */

// by this we will be getting the {([ which are having proper closing
//Refer the sheet not the below code

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;

        // Use an array to keep track of the indices of unmatched parentheses
        int[] unmatchedIndices = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char currensChar = s.charAt(i);

            if (currensChar == '(' || currensChar == '{' || currensChar == '[') {
                stack.push(i);
            } else if (!stack.isEmpty()) {
                // If the stack is not empty and the current character is a closing parenthesis
                int startIndex = stack.pop();
                unmatchedIndices[i] = startIndex;
                int len = (i - startIndex + 1);

                // If there is an inner valid substring, add its length
                if (startIndex > 0) {
                    len += unmatchedIndices[startIndex - 1];
                }

                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String parenthesesString = "({)()[]}";
        int result = longestValidParentheses(parenthesesString);
        System.out.println("Longest valid parentheses substring length: " + result);
    }
}

/*
We use a stack to keep track of opening parentheses encountered.
When we encounter an opening parenthesis ('(', '[', '{'), we push it onto the stack.
When we encounter a closing parenthesis (')', ']', '}'), we check if it matches the top of the stack.
If not, or if there's no opening parenthesis to match, the string is not valid.
After iterating through all characters, if the stack is empty, the string is valid; otherwise, it's not valid.






 */