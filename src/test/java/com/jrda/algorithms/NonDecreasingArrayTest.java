package com.jrda.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonDecreasingArrayTest {
    @Test
    public void testEmptyArray() {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        assertFalse(nonDecreasingArray.checkPossibility(null));
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{}));
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{1}));
        assertFalse(nonDecreasingArray.checkPossibility(new int[]{4, 2, 1}));
        assertTrue(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
        assertFalse(nonDecreasingArray.checkPossibility(new int[]{3, 4, 2, 3}));
    }
}
