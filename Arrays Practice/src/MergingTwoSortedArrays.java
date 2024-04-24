public class MergingTwoSortedArrays {

    public static void main(String[] args) {

        int[] array1 = ArrayUtility.takeArrayInput();
        int[] array2 = ArrayUtility.takeArrayInput();

        int[] mergedArray = merge(array1, array2);
        System.out.println("Array after merging: ");
        ArrayUtility.displayArray(mergedArray);

    }

        public static int[] merge(int[] array1, int[] array2) {
            int newSize = array1.length + array2.length;
            int[] newArray = new int[newSize];

            int i = 0, j = 0, k = 0;
            while (i < array1.length || j < array2.length) {
                if ( j == array2.length || (i < array1.length && array1[i] < array2[j]) ) {
                    newArray[k] = array1[i];
                    i++;
                    k++;
                }
                else {
                    newArray[k] = array2[j];
                    k++;
                    j++;
                }
            }

            return newArray;

/*

Let's break down the code's execution step-by-step for the following arrays:

array1 = [1, 2, 3, 4]
array2 = [5, 6, 7, 8]

1. Initialization

We calculate the combined size of the arrays:
newSize = array1.length + array2.length = 4 (length of array1) + 4 (length of array2) = 8
A new empty array newArray is created with a size of 8: newArray = [ , , , , , , , ]
We initialize three indices: i = 0 (points to the first element in array1),
j = 0 (points to the first element in array2), and k = 0 (points to the next available position in newArray).

2. Loop Iterations

The code enters a loop that continues as long as either i or j hasn't reached the end of their respective arrays.

Here's what happens in each iteration:

Iteration 1:

Loop Condition:
Both i < array1.length (0 < 4) and j < array2.length (0 < 4) are true, so the loop continues.

Comparison:
array1[i] (1) is smaller than array2[j] (5).

Merging:
The element from array1 is copied:
newArray[k] = array1[i] = 1 (newArray becomes: [1, , , , , , , ])
i is incremented to move to the next element in array1 (i becomes 1)
k is incremented to move to the next position in newArray (k becomes 1)

Iteration 2 (and so on):
The loop continues iterating, comparing elements from array1 and array2,
 and copying the smaller element to newArray.

Here's a general overview of the comparisons and copying that happen in the subsequent iterations:

Iteration 2: array1[i] (2) is smaller than array2[j] (5), so copy 2 from array1 to newArray.
Iteration 3: array1[i] (3) is smaller than array2[j] (5), so copy 3 from array1 to newArray.
Iteration 4: array1[i] (4) is smaller than array2[j] (5), so copy 4 from array1 to newArray.
After these iterations, i will be 4 (reaching the end of array1), and newArray will become: [1, 2, 3, 4, , , , ].

Iteration 5:

Loop Condition:
i (4) is already at the end of array1, but j < array2.length (0 < 4) is still true.

Comparison:
Since i has reached the end, we don't compare elements. We know the remaining elements in array2 are larger.

Merging:
The remaining elements from array2 are copied one by one:
newArray[k] = array2[j] = 5 (newArray becomes: [1, 2, 3, 4, 5, , , ])
i is not incremented (as it's already at the end)
j and k are incremented for each remaining element in array2.

The loop doesn't perform comparisons anymore.
Instead, it enters a phase where it simply copies the remaining elements from array2 (6, 7, and 8)
  to newArray one by one.

End of Loop:
Since i has reached the end of array1, the loop exits.

4. Final Array:

After the loop exits, newArray contains the merged and sorted elements: [1, 2, 3, 4, 5, 6, 7, 8].

 */
        }
    }
