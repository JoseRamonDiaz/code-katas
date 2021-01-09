package com.jrda.kata_log_christmas_lights;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
		assertTrue(light.isOn());
	}
	
	@Test
	public void testTurnOff() {
		light.off();
		assertFalse(light.isOn());
	}
	
	@Test
	public void testToogle() {
		light.off();
		light.toogle();
		assertTrue(light.isOn());
		
		light.toogle();
		assertFalse(light.isOn());
	}
	
}
