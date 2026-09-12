package Binary_Search;

import java.util.Arrays;

/*
 * Problem: Aggressive Cows
 * Approach: Binary Search on Answer
 * TC: O(n log n + n log(maxPosition - minPosition)) | SC: O(1)
 */

public class AggressiveCows_20 {

    public static int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];

        int answer = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if k cows can be placed with minimum distance mid
            if (canPlace(stalls, k, mid)) {

                // Possible, try a larger distance
                answer = mid;
                start = mid + 1;

            } else {

                // Not possible, try a smaller distance
                end = mid - 1;
            }
        }

        return answer;
    }

    public static boolean canPlace(int[] stalls, int k, int distance) {

        int cows = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            // Place cow if required distance is maintained
            if (stalls[i] - lastPosition >= distance) {

                cows++;
                lastPosition = stalls[i];
            }

            // Required cows are placed
            if (cows == k) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println(aggressiveCows(stalls, k));
    }
}
