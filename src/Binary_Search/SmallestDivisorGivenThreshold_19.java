package Binary_Search;

/*
 * Problem: Find the Smallest Divisor Given a Threshold
 * Approach: Binary Search on Answer
 * TC: O(n log max(nums)) | SC: O(1)
 */

public class SmallestDivisorGivenThreshold_19 {

    public static int smallestDivisor(int[] nums, int threshold) {

        int start = 1;
        int end = 0;

        // Maximum element is the maximum possible divisor
        for (int num : nums) {
            end = Math.max(end, num);
        }

        int answer = end;

        while (start <= end) {

            // mid is our current divisor
            int mid = start + (end - start) / 2;

            int sum = 0;

            // Calculate total using mid as divisor
            for (int num : nums) {

                // Calculate ceiling of num / mid
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {

                // Valid divisor, try smaller divisor
                answer = mid;
                end = mid - 1;

            } else {

                // Divisor is too small, increase it
                start = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        System.out.println(smallestDivisor(nums, threshold));
    }
}
