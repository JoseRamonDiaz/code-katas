package com.jrda.algorithms.koko_bananas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KokoBananasTest {
    @Test
    public void testKokoBananas() {
        KokoBananas kokoBananas = new KokoBananas();
        assertEquals(4, kokoBananas.calcK(new int[]{}, 8));
    }
}
