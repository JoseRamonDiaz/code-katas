package com.jrda.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	//assumes only positives values
	public int[] getTarget(int[] array, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < array.length; i++) {
			if (map.get(target - array[i]) != null) {
				result[0] = map.get(target - array[i]);
				result[1] = i;
				return result;
			}
			map.put(array[i], i);
		}
		
		return result;
	}
}
