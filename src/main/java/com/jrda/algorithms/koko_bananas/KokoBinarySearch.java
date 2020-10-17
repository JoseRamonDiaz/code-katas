package com.jrda.algorithms.koko_bananas;

import com.jrdadev.stopwatch.Stopwatch;

import java.util.logging.Level;
import java.util.logging.Logger;

public class KokoBinarySearch {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private NumberOfHoursCalc numberOfHoursCalc = new NumberOfHoursCalc();

    public int minEatingSpeed(int[] values, int target) {
        Stopwatch binarySearchStopWatch = new Stopwatch("Binary search");
        binarySearchStopWatch.start();
        int minValue = minEatingSpeed(values, target, 0, 1000000000);
        binarySearchStopWatch.stop();

        Stopwatch countingDownStopWatch = new Stopwatch("Counting down");
        countingDownStopWatch.start();
        while (numberOfHoursCalc.calc(values, --minValue) == target) {
        }
        countingDownStopWatch.stop();

        logger.log(Level.INFO, "\n" + binarySearchStopWatch.toString() + "\n" + countingDownStopWatch.toString());
        return ++minValue;
    }

    private int minEatingSpeed(int[] values, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int k = start + (end - start) / 2;
        int result = numberOfHoursCalc.calc(values, k);
        if (result > target) {
            int newStart = k + 1;
            return minEatingSpeed(values, target, newStart, end);
        }

        if (result < target) {
            int newEnd = k - 1;
            return minEatingSpeed(values, target, start, newEnd);
        }

        return k;
    }
}
