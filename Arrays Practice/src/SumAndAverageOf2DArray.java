public class SumAndAverageOf2DArray {

    public static long sum(int[][] numArray) {
        long sum = 0;
        int i = 0;

        while (i < numArray.length) {
            int j = 0;

            while (j < numArray[i].length) {
                sum += numArray[i][j];
                j++;
            }

            i++;

/*
Let's simplify it further. Imagine you have a 2D array like a grid:
1  2  3
4  5  6

Now, let's follow what the code does:

Initialization:
Start with sum as 0.
Start with i as 0.

Outer Loop (Rows):
Start with the first row ([1, 2, 3]).
Move through each element in this row.

Inner Loop (Columns):
Start with the first element (1) in the first row.
Add this element to sum.
Move to the next element (2).
Add it to sum.
Move to the next element (3).
Add it to sum.

Switch Rows:
Move to the next row ([4, 5, 6]).

Inner Loop (Columns):
Start with the first element (4) in the second row.
Add this element to sum.
Move to the next element (5).
Add it to sum.
Move to the next element (6).
Add it to sum.
Finish:

There are no more rows.
Return the final sum = 21.

 */
        }

        return sum;
    }


    public static double average(int[][] numArray) {

        if (numArray.length == 0) {
            return 0;
        }

        int rows = numArray.length;
        int cols = numArray[0].length;

        double size = rows * cols;
        return sum(numArray) / size;

        /*
Now, let's go through an example to illustrate these steps:

Consider numArray = [[1, 2, 3], [4, 5, 6]]:

The array has 2 rows and 3 columns.
The total number of elements (size) is 2 * 3 = 6.
The sum of all elements is calculated using the sum method which is 21.
Finally, the sum is divided by size to get the average (21 / 6 = 3.5).
         */
    }

    public static void main(String[] args) {

        int[][] numArray = ArrayUtility.take2DArrayInput();

        long sum = sum(numArray);
        double avg = average(numArray);


        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);

    }
}
