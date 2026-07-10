package Learn_The_Basics;

public class alldivisior {
    
    public static void main(String[] args) {
        int num = 12;
        System.out.print("All divisors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}