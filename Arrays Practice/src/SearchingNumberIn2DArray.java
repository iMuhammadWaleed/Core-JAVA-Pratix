import java.util.Scanner;
public class SearchingNumberIn2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] numArray = ArrayUtility.take2DArrayInput();

        System.out.println("Now enter the number you want to search: ");
        int num = input.nextInt();

        boolean isFound = search(numArray, num);

        if (isFound) {
            System.out.println("Your number is found");
        }

        else {
            System.out.println("Your number is not found");
        }
    }

    public static boolean search(int[][] numArray, int num) {
        int i = 0;

        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == num) {
                return true;
            }
            j++;
        }
        i++;
        }
        return false;

/*
Let's break it down with the array numArray = [ [1,2,3], [4,5,6] ] and we're searching for num = 4.

    The method starts at i=0 and j=0, which corresponds to the number 1 in the array. Since 1 is not 4, it increments j to 1.

    Now i=0 and j=1, which corresponds to the number 2 in the array. Since 2 is not 4, it increments j to 2.

    Now i=0 and j=2, which corresponds to the number 3 in the array. Since 3 is not 4, it increments i to 1 and resets j to 0.

    Now i=1 and j=0, which corresponds to the number 4 in the array. Since 4 is 4, the method returns true.

So, the method would return true because 4 is present in the array.
*/
    }
}
