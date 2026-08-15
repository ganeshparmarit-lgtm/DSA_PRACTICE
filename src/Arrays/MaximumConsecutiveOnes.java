/*
 * Problem: Max Consecutive Ones
 * Approach: Array Traversal
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxi = 0;               // final result tracker
        int count = 0;              // current one's tracker

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);         //maximum value
            } else {
                count = 0;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};

        System.out.println("Maximum Consecutive Ones: "
                + findMaxConsecutiveOnes(arr));
    }
}