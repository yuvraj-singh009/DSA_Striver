// E 
// D E 
// C D E 
// B C D E 
// A B C D E 

package Learn_The_Basics;
import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i <=rows; i++) {
            for (char ch ='A';ch<'A'+i;ch++) {
                System.out.print((char)(ch+rows-i)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}