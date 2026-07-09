package Learn_The_Basics;

// public class gcd {
//     public static void main(String[] args) {
//         int num1 = 48;
//         int num2 = 18;
//         int gcd = findGCD(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//     }

//     public static int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }
public class gcd{


public static void main(String[] args) {
    int num1 = 48;
    int num2 = 18;
    int g=0;
    for(int i = Math.min(num1, num2); i >= 1; i--) {
        if (num1 % i == 0 && num2 % i == 0) {
            // System.out.println("GCD of " + num1 + " and " + num2 + " is: " + i);
            g=i ;
            break;
        }
    }
    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + g);
}
}




