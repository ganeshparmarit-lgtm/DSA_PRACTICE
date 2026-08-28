/*
 * Problem: Reverse Pairs
 * Approach: Merge Sort + Two Pointer
 * TC: O(n log n) | SC: O(n)
 */
package Arrays;

public class ReversePairs_36 {

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int mergeSort(int[] nums, int low, int high) {

        // Single element me pair nahi ban sakta
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;

        // Left aur right part ke reverse pairs count karo
        int count = mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);

        // Left aur right ke beech reverse pairs count karo
        count += countPairs(nums, low, mid, high);

        // Dono sorted parts ko merge karo
        merge(nums, low, mid, high);

        return count;
    }

    public static int countPairs(int[] nums, int low, int mid, int high) {

        int j = mid + 1;
        int count = 0;

        // Left aur right part ke elements compare karo
        for (int i = low; i <= mid; i++) {

            while (j <= high && nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        return count;
    }

    public static void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Dono sorted parts ko merge karo
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Left part ke remaining elements
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // Right part ke remaining elements
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        // Temp ko original array me copy karo
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 3, 1};

        System.out.println(reversePairs(nums));
    }
}