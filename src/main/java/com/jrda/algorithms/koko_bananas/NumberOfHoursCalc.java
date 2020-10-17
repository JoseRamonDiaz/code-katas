package com.jrda.algorithms.koko_bananas;

public class NumberOfHoursCalc {
    public int calc(int[] ints, int k) {
        int sum = 0;

        for (int i = 0; i < ints.length; i++ ) {
            sum += Math.ceil(ints[i] / (double) k);
        }

        return sum;
    }
}
