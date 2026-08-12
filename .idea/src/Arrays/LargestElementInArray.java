/*
 * Problem: Largest Element in Array
 * Approach: Linear Search
 * TC: O(n) | SC: O(1)
 */


package Arrays;

public class LargestElementInArray {
    public static int largest(int[] arr){
        int largestelement = arr[0];     //start from first element.

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largestelement){
                largestelement = arr[i];  //update
            }
        }
        return largestelement;
    }
    public static void main(String[] args){
        int[] arr = {3,1,8,5,2};
        System.out.println("largest : " + largest(arr));
    }
}
