package Strings;

/*
 * Problem: Reverse String
 * Approach: Two Pointer
 * TC: O(n) | SC: O(1)
 */

public class ReverseString_1 {

    public static void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {

            // Swap first and last characters
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.println(s);
    }
}
