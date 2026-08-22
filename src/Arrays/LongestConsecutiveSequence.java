/*
 * Problem: Longest Consecutive Sequence
 * Approach: HashSet
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Saare elements Set me add karo
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Har number ko check karo
        for (int num : set) {

            // Agar previous number nahi hai,
            // to ye sequence ka starting point hai
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Consecutive numbers check karo
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Maximum length update karo
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Sequence: "
                + longestConsecutive(arr));
    }
}
