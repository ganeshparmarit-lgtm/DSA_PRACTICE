/*
 * Problem: Subarray Sum Equals K
 * Approach: HashMap (Prefix Sum)
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.HashMap;

public class SubArraySumEqualToK_26 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // prefix sum

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k); // count add karo
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1); // frequency update
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println("Count: " + subarraySum(arr, k));
    }
}