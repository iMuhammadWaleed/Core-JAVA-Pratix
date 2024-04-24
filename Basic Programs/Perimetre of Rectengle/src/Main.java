import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of side A: ");
        float A = input.nextFloat();

        System.out.print("Enter value of side B: ");
        float B = input.nextFloat();

        System.out.print("Enter value of side C: ");
        float C = input.nextFloat();

        System.out.print("Enter value of side D: ");
        float D = input.nextFloat();

        float perimeter = A+B+C+D;

        System.out.println("Perimeter of rectangle ABCD is: " + perimeter);

    }
}