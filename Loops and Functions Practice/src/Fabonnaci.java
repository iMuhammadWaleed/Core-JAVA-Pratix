import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        printSeries(num);
    }

    public static int printSeries(int num) {
        int first = 0, second = 1;

        if (num > 0)
            System.out.print("0 ");
        if (num >= 1)
            System.out.print("1 ");

        if (num <= 1)
            return num;

        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

        return num;
    }
}
