package algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    @Test
    public void selection() throws Exception{
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the sorting algorithm...................below

// Test insertion sort
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Bubble sort
        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubble sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Merge sort
        sort.mergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the merge sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Quick sort
        sort.quickSort(unSortedArray);
        //verify if the unsorted array is sorted by the quick sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Heap sort
        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heap sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Bucket sort
        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucket sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        // Test Shell sort
        sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the shell sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }




    }
}
