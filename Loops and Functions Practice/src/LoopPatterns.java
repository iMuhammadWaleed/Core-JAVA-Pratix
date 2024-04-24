import java.util.Scanner;

class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the no of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);
    }

    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\nHere is Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            // this loop prints stars
            int i = 0;
            while (i <= (maxRows-rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
/*

First Iteration:
rows is initially set to 5.
Outer Loop:
Since rows is greater than 0, the outer loop begins.
Printing Spaces:
The inner loop prints 4 spaces (rows - 1).
Printing Stars:
The inner loop prints 1 star (i starts from 0, and maxRows - rows is also 0).
Line Break:
After printing spaces and stars, a new line is inserted.
Decrementing Rows:
rows is decremented to 4.

Second Iteration:
rows is now 4.
Outer Loop:
It continues because rows is still greater than 0.
Printing Spaces:
The inner loop prints 3 spaces (rows - 1).
Printing Stars:
The inner loop prints 2 stars (maxRows - rows is 1).
Line Break:
After printing spaces and stars, a new line is inserted.
Decrementing Rows:
rows is decremented to 3.

Third Iteration:
rows is now 3.
Outer Loop:
It continues because rows is still greater than 0.
Printing Spaces:
The inner loop prints 2 spaces (rows - 1).
Printing Stars:
The inner loop prints 3 stars (maxRows - rows is 2).
Line Break:
After printing spaces and stars, a new line is inserted.
Decrementing Rows:
rows is decremented to 2.

Fourth Iteration:
rows is now 2.
Outer Loop:
It continues because rows is still greater than 0.
Printing Spaces:
The inner loop prints 1 space (rows - 1).
Printing Stars:
The inner loop prints 4 stars (maxRows - rows is 3).
Line Break:
After printing spaces and stars, a new line is inserted.
Decrementing Rows:
rows is decremented to 1.

Fifth Iteration:
rows is now 1.
Outer Loop:
It continues because rows is still greater than 0.
Printing Spaces:
The inner loop prints 0 spaces (rows - 1).
Printing Stars:
The inner loop prints 5 stars (maxRows - rows is 4).
Line Break:
After printing spaces and stars, a new line is inserted.
Decrementing Rows:
rows is decremented to 0.

*/
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}