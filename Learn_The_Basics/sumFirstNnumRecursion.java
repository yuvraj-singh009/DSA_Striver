package Learn_The_Basics;

public class sumFirstNnumRecursion {
    public static int sumFirstNnum(int n) {
        // int sum=0;
        if (n <= 0) {
            return 0;
        } else {
            // sum=sum+n;
            // n--;
            // sumFirstNnum(n);
            return n + sumFirstNnum(n - 1);
        }
        // return sum;
    }
    
    public static void main(String[] args) {
        int n = 5; // Example number to calculate factorial
        int sum = sumFirstNnum(n);
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}
