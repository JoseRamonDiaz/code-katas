package com.jrda.algorithms.tree_height_bsf;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHeightTest {
	@Test
	public void test() {
		Node n = new Node(1);
		n.left = new Node(2);
		n.left.left = new Node(3);
		
		TreeHeight th = new TreeHeight();
		assertEquals(3, th.height(n));
	}
}
