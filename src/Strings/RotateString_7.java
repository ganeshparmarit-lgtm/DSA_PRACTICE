package Strings;

/*
 * Problem: Rotate String
 * Approach: Concatenate the string with itself and check whether goal exists as a substring.
 * TC: O(n) | SC: O(n)
 */

public class RotateString_7 {

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}
