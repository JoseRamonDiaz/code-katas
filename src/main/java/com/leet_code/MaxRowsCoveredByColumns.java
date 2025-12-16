package com.leet_code;

import java.util.ArrayList;
import java.util.List;

public class MaxRowsCoveredByColumns {
	private List<Integer> combination;
	private List<List<Integer>> result;
	private int col = 0;
	private int toSelect = 0;
	private int maxRowsCovered = 0;

	public int maximumRows(int[][] matrix, int numSelect) {
		maxRowsCovered = 0;
		generateCombination(matrix[0].length, numSelect);

		for (List<Integer> s : result) {
			int numCoveredRows = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (isCovered(matrix[i], s))
					numCoveredRows++;
			}
			maxRowsCovered = Math.max(numCoveredRows, maxRowsCovered);
		}

		return maxRowsCovered;
	}

	private boolean isCovered(int[] row, List<Integer> s) {
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1 && !s.contains(i)) {
				return false;
			}
		}
		
		return true;
	}

	protected List<List<Integer>> generateCombination(int col, int toSelect) {
		combination = new ArrayList<>();
		result = new ArrayList<>();
		this.col = col;
		this.toSelect = toSelect;
		gen(0);
		System.out.println(result);
		return result;
	}

	private void gen(int start) {
		if (combination.size() == toSelect) {
			result.add(new ArrayList<>(combination));
			return;
		}

		for (int i = start; i < col; i++) {
			combination.add(i);
			gen(i + 1);
			combination.remove(combination.size() - 1);
		}
	}
}
