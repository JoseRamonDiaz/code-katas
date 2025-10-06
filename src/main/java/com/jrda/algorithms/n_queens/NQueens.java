package com.jrda.algorithms.n_queens;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NQueens {
	private Stack<Queen> queens;

	public String[][] calculate(int n) {
		queens = new Stack<>();
		// push the first element to the stack
		queens.add(new Queen(n, 0, 0));
		Queen current = queens.peek();
		// go to next line
		while (!queens.isEmpty()) {
			boolean safe = false;

			for (int i = 0; i < n; i++) {
				if (current.row == n - 1)
					break;

				Queen candidateQueen = new Queen(n, current.row + 1, i);
				// if valid push to stack
				if (isSafe(candidateQueen)) {
					queens.add(candidateQueen);
					current = candidateQueen;
					safe = true;
					break;
				}
			}

			if (!safe) {
				current = new Queen(queens.pop());

				if (current.column < n)
					queens.add(current);
			}

			if (queens.size() == n)
				break;
		}

		// if is invalid and last column pop from the stack
		// move to the next column, cycle here until stack is empty

		return generateResult();
	}

	private String[][] generateResult() {
		String[][] result = new String[queens.size()][queens.size()];

		for (int i = 0; i < queens.size(); i++) {
			for (int j = 0; j < queens.size(); j++) {
				result[i][j] = ".";
			}
		}

		for (Queen q : queens) {
			result[q.row][q.column] = "Q";
		}

		return result;
	}

	private boolean isSafe(Queen candidateQueen) {
		return queens.stream().noneMatch(q -> q.isTread(candidateQueen.diagonals));
	}

	private class Queen {
		int n;
		int row;
		int column;
		List<Point> diagonals = new ArrayList<>();

		public Queen(int n, int row, int column) {
			this.n = n;
			this.row = row;
			this.column = column;

			generateLeftDiagonals();
			generateRightDiagonals();
			generateColumns();
		}

		private void generateColumns() {
			int i = row;
			while (i > 0) {
				i--;
				diagonals.add(new Point(i, column));
			}
		}

		private void generateRightDiagonals() {
			int i = row;
			int j = column;

			while (j < n && i > 0) {
				i--;
				j++;
				diagonals.add(new Point(i, j));
			}
		}

		private void generateLeftDiagonals() {
			int i = row;
			int j = column;

			while (j > 0 && i > 0) {
				i--;
				j--;
				diagonals.add(new Point(i, j));
			}
		}

		/**
		 * Creates a new Queen positioned in the next column
		 * 
		 * @param q
		 */
		public Queen(Queen q) {
			this.n = q.n;
			this.row = q.row;
			this.column = q.column + 1;

			generateLeftDiagonals();
			generateRightDiagonals();
			generateColumns();
		}

		public boolean isTread(List<Point> points) {
			return points.stream().anyMatch(p -> p.row == this.row && p.column == this.column);
		}

		@Override
		public String toString() {
			return "Queen [n=" + n + ", row=" + row + ", column=" + column + ", diagonals=" + diagonals + "]";
		}

	}

	private class Point {
		public Point(int row, int column) {
			this.row = row;
			this.column = column;
		}

		int row;
		int column;

	}
}
