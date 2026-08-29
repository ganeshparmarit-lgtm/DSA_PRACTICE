/*
 * Problem: Maximum Product Subarray
 * Approach: Track Maximum & Minimum
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class MaximumProductSubarray_37 {

    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Purana max save karo
            int temp = max;

            // Maximum product find karo
            max = Math.max(
                    Math.max(max * nums[i], min * nums[i]),
                    nums[i]
            );

            // Minimum product find karo
            min = Math.min(
                    Math.min(temp * nums[i], min * nums[i]),
                    nums[i]
            );

            // Answer update karo
            if (max > ans) {
                ans = max;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        System.out.println("Maximum Product: " + maxProduct(nums));
    }
}
