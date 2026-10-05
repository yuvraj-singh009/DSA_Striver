package Strings;

public class palindrome_check {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals((sb).toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
