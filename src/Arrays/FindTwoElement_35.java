/*
 * Problem: Find Repeating and Missing Number
 * Approach: Sorting
 * TC: O(n log n) | SC: O(1)
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTwoElement_35 {

    public static ArrayList<Integer> findTwoElement(int[] arr) {

        // Array ko sort karo
        Arrays.sort(arr);

        // Step 1: Repeating element find karo
        int repeating = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                repeating = arr[i];
            }
        }

        // Step 2: Missing element find karo
        int j = 1;

        for (int i = 0; i < arr.length; i++) {

            // Expected number mil gaya
            if (arr[i] == j) {
                j++;
            }

            // Duplicate hai, ignore karo
            else if (arr[i] < j) {
                continue;
            }

            // Current number expected number se bada hai
            // Matlab j missing hai
            else {
                break;
            }
        }

        // Step 3: Result [Repeating, Missing]
        ArrayList<Integer> result = new ArrayList<>();

        result.add(repeating);
        result.add(j);

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 4};

        System.out.println(findTwoElement(arr));
    }
}