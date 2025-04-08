package com.project_euler.largest_prime_factor;

public class LargestPrimeFactor {
  private PrimeGenerator pg;

  public LargestPrimeFactor(PrimeGenerator pg) {
    this.pg = pg;
  }

  public Long find(long n) {
    Long p = pg.next();
    Long largestPrime = n;

    //if p < 0 then there is no more primes to check, return n because is prime
    while (n > 1 && p > 0) {
      if (n % p == 0) {
        n = n / p;
        largestPrime = p;
      } else
        p = pg.next();
    }

    return largestPrime;
  }
}
