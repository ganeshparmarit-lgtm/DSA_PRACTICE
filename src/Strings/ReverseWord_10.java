package Strings;

/*
 * Problem: Reverse Words in a String
 * Approach: Split the string into words, then traverse from last word to first.
 * TC: O(n) | SC: O(n)
 */

public class ReverseWord_10 {

    public static String reverseWords(String s) {

        String[] words = s.split("\\s+");

        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            res.append(words[i]);

            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }
}
