/*
 * Problem: Count Subarrays with XOR K
 * Approach: Prefix XOR + HashMap
 * TC: O(n) | SC: O(n)
 */
package Arrays;

import java.util.HashMap;

public class CountSubarraysWithXorK_33 {

    public static int subarrayXor(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count = 0;

        // Starting me XOR = 0 ek baar maana
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            // Current prefix XOR
            xor = xor ^ arr[i];

            // Required previous XOR
            int required = xor ^ k;

            // Agar required XOR pehle mila hai
            if (map.containsKey(required)) {
                count += map.get(required);
            }

            // Current XOR ki frequency store/update karo
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(subarrayXor(arr,));
    }
}
