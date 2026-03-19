package com.leet_code;

public class MaxScore {

	public int maximumsSplicedArray(int[] nums1, int[] nums2) {
		return Math.max(getResp(nums1, nums2), getResp(nums2, nums1));
	}
	
	private int getResp(int[] nums1, int[] nums2) {
		int[] diffs = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++)
			diffs[i] = nums2[i] - nums1[i];
		
		int sumNums1 = sum(nums1);
		int res1 = Math.max(sumNums1, sumNums1 + kadane(diffs));
		return res1;
	}

	private int sum(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return sum;
	}

	protected int kadane(int[] nums) {
		int current = nums[0];
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			current = Math.max(nums[i], current + nums[i]);
			max = Math.max(max, current);
		}
		
		return max;
	}
}
