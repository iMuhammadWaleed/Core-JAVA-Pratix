import java.util.Scanner;
public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int complimentOperation = ~ num;

        System.out.println("Answer: " + complimentOperation);
    }
}