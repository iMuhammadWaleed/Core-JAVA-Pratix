public class SumOfDiagonalsOf2DArray {

    public static void main(String[] args) {

        int[][] numArray = ArrayUtility.take2DArrayInput();

        long sum = sumOfDiagonals(numArray);


        System.out.println("Your sum of diagonal elemrnts in an array is: " + sum);

    }

    public static long sumOfLeftDiagonal(int[][] numArray) {

        long sum = 0;
        int i = 0;

        while (i < numArray.length) {
            sum+= numArray[i][i];
            i++;
        }

        return sum;

        /*
         Let's assume numArray = [[1, 2], [3, 4]]:

    sum is initialized to 0.
    i is initialized to 0.
    The while loop iterates over each row of the array.
    In the first iteration: sum += numArray[0][0], which is 1. So, sum = 1.
    i is incremented to 1.
    In the second iteration: sum += numArray[1][1], which is 4. So, sum = 1 + 4 = 5.
    i is incremented to 2.
    The loop ends because i is no longer less than numArray.length.
    The function returns sum, which is 5, the sum of the elements on the left diagonal.
         */
    }

    public static long sumOfRightDiagonal(int[][] numArray) {

        int i = 0;
        long sum = 0;
        while (i < numArray.length) {
            int col = numArray.length - 1 - i;
            sum += numArray[i][col];
            i++;
        }

        return sum;

        /*
    i is initialized to 0.
    The while loop iterates over each row of the array.
    In the first iteration: col = 2 - 1 - 0 = 1, so sum += numArray[0][1], which is 2. So, sum = 2.
    i is incremented to 1.
    In the second iteration: col = 2 - 1 - 1 = 0, so sum += numArray[1][0], which is 3. So, sum = 2 + 3 = 5.
    i is incremented to 2.
    The loop ends because i is no longer less than numArray.length.
    The function returns sum, which is 5, the sum of the elements on the right diagonal.
         */
    }

    public static long sumOfDiagonals(int[][] numArray) {

        long leftSum = sumOfLeftDiagonal(numArray);
        long rightSum = sumOfRightDiagonal(numArray);

        long sum = leftSum + rightSum;

        if (numArray.length % 2 != 0) {
            int ind = numArray.length / 2;
            sum += numArray[ind][ind];
        }

        return sum;

        /*
    leftSum is calculated using the sumOfLeftDiagonal() function, which would be 1 + 4 = 5.
    rightSum is calculated using the sumOfRightDiagonal() function, which would be 2 + 3 = 5.
    sum is the sum of both diagonals, so sum = 5 + 5 = 10.
    Since the matrix has an even number of rows/columns, there's no need to add any center element.
    Finally, 10 is returned as the total sum of the diagonals.
         */
    }
}
