package com.jrda.algorithms.dijkstra;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DijkstraTest {
	@Test
	public void testOneVertexGraph() {
		Dijkstra d = new Dijkstra();
		assertArrayEquals(new int[] {0}, d.calculate(List.of(List.of()), 0));
	}
	
	@Test
	public void testTwoVertex() {
		Dijkstra d = new Dijkstra();
		
		List<List<Node>> graph = new ArrayList<List<Node>>();
		for (int i = 0; i < 2;i++) graph.add(new ArrayList<>());
		
		graph.get(0).add(new Node(1, 4));
		
		assertArrayEquals(new int[] {0, 4}, d.calculate(graph, 0));
	}
	
	@Test
	public void testThreeVertex() {
		Dijkstra d = new Dijkstra();
		
		List<List<Node>> graph = new ArrayList<List<Node>>();
		for (int i = 0; i < 4;i++) graph.add(new ArrayList<>());
		
		graph.get(0).add(new Node(1, 4));
		graph.get(0).add(new Node(2, 3));
		graph.get(2).add(new Node(3, 2));
		
		assertArrayEquals(new int[] {0, 4, 3, 5}, d.calculate(graph, 0));
	}
}
