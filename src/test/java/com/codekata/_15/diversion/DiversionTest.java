package com.codekata._15.diversion;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class DiversionTest {

    @Test
    public void testCombinationsGeneration() throws Exception {
        Diversion diversion = new Diversion();
        assertEquals(new HashSet<>(){
            {
                add("0");
                add("1");
            }
        }, diversion.generateCombinations(1));

        assertEquals(new HashSet<>(){
            {//todo we need to change to a set maybe, to make accept what ever the order is
                add("00");
                add("01");
                add("11");
                add("10");
            }
        }, diversion.generateCombinations(2));
    }

}
