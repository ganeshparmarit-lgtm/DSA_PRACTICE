package Binary_Search;

/*
 * Problem: Number of Occurrences in a Sorted Array
 * Approach: Binary Search using Lower Bound and Upper Bound
 * TC: O(log n) | SC: O(1)
 */

public class NumberOfOcurrences_13 {

    public static int countFreq(int[] arr, int target) {

        // First position where target can occur
        int first = lowerBound(arr, target);

        // Position just after the last target
        int last = upperBound(arr, target);

        // Difference gives number of occurrences
        return last - first;
    }

    public static int lowerBound(int[] arr, int target) {

        int start = 0;
        int end = arr.length;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Target is on the right side
            if (arr[mid] < target) {
                start = mid + 1;
            }

            // mid can be the first position
            else {
                end = mid;
            }
        }

        return start;
    }

    public static int upperBound(int[] arr, int target) {

        int start = 0;
        int end = arr.length;

        while (start < end) {

            int mid = start + (end - start) / 2;

            // Move right to find position after target
            if (arr[mid] <= target) {
                start = mid + 1;
            }

            // mid can be the upper bound
            else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3};
        int target = 2;

        System.out.println(countFreq(arr, target));
    }
}
