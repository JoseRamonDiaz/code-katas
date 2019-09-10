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
    public void generateWordChainTest(){
        assertEquals(Arrays.asList("cat", "cot", "dot", "dog"), wc.getShortestWordChain("cat", "dog"));
    }
}
