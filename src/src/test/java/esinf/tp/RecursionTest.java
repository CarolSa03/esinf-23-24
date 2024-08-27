package esinf.tp;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecursionTest {

    @Test
    public void testSum() {
        // Testing positive numbers
        assertEquals(5, Recursion.sum(2, 3));
        assertEquals(10, Recursion.sum(7, 3));

        // Testing with zero
        assertEquals(3, Recursion.sum(3, 0));
        assertEquals(7, Recursion.sum(0, 7));
    }

    @Test
    public void testDecimalToBinary() {
        // Testing standard conversions
        assertEquals("0", Recursion.decimalToBinary(0));
        assertEquals("1", Recursion.decimalToBinary(1));
        assertEquals("10", Recursion.decimalToBinary(2));
        assertEquals("1010", Recursion.decimalToBinary(10));
        assertEquals("1111", Recursion.decimalToBinary(15));

        // Testing larger numbers
        assertEquals("100000", Recursion.decimalToBinary(32));
        assertEquals("1100100", Recursion.decimalToBinary(100));
    }

    @Test
    public void testIsPrime() {
        // Testing non-prime numbers
        assertFalse(Recursion.isPrime(0));
        assertFalse(Recursion.isPrime(1));
        assertFalse(Recursion.isPrime(4));
        assertFalse(Recursion.isPrime(100));

        // Testing prime numbers
        assertTrue(Recursion.isPrime(2));
        assertTrue(Recursion.isPrime(3));
        assertTrue(Recursion.isPrime(5));
        assertTrue(Recursion.isPrime(7));
        assertTrue(Recursion.isPrime(13));
        assertTrue(Recursion.isPrime(17));

        // Testing larger prime numbers
        assertTrue(Recursion.isPrime(97));
    }

    @Test
    public void testIsPalindrome() {
        // Testing palindromes
        assertTrue(Recursion.isPalindrome("a"));
        assertTrue(Recursion.isPalindrome("aa"));
        assertTrue(Recursion.isPalindrome("aba"));
        assertTrue(Recursion.isPalindrome("abba"));
        assertTrue(Recursion.isPalindrome("racecar"));
        assertTrue(Recursion.isPalindrome("madam"));

        // Testing non-palindromes
        assertFalse(Recursion.isPalindrome("ab"));
        assertFalse(Recursion.isPalindrome("abc"));
        assertFalse(Recursion.isPalindrome("hello"));
        assertFalse(Recursion.isPalindrome("world"));
    }
}
