package com.codekata._02.chop;

public class IterativeKarateChop {

    public int chop(int target, int[] numbers) {
        if (numbers.length == 1) {
            if (numbers[0] == target)
                return 0;
            else
                return -1;
        }

        int start = 0;
        int end = numbers.length - 1;
        int middle = (int) Math.ceil((double) (start + end) / 2);

        while (middle <= end) {

            if (numbers[middle] == target)
                return middle;

            if (target < numbers[middle]) {
                end = middle - 1;
                middle = (int) Math.ceil((double) (start + end) / 2);
                continue;
            }

            if (target > numbers[middle]) {
                start = middle + 1;
                middle = (int) Math.ceil((double) (start + end) / 2);
            }
        }

        return -1;
    }
}
