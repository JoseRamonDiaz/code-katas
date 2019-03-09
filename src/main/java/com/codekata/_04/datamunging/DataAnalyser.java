package com.codekata._04.datamunging;

public class DataAnalyser {
	Integer smallestDifference = null;
	int smallestDifferenceIndex = 0;

	public String getMinSpread(String filePath, int resultIndex, int j, int k) {
		MatrixCreator matrixCreator = new MatrixCreator(filePath);
		String[][] matrix = matrixCreator.getMatrix();
		
		for(int i = 0; i < matrixCreator.getRowsLength(); i++) {
			int difference;
			int intJ, intK;
			
			try {
				intJ = Integer.parseInt(matrix[i][j]);
				intK = Integer.parseInt(matrix[i][k]);
			}catch(Exception ex){
				continue;
			}
			if(intJ > intK) {
				difference = intJ - intK;
				updateSmallestDiff(i, difference);
				continue;
			}
			if(intK > intJ) {
				difference = intK - intJ;
				updateSmallestDiff(i, difference);
				continue;
			}
			
			difference = 0;
			updateSmallestDiff(i, difference);
		}
		
		return matrix[smallestDifferenceIndex][resultIndex];
	}

	private void updateSmallestDiff(int i, int difference) {
		boolean isFirstIteration = smallestDifference == null ? true : false; 
		
		if(isFirstIteration || (difference < smallestDifference)) {
			smallestDifference = difference;
			smallestDifferenceIndex = i;
		}
	}

}
