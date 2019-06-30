package com.codekata._11.sorting;

public class Rack {
	AVLTree t = new AVLTree();
	AVLTree.Node root = null;
	
	public void add(Integer ballNumber) {
		root = t.insert(root, ballNumber);
	}
	
	public Integer[] balls() {
		return t.getSortedArray(root);
	}
}
