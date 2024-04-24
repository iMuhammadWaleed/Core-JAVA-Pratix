public class CheckingPalindromeInArray {

    public static void main(String[] args) {

        int[] numArray = ArrayUtility.takeArrayInput();

        boolean isPalin = isPalindrome(numArray);

        if (isPalin) {
            System.out.println("It is the palindrome array");
        }

        else {
            System.out.println("It is not the palindrome array");
        }
        }

        public static boolean isPalindrome(int[] numArray) {
            int i = 0;

            while (i < numArray.length / 2) {
                if (numArray[i] != numArray[numArray.length - 1 - i]) {
                    return false;
                }
                i++;
            }
            return true;

/*
Let's walk through the iterations of the isPalindrome method for the example array [1, 2, 2, 2, 1]:

Iteration 1:

    i starts at 0.
    Loop condition check: 0 is less than half of the array length (which is 2.5, rounded down to 2).
    The loop continues.
    Element comparison:
        The code accesses numArray[0], which is 1.
        The mirrored position is calculated as numArray.length - 1 - i = 5 - 1 - 0 = 4.
        So, it compares numArray[0] (1) with numArray[4] (1).
        They match (1 == 1).

Iteration 2:

    i is incremented to 1.
    Loop condition check: 1 is still less than 2. The loop continues.
    Element comparison:
        The code compares numArray[1] (2) with numArray[length - 1 - i] = numArray[3] (2).
        They match (2 == 2).

Iteration 3:

    i is incremented to 2.
    Loop condition check: Crucially, 2 is not less than half the array length (2).
    This is the key point where the loop terminates.
*/
        }
    }
