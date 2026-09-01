
/*
 * Problem: Search Insert Position
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */
package Binary_Search;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            // Middle index
            int mid = start + (end - start) / 2;

            // Target mil gaya
            if (nums[mid] == target) {
                return mid;
            }

            // Mid ka element target se bada hai
            // Left side me search karo
            else if (nums[mid] > target) {
                end = mid - 1;
            }

            // Mid ka element target se chhota hai
            // Right side me search karo
            else {
                start = mid + 1;
            }
        }

        // Target nahi mila → yahi insertion position hai
        return start;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 4;

        System.out.println(searchInsert(nums, target));
    }
}
