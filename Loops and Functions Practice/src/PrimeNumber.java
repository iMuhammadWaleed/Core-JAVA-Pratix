import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num = input.nextInt();
        //Suppose num = 13

        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println("Your number is Prime!");
        } else {
            System.out.println("Your number is not a Prime number!");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;

        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}