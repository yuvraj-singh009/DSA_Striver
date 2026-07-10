package Learn_The_Basics;

public class factorialrecursion {
    public static int factorial(int n) {
        // int sum=0;
        if (n <= 1) {
            return 1;
        } else {
            // sum=sum+n;
            // n--;
            // sumFirstNnum(n);
            return n * factorial(n - 1);
        }
        // return sum;
    }
    
    public static void main(String[] args) {
        int n = 5; // Example number to calculate factorial
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
