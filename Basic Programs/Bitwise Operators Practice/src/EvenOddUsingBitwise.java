import java.util.Scanner;
public class EvenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is an even number");
        }
    }
}