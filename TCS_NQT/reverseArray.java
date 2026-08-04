package TCS_NQT;

import java.util.Scanner;

public class reverseArray {
    public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		int[] arrr=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int j=0;
		
		for(int i=n-1;i>=0;i--){

			arrr[j]=arr[i];
			j++;
			
		}
		for(int i=0;i<n;i++){

			
			System.out.print(arrr[i]);
		}

	}
}
