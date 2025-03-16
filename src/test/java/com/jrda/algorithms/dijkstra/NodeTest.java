package com.jrda.algorithms.dijkstra;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {
	@Test
	public void testComparator() {
		Node n = new Node(0, 1);
		Node n0 = new Node(0, 1);
		Node n1 = new Node(0, 2);
		assertEquals(-1, n.compareTo(n1));
		assertEquals(1, n1.compareTo(n));
		assertEquals(0, n.compareTo(n0));
	}
}
