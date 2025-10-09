package com.jrda.algorithms.n_queens;

import java.util.ArrayList;
import java.util.List;

public class NQ {
	private int[] queenCol;
	private List<int[]> solutions;
	private int n;
	
	public void solve(int n) {
		queenCol = new int[n];
		solutions = new ArrayList<>();
		this.n = n;
		
		placeQueens(0);
		System.out.println("Solutions: " + solutions.size());
	}

	private void placeQueens(int row) {
		if (row == n) {
			solutions.add(queenCol.clone());
		}
		
		for (int col = 0; col < n; col++) {			
			if (isSafe(col, row)) {
				queenCol[row] = col;
				placeQueens(row + 1);
			}
		}
	}

	private boolean isSafe(int col, int row) {
		for (int prevRow = 0; prevRow < row; prevRow++) {
			int prevCol = queenCol[prevRow];
			if (col == prevCol) return false;
			if (Math.abs(col - prevCol) == Math.abs(row - prevRow)) return false;
		}
		return true;
	}
}
