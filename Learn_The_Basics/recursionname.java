package Learn_The_Basics;

public class recursionname {
    public static int recursion(String n,int count , int times) {
        System.out.println(n);

        if(count==times){
            return 0;
        }
        else{
            count++;
            return recursion(n,count,times);

        }

}



public static void main(String[] args) {
    String name = "yuvraj"; // Example number to calculate factorial
    int count=1;
    int times=5;
    recursion(name,count,times);
    // System.out.println("Factorial of " + num + " is: " + result);
}
}