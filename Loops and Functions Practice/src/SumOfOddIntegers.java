import java.util.Scanner;
class SumOfOddIntegers {
    public static void main(String[] args) {
        int num, i = 1, sum = 0;
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            num = input.nextInt(); // Suppose n = 10;

            while(i<=num) // 1 < 10 which is true
            {
                sum += i;
                i += 2;
       /*
       The loop processes the following values of i: 1, 3, 5, 7, 9.
During each iteration:
* When i is 1, sum becomes 0 + 1 = 1.
* When i is 3, sum becomes 1 + 3 = 4.
* When i is 5, sum becomes 4 + 5 = 9.
* When i is 7, sum becomes 9 + 7 = 16
* When i is 9, sum becomes 16 + 9= 25
So final value of sum will be 1+4+9 = 25*/
            }
        System.out.println("Sum of odd numbers = " + sum);
    }
    }