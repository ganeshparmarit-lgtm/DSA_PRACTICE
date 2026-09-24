package Strings;

/*
 * Problem: Valid Anagram
 * Approach: Count character frequencies using an integer array.
 * TC: O(n) | SC: O(1)
 */

public class ValidAnagram_8{

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int value : count) {

            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
