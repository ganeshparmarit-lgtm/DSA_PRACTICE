package Binary_Search;

/*
 * Problem: Single Element in a Sorted Array
 * Approach: Modified Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class SingleElementInSortedArray_9 {

    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Make mid even so that mid and mid + 1 form a pair
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct, so single element is on the right
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            }

            // Pair is broken, so single element is at mid or on the left
            else {
                end = mid;
            }
        }

        return nums[start];
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        System.out.println(singleNonDuplicate(nums));
    }
}
