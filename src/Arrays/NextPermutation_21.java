/*
 * Problem: Next Permutation
 * Approach: 3 Steps — Pivot, Swap, Reverse
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class NextPermutation_21 {
    public static void nextPermutation(int[] nums) {

        // Step 1: Pivot dhundho peeche se
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Pivot mila → swap karo
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Pivot ke baad reverse karo
        int start = i + 1;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}