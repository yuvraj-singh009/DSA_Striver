package Learn_The_Basics;

public class recursionNto1 {
    public static int recursion(int count ) {
        
        System.out.println(count);

        if(count==0){
            return 0;
        }
        else{
            count--;
            return recursion(count);
        }

}



public static void main(String[] args) {
    // String name = "yuvraj"; // Example number to calculate factorial
    int count=10;
    // int times=5;
    recursion(count);
    // System.out.println("Factorial of " + num + " is: " + result);
}
}