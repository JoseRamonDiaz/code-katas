package com.jrda.kata_log_christmas_lights;

public class Grid {
	private Light[][] matrix;
	private GridExecutor onExecutor;
	private GridExecutor offExecutor;
	private GridExecutor toggleExecutor;
	
	public Grid() {
		onExecutor = new GridOnExecutor();
		offExecutor = new GridOffExecutor();
		toggleExecutor = new GridToggleExecutor();
		
		matrix = new Light[1000][1000];
		
		for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[0].length; j++) {
    			matrix[i][j] = new Light();
    		}
    	}
	}
	
	public Light[][] getMatrix() {
		return matrix;
	}
	
    public void on(int originX, int originY, int destX, int destY) {
    	onExecutor.execute(originX, originY, destX, destY, matrix);
	}

	public void off(int originX, int originY, int destX, int destY) {
		offExecutor.execute(originX, originY, destX, destY, matrix);
	}

	public void toggle(int originX, int originY, int destX, int destY) {
		toggleExecutor.execute(originX, originY, destX, destY, matrix);
	}

}
