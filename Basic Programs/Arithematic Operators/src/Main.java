import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        int add = a+b;
        System.out.println("Addition: " + add);

        int sub = a-b;
        System.out.println("Subtraction: " + sub);

        int mul = a * b;
        System.out.println("Multiplication: " + mul);

        int division = a / b;
        System.out.println("Division: " + division);

        int modulus = a % b;
        System.out.println("Modulus: " + modulus);

    }
}