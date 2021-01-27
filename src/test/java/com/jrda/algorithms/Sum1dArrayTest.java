package com.jrda.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Sum1dArrayTest {
    @Test
    public void testSum() {
        Sum1dArray sum1dArray = new Sum1dArray();
        assertArrayEquals(new int[]{1, 3, 6, 10}, sum1dArray.runningSum(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sum1dArray.runningSum(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{3,4,6,16,17}, sum1dArray.runningSum(new int[]{3,1,2,10,1}));
    }
}