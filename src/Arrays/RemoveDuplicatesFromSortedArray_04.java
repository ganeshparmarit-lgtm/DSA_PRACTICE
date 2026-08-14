package Arrays;

public class RemoveDuplicatesFromSortedArray_04 {
    public static int removeduplicates(int[] arr){

        int k = 1;                           //pehla element humesha unique

        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){           //unique mila
                arr[k] = arr[i];              //k position pe rakho
                k++;                          //k aage badhao
            }
        }
        return k;                           //total unique elements
    }
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Uniques elements are : " + removeduplicates(arr));
    }
}
