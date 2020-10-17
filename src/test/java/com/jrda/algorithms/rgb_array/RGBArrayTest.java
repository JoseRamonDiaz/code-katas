package com.jrda.algorithms.rgb_array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RGBArrayTest {
    @Test
    public void testSortRGB() {
        RGBArray rgbArray = new RGBArray();
        assertArrayEquals(new String[]{"r", "r", "r", "g", "g", "b", "b"}, rgbArray.sort(new String[]{"g", "b", "r", "r", "b", "r", "g"}));
    }
}
