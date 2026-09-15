package Binary_Search;

/*
 * Problem: Median of Two Sorted Arrays
 * Approach: Binary Search on Smaller Array
 * TC: O(log(min(m, n))) | SC: O(1)
 */

public class MedianOfTwoSortedArrays_23 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Binary search always on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int start = 0;
        int end = m;

        while (start <= end) {

            // Partition positions
            int cut1 = start + (end - start) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            // Boundary values around partitions
            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = cut1 == m ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = cut2 == n ? Integer.MAX_VALUE : nums2[cut2];

            // Check if partition is correct
            if (left1 <= right2 && left2 <= right1) {

                // Odd total → maximum of left side
                if ((m + n) % 2 == 1) {
                    return Math.max(left1, left2);
                }

                // Even total → average of middle two values
                return (Math.max(left1, left2)
                        + Math.min(right1, right2)) / 2.0;
            }

            // nums1 partition is too far right
            if (left1 > right2) {
                end = cut1 - 1;

            } else {

                // nums1 partition is too far left
                start = cut1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}