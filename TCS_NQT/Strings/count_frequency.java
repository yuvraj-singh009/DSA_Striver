import java.util.*;

public class count_frequency {
     public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	// System.out.println(st);
	StringBuilder sb= new StringBuilder(st);
	

	for(int i=0 ; i< sb.length(); i++){
        int count =0;
		for(int j=0 ; j< sb.length(); j++){
			if(sb.charAt(i) == sb.charAt(j)){
				count++;
			}
		}
	System.out.println("count of " + sb.charAt(i) + "is" +count);
    }
    
}
}
