/*
 * Problem: Sort Colors (Dutch National Flag)
 * Approach: 3 Pointers
 * TC: O(n) | SC: O(1)
 */
package Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid); // 0 → start pe rakho
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++; // 1 → sahi jagah hai
                    break;

                case 2:
                    swap(nums, mid, end); // 2 → end pe rakho
                    end--;
                    // mid++ nahi — naya element check karna hai!
                    break;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1};
        sortColors(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
