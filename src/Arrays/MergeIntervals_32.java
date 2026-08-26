/*
 * Problem: Merge Intervals
 * Approach: Sorting + Merging
 * TC: O(n log n) | SC: O(n)
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_32 {

    public static int[][] merge(int[][] intervals) {

        // Starting point ke according sort karo
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            // Overlap hai
            if (s <= end) {
                end = Math.max(end, e);
            }
            else {

                // Current interval complete ho gaya
                list.add(new int[]{start, end});

                // New interval start karo
                start = s;
                end = e;
            }
        }

        // Last interval add karo
        list.add(new int[]{start, end});

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {9, 12}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(
                    "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}
