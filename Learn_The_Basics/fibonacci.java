package Learn_The_Basics;
import java.util.*;

// public class fibonacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         int firstTerm = 0, secondTerm = 1;

//         System.out.println("Fibonacci Series up to " + n + " terms:");
//         for (int i = 1; i <= n; ++i) {
//             System.out.print(firstTerm + " ");

//             // compute the next term
//             int nextTerm = firstTerm + secondTerm;
//             firstTerm = secondTerm;
//             secondTerm = nextTerm;
//         }
//         sc.close();
//     }
// }

public class fibonacci{
    public static int fibbo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibbo(n-1)+fibbo(n-2);
        }
    }
    
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        // int firstTerm = 0, secondTerm = 1;
        // fibbo f = new fibbo();
        // f=new fibbo();
        // int f=fibbo(n);
        System.out.println("Fibonacci Series up to " + n + " terms: " + fibbo(n));
    }
}