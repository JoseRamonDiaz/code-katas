package com.jrda.algorithms.n_queens;

import org.junit.Test;

public class NQueensTest {
	@Test
	public void test4() {
		NQueens nq = new NQueens();
		print(nq.calculate(4));
	}
	
	private void print(String[][] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(String.join(" ", a[i]));
		}
	}
}
