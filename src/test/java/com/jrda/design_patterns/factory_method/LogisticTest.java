package com.jrda.design_patterns.factory_method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogisticTest {
    @Test
    public void testEarthDelivery(){
        Logistic logistic = new EarthLogistic();
        assertEquals("Road delivery", logistic.doDelivery());
    }

    @Test
    public void testSeaDelivery(){
        Logistic logistic = new SeaLogistic();
        assertEquals("Sea delivery", logistic.doDelivery());
    }
}
