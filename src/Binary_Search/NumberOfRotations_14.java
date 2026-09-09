package Binary_Search;

/*
 * Problem: Find out how many times an array is rotated
 * Approach: Modified Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class NumberOfRotations_14 {

    public static int findRotationCount(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Minimum is on the right side
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                // Minimum is at mid or on the left
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};

        System.out.println(findRotationCount(arr));
    }
}
