package com.jrda.algorithms.ugly_numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class UglyNumbersTest {
    @Test
    public void testGetNPrimeNumbers() {
        UglyNumbers uglyNumbers = new UglyNumbers();
        boolean[] expectedResponse = new boolean[5000];

        assertArrayEquals(expectedResponse, uglyNumbers.calculatePrimeNumbers(1));
        assertTrue(uglyNumbers.calculatePrimeNumbers(2)[4]);
        assertTrue(uglyNumbers.calculatePrimeNumbers(2)[6]);
        assertFalse(uglyNumbers.calculatePrimeNumbers(2)[2]);

    }
}
