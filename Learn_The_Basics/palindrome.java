package Learn_The_Basics;


public class palindrome {

public static void main(String[] args) {
    int num = 12345;
    int reversed = 0;

    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }
    if (reversed == 12345) {
        System.out.println("The number is a palindrome.");
    } else {
        System.out.println("The number is not a palindrome.");
    }

    
}
}
