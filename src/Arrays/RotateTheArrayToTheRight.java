/*
 * Problem: Rotate Array
 * Approach: Reverse Array
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class RotateTheArrayToTheRight {

    // Array ke given range ko reverse karta hai
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            // Start aur end elements ko swap kiya
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;         // Agar k, n se bada hai to extra rotations hata diya

        reverse(nums, 0, n - 1);         // 1. Pura array reverse
        reverse(nums, 0, k - 1);        // 2. First k elements reverse
        reverse(nums, k, n - 1);             // 3. Baaki elements reverse
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(arr, k);
        System.out.print("Rotated Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
