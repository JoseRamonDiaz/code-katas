package com.jrda.algorithms.tree_height_bsf;

import java.util.Stack;

public class TreeHeightDFS {
	public int getDepth(Node root) {
		if (root == null)
			return 0;
		
		Stack<PairNodeDepth> s = new Stack<>();
		s.push(new PairNodeDepth(root, 1));
		int maxDepth = 1;
		
		while(!s.isEmpty()) {
			PairNodeDepth pairND = s.pop();
			int depth = pairND.depth;
			maxDepth = Math.max(maxDepth, depth);
			
			if (pairND.n.left != null)
				s.add(new PairNodeDepth(pairND.n.left, depth + 1));
			
			if (pairND.n.right != null)
				s.add(new PairNodeDepth(pairND.n.right, depth + 1));
		}
		
		return maxDepth;
	}
}
