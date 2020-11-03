package com.jrda.algorithms;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if (nums == null) {
            return false;
        }

        boolean isPossible = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (!isPossible) {
                    return false;
                }
                isPossible = false;

                if (!tryToTurnItDown(nums, i)) {
                    nums[i + 1] = nums[i] + 1;
                }
            }
        }
        return true;
    }

    private boolean tryToTurnItDown(int[] nums, int i) {
        if (i == 0) {
            nums[i] = Integer.MIN_VALUE;
            return true;
        }

        if (nums[i - 1] <= nums[i + 1]) {
            nums[i] = nums[i - 1];
            return true;
        }

        return false;
    }
}
