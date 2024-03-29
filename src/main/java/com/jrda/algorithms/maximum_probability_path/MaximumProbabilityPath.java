package com.jrda.algorithms.maximum_probability_path;

import java.util.*;

/*
1514. Path with Maximum Probability
You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].

Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.

If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.
 */
public class MaximumProbabilityPath {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> ((int)((b[1] - a[1]) * 1000000000)));
        Map<Integer, Map<Integer, Double>> g = buildGraph(edges, succProb);
        pq.offer(new double[]{start, 1.0});
        Set<Integer> vs = new HashSet<>();
        Map<Integer, Double> probs = new HashMap<>();
        probs.put(start, 1.0);
        while (!pq.isEmpty()){
            double[] curr = pq.poll();
            if (vs.contains((int) curr[0])) continue;
            vs.add((int) curr[0]);
            if (((int) curr[0]) == end) return curr[1];
            for (int neig : g.getOrDefault((int) curr[0], new HashMap<>()).keySet()) {
                if (vs.contains(neig)) continue;
                double prob = curr[1] * g.get((int) curr[0]).get(neig);
                if (prob > probs.getOrDefault(neig, 0.0)) {
                    probs.put(neig, prob);
                    pq.offer(new double[]{neig, prob});
                }
            }
        }
        return 0;
    }

    private Map<Integer, Map<Integer, Double>> buildGraph(int[][] edges, double[] succProb) {
        Map<Integer, Map<Integer, Double>> g = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            g.computeIfAbsent(edges[i][0], k -> new HashMap<>());
            g.computeIfAbsent(edges[i][1], k -> new HashMap<>());
            g.get(edges[i][0]).put(edges[i][1], succProb[i]);
            g.get(edges[i][1]).put(edges[i][0], succProb[i]);
        }
        return g;
    }
}
