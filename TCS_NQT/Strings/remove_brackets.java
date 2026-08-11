import java.util.*;

public class remove_brackets {
    
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	// System.out.println(st);
	StringBuilder sb= new StringBuilder(st);
    for(char c : st.toCharArray()){
        if(c == '(' || c == ')'){
            sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
        }
    }

	for(int i=0 ; i< sb.length(); i++){
        if(sb.charAt(i) == '(' || sb.charAt(i) == ')'){
            sb.deleteCharAt(i);
        }
    }
    System.out.println(sb);
}
}
