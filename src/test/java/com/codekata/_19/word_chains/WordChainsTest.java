package com.codekata._19.word_chains;

import com.codekata._04.datamunging.DataReader;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class WordChainsTest {
    private WordChain wc;
    @Before
    public void init(){
        wc = new WordChain();
    }

    @Test
    public void getDiccionaryTest(){
        assertNotNull(wc.getDiccionary());
        assertNotNull(wc.getDiccionary().size());
    }

    @Test
    public void sameWordTest(){
        assertEquals( Collections.emptyList(), wc.getShortestWordChain("cat", "cat"));
    }

    @Test
    public void differentLengthTest(){
        assertEquals( Collections.emptyList(), wc.getShortestWordChain("cat", "catl"));
    }

    @Test
    public void getDiffTest(){
        assertEquals(1, wc.getDiff("cat", "cot"));
        assertEquals(2, wc.getDiff("cat", "cod"));
        assertEquals(1, wc.getDiff("cat", "caz"));
        assertEquals(3, wc.getDiff("cat", "ddd"));
        assertEquals(0, wc.getDiff("aaa", "aaa"));
    }

    @Test
    public void isCloserTest(){
        assertTrue( wc.isCloserThanCurrent("cat", "cag", "dog"));
        assertFalse( wc.isCloserThanCurrent("cat", "cal", "dog"));
        assertFalse( wc.isCloserThanCurrent("cat", "caz", "dog"));
        assertTrue( wc.isCloserThanCurrent("cat", "cot", "dog"));
        assertTrue(wc.isCloserThanCurrent("cot", "cog", "dog"));
    }

    @Test
    public void isWCloserToEnd(){
        assertTrue(wc.isWCloserToEnd("cat", "cot", "dog"));
        assertTrue(wc.isWCloserToEnd("cot", "cog", "dog"));
    }

    @Test
    public void generateWordChainTest(){
        assertEquals(Arrays.asList("cat", "cot", "dot", "dog"), wc.getShortestWordChain("cat", "dog"));
    }
}
