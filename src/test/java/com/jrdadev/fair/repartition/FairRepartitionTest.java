package com.jrdadev.fair.repartition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FairRepartitionTest {
    @Test
    public void testGetNoBirthdayAmount(){
        FairRepartition fairRepartition = new FairRepartition(120, 3, 1);

        assertEquals(60d, fairRepartition.getNoBirthdayAmount(), 0);
        assertEquals(0d, fairRepartition.getBirthdayAmount(), 0);
        assertEquals(40d, fairRepartition.getNormalAmount(), 0);
        assertEquals(120d, fairRepartition.getAmountPayed(), 0);
    }

    @Test
    public void testGetNoBirthdayAmount2(){
        FairRepartition fairRepartition = new FairRepartition(120, 3, 2);

        assertEquals(80d, fairRepartition.getNoBirthdayAmount(), 0);
        assertEquals(20d, fairRepartition.getBirthdayAmount(), 0);
        assertEquals(40d, fairRepartition.getNormalAmount(), 0);
        assertEquals(120d, fairRepartition.getAmountPayed(), 0);
    }

    @Test
    public void testOtherCases(){
        FairRepartition fairRepartition = new FairRepartition(120, 4, 3);
        System.out.println(fairRepartition.getNoBirthdayAmount());
        System.out.println(fairRepartition.getBirthdayAmount());
    }
}
