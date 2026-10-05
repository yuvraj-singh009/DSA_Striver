package Strings;

public class rotate_string {
    public static void main(String[] args){
        // String str="abcdef";
        // String goal="cdefab";
        // int n=2;
        // for(int i=0; i<n; i++){
        //     char ch=str.charAt(0);
        //     str=str.substring(1,str.length())+ch;
        // }

        // if(str.equals(goal)){
        //     System.out.println("Yes");
        
        // }
        String s="abcdef";
        String goal="cdefab";

        int m=s.length();
        int n=goal.length();
        if(m==n && (s+s).contains(goal)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
