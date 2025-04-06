package com.project_euler.largest_prime_factor;

public class LargestPrimeFactor {
  private PrimeGenerator pg;

  public LargestPrimeFactor(PrimeGenerator pg) {
    this.pg = pg;
  }

  public Long find(long n) {
    Long p = pg.next();
    Long largestPrime = p;

    while (n > 1) {
      if (n % p == 0) {
        n = n / p;
        largestPrime = p;
      } else
        p = pg.next();
    }

    return largestPrime;
  }
}
