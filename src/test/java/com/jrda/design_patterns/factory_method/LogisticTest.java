package com.jrda.design_patterns.factory_method;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LogisticTest {
    @Test
    public void testEarthDelivery(){
        Config config = Mockito.mock(Config.class);
        when(config.getConfig()).thenReturn("This is a mock config");

        Logistic logistic = new EarthLogistic();
        logistic.setConfig(config);

        assertEquals("This is a mock config", logistic.doDelivery());
    }

    @Test
    public void testSeaDelivery(){
        Logistic logistic = new SeaLogistic();
        assertEquals("Sea delivery", logistic.doDelivery());
    }
}
