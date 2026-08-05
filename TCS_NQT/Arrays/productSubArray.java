package TCS_NQT;

import java.util.Scanner;

public class productSubArray {
      public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=1;
		for(int i=0;i<n;i++){
 			sum=sum*arr[i];
		}
		System.out.println("PRODUCT is " + sum);

	}
}
