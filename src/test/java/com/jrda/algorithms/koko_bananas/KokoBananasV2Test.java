package com.jrda.algorithms.koko_bananas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KokoBananasV2Test {
    @Test
    public void test() {
        KokoBananasV2 kokoBananasV2 = new KokoBananasV2();
        assertEquals(4, kokoBananasV2.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, kokoBananasV2.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, kokoBananasV2.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }
}
