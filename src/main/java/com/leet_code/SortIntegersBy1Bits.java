package com.leet_code;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersBy1Bits {
	
	public int[] sortByBits(int[] arr) {
		Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int result = Integer.bitCount(o1) - Integer.bitCount(o2);
				
				if (result == 0)
					return o1 - o2;
					
				return result;
			}
        });
		return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }

}
