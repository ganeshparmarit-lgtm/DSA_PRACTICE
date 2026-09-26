package Strings;

/*
 * Problem: Count and Say
 * Approach: Use recursion and Run Length Encoding (RLE).
 * TC: O(n * L) | SC: O(L)
 */

public class CountAndSay_12 {

    public static String RLE(String sequence) {

        StringBuilder sb = new StringBuilder();

        char[] nums = sequence.toCharArray();

        char curr = nums[0];

        int count = 0;

        for (char num : nums) {

            if (num == curr) {
                count++;
            }
            else {

                sb.append(count);
                sb.append(curr);

                curr = num;
                count = 1;
            }
        }

        // Add the last group
        sb.append(count);
        sb.append(curr);

        return sb.toString();
    }

    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        return RLE(countAndSay(n - 1));
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(countAndSay(n));
    }
}
