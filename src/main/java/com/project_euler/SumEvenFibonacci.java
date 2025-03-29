package com.project_euler;

/**
 * Problem 2
 * Even Fibonacci Numbers
 */
public class SumEvenFibonacci {
	public int sum(int limit) {
		if (limit < 2)
			return 0;
		
		int a = 1;
		int b = 2;
		int iterationCounter = 0;
		int sum = 2;
		
		while (b <= limit) {
			b = a + b;
			a = b - a;
			iterationCounter++;
			if (iterationCounter % 3 == 0 && b <= limit)
				sum += b;
		}
		
		return sum;
	}
}
