/*
 * Problem: Majority Element
 * Approach: Boyer-Moore Voting Algorithm
 * TC: O(n) | SC: O(1)
 */

package Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int majority = nums[0]; // Current candidate
        int votes = 1;          // Candidate ki strength

        for (int i = 1; i < nums.length; i++) {

            if (votes == 0) {
                // Purana candidate cancel ho gaya
                majority = nums[i];
                votes = 1;
            }
            else if (majority == nums[i]) {
                // Same element mila → vote badhao
                votes++;
            }
            else {
                // Different element mila → vote ghatao
                votes--;
            }
        }

        return majority;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + majorityElement(arr));
    }
}