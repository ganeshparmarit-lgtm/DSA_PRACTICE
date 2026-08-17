/*
 * Problem: Two Sum
 * Approach: HashMap
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int findme = target - arr[i]; // complement dhundho

            if (map.containsKey(findme)) {
                return new int[]{i, map.get(findme)}; // answer mila!
            }

            map.put(arr[i], i); // pehle check, phir daalo
        }
        return null; // answer nahi mila
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
