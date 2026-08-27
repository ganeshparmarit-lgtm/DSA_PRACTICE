/*
 * Problem: Merge Sorted Array
 * Approach: Three Pointer
 * TC: O(m + n) | SC: O(1)
 */
package Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;       // nums1 ka last actual element
        int j = n - 1;       // nums2 ka last element
        int k = m + n - 1;   // nums1 ka last position

        // End se elements compare karo
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Agar nums2 me elements bach gaye
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 3, nums2, 3);

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
