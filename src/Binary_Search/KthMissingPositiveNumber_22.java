package Binary_Search;

/*
 * Problem: Kth Missing Positive Number
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class KthMissingPositiveNumber_22 {

    public static int findKthPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Count missing numbers before or at mid
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {

                // Need more missing numbers, go right
                start = mid + 1;

            } else {

                // Enough missing numbers, go left
                end = mid - 1;
            }
        }

        // start tells how many array elements are before the answer
        return start + k;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println(findKthPositive(arr, k));
    }
}
