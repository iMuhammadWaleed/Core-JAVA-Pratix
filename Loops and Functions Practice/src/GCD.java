import java.util.Scanner;
class GCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        //Suppose num1 = 15;

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        //Suppose num2 = 20;

        int gcd = gcd(num1,num2); //gcd will be 5

        System.out.println("GCD of these 2 numbers is: " + gcd);

    }

    public static int gcd(int num1, int num2)
    {
        int gcd = 1;
        int i =2;

        int least = least(num1, num2); // least = 15;

        while(i <= least) // 2<=15 which is true
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                gcd = i;
            }
            i++;
        }
        
        /*
Iterations:
Iteration 1:
i = 2
Condition num1 % i == 0 && num2 % i == 0: Neither 15 nor 20 is divisible by 2, so the condition is false.
gcd remains 1.
Iteration 2:
i = 3
Condition num1 % i == 0 && num2 % i == 0: Neither 15 nor 20 is divisible by 3, so the condition is false.
gcd remains 1.
Iteration 3:
i = 4
Condition num1 % i == 0 && num2 % i == 0: Neither 15 nor 20 is divisible by 4, so the condition is false.
gcd remains 1.
Iteration 4:
i = 5
Condition num1 % i == 0 && num2 % i == 0: 15 is divisible by 5 and 20 is also divisible by 5.
so, gcd = 5  */
        return gcd;
    }

    public static int least(int num1, int num2)
    {
        if (num1 < num2) // 15<20 which is true
        {
            return num1;  // so, return 15 through which least in gcd method will become equal to 15
        }

        else
        {
            return num2;
        }
    }
}