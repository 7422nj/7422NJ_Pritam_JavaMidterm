package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public Object insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here

        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > current)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = current;


            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;

        }
        return null;
    }

    //implement here
    public int[] bubbleSort(int[] Array) {
        final long startTime = System.currentTimeMillis();
        int[] list = Array;
        int n = Array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Array[j - 1] > Array[j]) {
                    //swap elements
                    temp = Array[j - 1];
                    Array[j - 1] = Array[j];
                    Array[j] = temp;
                }

            }
        }

        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;

    }


    public int[] mergeSort(int[] array) {
        // final long startTime = System.currentTimeMillis();
        // final long endTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (list.length <= 1) {
            return list;
        }
        int midPoint = array.length / 2;
        int[] left = new int[midPoint];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[midPoint];
        } else {
            right = new int[midPoint + 1];
        }
        for (int i = 0; i < midPoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < left.length; j++) {
            right[j] = array[midPoint + j];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return result;


        //final long endTime = System.currentTimeMillis();
        // final long executionTime = endTime - startTime;
        //this.executionTime = executionTime;
        //return list;


    }


    public void quickSort(int[] array) {
        int[] list = array;
    }
    //implement here
    public static int[] merge(int[] right, int[] left) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer++];
            }
        }
        return result;
    }

    public static void heapSort(int[] array) {
        int[] list = array;
        //implement here
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            heapSort(array, i, array.length - 1);

        }
    }


    public static void heapSort(int[] arr, int i,int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int max;
        if(left <= size && arr[left] > arr[i]){
            max=left;
        } else {
            max=i;
        }

        if(right <= size && arr[right] > arr[max]) {
            max=right;
        }
        // If max is not current node, exchange it with max of left and right child
        if(max!=i) {
            exchange(arr,i, max);
            heapSort(arr, max,size);
        }
    }

    public static void exchange(int[] arr,int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static int[] heapSort(int[] arr, int[] array) {

        heapSort(array);
        int sizeOfHeap=arr.length-1;
        for(int i=sizeOfHeap; i>0; i--) {
            exchange(arr,0, i);
            sizeOfHeap=sizeOfHeap-1;
            heapSort(arr, 0,sizeOfHeap);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,10,16,19,3,5};
        System.out.println("Before Heap Sort : ");
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println("=====================");
        System.out.println("After Heap Sort : ");
        System.out.println(Arrays.toString(arr));
    }


    public void bucketSort(int[] array) {
        int[] list = array;
        //implement here
        int[] arr = {37, 74, 12, 45, 67, 99, 65, 29, 32, 9, 15, 4};
        System.out.println("Original array- " + Arrays.toString(arr));
        bucketSort(arr, 10);
        System.out.println("Sorted array after bucket sort- " + Arrays.toString(arr));
    }

    private static void bucketSort(int[] arr, int bucketSize){
        // Create bucket array for storing lists
        List<Integer>[] buckets = new List[bucketSize];
        // Linked list with each bucket array index
        // as there may be hash collision
        for(int i = 0; i < bucketSize; i++){
            buckets[i] = new LinkedList<>();
        }
        // calculate hash and assign elements to proper bucket
        for(int num : arr){
            buckets[hash(num, bucketSize)].add(num);
        }
        // sort buckets
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int index = 0;
        // Merge buckets to get sorted array
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                arr[index++] = num;
            }
        }
    }

    // hash function used for element distribution
    private static int hash(int num, int bucketSize){
        return num/bucketSize;



    }

    public void shellSort(int  arrayToSort[]) {
        //implement here
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }

        }}

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
