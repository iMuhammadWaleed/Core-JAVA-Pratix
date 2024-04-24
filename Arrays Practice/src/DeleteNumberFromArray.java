import java.util.Scanner;
public class DeleteNumberFromArray {

        public static void main(String[] args)

        {
            Scanner input = new Scanner(System.in)
;            int[] numArray = ArrayUtility.takeArrayInput();
            System.out.print("Enter the number you want to delete: ");
            int numToDelete = input.nextInt();

            int[] newArray = deleteNumber(numArray, numToDelete);

            System.out.println("Your array now becomes: ");
            ArrayUtility.displayArray(newArray);

        }

        public static int[] deleteNumber(int[] numArray, int numToDelete) {
        int occ = NumberOfOccurrences.numberOfOccurrences(numArray, numToDelete);

            int newSize = numArray.length - occ;
            int[] newArray = new int[newSize];

            if (occ == 0)
            {
                return numArray;
            }

            int i = 0, j = 0;

            while (i < numArray.length)
            {
                if (numArray[i] != numToDelete)
                {
                    newArray[j] = numArray[i];
                    j++;
                }

                i++;
            }
            return newArray;

            /*
 Let see how deleteNumber method is working:

 Suppose numArray[] = [1,2,3,4]; and number you want to exclude it from it is "3".

1. For numberOfOccurrences method from NumberOfOccurrences class (Helper Method):

    This method calculates how many times the number 3 appears in numArray.
        "i" iterate through the array:
            At i = 0 (index 0), numArray[i] (1) is not equal to 3, so the count occ remains 0.
            At i = 1 (index 1), numArray[i] (2) is not equal to 3, so occ remains 0.
            At i = 2 (index 2), numArray[i] (3) is equal to 3, so occ is incremented to 1.
            At i = 3 (index 3), numArray[i] (4) is not equal to 3, so occ remains 1.
    The method returns occ, which is now 1.

2. Creating the New Array:

    Since there's one occurrence of 3, the new array's size will be numArray.length - 1 (4 - 1) = 3.
    A new array newArray with size 3 is created.

3. Copying Elements (Excluding 3):

Loop Setup:

    Two variables are initialized:
        i to keep track of the current index in the original array (numArray).
        j to keep track of the index where elements will be copied to in the new array (newArray).

    i iterate through numArray, and j iterates through newArray.
        At i = 0 (index 0) and j = 0:
            numArray[i] (1) is not 3, so it's copied to newArray[j] (which becomes 1).
            j is incremented to 1.
        At i = 1 (index 1) and j = 1:
            numArray[i] (2) is not 3, so it's copied to newArray[j] (which becomes 2).
            j is incremented to 2.
        At i = 2 (index 2) where numArray[i] (3) is the number to delete, it's skipped.
        At i = 3 (index 3) and j still at 2:
            Since i has reached the end of numArray, the loop terminates.

4. Returning the New Array:

    The deleteNumber method returns the newArray, which now contains [1, 2, 4].
*/

        }


    }
