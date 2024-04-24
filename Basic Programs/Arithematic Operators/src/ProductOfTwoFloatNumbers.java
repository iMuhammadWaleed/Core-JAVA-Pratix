import java.util.Scanner;
public class ProductOfTwoFloatNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = input.nextFloat();

        System.out.print("Enter second number: ");
        float b = input.nextFloat();

        float mul = a * b;
        System.out.println("After Multiplication, answer is: " + mul);
    }
}
