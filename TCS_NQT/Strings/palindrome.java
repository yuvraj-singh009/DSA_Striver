import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	System.out.println(st);
	StringBuilder sb= new StringBuilder(st);
	sb.reverse();
	if(st.equals(st)){
		System.out.println(" is palindrome");
	}
	
	}

}
