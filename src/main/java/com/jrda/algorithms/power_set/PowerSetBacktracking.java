package com.jrda.algorithms.power_set;

import java.util.ArrayList;
import java.util.List;

public class PowerSetBacktracking {
  private static int[] nums = { 1, 2, 3 };
  private static List<List<Integer>> result = new ArrayList<>();
  private static List<Integer> current = new ArrayList<>();

  public static void main(String[] args) {
    backtrack(0);
    System.out.println(result);
  }

  private static void backtrack(int index) {
    result.add(new ArrayList<>(current));

    for (int i = index; i < nums.length; i++) {
      current.add(nums[i]);
      backtrack(i + 1);
      current.remove(current.size() - 1);
    }
  }
}
