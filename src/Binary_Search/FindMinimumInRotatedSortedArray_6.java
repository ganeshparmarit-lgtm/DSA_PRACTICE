package Binary_Search;

/*
 * Problem: Find Minimum in Rotated Sorted Array
 * Approach: Modified Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class FindMinimumInRotatedSortedArray_6 {

    public static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Minimum lies in right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            // Minimum lies at mid or in left half
            else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        System.out.println(findMin(nums));
    }
}