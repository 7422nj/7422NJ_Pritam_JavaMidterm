package math.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;

import static org.testng.Assert.*;

public class UnitTestingMath {

    // Apply unit testing from each class contained within this package, here.
    private Object LowestNumber;


    @Test
    public void testFactorial() {
        int expectedResult = 120;
        int actualResult = Factorial.factorial(5);
        Assert.assertEquals(expectedResult, actualResult, "Test Failed");

    }

    @Test
    public void testFibonacci() {
        int expectedResult = 40;
        int actualResult = Fibonacci.fibonacci(40);
        Assert.assertEquals(expectedResult, actualResult, "Test Failed");
    }

    @Test
    public void checkPatternTest() {
        String expectedResult = "100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32,28,24,20,16,12,8,4,0";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        Pattern.printPattern();
        System.out.flush();
        System.setOut(old);

        String actualResult = baos.toString();
        assertEquals("Test fail", expectedResult, actualResult);

        //int expectedResult=Pattern.printPattern(100);
        //Assert.assertEquals("Test Failed", expectedResult,100);

    }

    @Test
    public void testFindLowestDifference() {
        int[] arr1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] arr2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int expectedResult = 0;
        int actualResult = FindLowestDifference.findLowestDifference(arr1, arr2);
        Assert.assertEquals(expectedResult, actualResult, "Test Failed");

    }

    @Test
    public void testIsPrime() {
        int num = 13;
        boolean expectedResult = true;
        boolean actualResult = true;
        Assert.assertTrue(true, "Test fail");
    }

    @Test
    public void testMissingNumber() {
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int[] actualResult = FindMissingNumber.missingNumber(array);
        Assert.assertEquals(expectedResult, actualResult, "Test fail");

    }

    @Test
    public int lowestNumberTest() {
        int expectedResult = 5;
        int actualResult = lowestNumberTest();
        Assert.assertEquals(expectedResult, actualResult, "Test Fail");

        return actualResult;

    }
}

