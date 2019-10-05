package com.codekata._20.klondike;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoundationPileIndexTest {
    @Test
    public void testIndexes(){
        assertEquals(0, FoundationPileIndex.FIRST.ordinal());
        assertEquals(1, FoundationPileIndex.SECOND.ordinal());
        assertEquals(2, FoundationPileIndex.THIRD.ordinal());
        assertEquals(3, FoundationPileIndex.FOURTH.ordinal());
    }
}
