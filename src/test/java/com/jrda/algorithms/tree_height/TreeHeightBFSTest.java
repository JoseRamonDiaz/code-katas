package com.jrda.algorithms.tree_height;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHeightBFSTest {
	@Test
	public void test() {
		Node n = new Node(1);
		n.left = new Node(2);
		n.right = new Node(4);
		n.left.left = new Node(3);
		n.left.right = new Node(5);
		
		TreeHeightBFS th = new TreeHeightBFS();
		assertEquals(2, th.height(n));
	}
}
