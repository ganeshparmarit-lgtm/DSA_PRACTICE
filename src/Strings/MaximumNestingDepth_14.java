package Strings;

/*
 * Problem: Maximum Nesting Depth of Parentheses
 * Approach: Track current depth and maximum depth.
 * TC: O(n) | SC: O(1)
 */

public class MaximumNestingDepth_14 {

    public static int maxDepth(String s) {

        int count = 0;
        int maxNum = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                count++;

                if (maxNum < count) {
                    maxNum = count;
                }

            } else if (c == ')') {

                count--;
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}