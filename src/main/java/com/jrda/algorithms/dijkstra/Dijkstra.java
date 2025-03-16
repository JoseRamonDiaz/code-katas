package com.jrda.algorithms.dijkstra;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	public int[] calculate(List<List<Node>> graph, int start) {
		int[] dist = new int[graph.size()];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		boolean[] visited = new boolean[graph.size()];
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node current = pq.poll();
			if (visited[current.getVertex()]) continue; 
			
			for (Node neighbor : graph.get(current.getVertex())) {
				if (current.getWeigth() + neighbor.getWeigth() < dist[neighbor.getVertex()]) {
					dist[neighbor.getVertex()] = current.getWeigth() + neighbor.getWeigth();
					pq.add(new Node(neighbor.getVertex(), dist[neighbor.getVertex()]));
				}
			}
			visited[current.getVertex()] = true;
		}
		
		return dist;
	}
}
