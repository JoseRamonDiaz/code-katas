package com.jrda.algorithms.combination_sum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	private int[] candidates;
	private List<Integer> current;
	private List<List<Integer>> result;
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		result = new ArrayList<>();
		this.candidates = candidates;
		this.current = new ArrayList<>();
		backtrack(target, 0);
		return result;
	}

	private void backtrack(int remaining, int start) {
		if (remaining == 0) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (candidates[i] > remaining)
				continue; // prune

			current.add(candidates[i]); // choose
			backtrack(remaining - candidates[i], i); // explore
			current.remove(current.size() - 1); // backtrack
		}
	}
}
