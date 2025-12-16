package com.jrda.algorithms.tree_height;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeightBFS {
	
	public int height(Node node) {
		if (node == null) 
			return 0;
		
		Queue<Node> q = new LinkedList<>();
		node.lvl = 0;
		q.offer(node);
		int depth = -1;
		
		while (!q.isEmpty()) {
			Node current = q.poll();
			
			if (current.left != null) {
				current.left.lvl = current.lvl + 1;
				q.offer(current.left);
				if (depth < current.left.lvl)
					depth = current.left.lvl;
			}
				
			if (current.right != null) {
				current.right.lvl = current.lvl + 1;
				q.offer(current.right);
				if (depth < current.right.lvl)
					depth = current.right.lvl;
			}
		}
		
		return depth;
	}
	
}
