package com.jrda.algorithms;

import java.util.TreeMap;

//problem number: 2762
public class ContinuousSubarrays {
	public long triangularNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
	
	public long continuousSubarraysIterative(int[] nums) {
		long c = 0;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				
				if (i == j) {
					c++;
					min = nums[i];
					max = min;
					continue;
				}
				
				if (nums[j] < min)
					min = nums[j];
				
				if (nums[j] > max)
					max = nums[j];
				
				if ((max - min) <= 2) {
					c++;
				} else {
					break;
				}
				
			}
		}
		
		return c;
	}
	
	public long continuousSubarrays(int[] nums) {
		long c = 0;
		TreeMap<Integer, Integer> minMaxMap = new TreeMap<>();
		int left = 0, right = 0;
		int n = nums.length;
		
		while (right < n) {
			minMaxMap.put(nums[right], minMaxMap.getOrDefault(nums[right], 0) + 1);
			while ((minMaxMap.lastKey() - minMaxMap.firstKey()) > 2) {
				int leftOcurrencies = minMaxMap.get(nums[left]);
				if (leftOcurrencies == 1) {
					minMaxMap.remove(nums[left]);
				} else {
					minMaxMap.put(nums[left], leftOcurrencies - 1);
				}
				
				left++;
			}
				c += right - left + 1;
				right++;
		}
		
		return c;
	}
}
