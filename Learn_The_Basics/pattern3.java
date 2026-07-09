package Learn_The_Basics;
import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j =rows; j>i; j--) {
                System.out.print(rows-j+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//12345
//1234
//123
//12
//1