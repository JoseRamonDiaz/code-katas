package com.jrda.algorithms.koko_bananas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfHoursCalcTest {

    @Test
    public void testNumberOfHrs() {
        NumberOfHoursCalc numberOfHoursCalc = new NumberOfHoursCalc();
        assertEquals(10, numberOfHoursCalc.calc(new int[]{3, 6, 7, 11}, 3));
        assertEquals(8, numberOfHoursCalc.calc(new int[]{3, 6, 7, 11}, 4));
        assertEquals(8, numberOfHoursCalc.calc(new int[]{3, 6, 7, 11}, 5));
    }
}
