/*
 * Problem: Next Permutation
 * Approach: Pivot + Swap + Reverse
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        // STEP 1: Right se pivot find karo
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // STEP 2: Pivot mila to usse bada element find karke swap karo
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // STEP 3: Pivot ke baad ka part reverse karo
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

        System.out.print("Next Permutation: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}