package Arrays;

public class max_elem_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1};
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}
