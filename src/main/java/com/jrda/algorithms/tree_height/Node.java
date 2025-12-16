package com.jrda.algorithms.tree_height;

public class Node {
	int val;
	int lvl;
	Node right;
	Node left;
	
	public Node(int val) {
		this.val = val;
		this.lvl = -1;
	}
}
