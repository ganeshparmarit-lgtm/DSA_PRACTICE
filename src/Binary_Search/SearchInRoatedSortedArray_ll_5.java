package Binary_Search;

/*
 * Problem: Search in Rotated Sorted Array II
 * Approach: Modified Binary Search with duplicate handling
 * TC: O(log n) average, O(n) worst case | SC: O(1)
 */

public class SearchInRoatedSortedArray_ll_5{

    public static boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates
            if (nums[start] == nums[mid]) {
                start++;
                continue;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }
}