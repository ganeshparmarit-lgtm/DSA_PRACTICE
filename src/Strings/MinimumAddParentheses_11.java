package Strings;

/*
 * Problem: Minimum Add to Make Parentheses Valid
 * Approach: Track unmatched '(' and extra ')'.
 * TC: O(n) | SC: O(1)
 */

public class MinimumAddParentheses_11 {

    public static int minAddToMakeValid(String s) {

        int open = 0;
        int add = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                open++;
            }
            else if (open > 0) {
                open--;
            }
            else {
                add++;
            }
        }

        return add + open;
    }

    public static void main(String[] args) {

        String s = "())";

        System.out.println(minAddToMakeValid(s));
    }
}