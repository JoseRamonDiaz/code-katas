package com.jrda.kata_log.christmas_lights;

public abstract class GridExecutor {
	public void execute(int originX, int originY, int destX, int destY, Light[][] matrix) {
    	for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
    			action(matrix[i][j]);
    		}
    	}
	}
	
	protected abstract void action(Light light);
}
