package Learn_The_Basics;

// public class stringpalindrome {
//     public static void main(String[] args){
//         String str = "racecar";
//         String rev = "";
//         for(int i=str.length()-1;i>=0;i--){
//             rev+=str.charAt(i);
//         }
//         if(str.equals(rev)){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not a palindrome");
//         }
//     }
// }

public class stringpalindrome {
    public static void main(String[] args){
        String str = "racecar";
        int n = str.length()-1;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
