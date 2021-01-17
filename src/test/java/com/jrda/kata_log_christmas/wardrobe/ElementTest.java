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

	@Test
	public void testElementPrice() {
		Element e0 = new Element(50, 59d);
		assertEquals(59, e0.getPrice(), 0.001);

		Element e1 = new Element(75, 62d);
		assertEquals(62, e1.getPrice(), 0.001);
	}
}
