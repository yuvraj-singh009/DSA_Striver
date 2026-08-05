import java.util.Scanner;

public class palindromechk {
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int digit=0;
        int num=n;
		while(n!=0){
		int a =n%10;
	    digit=digit*10+a;
		n=n/10;
		}
		if(digit==num){
		System.out.println("YES");
		}
	}

}
