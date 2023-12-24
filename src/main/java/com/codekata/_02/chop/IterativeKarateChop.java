package com.codekata._02.chop;

public class IterativeKarateChop {
    private int start, middle, end;

    public int chop(int target, int[] numbers) {
        if (numbers.length == 1) {
            if (numbers[0] == target)
                return 0;
            else
                return -1;
        }

       resetVariablesValue(numbers.length);

        while (middle <= end) {
            if (numbers[middle] == target)
                return middle;
            if (target < numbers[middle])
                movePointerToTheFirstHalf();
            else
                movePointersToTheSecondHalf();
        }

        return -1;
    }

    private void movePointersToTheSecondHalf() {
        start = middle + 1;
        middle = recalculateMiddle();
    }

    private void movePointerToTheFirstHalf() {
        end = middle - 1;
        middle = recalculateMiddle();
    }

    private void resetVariablesValue(int length) {
        start = 0;
        end = length - 1;
        middle = recalculateMiddle();
    }

    private int recalculateMiddle() {
        return (int) Math.ceil((double) (start + end) / 2);
    }
}
