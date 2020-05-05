package com.project_euler;

public class MaxPathSumTriangle {

	public int getMaxSum(int[][] input, int m, int n) {
		
		for(int i = m - 2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				if (input[i + 1][j] > input[i + 1][j + 1]) {
					input[i][j] += input[i + 1][j];
				} else {
					input[i][j] += input[i + 1][j + 1];
				}
			}
		}
		
		
		return input[0][0];
	}
	
}
