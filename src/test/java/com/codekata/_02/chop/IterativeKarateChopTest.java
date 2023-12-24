package com.codekata._02.chop;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IterativeKarateChopTest {
    private IterativeKarateChop karateChop;

    @Before
    public void init() {
        karateChop = new IterativeKarateChop();
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, karateChop.chop(2, new int[] {}));
    }

    @Test
    public void testArraySingleEntry() {
        assertEquals(0, karateChop.chop(2, new int[] {2}));
    }

    @Test
    public void testArrayLength1NotFound() {
        assertEquals(-1, karateChop.chop(2, new int[] {1}));
    }

    @Test
    public void testArrayLength2FoundLast() {
        assertEquals(1, karateChop.chop(1, new int[] {0, 1}));
    }

    @Test
    public void testArrayLength2FoundFirst() {
        assertEquals(0, karateChop.chop(0, new int[] {0, 1}));
    }

    @Test
    public void testArrayLength3FoundLast() {
        assertEquals(2, karateChop.chop(2, new int[] {0, 1, 2}));
    }

    @Test
    public void testArrayLength3FoundMiddle() {
        assertEquals(1, karateChop.chop(1, new int[] {0, 1, 2}));
    }

    @Test
    public void testArrayLength3FoundFirst() {
        assertEquals(0, karateChop.chop(0, new int[] {0, 1, 2}));
    }

    @Test
    public void testArrayLength4Found4() {
        assertEquals(3, karateChop.chop(3, new int[] {0, 1, 2, 3}));
    }

    @Test
    public void testArrayLength4Found3(){
        assertEquals(2, karateChop.chop(2, new int[] {0, 1, 2, 3}));
    }

    @Test
    public void testArrayLength4Found2(){
        assertEquals(1, karateChop.chop(1, new int[] {0, 1, 2, 3}));
    }

    @Test
    public void testArrayLength4Found1(){
        assertEquals(0, karateChop.chop(0, new int[] {0, 1, 2, 3}));
    }
}
