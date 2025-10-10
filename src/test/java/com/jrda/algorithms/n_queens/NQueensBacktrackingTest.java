package com.jrda.algorithms.n_queens;

import org.junit.Test;

public class NQueensBacktrackingTest {
  @Test
  public void test() {
    NQueensBacktracking nq = new NQueensBacktracking();
    nq.solve(8);
  }

  @Test
  public void testNQ() {
    NQ nq = new NQ();
    nq.solve(8);
  }

  @Test
  public void testNQN() {
    NQN nq = new NQN();
    nq.solve(8);
  }

  @Test
  public void testNQNN() {
    NQNN nq = new NQNN();
    nq.solve(8);
  }
}
