package Binary_Search;

/*
 * Problem: Find Ceil in a Sorted Array
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class CeilInSortedArray_11 {

    public static int findCeil(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;

        int ceil = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= x) {

                ceil = mid;
                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8};
        int x = 5;

        System.out.println(findCeil(arr, x));
    }
}
