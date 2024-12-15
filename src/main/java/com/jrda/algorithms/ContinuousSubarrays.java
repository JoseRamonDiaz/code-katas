package com.jrda.algorithms;
//problem number: 2762
public class ContinuousSubarrays {
	public long triangularNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
	
	public long continuousSubarrays(int[] nums) {
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
}
