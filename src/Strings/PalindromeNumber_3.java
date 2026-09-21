package Strings;

/*
 * Problem: Palindrome Number
 * Approach: Reverse the Number
 * TC: O(log10(n)) | SC: O(1)
 */

public class PalindromeNumber_3 {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x > 0) {

            // Get last digit
            int digit = x % 10;

            // Add digit to reverse
            reverse = reverse * 10 + digit;

            // Remove last digit
            x = x / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}