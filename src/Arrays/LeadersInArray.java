/*
 * Problem: Leaders in an Array
 * Approach: Traverse from right
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length - 1]; // last element hamesha leader
        result.add(max);

        // peeche se traverse karo
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i]; // max update karo
                result.add(max); // leader add karo
            }
        }

        Collections.reverse(result); // order sahi karo
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }
}
