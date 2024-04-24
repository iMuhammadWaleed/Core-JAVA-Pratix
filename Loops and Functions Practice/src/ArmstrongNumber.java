import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = input.nextInt(); // Suppose num = 153

        boolean isArmstrong = isArmstrong(num);

        if (isArmstrong)
        {
            System.out.println("This is an Armstrong number");
        }

        else
        {
            System.out.println("This is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num)
    {
        int numOfDigits = numOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;

        while (num > 0)
        {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, numOfDigits);
        }
        return finalNumber == numCopy;
           
/*
 Initialization:
numOfDigits = numOfDigits(153) = 3 (since there are 3 digits in 153).
numCopy = 153.finalNumber = 0.

Loop:
Iteration 1:
lastDigit = 153 % 10 = 3.
num = 153 / 10 = 15.
finalNumber += pow(3, 3) = 27 (since 3^3 = 27).

Iteration 2:
lastDigit = 15 % 10 = 5.
num = 15 / 10 = 1.
finalNumber += pow(5, 3) = 152 (since 5^3 = 125, and 27 + 125 = 152).

Iteration 3:
lastDigit = 1 % 10 = 1.
num = 1 / 10 = 0.
finalNumber += pow(1, 3) = 153 (since 1^3 = 1, and 152 + 1 = 153).

Comparison:
Since finalNumber (153) is equal to numCopy (153), the method returns true.
*/
    }

    public static int pow(int num1, int num2)
    {
        int result = 1;
        int i = 0;

        while (i < num2)
        {
            result*= num1;
            i++;
        }
        return result;
    }

    public static int numOfDigits(int num)
    {
        int digits = 0;
        while (num > 0) // 153 > 0 true
        {
            digits++;
            num/=10;
        }
        return digits;
    }
 /*
Initialization:
digits is initialized to 0.
 
Loop:

Iteration 1:
Since num (153) is greater than 0, the loop continues.
digits is incremented by 1.
num becomes 15 after dividing by 10 (num = 153 / 10 = 15).

Iteration 2:
Since num (15) is still greater than 0, the loop continues.
digits is incremented by 1.
num becomes 1 after dividing by 10 (num = 15 / 10 = 1).

Iteration 3:
Since num (1) is still greater than 0, the loop continues.
digits is incremented by 1.
num becomes 0 after dividing by 10 (num = 1 / 10 = 0).

Termination:
The loop stops since num is now 0.

Result:
After the loop, digits contains the total number of digits in the original number.
In this example, numOfDigits(153) returns 3, indicating that 153 has three digits.  
*/
}