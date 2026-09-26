package Strings;

/*
 * Problem: Remove Outermost Parentheses
 * Approach: Use depth to identify and skip the outermost brackets.
 * TC: O(n) | SC: O(n)
 */

public class RemoveOuterParentheses_13 {

    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();

        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                // Add only inner '('
                if (depth > 0) {
                    sb.append(ch);
                }

                depth++;
            }

            else {

                depth--;

                // Add only inner ')'
                if (depth > 0) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "(()())";

        System.out.println(removeOuterParentheses(s));
    }
}
