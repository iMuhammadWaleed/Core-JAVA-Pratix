import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter breadth: ");
        float breath = input.nextFloat();

        System.out.print("Enter height: ");
        float height = input.nextFloat();

        float area = 1/2f * breath * height;

        System.out.println("Area of triangle is: " + area);

    }
}