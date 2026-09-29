package Strings;

/*
 * Problem: Longest Palindromic Substring
 * Approach: Expand Around Center
 * TC: O(n^2) | SC: O(1)
 */

public class LongestPalindromicSubstring_17 {

    public static String longestPalindrome(String s) {

        if (s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int oddLength = expandAroundCenter(s, i, i);

            // Even length palindrome
            int evenLength = expandAroundCenter(s, i, i + 1);

            int currentLength = Math.max(oddLength, evenLength);

            if (currentLength > maxLength) {

                maxLength = currentLength;

                start = i - (currentLength - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}
