import java.util.Scanner;
class SumOfAllDigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Suppose number = 236;

        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            // Iteration 1: lastDigit = 236 % 10 = 6
            // Iteration 2: lastDigit = 23 % 10 = 3
            // Iteration 3: lastDigit = 2 % 10 = 2

            number /= 10;
            // Iteration 1: number = 236 / 10 = 23
            // Iteration 2: number = 23 / 10 = 2
            // Iteration 3: number = 2 / 10 = 0

            sum += lastDigit;
            // Iteration 1: sum = 0 + 6 = 6
            // Iteration 2: sum = 6 + 3 = 9
            // Iteration 3: sum = 9 + 2 = 11
        }

        System.out.print(sum);
    }
}