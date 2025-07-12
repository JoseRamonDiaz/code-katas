package com.jrda.algorithms.tree_height;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeightBFS {
	
	public int height(Node node) {
		if (node == null) 
			return 0;
		
		Queue<Node> q = new LinkedList<>();
		q.offer(node);
		int depth = 0;
		
		while (!q.isEmpty()) {
			int elementsAtLvl = q.size();
			Node current = q.poll();
			
			for (int i = 0; i < elementsAtLvl; i++) {
				if (current.left != null)
					q.offer(current.left);
				
				if (current.right != null)
					q.offer(current.right);
			}
			
			//increase the depth, because we processed a complete lvl
			depth++;
		}
		
		return depth;
	}
	
}
