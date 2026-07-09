package Learn_The_Basics;
import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows-i+1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// *****
// ****
// *** 
// **
// *