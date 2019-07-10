package com.codekata._14.trigram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigramTest {

    @Test
    public void testPairReader(){
        PairReader pr = new PairReader("trigrams");
        assertEquals(4, pr.getPairsCount());
    }

}
