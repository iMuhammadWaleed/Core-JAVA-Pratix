import java.util.Scanner;
class SumOfAllIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = sc.nextInt(); // Suppose n = 5;

        int i=1;
        int sum=1;

        while(i<num) // 1 < 5 which is true
        {
            i = i+1;
            // i = 1+1=2 , then i = 2+1=3, and so on..
            sum = sum + i;
       /* 
       The loop processes the following values of i: 1, 2, 3, 4, 5.
During each iteration:
* When i is 1, sum becomes 0 + 1 = 1.
* When i is 2, sum becomes 1 + 2 = 3.
* When i is 3, sum becomes 3+ 3 = 6.
* When i is 4, sum becomes 6+ 4 = 10
* When i is 5, sum becomes 10+ 5= 15
So final value of sum will be 1+2+3+4+5 = 15*/

        }
        System.out.println("Sum of all integer numbers = " + sum);
    }

}