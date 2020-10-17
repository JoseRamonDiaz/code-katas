package com.jrda.algorithms.palindrome_numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeNumbersTest {
    @Test
    public void testNegativeNumber() {
        assertFalse(PalindromeNumbers.isPalindrome(-10));
    }

    @Test
    public void testPalindromeNumber() {
        assertTrue(PalindromeNumbers.isPalindrome(101));
        assertTrue(PalindromeNumbers.isPalindrome(23132));
    }

    @Test
    public void testNoPalindromeNumber() {
        assertFalse(PalindromeNumbers.isPalindrome(100));
        assertFalse(PalindromeNumbers.isPalindrome(456));
    }
}
