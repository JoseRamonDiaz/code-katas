package com.codekata._04.datamunging;

import java.util.List;

public class MatrixCreator {
	private String[][] matrix;
	private String filePath;
	
	public MatrixCreator(String filePath) {
		this.filePath = filePath;
	}
	
	public int getRowsLength() {
		return matrix.length;
	}
	
	public int getColumnsLength() {
		return matrix[0].length;
	}
	
	public String[][] getMatrix(){
		if(matrix == null) {
			loadMatrixData();
		}
		return matrix;
	}
	
	private void loadMatrixData() {
		DataReader dr = new DataReader(filePath);
		List<String> lines = dr.getLines();
		String regex = "\\s+";
		matrix = new String[dr.getNumberOfLines()][dr.getColumnsNumber()];
		
		for(int i = 0; i < dr.getNumberOfLines(); i++) {
			matrix[i] = lines.get(i).split(regex);
		}
		
	}
}
