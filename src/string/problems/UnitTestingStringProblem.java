package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.testng.Assert.*;

public class UnitTestingStringProblem<expectedResult, actualResult>  {



    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here


    }
        @Test
        public void testPermutation() {
            Set<String> expectedResult = new HashSet<>(Arrays.asList("bob","obb","bbo"));
            Set<String> actualResult = Permutation.permutations("bob");
            Assert.assertEquals("Test Failed", expectedResult, String.valueOf(actualResult));
        }

        @Test
        public void testAnagram() {
            String expectedResult = "act and cat are anagram.";
            boolean actualResult = Anagram.checkAnagram("ACT", "CAT");
            Assert.assertEquals("Test Fail", expectedResult, String.valueOf(actualResult));
        }

        @Test
        public void testLargestWord() {
            String expectedResult = "10 biological";
            Map<Integer, String> actualResult = DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
            Assert.assertEquals("Test Fail", expectedResult, String.valueOf(actualResult));
        }

        @Test
        public void testDuplicateWord() {
            DuplicateWord.duplicateWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        }
        @Test
        public void testPalindrome() {
        Palindrome palindrome;
            boolean expectedResult = true;
//            boolean actualResult = Palindrome.isPalindromes("MADAM");
//            Assert.assertEquals("Test Fail", expectedResult, actualResult);
        }}


