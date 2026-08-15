/*
 * Problem: Single Number
 * Approach: XOR
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class SingleNumber_12 {

    public static int singleNumber(int[] nums) {

        int xor = 0;

        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        return xor;
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println("Single Number: " + singleNumber(arr));
    }
}
