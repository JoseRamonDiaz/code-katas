package com.jrda.algorithms.maximum_probability_path;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumProbabilityPathTest {
    private MaximumProbabilityPath maximumProbabilityPath;

    @Before
    public void init() {
        maximumProbabilityPath = new MaximumProbabilityPath();
    }

    @Test
    public void test0() {
        assertEquals(0.0, maximumProbabilityPath.maxProbability(3, new int[][] {{0, 1}}, new double[] {0.5}, 0, 2), 0.001);
    }

    @Test
    public void test1() {
        assertEquals(0.25, maximumProbabilityPath.maxProbability(3, new int[][] {{0, 1}, {1, 2}, {0, 2}}, new double[] {0.5, 0.5, 0.2}, 0, 2), 0.001);
    }

    @Test
    public void test2() {
        assertEquals(0.3, maximumProbabilityPath.maxProbability(3, new int[][] {{0, 1}, {1, 2}, {0, 2}}, new double[] {0.5, 0.5, 0.3}, 0, 2), 0.001);
    }

    @Test
    public void test3() {
        assertEquals(0.21390, maximumProbabilityPath.maxProbability(5, new int[][] {{1, 4}, {2, 4}, {0, 4}, {0, 3}, {0, 2}, {2, 3} }, new double[] {0.37, 0.17, 0.93, 0.23, 0.39, 0.04}, 3, 4), 0.001);
    }
}