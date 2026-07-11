package Arrays;
import java.util.*;

public class sec_large_Elem_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5, 1, 2, 3, 1};
        int n = arr.length;
        Arrays.sort(arr);
        // int secondLargest = Integer.MIN_VALUE;
        System.out.println(arr[n-2]);
        // for(int i=n-2; i>=0; i--){
        //     if(arr[i] < arr[n-1]){
        //         secondLargest = arr[i];
        //         break;
        //     }
        // }
        // if(secondLargest == Integer.MIN_VALUE){
        //     System.out.println("There is no second largest element in the array.");
        // } else {
        //     System.out.println("Second largest element in the array is: " + secondLargest);
        // }
    }
}