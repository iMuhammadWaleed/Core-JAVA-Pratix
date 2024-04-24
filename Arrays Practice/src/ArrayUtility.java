import java.util.Scanner;
public class ArrayUtility {

/***
This class is created to use anywhere in another class for taking use inputs
 as elements for creating an array thoroughly, so how's that working? Well:

 First take off single Array input method which is named as "takeArrayInput()":
 * The program starts by the user to enter the number of elements with the message:
 * "Please enter the number of elements: ".
* The user inputs 5 as the number of elements.
* An integer array named numbers with a size of 5 is created to store the user's input.
* The variable "i" is initialized to 0 to use as an index for the array.
* A while loop is used to prompt the user to enter each element of the array.
* Inside the loop:
* The program displays a message asking the user to enter the element number,
 starting from 1: "Please enter element no." + (i + 1) + ": ".
* The user inputs a value.
 * For simplicity, let's consider the user inputs 1, 2, 3, 4, and 5 separately.
* Each value is stored in the numbers array at the corresponding index i.
* The index i is incremented after each input.
* Now, let's go through the iterations step by step:
* Iteration 1: The user is prompted to enter element no.1:
 * The user inputs 1.
 * The value 1 is stored in numbers[0].
* Iteration 2: The user is prompted to enter element no.2:
 * The user inputs 2.
 * The value 2 is stored in numbers[1].
* Iteration 3: The user is prompted to enter element no.3:
 * The user inputs 3. The value 3 is stored in numbers[2].
* Iteration 4: The user is prompted to enter element no.4:
 * The user inputs 4. The value 4 is stored in numbers[3].
* Iteration 5: The user is prompted to enter element no.5:
 * The user inputs 5. The value 5 is stored in numbers[4].
* After all iterations, the array numbers contains the values [1, 2, 3, 4, 5].
*/

    public static int[] takeArrayInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the no of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        int i = 0;

        while (i < size)
        {
            System.out.print("Please enter element no." + (i+1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }
        return numbers;
    }

    public static int[][] take2DArrayInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the no of rows: ");
        int rows = input.nextInt();

        System.out.print("Please enter the no of columns: ");
        int columns = input.nextInt();

        int[][] numArray = new int[rows][columns];

        int i = 0;

        while (i < rows)
        {

           int  j = 0;

            while (j< rows) {
                System.out.print("Please enter element rows" + (i + 1) + ", column : " + (j+1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;

/*

Suppose user wants to enter the numbers 1, 2, 3, 4, 5, 6 and has specified 2 rows and 3 columns.
 The loops will work like this:

  For the first iteration of the outer loop (i = 0, representing the first row).
  The inner loop will run three times (j = 0, 1, 2 representing the three columns).
  The user will be asked to enter three numbers. Let's say they enter 1, 2, 3.
  These numbers will be stored in the first row of the array.

 For the second iteration of the outer loop (i = 1, representing the second row).
 The inner loop will again run three times.
 The user will be asked to enter three more numbers. Let's say they enter 4, 5, 6.
 These numbers will be stored in the second row of the array.

So, the final 2D array will look like this:

1 2 3
4 5 6

*/
    }

    public static void displayArray(int[] numArray) {

        int i = 0;

        while (i < numArray.length)
        {
            System.out.print(numArray[i] + " ");
            i++;
        }
    }
}