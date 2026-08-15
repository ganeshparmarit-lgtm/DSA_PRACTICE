/*
 * Problem: Missing Number
 * Approach: Sum Formula
 * TC: O(n) | SC: O(1)
 */

package Arrays;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2; // 1 se n tak ka sum
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i]; // array ka actual sum
        }

        return expectedSum - actualSum; // difference = missing number
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 4};
        System.out.println("Missing: " + missingNumber(arr));
    }
}
