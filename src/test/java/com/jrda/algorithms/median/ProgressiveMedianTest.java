package com.jrda.algorithms.median;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgressiveMedianTest {
    @Test
    public void testProgressiveMedian() {
        ProgressiveMedian progressiveMedian = new ProgressiveMedian();
        assertEquals(2, progressiveMedian.add(2), 0.001);
        assertEquals(1.5, progressiveMedian.add(1), 0.001);
        assertEquals(2, progressiveMedian.add(5), 0.001);
        assertEquals(3.5, progressiveMedian.add(7), 0.001);
    }
}
