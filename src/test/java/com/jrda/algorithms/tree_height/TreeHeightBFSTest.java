package com.jrda.algorithms.tree_height;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHeightBFSTest {
	@Test
	public void test() {
		Node n = new Node(1);
		n.left = new Node(2);
		n.left.left = new Node(3);
		
		TreeHeightBFS th = new TreeHeightBFS();
		assertEquals(3, th.height(n));
	}
}
