package Learn_The_Basics;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i <= rows; i++) {
            for (int j =0; j<rows-i-1; j++) {
                System.out.print(" ");
            }
            for (int j =0; j<2*i+1; j++) {
                System.out.print("*");
            }
            for (int j =0; j<rows-i-1; j++) {
                System.out.print(" ");
            }





            System.out.println();
        }
        sc.close();
    }
}
//      *     
//     ***    
//    *****   
//   *******  
//  ********* 
// ***********
//*************