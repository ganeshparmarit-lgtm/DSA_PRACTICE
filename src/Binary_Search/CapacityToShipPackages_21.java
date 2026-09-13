package Binary_Search;

/*
 * Problem: Capacity To Ship Packages Within D Days
 * Approach: Binary Search on Answer
 * TC: O(n log sum(weights)) | SC: O(1)
 */

public class CapacityToShipPackages_21 {

    public static int shipWithinDays(int[] weights, int days) {

        int start = 0;
        int end = 0;

        // Maximum package weight = minimum possible capacity
        // Total weight = maximum possible capacity
        for (int weight : weights) {

            start = Math.max(start, weight);
            end += weight;
        }

        while (start < end) {

            // mid is our current ship capacity
            int mid = start + (end - start) / 2;

            int daysNeeded = 1;
            int currentWeight = 0;

            // Calculate days needed with capacity mid
            for (int weight : weights) {

                if (currentWeight + weight > mid) {

                    // Current package does not fit, start new day
                    daysNeeded++;
                    currentWeight = 0;
                }

                currentWeight += weight;
            }

            if (daysNeeded <= days) {

                // Capacity works, try smaller capacity
                end = mid;

            } else {

                // Capacity is too small, increase capacity
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5, 6, 7};
        int days = 3;

        System.out.println(shipWithinDays(weights, days));
    }
}
