package Learn_The_Basics;

public class recursion1toN {
    public static int recursion(int count ,int times) {
        System.out.println(count);

        if(count==times){
            return 0;
        }
        else{
            count++;
            return recursion(count,times);
        }
    }



public static void main(String[] args) {
    // String name = "yuvraj"; // Example number to calculate factorial
    int count=1;
    int times=5;
    recursion(count,times);
    // System.out.println("Factorial of " + num + " is: " + result);
}
}