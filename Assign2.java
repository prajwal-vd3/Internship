public class Assign2 {
    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 49;

        prime(num1);
        prime(num2);
    }

    static void prime(int num) {

    boolean isPrime = true;

    if (num <= 1) {
        isPrime = false;
    } 
    else {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {   
                isPrime = false; 
                break;
            }
        }
    }

    if (isPrime)
        System.out.println("Yes, " + num + " is a prime number");
    else
        System.out.println("No, " + num + " is not a prime number");
    }
}
