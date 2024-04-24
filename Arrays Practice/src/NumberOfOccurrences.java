import java.util.Scanner;
class NumberOfOccurrences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.takeArrayInput();
        System.out.print("Enter the value you want to find: ");
        int num = input.nextInt();

        int occurrences = numberOfOccurrences(numArray, num);
        System.out.println("Your number was found " + occurrences + " times in an array");
    }

        public static int numberOfOccurrences(int[] numArray, int num)
        {
            int occ = 0;
            int i = 0;

            while (i < numArray.length)
            {
              if (numArray[i] == num)
              {
                 occ++;
              }
              i++;
            }
            return occ;
        }
/*

Suppose numArray[] = [1, 2, 2, 2,4]
num = 2 (which is a number to find)
and therefore obviously numArray.length = 5

Inside the loop:

"Remember "i" will keep updating due to i++"

Iteration 1:
numArray[0] = 1 is not equal to 2
therefore, occ = 0

Iteration 2:
numArray[1] = 2 is  equal to 2
therefore, occ = 0 + 1 = 1 (occ++ is executed)

Iteration 3:
numArray[2] = 2 is  equal to 2
therefore, occ = 1 + 1 = 2 (occ++ is executed)

Iteration 4:
numArray[3] = 2  is equal to 2
therefore, occ = 2 + 1 = 3 (occ++ is executed)

Iteration 5:
numArray[4] = 4 is not equal to 2
therefore, occ  will remain 3

and 3 will be returned as
the value of occ which will
be printed via main method
*/

    }
