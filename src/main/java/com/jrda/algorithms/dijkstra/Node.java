package com.jrda.algorithms.dijkstra;

public class Node implements Comparable<Node> {
	private int vertex;
	private int weigth;
	
	public Node(int vertex, int weigth) {
		super();
		this.vertex = vertex;
		this.weigth = weigth;
	}

	@Override
	public int compareTo(Node o) {
		return Integer.compare(this.weigth, o.weigth);
	}

	public int getVertex() {
		return vertex;
	}

	public int getWeigth() {
		return weigth;
	}
}
