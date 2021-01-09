package com.jrda.kata_log_christmas_lights;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LightTest {
	private Light light;
	
	@Before
	public void init() {
		light = new Light();
	}
	
	@Test
	public void testTurnOn() {
		light.on();
		assertEquals(1, light.getBrightness());
	}
	
	@Test
	public void testTurnOff() {
		light.off();
		assertEquals(0, light.getBrightness());
		
		light.on();
		light.on();
		light.off();
		assertEquals(1, light.getBrightness());
	}
	
	@Test
	public void testToogle() {
		light.off();
		light.toogle();
		assertEquals(2, light.getBrightness());
		
		light.toogle();
		assertEquals(4, light.getBrightness());
	}
	
}
