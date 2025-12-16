package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestConsecutiveSequenceTest {
  @Test
  public void test0() {
    LongestConsecutiveSequence cs = new LongestConsecutiveSequence();
    assertEquals(4, cs.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
  }

  @Test
  public void test1() {
    LongestConsecutiveSequence cs = new LongestConsecutiveSequence();
    assertEquals(9, cs.longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }));
  }

  @Test
  public void test2() {
    LongestConsecutiveSequence cs = new LongestConsecutiveSequence();
    assertEquals(3, cs.longestConsecutive(new int[] { 1, 0, 1, 2 }));
  }

  @Test
  public void test3() {
    LongestConsecutiveSequence cs = new LongestConsecutiveSequence();
    assertEquals(1, cs.longestConsecutive(new int[] { 0 }));
  }
}
