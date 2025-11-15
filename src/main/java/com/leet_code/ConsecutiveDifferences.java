package com.leet_code;

import java.util.ArrayList;
import java.util.List;

/**
 * 967. Numbers With Same Consecutive Differences
 * 
 * Given two integers n and k, return an array of all the integers of length n where the difference between every two consecutive digits is k. You may return the answer in any order.
 * Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.
 * 
 * Example 1:
 *  Input: n = 3, k = 7
 *  Output: [181,292,707,818,929]
 *  Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 *  
 * Example 2:
 *  Input: n = 2, k = 1
 *  Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 * 
 * Constraints:
 * 2 <= n <= 9
 * 0 <= k <= 9
 */
public class ConsecutiveDifferences {
	private List<List<Integer>> result;
	private int n;
	private int k;
	private List<Integer> current;

	public int[] numsSameConsecDiff(int n, int k) {
		this.n = n;
		this.k = k;
		result = new ArrayList<>();
		current = new ArrayList<>();

		
		for (int i = 1; i < 10; i++) {
			current.clear();
			backTrack(i);
		}
		
		return result.stream().mapToInt(l -> {
			int exp = l.size() - 1;
			int accum = 0;
			for (int i : l) {
				accum += Math.pow(10, exp) * i;
				exp--;
			}
			return accum;
		}).toArray();
    }
	
	private void backTrack(int num) {
		current.add(num);

		if (num < 0 || num > 9)
			return;
		
		if (isValid()) {
			result.add(new ArrayList<>(current));
			return;
		}
		
//		current.add(current.get(current.size() - 1) - k);
		backTrack(current.get(current.size() - 1) - k);
		current.remove(current.size() - 1);

//		current.add(current.get(current.size() - 1) + k);
		if (k != 0) {
            backTrack(current.get(current.size() - 1) + k);
            current.remove(current.size() - 1);
        }
	}
	
	private boolean isValid() {
		return current.size() == n && isDiffValid();
	}
	
	private boolean isDiffValid() {
		for (int i = 0; i < n - 1; i++) {
			if (Math.abs(current.get(i) - current.get(i + 1)) != k) return false;
		}
		
		return true;
	}
}
