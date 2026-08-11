import java.util.*;

public class remove_vowels {
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	// System.out.println(st);
	StringBuilder sb= new StringBuilder(st);


	for(int i=0 ; i< sb.length(); i++){
		if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u' ){
        sb.deleteCharAt(i);
		}
    }
    System.out.println(sb);
}
}
