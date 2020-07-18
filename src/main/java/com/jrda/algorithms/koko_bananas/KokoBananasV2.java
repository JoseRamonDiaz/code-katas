package com.jrda.algorithms.koko_bananas;

public class KokoBananasV2 {
    public int minEatingSpeed(int[] values, int h) {
        int lo = 1;
        int hi = 1_000_000_000;

        while (lo < hi) {
            int mi = (hi + lo) / 2;
            if (!isPossible(values, h, mi)) {
                lo = mi + 1;
            } else {
                hi = mi;
            }
        }

        return lo;
    }

    private boolean isPossible(int[] values, int time, int speed) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            //this emulates the ceiling function
            sum += (values[i] - 1) / speed + 1;
        }

        return sum <= time;
    }
}
