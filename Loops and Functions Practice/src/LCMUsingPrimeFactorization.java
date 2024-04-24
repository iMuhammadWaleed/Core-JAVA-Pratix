import java.util.Scanner;
class LCMCalculator {
    // Method to calculate LCM using prime factorization
    public static int calculateLCM(int a, int b) {
        int lcm = 1;
        /* Initialize LCM to 1 ecause it is the smallest positive integer, ensuring that any subsequent multiplication operation will result in a correct product. As we iteratively compute the LCM, we gradually build upon this initial value by multiplying it with prime factors and remaining factors of the input numbers.*/

        // Suppose a= 8, and b=12;

        int maxNumber;
        if (a > b) { // 8 < 12 which is true 
            maxNumber = a; // So, maxnumber = 8
        } else {
            maxNumber = b;
        }

        for (int i = 2; i <= maxNumber; i++) {
            // Find prime factors of a and b and multiply them to lcm
            while (a % i == 0 || b % i == 0) {
                lcm *= i; // Multiply prime factor to lcm
                if (a % i == 0) {
                    a /= i; // Divide a by the prime factor
                }
                if (b % i == 0) {
                    b /= i; // Divide b by the prime factor
                }
            }
        }

        // Multiply remaining values of a and b to lcm
        lcm *= a * b;

        return lcm; // Return the calculated LCM
    }
    
      /*
 Step-by-Step Breakdown:

Initialization:

lcm is set to 1 (initial product for accumulating prime factors).
maxNumber is determined to be 15 (the larger number between 8 and 15).
Prime Factorization Loop:

The loop iterates from i = 2 (smallest prime number) to i <= maxNumber (15).

Iteration 1 (i = 2):

a (8) is divisible by 2, so:
lcm is updated to lcm * i = 1 * 2 = 2 (incorporating the prime factor 2).
a is divided by 2: a = 8 / 2 = 4.

Iteration 2 (i = 2):

a (4) is still divisible by 2, so:
lcm is updated to lcm * i = 2 * 2 = 4 (including another 2).
a is divided by 2: a = 4 / 2 = 2.
Iteration 3 (i = 2):

a (2) is not divisible by 2 anymore.

Iteration 4 (i = 3):

b (15) is divisible by 3, so:
lcm is updated to lcm * i = 4 * 3 = 12 (adding the prime factor 3).
b is divided by 3: b = 15 / 3 = 5.

Iterations 5-15 (i = 4 to 15):

No more prime factors are found for a (2) or the remaining b (5), which are both prime numbers themselves.
Handling Remaining Non-Divisible Parts:

After the loop completes, a is 2 (a prime) and b is 5 (a prime).
lcm is multiplied by the remaining values: lcm = lcm * a * b = 12 * 2 * 5 = 120.
Return the LCM:

The calculated LCM (120) is returned from the calculateLCM method.
Output:

With a = 8 and b = 15, the program would print:

LCM of 8 and 15 is: 120*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to find their LCM:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //Suupose inputed values are 8 and 15

        // Calculate and display LCM
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);    }
}