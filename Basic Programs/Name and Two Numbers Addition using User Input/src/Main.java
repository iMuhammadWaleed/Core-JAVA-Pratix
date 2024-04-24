
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Ok! now enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Now, enter second number: ");
        int num2 = input.nextInt();

        int sum = num1+num2;

        System.out.print("Answer: " + sum);
    }
}