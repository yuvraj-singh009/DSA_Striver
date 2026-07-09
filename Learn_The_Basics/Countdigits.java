package Learn_The_Basics;

class Countdigits {

    public int Countdigit(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;      // Increment the count
        }
        return count;
    }



    public static void main(String[] args) {
        int n = 1234567890; // Example number

        Countdigits cd = new Countdigits();
        System.out.println("Number of digits: " + cd.Countdigit(n));
    }
}