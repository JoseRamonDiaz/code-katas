package com.jrda.algorithms.ugly_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumbersTest {
    @Test
    public void tesUglies() {
        UglyNumbers uglyNumbers = new UglyNumbers();
        assertEquals(1, uglyNumbers.nthUglyNumber(1));
        assertEquals(2, uglyNumbers.nthUglyNumber(2));
        assertEquals(3, uglyNumbers.nthUglyNumber(3));
        assertEquals(4, uglyNumbers.nthUglyNumber(4));
        assertEquals(5, uglyNumbers.nthUglyNumber(5));
        assertEquals(6, uglyNumbers.nthUglyNumber(6));
        assertEquals(8, uglyNumbers.nthUglyNumber(7));
        assertEquals(9, uglyNumbers.nthUglyNumber(8));
        assertEquals(10, uglyNumbers.nthUglyNumber(9));
        assertEquals(12, uglyNumbers.nthUglyNumber(10));
        assertEquals(15, uglyNumbers.nthUglyNumber(11));
        assertEquals(64, uglyNumbers.nthUglyNumber(27));
    }

    @Test
    public void testMin() {
        UglyNumbers uglyNumbers = new UglyNumbers();
        assertEquals(1, uglyNumbers.min(1, 2, 3));
        assertEquals(1, uglyNumbers.min(2, 1, 3));
        assertEquals(1, uglyNumbers.min(3, 2, 1));
    }
}
