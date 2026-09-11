package Binary_Search;

/*
 * Problem: Minimum Number of Days to Make M Bouquets
 * Approach: Binary Search on Answer
 * TC: O(n log maxDay) | SC: O(1)
 */

public class MinimumDaysToMakeBouquets_18 {

    public static int minDays(int[] bloomDay, int m, int k) {

        // If required flowers are more than available flowers
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int start = 1;
        int end = 0;

        // Find the maximum blooming day
        for (int day : bloomDay) {
            end = Math.max(end, day);
        }

        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int bouquets = 0;
            int consecutive = 0;

            // Check how many bouquets can be made by mid day
            for (int day : bloomDay) {

                if (day <= mid) {

                    consecutive++;

                    // k consecutive flowers make one bouquet
                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }

                } else {

                    // Unbloomed flower breaks the consecutive sequence
                    consecutive = 0;
                }
            }

            if (bouquets >= m) {

                // Possible, so try fewer days
                answer = mid;
                end = mid - 1;

            } else {

                // Not possible, so need more days
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] bloomDay = {1, 2, 4, 9, 3};
        int m = 2;
        int k = 2;

        System.out.println(minDays(bloomDay, m, k));
    }
}
