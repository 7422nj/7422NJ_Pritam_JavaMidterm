package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */

        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i]) != 1) ;
            {
                array[i] = array[i] + 1;
            }
            System.out.println(Arrays.toString(array));
        }
    }
    public static int[] missingNumber(int[] array) {
        return array;
    }
    }

