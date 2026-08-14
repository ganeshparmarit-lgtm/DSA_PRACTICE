/*
 * Problem: Check if Array is Sorted and Rotated
 * Approach: Count rule breaks
 * TC: O(n) | SC: O(1)
 */


package Arrays;

public class ArrayIsSortedAndRoated_03 {
    public static boolean check(int[] arr) {
        int count = 0;

        // adjacent pairs check kare
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++; // rule toota
            }
        }

        // last aur pehla element check kare (circular)
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }

        // sirf ek baar rule toota → sorted rotated
        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println("Sorted and Rotated: " + check(arr));
    }
}
