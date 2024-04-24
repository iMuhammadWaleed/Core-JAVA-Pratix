public class ReversingAnArray {

    public static void main(String[] args) {
        int[] numArray = ArrayUtility.takeArrayInput();
        reverseArray(numArray);

        System.out.println("Array after reversing: ");
        ArrayUtility.displayArray(numArray);
    }

    public static void reverseArray(int[] array) {
        int i = 0;

        while (i < array.length / 2) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
            i++;
        }
/*
Here's a breakdown of how it works for an array with the values [1, 2, 3]:

Initialization:

An integer variable i is declared and initialized to 0.

Loop Condition:

A while loop is used to iterate as long as i is less than half the length of the array (array.length / 2).
This condition ensures that the swapping process only goes halfway through the array,
as swapping the elements at opposite ends effectively reverses the order within that range.

Swapping Elements:

Inside the loop:

A temporary variable temp is declared and assigned the value of the element at index i (initially temp = array[0] = 1).
Increment Counter:

After each swap, the loop counter i is incremented by 1.
Iteration Breakdown:

Iteration 1:
i = 0, temp = array[0] = 1
array[0] = array[2] = 3
array[2] = temp = 1 (now the array becomes [3, 2, 1])
Iteration 2:
i = 1, temp = array[1] = 2 (but this value won't be used for swapping as i has already reached the halfway point)
The loop terminates because i (1) >= array.length / 2 (1.5).

 */

    }
}
