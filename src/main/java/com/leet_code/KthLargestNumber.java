package com.leet_code;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNumber {

  public String kthLargestNumber(String[] nums, int k) {
    PriorityQueue<String> pq = new PriorityQueue<>(new KthStringComparator().reversed());
    for (String n : nums)
      pq.add(n);

    for (int i = 0; i < k; i++) {
      if (i == k - 1) {
        return pq.poll();
      }
      pq.poll();
    }

    return "";
  }

  private class KthStringComparator implements Comparator<String> {
    @Override
    public int compare(String s0, String s1) {
      if (s0.length() > s1.length())
        return 1;

      if (s0.length() < s1.length())
        return -1;

      for (int i = 0; i < s0.length(); i++) {
        char c0 = s0.charAt(i);
        char c1 = s1.charAt(i);
        if (c0 != c1) {
          int i0 = c0 - '0';
          int i1 = c1 - '0';
          return i0 - i1;
        }
      }

      return 0;
    }
  }
}
