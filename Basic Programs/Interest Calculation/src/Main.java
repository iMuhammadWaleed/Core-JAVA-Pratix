import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

            System.out.println("** Simple Interest Calculator **");

            Scanner input = new Scanner(System.in);

            System.out.print("Enter principal amount: ");
            int principal = input.nextInt();

            System.out.print("Enter rate of interest: ");
            float rate = input.nextFloat();

            System.out.print("Enter time: ");
            float time = input.nextFloat();


            float simpleInterest = (principal * rate * time) / 100f;

            System.out.println("Simple Interest: " + simpleInterest);

        }
    }