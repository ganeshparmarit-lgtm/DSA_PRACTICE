/*
 * Problem: 3Sum
 * Approach: Sort + Two Pointer
 * TC: O(n²) | SC: O(1)
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_29 {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // Step 1: Sort karo
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Duplicate i skip karo
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;       // left pointer
            int right = nums.length - 1; // right pointer

            while (left < right) {

                // Teeno ka sum
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Answer mila → add karo
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Duplicate left skip karo
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    // Duplicate right skip karo
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;  // sum chota → left badhao
                } else {
                    right--; // sum bada → right ghataao
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}