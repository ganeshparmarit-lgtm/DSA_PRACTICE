/*
 * Problem: Union of Two Sorted Arrays
 * Approach: Two Pointer
 * TC: O(n+m) | SC: O(n+m)
 */

package Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays_09 {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {

        int i = 0; // arr1 ka pointer
        int j = 0; // arr2 ka pointer
        ArrayList<Integer> result = new ArrayList<>(); // result store karne ke liye

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                    result.add(a[i]);
                i++;

            } else if (b[j] < a[i]) {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j])
                    result.add(b[j]);
                j++;

            } else {
                // dono equal hain → sirf ek baar add kara
                if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                    result.add(a[i]);
                i++;
                j++;
            }
        }

        // arr1 mein elements bache hain → sab add kare
        while (i < a.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
            i++;
        }
        // arr2 mein elements bache hain → sab add kare
        while (j < b.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j])
                result.add(b[j]);
            j++;
        }

        return result; // final union list
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int[] b = {2, 3, 4, 6};
        System.out.println(findUnion(a, b));
    }
}