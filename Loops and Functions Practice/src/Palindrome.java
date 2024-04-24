import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        int number, lastDigit, originalNumber, reverse = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        originalNumber = number;
        /* Storing the original number because you'te going to modify number in the while loop,
        it will be no longer the original number.
        You need to store the original number in a separate variable for comparison. */

        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }
}