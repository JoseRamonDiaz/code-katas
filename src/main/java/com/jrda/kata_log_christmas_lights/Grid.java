package com.jrda.kata_log_christmas_lights;

public class Grid {
	private Light[][] matrix;
	
	public Grid() {
		matrix = new Light[1000][1000];
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[0].length; j++) {
    			matrix[i][j] = new Light();
    		}
    	}
	}

    public void on(int originX, int originY, int destX, int destY) {
    	for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			matrix[i][j].on();
    		}
    	}
	}

	public Light[][] getMatrix() {
		return matrix;
	}

	public void off(int originX, int originY, int destX, int destY) {
		for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			matrix[i][j].off();
    		}
    	}
	}

	public void toggle(int originX, int originY, int destX, int destY) {
		for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			matrix[i][j].toogle();
    		}
    	}
	}

}
