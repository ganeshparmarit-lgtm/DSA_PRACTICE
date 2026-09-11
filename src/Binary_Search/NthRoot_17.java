package Binary_Search;

/*
 * Problem: Find Nth Root of M
 * Approach: Binary Search
 * TC: O(n log m) | SC: O(1)
 */

public class NthRoot_17 {

    public static int nthRoot(int n, int m) {

        int start = 1;
        int end = m;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int result = power(mid, n);

            if (result == m) {
                return mid;
            }

            if (result < m) {

                // mid is too small, move right
                start = mid + 1;

            } else {

                // mid is too large, move left
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int power(int base, int exponent) {

        int result = 1;

        for (int i = 1; i <= exponent; i++) {

            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 27;

        System.out.println(nthRoot(n, m));
    }
}
