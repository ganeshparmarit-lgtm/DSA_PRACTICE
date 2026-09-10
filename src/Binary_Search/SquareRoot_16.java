package Binary_Search;

/*
 * Problem: Square Root of a Number
 * Approach: Binary Search
 * TC: O(log n) | SC: O(1)
 */

public class SquareRoot_16 {

    public static int squareRoot(int n) {

        int start = 1;
        int end = n;
        int answer = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check if mid is a possible square root
            if (mid <= n / mid) {

                answer = mid;

                // Try for a bigger square root
                start = mid + 1;

            } else {

                // mid is too big, move to left
                end = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 27;

        System.out.println(squareRoot(n));
    }
}