import java.util.Scanner;
public class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int leftShiftOperation = num << 1; // Suppose if input is "2" then 2*2^1 = 2*2 = 4

        System.out.println("Answer: " + leftShiftOperation);
    }
}