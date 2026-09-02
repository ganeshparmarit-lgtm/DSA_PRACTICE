/*
 * Problem: Binary Search
 * Approach: Divide and Conquer
 * TC: O(log n) | SC: O(1)
 */
package Binary_Search;

public class Binarysearch_1 {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // beech wala index

            if (nums[mid] == target) {
                return mid; // mil gaya!
            } else if (nums[mid] < target) {
                low = mid + 1; // target right mein hai
            } else {
                high = mid - 1; // target left mein hai
            }
        }
        return -1; // nahi mila
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 9;
        System.out.println("Index: " + search(arr, target));
    }
}