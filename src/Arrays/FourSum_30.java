/*
 * Problem: 4Sum
 * Approach: Sort + Two Pointer
 * TC: O(n³) | SC: O(1)
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_30 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums); // Step 1: Sort karo
        List<List<Integer>> result = new ArrayList<>();

        // Pehla element fix karo
        for (int i = 0; i < nums.length - 3; i++) {

            // Duplicate i skip karo
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Dusra element fix karo
            for (int j = i + 1; j < nums.length - 2; j++) {

                // Duplicate j skip karo
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;          // left pointer
                int right = nums.length - 1; // right pointer

                while (left < right) {

                    // Chaaro ka sum
                    long sum = (long) nums[i] + nums[j]
                            + nums[left] + nums[right];

                    if (sum == target) {

                        // Answer mila → add karo
                        result.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[left],
                                nums[right]
                        ));

                        left++;
                        right--;

                        // Duplicate left skip karo
                        while (left < right && nums[left] == nums[left - 1])
                            left++;

                        // Duplicate right skip karo
                        while (left < right && nums[right] == nums[right + 1])
                            right--;

                    } else if (sum < target) {

                        left++;  // Sum chota → left badhao

                    } else {

                        right--; // Sum bada → right ghataao
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};

        System.out.println(fourSum(arr, 0));
    }
}