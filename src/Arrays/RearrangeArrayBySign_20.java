/*
 * Problem: Rearrange Array Elements by Sign
 * Approach: Two Pointer
 * TC: O(n) | SC: O(n)
 */
package Arrays;

public class RearrangeArrayBySign_20 {
    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positiveIndex = 0; // even positions
        int negativeIndex = 1; // odd positions

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[positiveIndex] = nums[i]; // positive even pe
                positiveIndex += 2;
            } else {
                result[negativeIndex] = nums[i]; // negative odd pe
                negativeIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(arr);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
