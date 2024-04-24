
public class SumAndAverageOfArray {
    public static void main(String[] args) {

        int[] numArray = ArrayUtility.takeArrayInput();

        long sum = sum(numArray);
        int avg = average(numArray);

        System.out.println("Sum of all elements in this array is: " + sum);
        System.out.println("Average of all elements in this array is: " + avg);

    }
        public static long sum(int[] numArray)
        {
            long sum = 0;
            int i = 0;

            while (i < numArray.length) {
                sum += numArray[i];
                i++;
/*
So, in the context of your example with an array of size 5 and values
1, 2, 3, 4, 5, the sum method would work as follows:
            Iteration 1: sum = 0 + 1 = 1
            Iteration 2: sum = 1 + 2 = 3
            Iteration 3: sum = 3 + 3 = 6
            Iteration 4: sum = 6 + 4 = 10
            Iteration 5: sum = 10 + 5 = 15
Finally, 15 would be returned as the sum of all elements in the array.
*/
            }
            return sum;
        }

        public static int average(int[] numArray)
        {
            long sum = sum(numArray);

            return (int) (sum / numArray.length);

/*
Average Calculation:
The avg method calculates the average by dividing the sum by the number of elements in the array:
        average = sum / numArray.length = 15 / 5 = 3
Type Casting:
The result of the division is a long value.
Since the method is declared to return an int, the result is typecasted to an int.
Return Statement:
The calculated average value, which is 3, is returned to the calling method.
*/
        }
}