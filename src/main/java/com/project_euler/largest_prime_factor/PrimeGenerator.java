package com.project_euler.largest_prime_factor;

public class PrimeGenerator {
  boolean primeArray[];
  int pos = 1;

  public PrimeGenerator(long limit) {
	int intLimit = (int) Math.floor(Math.sqrt(limit));
    this.primeArray = new boolean[intLimit + 1];
    primeArray[0] = true;
    primeArray[1] = true;
  }

  public long next() {
    pos++;
    
    if (pos >= primeArray.length) {
    	return -1l;
    }
    
    while (primeArray[pos]) {
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
