package com.project_euler.largest_prime_factor;

public class PrimeGenerator {
	boolean primeArray[];
	int pos = 1;
	
	public PrimeGenerator(int limit) {
		this.primeArray = new boolean[limit];
		primeArray[0] = true;
		primeArray[1] = true;
	}
	
	public long next() {
		pos++;
		//TODO throw an exception when pos > limit
		while(primeArray[pos]) {
			pos++;
		}
		
		markProducts(pos);
		
		return pos;
	}
	
	private void markProducts(int p) {
		for (int i = 2; (i * p) < primeArray.length; i++) {
			primeArray[i * p] = true;
		}
	}
}
