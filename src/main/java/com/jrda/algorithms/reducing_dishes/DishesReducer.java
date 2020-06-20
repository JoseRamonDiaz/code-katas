package com.jrda.algorithms.reducing_dishes;

import com.jrdadev.palindrome.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DishesReducer {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        List<Integer> negativeSatisfaction = getNegativeSatisfactions(satisfaction);
        List<Integer> nonNegativeSatisfaction = getNonNegativeSatisfactions(satisfaction);
        int baseSum = getSum(nonNegativeSatisfaction);
        int lastVal = getBaseProduct(nonNegativeSatisfaction);

        do {
            if (negativeSatisfaction.isEmpty()) {
                return lastVal;
            }

            //add the last negative satisfaction
            baseSum += negativeSatisfaction.remove(negativeSatisfaction.size()-1);

            //if the number is positive, the count should increase with that value. lastVal = newVal
            if (baseSum > 0) {
                lastVal += baseSum;
            } else {
                return lastVal;
            }
        } while (negativeSatisfaction.size() > 0);

        return lastVal;
    }

    /**
     *
     * @param satisfaction needs to be a sorted array of int
     * @return list of non negative values
     */
    protected List<Integer> getNegativeSatisfactions(int[] satisfaction) {
        List<Integer> negativeSatisfaction = new ArrayList<>();

        for (int value : satisfaction) {
            if (value < 0) {
                negativeSatisfaction.add(value);
            } else {
                break;
            }
        }

        return negativeSatisfaction;
    }

    /**
     * Maybe we should sort the array inside the method and avoid future problems
     * @param satisfaction needs to be a sorted array of int in order to return the correct value
     * @return subset of non-negative values
     */
    public List<Integer> getNonNegativeSatisfactions(int[] satisfaction) {
        List<Integer> nonNegativeSatisfaction = new ArrayList<>();

        for (int value : satisfaction) {
            if (value >= 0) {
                nonNegativeSatisfaction.add(value);
            }
        }

        return nonNegativeSatisfaction;
    }

    protected int getBaseProduct(List<Integer> nonNegativeSatisfaction) {
        int baseProduct = 0;

        for(int i = 0; i < nonNegativeSatisfaction.size(); i++) {
            baseProduct += nonNegativeSatisfaction.get(i) * (i+1);
        }

        return baseProduct;
    }

    protected int getSum(List<Integer> nonNegativeSatisfaction) {
        int sum = 0;

        for (Integer num : nonNegativeSatisfaction) {
            sum += num;
        }

        return sum;
    }
}
