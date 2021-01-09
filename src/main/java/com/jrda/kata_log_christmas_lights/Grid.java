package com.jrda.kata_log_christmas_lights;

public class Grid {
	private boolean[][] matrix;
	
	public Grid() {
		matrix = new boolean[1000][1000];
	}

    public void on(int originX, int originY, int destX, int destY) {
    	setLights(originX, originY, destX, destY, true);
	}

	public boolean[][] getMatrix() {
		return matrix;
	}

	public void off(int originX, int originY, int destX, int destY) {
		setLights(originX, originY, destX, destY, false);
	}
	
	private void setLights(int originX, int originY, int destX, int destY, boolean valueToSet) {
		for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			matrix[i][j] = valueToSet;
    		}
    	}
	}

	public void toggle(int originX, int originY, int destX, int destY) {
		for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			matrix[i][j] = !matrix[i][j];
    		}
    	}
	}

}
