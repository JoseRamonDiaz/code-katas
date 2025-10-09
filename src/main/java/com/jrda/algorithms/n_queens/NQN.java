package com.jrda.algorithms.n_queens;

import java.util.ArrayList;
import java.util.List;

public class NQN {
	private int[] queens;
	private List<int[]> solutions;
	int n;
	
	public void solve(int n) {
		this.n = n;
		queens = new int[n];
		solutions = new ArrayList<>();
		
		placeQueens(0);
		System.out.println("Solutions: " + solutions.size());
	}
	
	private void placeQueens(int row) {
		if (row == n) {
			solutions.add(queens.clone());
		}
		
		for (int col = 0; col < n; col++) {
			if (isSafe(row, col)) {
				queens[row] = col;
				placeQueens(row + 1);
			}
		}
	}
	
	private boolean isSafe(int row, int col) {
		for (int prevRow = 0; prevRow < row; prevRow++) {
			int prevCol = queens[prevRow];
			if (prevCol == col) return false;
			if (Math.abs(prevCol - col) == Math.abs(prevRow - row)) return false;
		}
		
		return true;
	}
	
}
