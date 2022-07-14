package com.jrda.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jrda.algorithms.LinkedListToInteger.ListNode;

public class LinkedListToIntegerTest {
	@Test
	public void testZero() {
		ListNode listNode = new ListNode(0);
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(0, linkedListToInteger.getDecimalValue(listNode));
	}
	
	@Test
	public void testOne() {
		ListNode listNode = new ListNode(1);
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(1, linkedListToInteger.getDecimalValue(listNode));
	}
	
	@Test
	public void testTwo() {
		ListNode listNode = new ListNode(1, new ListNode(0));
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(2, linkedListToInteger.getDecimalValue(listNode));
	}
	
	@Test
	public void testThree() {
		ListNode listNode = new ListNode(1, new ListNode(1));
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(3, linkedListToInteger.getDecimalValue(listNode));
	}
	
	@Test
	public void testFour() {
		ListNode listNode = new ListNode(1, new ListNode(0, new ListNode(0)));
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(4, linkedListToInteger.getDecimalValue(listNode));
	}
	
	@Test
	public void testFive() {
		ListNode listNode = new ListNode(1, new ListNode(0, new ListNode(1)));
		LinkedListToInteger linkedListToInteger = new LinkedListToInteger();
		assertEquals(5, linkedListToInteger.getDecimalValue(listNode));
	}
}
