package Binary_Search;

/*
 * Problem: Find Floor in a Sorted Array
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class FloorInSortedArray_10 {

    public static int findFloor(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;

        int floor = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {

                floor = mid;
                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {

        int[] arr = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28};
        int x = 26;

        System.out.println(findFloor(arr, x));
    }
}