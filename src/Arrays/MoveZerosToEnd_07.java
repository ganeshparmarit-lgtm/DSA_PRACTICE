/*
 * Problem: Move Zeroes
 * Approach: Two Pointer
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class MoveZerosToEnd_07 {
    public static void moveZeroes(int[] nums) {
        int j = 0;                    // pehli zero ki position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {          // non-zero mila
                // swap karo — non-zero aage, zero peeche
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; // agli zero dhundho
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3};
        moveZeroes(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
