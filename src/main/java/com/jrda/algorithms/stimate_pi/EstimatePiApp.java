package com.jrda.algorithms.stimate_pi;

public class EstimatePiApp {
    public static void main(String[] args) {
        estimate(0d);
    }

    private static void estimate(double min) {
        double pi = 3.14159265358979;
        EstimatePiMonteCarlo estimatePiMonteCarlo = new EstimatePiMonteCarlo();
        int numberOfOperations = 30;
        double accumulatedDiffs = 0;

        for (int i = 0; i < numberOfOperations; i++) {
            accumulatedDiffs += Math.abs(estimatePiMonteCarlo.estimatePi(1_000_000_000, min) - pi);
        }

        System.out.println(accumulatedDiffs/numberOfOperations);
    }
}
