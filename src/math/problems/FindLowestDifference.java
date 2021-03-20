package math.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindLowestDifference {
    static FindLowestDifference LearnArrayWithMethod;

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

    }
    public static int findLowestDifference(int[] arr1, int[] arr2) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{30, 5, 2, 9, 12, 20, 33, 1}));
        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{18, 25, 41, 47, 17, 36, 14, 19}));

        // How To Do Union Set
        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two set " + union);

        LearnArrayWithMethod.checkMinimum(array1);
        return 0;
    }
    // This Method will Check Minimum Value from an Array
    static void checkMinimum(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        System.out.println("Minimum value : " + min);
    }}



