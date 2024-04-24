public class MaximumAndMinimumNumber {

    public static void main(String[] args) {
        int[] numArray = ArrayUtility.takeArrayInput();

        int max = max(numArray);
        int min = min(numArray);

        System.out.println("Maximum number in your array is: " + max);
        System.out.println("Minimum number in your array is: " + min);

    }

    public static int max(int[] numArray) {

        if (numArray.length == 0)
        {
            return Integer.MIN_VALUE;
            /* We used it suppose if array's size is zero or array is empty you can say,
               so it means you will obviously return nothing in min variable of main
               method, and it will automatically become zero!
             */
        }

        int max = numArray[0]; // first value of an array

        int i =1; // iterations will start from index 1 value for example in [2,1,3] from "1"

        while (i < numArray.length) {

            if (max < numArray[i])
            {
                max = numArray[i];
            /* We will be checking if number which we supposed as max is either had not
            become large to number we are visiting using this iteration while loop, if it is
            so then make max variable equal to that array's value
             */

            }
            i++;

            /* as far as iterations are less than array's length it'll be kept on increasing
            iterative values by adding 1
             */
        }

        return max;

    }

    public static int min(int[] numArray) {

        int min = Integer.MAX_VALUE;

        int i = 0;

        while(i< numArray.length) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}

/*
So how'z that working let's have a deep look!

Suppose numArray[] = [1,2,4,6,8] and its length is 5.
So, Let's go through each step of the iteration process for both the max and min methods

max method:

Initialize max variable to the first element of the array: max = numArray[0], which is 1.
Set i to 1.

In the first iteration:
Check if max (currently 1) is less than numArray[1], which is 2. Since it is, update max to 2.
Increment i.

In the second iteration:
Check if max (currently 2) is less than numArray[2], which is 4. Since it is, update max to 4.
Increment i.

In the third iteration:

Check if max (currently 4) is less than numArray[3], which is 6. Since it is, update max to 6.
Increment i.
In the fourth iteration:

Check if max (currently 6) is less than numArray[4], which is 8. Since it is, update max to 8.
Increment i.

Since i is now equal to the length of the array (5), the loop terminates.
Return max, which is 8.

min method:

Initialize min variable to Integer.MAX_VALUE, which is the largest possible integer value.
Set i to 0.

In the first iteration:
Check if min (currently Integer.MAX_VALUE) is greater than numArray[0], which is 1.
Since it is, update min to 1.
Increment i.

In the second iteration:
Check if min (currently 1) is greater than numArray[1], which is 2. Since it is not, min remains 1.
Increment i.

In the third iteration:
Check if min (currently 1) is greater than numArray[2], which is 4. Since it is not, min remains 1.
Increment i.

In the fourth iteration:
Check if min (currently 1) is greater than numArray[3], which is 6. Since it is not, min remains 1.
Increment i.
In the fifth iteration:

Check if min (currently 1) is greater than numArray[4], which is 8. Since it is not, min remains 1.
Increment i.

Since i is now equal to the length of the array (5), the loop terminates.
Return min, which is 1.

So, the max method returns 8, and the min method returns 1,

 */
