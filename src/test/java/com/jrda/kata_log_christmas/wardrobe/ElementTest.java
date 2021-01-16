package com.jrda.kata_log_christmas.wardrobe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElementTest {
	@Test
	public void testElementSize() {
		Element e = new Element(1);
		assertEquals(1, e.getSize());
		
		Element e1 = new Element(2);
		assertEquals(2, e1.getSize());
	}
}
