import java.util.Scanner;
public class XorOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int xorOperation = num1 ^ num2;

        System.out.println("Answer: " + xorOperation);
    }
}