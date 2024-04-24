import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        int P = input.nextInt();

        System.out.print("Enter rate of interest: ");
        float R = input.nextFloat();

        System.out.print("Enter time: ");
        float T = input.nextFloat();


        double compoundInterest = Math.pow(P * (1 + R / 100), T); // -> power function
        System.out.println("Compound Interest: " + compoundInterest);


    }
}
