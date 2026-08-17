/*
 * Problem: Longest Subarray with Sum K
 * Approach: HashMap (Prefix Sum)
 * TC: O(n) | SC: O(n)
 */


package Arrays;

import java.util.HashMap;

public class LongestSubarrayWithSumK_13 {
    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // base case

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // prefix sum update karo

            if (sum == k) {
                maxLen = i + 1; // index 0 se i tak pura subarray
            }

            if (map.containsKey(sum - k)) {
                // beech ka subarray = K mila!
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i); // pehli baar hi store karo
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1};
        int k = 3;
        System.out.println("Longest Subarray Length: " + longestSubarray(arr, k));
    }
}