package TCS_NQT;

import java.util.Scanner;

public class rotateArray {
    public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give array length");
		int n= sc.nextInt();
		System.out.println("Give k length");
		int k= sc.nextInt();
		int[] arr=new int[n];
		int[] arrr=new int[n];
		

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int j=0;
		
		for(int i=n-k;i<n;i++){
 			arrr[j]=arr[i];
			j++;
		}
		for(int i=0;i<n-k;i++){
 			arrr[j]=arr[i];
			j++;
		}
		System.out.println("New array is");
		for(int i=0;i<n;i++){
			System.out.print(arrr[i]+" ");

		}

		
	}

}
