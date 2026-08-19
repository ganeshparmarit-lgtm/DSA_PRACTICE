/*
 * Problem: Maximum Subarray
 * Approach: Kadane's Algorithm
 * TC: O(n) | SC: O(1)
 */


package Arrays;

public class MaximumSubarray_17 {

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {

            // New subarray start karo OR current subarray continue karo
            curr = Math.max(nums[i], nums[i] + curr);

            // Overall maximum sum update karo
            max = Math.max(curr, max);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
    }
}
