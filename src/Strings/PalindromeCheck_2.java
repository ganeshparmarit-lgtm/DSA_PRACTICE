package Strings;

/*
 * Problem: Palindrome Check
 * Approach: Two Pointer
 * TC: O(n) | SC: O(1)
 */

public class PalindromeCheck_2 {

    public static boolean palindromeCheck(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            // Compare first and last characters
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "madam";

        System.out.println(palindromeCheck(s));
    }
}