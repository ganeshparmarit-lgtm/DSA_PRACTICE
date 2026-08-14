/*
 * Problem: Right Rotate Array by One
 * Approach: Shift elements right
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class RightRotateArrayByOne_05 {
    public static void rotate(int[] nums) {
        int temp = nums[nums.length - 1]; // last element save karo

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1]; // sab ek jagah right shift
        }

        nums[0] = temp; // pehle pe last element rakho
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
//left rotate array by one - change only this
//int temp = nums[0]; // pehla element save karo
//nums[nums.length - 1] = temp; // last pe pehla element rakho