package com.jrda.algorithms.tree_height_bsf;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeHeightDFSTest {
	@Test
	public void test() {
		Node n = new Node(1);
		n.left = new Node(2);
		n.left.left = new Node(3);
		
		TreeHeightDFS t = new TreeHeightDFS();
		assertEquals(3, t.getDepth(n));
	}
}
