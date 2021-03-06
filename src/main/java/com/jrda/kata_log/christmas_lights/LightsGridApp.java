package com.jrda.kata_log.christmas_lights;

public class LightsGridApp {
	public static void main(String args[]) {
		Grid grid = new Grid();
		grid.on(0, 0, 1, 1);
		print(grid.getMatrix());
	}

	private static void print(Light[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j].getBrightness() > 0) {
					System.out.print("O");
				} else {
					System.out.print("-");
				}
				if (j == matrix[0].length - 1) {
					System.out.println("");
				}
			}
		}
	}
}
