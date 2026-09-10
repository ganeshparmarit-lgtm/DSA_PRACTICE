package Binary_Search;

/*
 * Problem: Koko Eating Bananas
 * Approach: Binary Search on Answer
 * TC: O(n log m) | SC: O(1)
 */

public class KokoEatingBananas_15 {

    public static int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 0;

        // Find maximum pile
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        while (start < end) {

            // Try this eating speed
            int mid = start + (end - start) / 2;

            int hours = 0;

            // Calculate total hours needed
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {

                // Speed works, try smaller speed
                end = mid;

            } else {

                // Speed is too slow, increase it
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}
