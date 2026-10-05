package Strings;
import java.util.*;


public class reverseWords {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
        char ch = sc.next().charAt(0);
        sb.append(ch);
    }
    sb.reverse();
    System.out.println(Arrays.toString(sb.toString().toCharArray()));
}
}
