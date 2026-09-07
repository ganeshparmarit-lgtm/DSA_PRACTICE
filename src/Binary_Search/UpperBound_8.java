package Binary_Search;

/*
 * Problem: Upper Bound
 * Approach: Linear Search
 * TC: O(n) | SC: O(1)
 */

public class UpperBound_8 {

    public static int upperBound(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > target) {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5, 7};
        int target = 4;

        System.out.println(upperBound(arr, target));
    }
}