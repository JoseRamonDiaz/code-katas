package com.leet_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

  public int longestConsecutive(int[] nums) {
    Set<Integer> numsSet = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toCollection(HashSet::new));

    int maxLength = 0;
    for (int n : nums) {
      if (!numsSet.contains(n - 1)) {
        int currentMaxLength = 1;
        int nextN = n + 1;

        while (numsSet.contains(nextN)) {
          currentMaxLength++;
          nextN++;
        }

        maxLength = maxLength > currentMaxLength ? maxLength : currentMaxLength;
      }
    }

    return maxLength;
  }

}
