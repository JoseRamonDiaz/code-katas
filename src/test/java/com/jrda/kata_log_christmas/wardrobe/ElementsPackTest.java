package com.jrda.kata_log_christmas.wardrobe;

import static org.junit.Assert.*;

import org.junit.*;

public class ElementsPackTest {
	@Test
	public void testPushPopAndIsEmpty() {
		ElementsPack elementsPack = new ElementsPack();
		assertTrue(elementsPack.isEmpty());
		
		Element e0 = new Element(10);
		elementsPack.push(e0);
		assertFalse(elementsPack.isEmpty());
		assertFalse(elementsPack.isEmpty());
		
		Element e1 = elementsPack.pop();
		assertNotNull(e1);
		assertTrue("Objects should be in same memory space", e0 == e1);
	}
	
	@Test
	public void testEquals() {
		ElementsPack ep0 = new ElementsPack();
		ep0.push(new Element(50));
		ep0.push(new Element(75));
		
		ElementsPack ep1 = new ElementsPack();
		ep1.push(new Element(75));
		ep1.push(new Element(50));
		
		assertTrue(ep0.equals(ep1));
		
		ElementsPack ep2 = new ElementsPack();
		assertFalse(ep0.equals(ep2));
		assertFalse(ep1.equals(ep2));
		assertEquals(ep2, ep2);
		
		ep2.push(new Element(50));
		ep2.push(new Element(50));
		assertFalse(ep2.equals(ep0));
	}
	
	@Test
	public void testClone() {
		ElementsPack ep0 = new ElementsPack();
		ep0.push(new Element(50));
		ep0.push(new Element(75));
		
		ElementsPack epClone = ep0.clone();
		assertNotNull(epClone);
		assertFalse(epClone.isEmpty());
		
		ep0.pop();
		ep0.pop();
		assertFalse(epClone.isEmpty());
	}
	
	@Test
	public void testRemaining() {
		ElementsPack ep0 = new ElementsPack();
		ep0.push(new Element(50));
		ep0.push(new Element(75));
		
		assertEquals(75, ep0.getRemaining());
		
		ep0.push(new Element(50));
		assertEquals(25, ep0.getRemaining());
	}
}
