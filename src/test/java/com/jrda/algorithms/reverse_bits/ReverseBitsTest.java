package com.jrda.algorithms.reverse_bits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {
    @Test
    public void test() {
        assertEquals(-1073741825,new ReverseBits().reverseBits(-3));
    }
}
