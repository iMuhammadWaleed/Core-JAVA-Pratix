import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        int number, lastDigit, reverse = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number > 0)
        {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        System.out.print(reverse);

    }
}