package Binary_Search;

/*
 * Problem: Find Peak Element
 * Approach: Modified Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class FindPeakElement_12 {

    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {

                // We are going uphill, so peak is on the right
                start = mid + 1;

            } else {

                // We are going downhill, so peak is at mid or on the left
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(findPeakElement(nums));
    }
}
