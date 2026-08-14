/*
 * All Array Rotation Problems
 * TC: O(n) | SC: O(1) for all
 */
package Arrays;

public class ArrayRotations_06 {

    // ==========================================
    // 1. Left Rotate by One
    // ==========================================
    public static void leftRotateByOne(int[] arr) {
        int temp = arr[0]; // pehla element save karo
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // sab left shift
        }
        arr[arr.length - 1] = temp; // last pe pehla element
    }

    // ==========================================
    // 2. Right Rotate by One
    // ==========================================
    public static void rightRotateByOne(int[] arr) {
        int temp = arr[arr.length - 1]; // last element save karo
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // sab right shift
        }
        arr[0] = temp; // pehle pe last element
    }

    // ==========================================
    // 3. Left Rotate by K Places
    // ==========================================
    public static void leftRotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // edge case
        reverse(arr, 0, k - 1);   // pehle k reverse
        reverse(arr, k, n - 1);   // baaki reverse
        reverse(arr, 0, n - 1);   // pura reverse
    }

    // ==========================================
    // 4. Right Rotate by K Places
    // ==========================================
    public static void rightRotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // edge case
        reverse(arr, 0, n - 1);   // pura reverse
        reverse(arr, 0, k - 1);   // pehle k reverse
        reverse(arr, k, n - 1);   // baaki reverse
    }

    // ==========================================
    // Helper - Reverse
    // ==========================================
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // ==========================================
    // Main - Testing
    // ==========================================
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        leftRotateByOne(arr1);
        System.out.print("Left Rotate by One: ");
        print(arr1);

        int[] arr2 = {1, 2, 3, 4, 5};
        rightRotateByOne(arr2);
        System.out.print("Right Rotate by One: ");
        print(arr2);

        int[] arr3 = {1, 2, 3, 4, 5};
        leftRotateByK(arr3, 2);
        System.out.print("Left Rotate by K=2: ");
        print(arr3);

        int[] arr4 = {1, 2, 3, 4, 5};
        rightRotateByK(arr4, 2);
        System.out.print("Right Rotate by K=2: ");
        print(arr4);
    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}