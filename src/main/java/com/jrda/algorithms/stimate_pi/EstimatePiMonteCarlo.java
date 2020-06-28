package com.jrda.algorithms.stimate_pi;

import java.util.concurrent.ThreadLocalRandom;

public class EstimatePiMonteCarlo {
    public double estimatePi(int iterations, double min) {
        int circlePoints = 0;

        for (int i = 0; i < iterations; i++) {
            double max = 1d;
            double x =  ThreadLocalRandom.current().nextDouble(min, max);
            double y =  ThreadLocalRandom.current().nextDouble(min, max);

            if ((x*x + y*y) <= 1) {
                circlePoints++;
            }

        }

        return 4 * ( (double)circlePoints / iterations);
    }
}
