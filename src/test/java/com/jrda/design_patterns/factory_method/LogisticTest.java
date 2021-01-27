package com.jrda.design_patterns.factory_method;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LogisticTest {
    @Test
    public void testEarthDelivery(){
        Config config = Mockito.mock(Config.class);
        when(config.getConfig()).thenReturn("This is a mock config");

        Logistic logistic = new EarthLogistic();
        logistic.setConfig(config);

        assertEquals("This is a mock config", logistic.doDelivery());

        verify(config).getConfig();
    }

    @Test
    public void testSeaDelivery(){
        Config config = Mockito.mock(Config.class);
        when(config.getConfig()).thenReturn("Sea delivery");
        Logistic logistic = new SeaLogistic();
        logistic.setConfig(config);
        assertEquals("Sea delivery", logistic.doDelivery());
    }
}
