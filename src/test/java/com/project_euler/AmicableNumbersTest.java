package com.project_euler;

import java.util.Set;

import org.junit.Test;

import com.project_euler.AmicableNumbers.Pair;

public class AmicableNumbersTest {
	
	@Test
	public void testNaive() {
		AmicableNumbers amicableNumbers = new AmicableNumbers();
		print(amicableNumbers.getDivisorSumNaive(10000));
	}
	
	@Test
	public void testAmicableNaive() {
		AmicableNumbers amicableNumbers = new AmicableNumbers();
		print(amicableNumbers.getAmiableNumbers(10000));
	}
	
	private void print(int[] sums) {
		for (int i = 0; i < sums.length; i++)
			System.out.println(i + " " + sums[i]);
	}
	
	private void print(Set<Pair> amicableNumbers) {
		for (Pair p : amicableNumbers) {
			System.out.println(p);
		}
	}

}
