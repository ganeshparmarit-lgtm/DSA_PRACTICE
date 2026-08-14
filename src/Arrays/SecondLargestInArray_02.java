/*
 * Problem: Second Largest Element in Array
 * Approach: Linear Search with two variables
 * TC: O(n) | SC: O(1)
 */

package Arrays;

public class SecondLargestInArray_02 {
    public static int getsecondlargest(int[] arr) {

        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;    //

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args){
        int[] arr = {5,8,9,3,1};
        System.out.println("Secondlargest : " + getsecondlargest(arr));
    }
}
