package com.jrda.algorithms.stimate_pi;

import org.junit.Test;

public class EstimatePiMonteCarloTest {
    @Test
    public void testEstimatePi() {
        double pi = 3.14159265358979;
        EstimatePiMonteCarlo estimatePiMonteCarlo = new EstimatePiMonteCarlo();
        int numberOfOperations = 30;
        double accumulatedDiffs = 0;

        for (int i = 0; i < numberOfOperations; i++) {
            accumulatedDiffs += Math.abs(estimatePiMonteCarlo.estimatePi(1_000_000_000, -1d) - pi);
        }

        System.out.println(accumulatedDiffs/numberOfOperations);
    }
}