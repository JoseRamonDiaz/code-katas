package com.jrda.algorithms.reducing_dishes;

import java.util.Arrays;

public class DishesReducer {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        Integer negativePointer = null;
        int i = 0, accum = 0, baseSum = 0;
        for (int pos = 0; pos < satisfaction.length; pos++) {
            if (satisfaction[pos] >= 0) {
                if(negativePointer == null) {
                    negativePointer = pos - 1;
                }

                i++;
                accum += i * satisfaction[pos];

                baseSum += satisfaction[pos];
            }
        }

        if (negativePointer == null || negativePointer < 0) {
            return accum;
        }

        do {
            baseSum += satisfaction[negativePointer];
            if (baseSum > 0) {
                accum += baseSum;
            } else {
                return accum;
            }
            negativePointer--;
        } while (negativePointer >= 0);

        return accum;
    }
}
