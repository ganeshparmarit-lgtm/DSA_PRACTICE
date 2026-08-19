/*
 * Problem: Print Subarray with Maximum Sum
 * Approach: Kadane's + Index Tracking
 * TC: O(n) | SC: O(1)
 */

package Arrays;

public class PrintMaxSubarray_18 {
    public static void printMaxSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int start = 0, ansStart = 0, ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (curr == 0) start = i; // naya subarray yahan se

            curr += arr[i];

            if (curr > max) {
                max = curr;
                ansStart = start; // start update karo
                ansEnd = i;       // end update karo
            }

            if (curr < 0) curr = 0; // negative → reset
        }

        System.out.println("Max Sum: " + max);
        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printMaxSubarray(arr);
    }
}
