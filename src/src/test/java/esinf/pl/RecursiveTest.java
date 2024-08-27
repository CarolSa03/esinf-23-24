package esinf.pl;

import esinf.pl.Recursive;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class RecursiveTest extends TestCase {

    public void testReverse() {
        assertEquals("", Recursive.reverse(""));
        assertEquals("a", Recursive.reverse("a"));
        assertEquals("ba", Recursive.reverse("ab"));
        assertEquals("abcde", Recursive.reverse("edcba"));
    }

    public void testProduct() {
        assertEquals(0, Recursive.product(6980,0));
        assertEquals(9, Recursive.product(3,3));
        assertEquals(15, Recursive.product(5,3));
        assertEquals(-15, Recursive.product(-5,3));
        assertEquals(3480, Recursive.product(58,60));
        assertEquals(34146160, Recursive.product(6980,4892));

    }

    public void testGcd() {
        // Basic tests
        assertEquals(1, Recursive.gcd(17, 3));
        assertEquals(5, Recursive.gcd(20, 5));

        assertEquals(15, Recursive.gcd(0, 15));
        assertEquals(15, Recursive.gcd(15, 0));

        assertEquals(7, Recursive.gcd(7, 7));
        assertEquals(12, Recursive.gcd(12, 12));

        assertEquals(8, Recursive.gcd(56, 24));
        assertEquals(13, Recursive.gcd(169, 26));

        assertEquals(1, Recursive.gcd(14, 25));
        assertEquals(1, Recursive.gcd(37, 14));;
    }

    public void testStringToInt() {
        assertEquals(123, Recursive.stringToInt("123"));
        assertEquals(0, Recursive.stringToInt("0"));
        assertEquals(4567, Recursive.stringToInt("4567"));
        assertEquals(1001, Recursive.stringToInt("1001"));
        assertEquals(987654321, Recursive.stringToInt("987654321"));
        assertEquals(0, Recursive.stringToInt(""));
    }

    public void testIsPalindrome() {
        assertTrue(Recursive.isPalindrome(121));
        assertTrue(Recursive.isPalindrome(12321));
        assertFalse(Recursive.isPalindrome(123));
        assertFalse(Recursive.isPalindrome(1234));
        assertTrue(Recursive.isPalindrome(1));
        assertTrue(Recursive.isPalindrome(0));
        assertTrue(Recursive.isPalindrome(1221));
    }

    public void testSumRow() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals(10, Recursive.sumRow(array, 0, 0));
        assertEquals(26, Recursive.sumRow(array, 1, 0));
        assertEquals(42, Recursive.sumRow(array, 2, 0));
    }

    public void testSumOfElemArray() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        assertEquals(78, Recursive.sumOfElemArray(array, 0));
    }
}