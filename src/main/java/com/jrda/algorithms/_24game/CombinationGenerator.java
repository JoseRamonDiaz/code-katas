package com.jrda.algorithms._24game;

import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator {

	public String[][] generate(String[] strings) {
		return generate(strings, strings.length);
	}

	private String[][] generate(String[] combinations, int step) {
		if (step > 1) {
			String[][] incomingCombs = generate(combinations, step - 1);
			
			return concatenate(combinations, incomingCombs);
			
		} else {
			String[][] flatArray = new String[combinations.length][1];
			for (int i = 0; i < combinations.length; i++) {
				flatArray[i][0] = combinations[i];
			}
			return flatArray;
		}
	}
	
	private String[][] concatenate(String[] a, String[][] b) {
		String[][] concatenated = new String[b.length * a.length][b[0].length + 1];
		int count = 0;
		for (int k = 0; k < a.length; k++) {
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[0].length; j++) {
					if (j == 0)
						concatenated[count][0] = a[k];
					
					concatenated[count][j+1] = b[i][j];
				}
				count++;
			}
		}
		
		return concatenated;
	}
}

class Solution {
    // All possible operations we can perform on two numbers.
    private List<Double> generatePossibleResults(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b); 
        res.add(a - b);
        res.add(b - a); 
        res.add(a * b);
        if (b != 0) {
            res.add(a / b);
        }
        if (a != 0) {
            res.add(b / a);
        }
        return res;
    }
    
    // Check if using current list we can react result 24.
    private boolean checkIfResultReached(List<Double> list) {
        if (list.size() == 1) {
            // Base Case: We have only one number left, check if it is approximately 24.
            return Math.abs(list.get(0) - 24) <= 0.1;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // Create a new list with the remaining numbers and the new result.
                List<Double> newList = new ArrayList<>();
                for (int k = 0; k < list.size(); k++) {
                    if (k != j && k != i) {
                        newList.add(list.get(k));
                    }
                }
                
                // For any two numbers in our list,
                // we perform every operation one by one.
                for (double res : generatePossibleResults(list.get(i), list.get(j))) {
                    // Push the new result in the list
                    newList.add(res);
                    
                    // Check if using this new list we can obtain the result 24.
                    if (checkIfResultReached(newList)) {
                        return true;
                    }
                    
                    // Backtrack: remove the result from the list.
                    newList.remove(newList.size() - 1);
                }
            }
        }
        return false;
    }
    
    public boolean judgePoint24(int[] cards) {
        List<Double> list = new ArrayList<>();
        for (int card : cards) {
            list.add((double) card);
        }
        
        return checkIfResultReached(list);
    }
}
