package Strings;

/*
 * Problem: Sort Characters By Frequency
 * Approach: Count frequency using array, then repeatedly find the character
 *           with maximum frequency and add it to the result.
 * TC: O(n) | SC: O(1)
 */

public class SortCharacterByFrequency_9 {

    public static String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();

        int[] freq = new int[128];

        int n = s.length();

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }

        // Pick highest frequency character repeatedly
        while (sb.length() < n) {

            int max = 0;

            // Find character with maximum frequency
            for (int i = 1; i < 128; i++) {

                if (freq[i] > freq[max]) {
                    max = i;
                }
            }

            // Add character frequency times
            for (int i = 0; i < freq[max]; i++) {
                sb.append((char) max);
            }

            // Mark character as processed
            freq[max] = 0;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "tree";

        System.out.println(frequencySort(s));
    }
}
