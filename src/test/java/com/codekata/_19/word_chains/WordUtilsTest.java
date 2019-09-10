package com.codekata._19.word_chains;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class WordUtilsTest {
    WordUtils wu;

    @Before
    public void init(){
        wu = new WordUtils();
    }

    @Test
    public void getDiffTest(){
        assertEquals(1, wu.getDiff("cat", "cot"));
        assertEquals(2, wu.getDiff("cat", "cod"));
        assertEquals(1, wu.getDiff("cat", "caz"));
        assertEquals(3, wu.getDiff("cat", "ddd"));
        assertEquals(0, wu.getDiff("aaa", "aaa"));
    }

    @Test
    public void isCloserTest(){
        assertTrue( wu.isCloserThanCurrent("cat", "cag", "dog"));
        assertFalse( wu.isCloserThanCurrent("cat", "cal", "dog"));
        assertFalse( wu.isCloserThanCurrent("cat", "caz", "dog"));
        assertTrue( wu.isCloserThanCurrent("cat", "cot", "dog"));
        assertTrue(wu.isCloserThanCurrent("cot", "cog", "dog"));
    }

    @Test
    public void isWCloserToEnd(){
        assertTrue(wu.isWCloserToEnd("cat", "cot", "dog"));
        assertTrue(wu.isWCloserToEnd("cot", "cog", "dog"));
    }

}
