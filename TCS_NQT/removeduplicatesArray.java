package TCS_NQT;

import java.util.ArrayList;
import java.util.Scanner;

public class removeduplicatesArray {
    public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give array length");
		int n= sc.nextInt();
		// System.out.println("Give k length");
		System.out.println("input array elements");
		// int k= sc.nextInt();
		// int[] arr=new int[n];
		// int[] arrr=new int[n];
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer> arrr=new ArrayList<>();

		

		for(int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}
		
        int k=0;
		for(int i=0;i<n;i++){
 			int count =0;
			for(int j=0; j<n;j++){
			 if(arr.get(i)==arr.get(j)){
			 count++;
			 }
            }
		if(count==1){
			 arrr.add(arr.get(i));
			 k++;
		}
		else if(count>1){
			arrr.add(arr.get(i));
		}
		}
        for(int i=0;i<k;i++){
			System.out.print(arrr.get(i)+" ");
		}

                

		
	}

}
