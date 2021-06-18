package com.jrda.kata_log.christmas_lights.hex.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DimmerLightTest {
    private DimmerLight dimmerLight;

    @Before
    public void init() {
        dimmerLight = new DimmerLight();
    }

    @Test
    public void testImplementsLight() {
        assertTrue(dimmerLight instanceof Light);
    }

    @Test
    public void shouldStartWithBrightnessZero() {
        assertEquals(0, dimmerLight.getBright());
    }

    @Test
    public void shouldIncreaseOneBrightness() {
        dimmerLight.on();
        assertEquals(1, dimmerLight.getBright());
    }

    @Test
    public void shouldDecreaseOneBrightness() {
        dimmerLight.on();
        dimmerLight.off();
        assertEquals(0, dimmerLight.getBright());
    }

    @Test
    public void shouldNotGoLowerThanZero() {
        dimmerLight.off();
        assertEquals(0, dimmerLight.getBright());
    }

    @Test
    public void shouldIncreaseTwoInToggle() {
        dimmerLight.toggle();
        assertEquals(2, dimmerLight.getBright());
        dimmerLight.toggle();
        assertEquals(4, dimmerLight.getBright());
    }
}