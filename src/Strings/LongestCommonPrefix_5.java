package Strings;

/*
 * Problem: Longest Common Prefix
 * Approach: Sort the strings, then compare the first and last string character by character.
 * TC: O(n log n + m) | SC: O(m)
 */

import java.util.Arrays;

public class LongestCommonPrefix_5 {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {

            if (first[i] != last[i]) {
                break;
            }

            result.append(first[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}
