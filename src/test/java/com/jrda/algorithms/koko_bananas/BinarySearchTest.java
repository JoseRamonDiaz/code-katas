package com.jrda.algorithms.koko_bananas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        KokoBinarySearch kokoBinarySearch = new KokoBinarySearch();
        assertEquals(4, kokoBinarySearch.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, kokoBinarySearch.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, kokoBinarySearch.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}
