package com.leet_code;

import java.util.ArrayList;
import java.util.List;

public class MaxRowsCoveredByColumns {
	private List<Integer> combination;
	private int col = 0;
	private int toSelect = 0;
	private int maxRowsCovered = 0;
	private int[][] matrix;

	public int maximumRows(int[][] matrix, int numSelect) {
		maxRowsCovered = 0;
		this.matrix = matrix;
		combination = new ArrayList<>();
		this.col = matrix[0].length;
		this.toSelect = numSelect;
		gen(0);
		return maxRowsCovered;
	}

	private boolean isCovered(int[] row) {
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1 && !combination.contains(i)) {
				return false;
			}
		}

		return true;
	}

	private void gen(int start) {
		if (combination.size() == toSelect) {
			int numCoveredRows = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (isCovered(matrix[i]))
					numCoveredRows++;
			}
			maxRowsCovered = Math.max(numCoveredRows, maxRowsCovered);
			return;
		}

		for (int i = start; i < col; i++) {
			combination.add(i);
			gen(i + 1);
			combination.remove(combination.size() - 1);
		}
	}
}
