/*
 * Problem: Majority Element II
 * Approach: Boyer-Moore Voting Algorithm
 * TC: O(n) | SC: O(1)
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementSecond_28 {

    public static List<Integer> majorityElement(int[] nums) {

        int c1 = Integer.MIN_VALUE, v1 = 0;
        int c2 = Integer.MIN_VALUE, v2 = 0;

        List<Integer> result = new ArrayList<>();

        // Step 1: 2 possible candidates find karo
        for (int num : nums) {

            if (v1 == 0 && num != c2) {
                c1 = num;
                v1 = 1;
            }
            else if (v2 == 0 && num != c1) {
                c2 = num;
                v2 = 1;
            }
            else if (num == c1) {
                v1++;
            }
            else if (num == c2) {
                v2++;
            }
            else {
                v1--;
                v2--;
            }
        }

        // Step 2: Candidates ki actual frequency count karo
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == c1) {
                count1++;
            }
            if (num == c2) {
                count2++;
            }
        }

        // Step 3: n/3 se zyada frequency wale candidates add karo
        if (count1 > nums.length / 3) {
            result.add(c1);
        }

        if (c2 != c1 && count2 > nums.length / 3) {
            result.add(c2);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 0};

        System.out.println(majorityElement(nums));
    }
}
