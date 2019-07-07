package com.codekata._13.counting_loc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountingLocTest {

    @Test
    public void testLocCounter(){
        LocCounter locCounter = new LocCounter();

        assertEquals(3, locCounter.getCount("ThreeLoc"));
    }

}
