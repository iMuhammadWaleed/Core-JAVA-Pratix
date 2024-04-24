import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        double per = input.nextDouble();
        if (per >= 90) {
            System.out.println("You got an A!");
        } else if (per >= 75) {
            System.out.println("You got a B!");
        } else if (per >= 60) {
            System.out.println("You got a C!");
        } else if (per >= 30) {
            System.out.println("You got a D!");
        } else {
            System.out.println("You got an F!");
        }
    }
}
  