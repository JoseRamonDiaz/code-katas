package com.codekata._15.diversion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiversionTest {

    @Test
    public void testDiversion(){
        String binStr = "000001010011100101110111";
        int expectedResult = 5;
        int digits = 3;

        Diversion diversion = new Diversion(binStr, digits);
        assertEquals(8, diversion.getCombinationsNumber());
        //assertEquals(expectedResult, diversion.getCombinationsNumber(digits));
    }

}
