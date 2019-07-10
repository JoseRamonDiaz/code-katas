package com.codekata._14.trigram;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TrigramMapTest {

    @Test
    public void addTest(){
        TrigramMap trigramMap = new TrigramMap();
        trigramMap.add("a", "ahorro");
        trigramMap.add("a", "aguinaldo");
        assertEquals(2, trigramMap.getValuesList("a").size());

        trigramMap.add("a", "asptm");
        assertEquals(3, trigramMap.getValuesList("a").size());

        trigramMap.add("b", "burro");
        assertEquals(1, trigramMap.getValuesList("b").size());
        assertEquals(3, trigramMap.getValuesList("a").size());
    }
}
