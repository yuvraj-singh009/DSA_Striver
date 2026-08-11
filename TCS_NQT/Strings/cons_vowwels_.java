import java.util.Scanner;

public class cons_vowwels_ {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	// System.out.println(st);
	StringBuilder sb= new StringBuilder(st);


	for(int i=0 ; i< sb.length(); i++){
		if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' ){
		System.out.println("vowels");
		break;
		}
		else if ( sb.charAt(i) == ' '){
		System.out.println("Spaces");
		}
		else {
		System.out.println("All are consonents");
		}
	
	}

		
	}

}
