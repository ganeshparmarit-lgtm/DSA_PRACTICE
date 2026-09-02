/*
 * Problem: Find First and Last Position of Element in Sorted Array
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */
package Binary_Search;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // First occurrence find karo
    public static int findFirst(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;       // aur left me search karo
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return first;
    }

    // Last occurrence find karo
    public static int findLast(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;     // aur right me search karo
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}