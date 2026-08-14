/*
 * Problem: Linear Search
 * Approach: Traverse array one by one
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class LinearSearch_08 {
    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // element mila → index return karo
            }
        }
        return -1; // element nahi mila
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 5, 2};
        int x = 8;
        System.out.println("Index: " + search(arr, x));
    }
}
