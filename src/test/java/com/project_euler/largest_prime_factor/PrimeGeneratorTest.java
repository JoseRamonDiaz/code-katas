package com.project_euler.largest_prime_factor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeGeneratorTest {
  @Test
  public void testGeneratePrime() {
    PrimeGenerator pm = new PrimeGenerator(12);
    assertEquals(2, pm.next());
    assertEquals(3, pm.next());
    assertEquals(5, pm.next());
    assertEquals(7, pm.next());
    assertEquals(11, pm.next());
  }

  @Test
  public void testPrime() {
    PrimeGenerator pg = new PrimeGenerator(2);
    assertEquals(2, pg.next());
  }
}
