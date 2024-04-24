/*** The main purpose of this program is toc check whether array which we gave as input
 is either sorted or not in increasing or decreasing format
 for example;
 array1 = [1,2,8,9] is sorted array with increasing format
 array2 = [5,4,3,2,1] is sorted array with decreasing format
 */

public class SortedArrayChecker {

    public static void main(String[] args)
    {
        int[] numArray = ArrayUtility.takeArrayInput();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);

        if ( isInc || isDec )
        {
            System.out.println("Your array is sorted");
        }

        else
        {
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArray)
    {
        int i = 1;
        while (i < numArray.length)
        {
            if (numArray[i] > numArray[i-1])
            {
                return false;
            }
            i++;
        }
        return true;

/*
    Let's analyze how this function behaves with the array [1, 3, 5, 7]:

    i = 1 (initialization)
    numArray[i] (3) < numArray[i-1] (1) (False) -
    The second element (3) is not greater than the first element (1),
    so the condition for decreasing order is violated.
    The function immediately returns False without iterating further.
 */

    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] < numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;

/*
 Let's look at how this function works with the array [1, 3, 5, 7]:

    i = 1 (initialization)
    numArray[i] (3) > numArray[i-1] (1) (True) - Since the first two elements are in increasing order, the loop continues.
    i = 2 (iteration)
    numArray[i] (5) > numArray[i-1] (3) (True) - Again, the elements are in increasing order, so the loop continues.
    i = 3 (iteration)
    numArray[i] (7) > numArray[i-1] (5) (True) - The elements are still in increasing order. Since this is the last element of the array, the loop terminates.

As none of the elements violated the increasing order condition, the isIncreasing function returns True, indicating that the array is sorted in increasing order.

 */

 /*
So, why we started iterations steps with num[1]?
By starting the loop at i = 1, we essentially "reserve" the value of numArray[0] for comparison with the elements from the second position onwards.
This allows the functions to check the sorting order effectively without encountering issues related to missing previous elements.
 */

    }
}
