package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int ne=sc.nextInt();
        int[] arr= new int[ne];
        for(int i =0; i<ne; i++){
            int num= sc.nextInt();
            arr[i]=num;
        }
        // System.out.println(Arrays.sort(arr));
        // System.out.println(Arrays.sort(arr));
        Arrays.sort(arr);
        for(int i=0; i<ne; i++){
            System.out.print(arr[i]);
        }
    }
}
