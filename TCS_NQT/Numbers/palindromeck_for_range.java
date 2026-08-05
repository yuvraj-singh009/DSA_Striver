import java.util.Scanner;

public class palindromeck_for_range {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
                
		for(int i=1; i<=n; i++){
        int digit=0;
		int num =i;
		while(num!=0){
		int a =num%10;
	    digit=digit*10+a;
		num=num/10;
		}
		if(digit==i){
		System.out.println(i);
		}
    }
	}

}
