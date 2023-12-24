package com.codekata._02.chop;

import java.util.Arrays;

public class KarateChop {
	private int carry = 0;

	public int chop(int target, int[] numbers) {
		carry = 0;
		return recursiveChop(target, numbers);
	}

	private int recursiveChop(int target, int[] numbers) {
		if (numbers.length == 0)
			return -1;

		if (numbers.length == 1) {
			if (numbers[0] == target) {
				return carry;
			} else {
				return -1;
			}
		}

		int indexToCheck = (int) Math.floor((double) numbers.length /2);

		if (target == numbers[indexToCheck] ) {
			return carry + indexToCheck;
		}

		if (target < numbers[indexToCheck]) {
			return recursiveChop(target, Arrays.copyOfRange(numbers, 0, indexToCheck));
		} else {
			carry = carry + indexToCheck + 1;
			return recursiveChop(target, Arrays.copyOfRange(numbers, indexToCheck + 1, numbers.length));
		}
	}
}
