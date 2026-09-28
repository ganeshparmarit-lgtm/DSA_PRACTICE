package Strings;

/*
 * Problem: String to Integer (ATOI)
 * Approach: Remove leading spaces, check sign, process digits one by one,
 *           and handle integer overflow.
 * TC: O(n) | SC: O(1)
 */

public class StringToInteger_16 {

    public static int myAtoi(String s) {

        s = s.trim();

        int sign = 1;
        int i = 0;
        long res = 0;

        // Check empty string
        if (s.length() == 0) {
            return 0;
        }

        // Check sign
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Process digits
        while (i < s.length()) {

            char ch = s.charAt(i);

            // Stop at non-digit character
            if (ch < '0' || ch > '9') {
                break;
            }

            // Convert character to digit
            res = res * 10 + (ch - '0');

            // Handle overflow
            if (sign * res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * res);
    }

    public static void main(String[] args) {

        String s = "   -42abc";

        System.out.println(myAtoi(s));
    }
}
