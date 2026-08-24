/*
 * Problem: Pascal's Triangle
 * Approach: Previous Row Elements Sum
 * TC: O(n²) | SC: O(n²)
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_27 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        // Har row ko create karo
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // Current row ke elements add karo
            for (int j = 0; j <= i; j++) {

                // First aur last element hamesha 1
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    // Beech ka element = previous row ke 2 elements ka sum
                    int num1 = triangle.get(i - 1).get(j - 1);
                    int num2 = triangle.get(i - 1).get(j);

                    row.add(num1 + num2);
                }
            }

            // Complete row ko triangle me add karo
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        System.out.println(result);
    }
}