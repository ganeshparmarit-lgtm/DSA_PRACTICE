/*
 * Problem: Longest Subarray with Sum 0
 * Approach: Prefix Sum + HashMap
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.HashMap;

public class LongestSubarraySumZero_31 {

    public static int maxLength(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxlen = 0;
        int sum = 0;

        // Sum 0 ko index -1 par store karo
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Same prefix sum pehle aa chuka hai
            if (map.containsKey(sum)) {

                int len = i - map.get(sum);
                maxlen = Math.max(maxlen, len);

            } else {

                // Pehli baar mila sum hi store karo
                map.put(sum, i);
            }
        }

        return maxlen;
    }

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(maxLength(arr));
    }
}