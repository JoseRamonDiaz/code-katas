package com.jrda.algorithms.n_queens;

import java.util.ArrayList;
import java.util.List;

public class NQueensBacktracking {

	public void solve(int n) {
		int[] queenColumnIn = new int[n];
		List<int[]> solutions = new ArrayList<>();
		
		placeQueens(0, queenColumnIn, n, solutions);
		
		System.out.println("Solutions: " + solutions.size());
		for (int[] sol : solutions) {
            printBoard(sol);
            System.out.println();
        }
	}

	private void placeQueens(int row, int[] queenColumnIn, int n, List<int[]> solutions) {
		if (row == n) {
			solutions.add(queenColumnIn.clone());
		}
		
		for (int col = 0; col < n; col++) {
			if (isSafe(row, col, queenColumnIn)) {
				queenColumnIn[row] = col;
				placeQueens(row + 1, queenColumnIn, n, solutions);
			}
		}
	}

	private boolean isSafe(int row, int col, int[] queenColumnIn) {
		for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = queenColumnIn[prevRow];
            // Same column
            if (col == prevCol) return false;
            // Same diagonal
            if (Math.abs(col - prevCol) == Math.abs(row - prevRow)) return false;
        }
        return true;
	}
	
	private static void printBoard(int[] queenColumnIn) {
        int N = queenColumnIn.length;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (queenColumnIn[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
