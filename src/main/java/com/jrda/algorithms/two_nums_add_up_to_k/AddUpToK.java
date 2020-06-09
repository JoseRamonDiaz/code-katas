package com.jrda.algorithms.two_nums_add_up_to_k;

import javafx.util.Pair;

public class AddUpToK {
    public Pair<Integer, Integer> findAddUptoK (Integer[] input, Integer k) {
        boolean[] targets = new boolean[500];
        for (int i = 0; i < input.length; i++) {
            //mark as one target, if we found this value later the work is done
            targets[Math.abs(input[i] - k)] = true;
            if (targets[input[i]]) {
                return new Pair<>(input[i], Math.abs(input[i] - k));
            }
        }
        return null;
    }
}
