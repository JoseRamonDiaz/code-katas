package com.project_euler.largest_prime_factor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPrimeFactorTest {
  @Test
  public void test2() {
    PrimeGenerator pg = new PrimeGenerator(2);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(2, lpf.find(2), 0.001);
  }

  @Test
  public void test3() {
    int limit = 3;
    PrimeGenerator pg = new PrimeGenerator(limit);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(limit, lpf.find(limit), 0.001);
  }

  @Test
  public void test4() {
    int limit = 4;
    PrimeGenerator pg = new PrimeGenerator(limit);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(2, lpf.find(limit), 0.001);
  }

  @Test
  public void test5() {
    int limit = 5;
    PrimeGenerator pg = new PrimeGenerator(limit);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(limit, lpf.find(limit), 0.001);
  }

  @Test
  public void test6() {
    long longLimit = 13195L;
    PrimeGenerator pg = new PrimeGenerator(longLimit);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(29, lpf.find(longLimit), 0.001);
  }

  @Test
  public void test7() {
    long longLimit = 600851475143L;
    PrimeGenerator pg = new PrimeGenerator(longLimit);
    LargestPrimeFactor lpf = new LargestPrimeFactor(pg);

    assertEquals(6857, lpf.find(longLimit), 0.001);
  }
}
