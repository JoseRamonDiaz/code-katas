package com.jrda.algorithms.reducing_dishes;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DishesReducerTest {
    private DishesReducer dishesReducer;

    @Before
    public void init() {
        dishesReducer = new DishesReducer();
    }

    @Test
    public void testReduce() {
        dishesReducer = new DishesReducer();
        assertEquals(1, dishesReducer.maxSatisfaction(new int[]{1}));
        assertEquals(2, dishesReducer.maxSatisfaction(new int[]{2}));
        assertEquals(14, dishesReducer.maxSatisfaction(new int[]{-1,-8,0,5,-9}));
        assertEquals(20, dishesReducer.maxSatisfaction(new int[]{4,3,2}));
        assertEquals(0, dishesReducer.maxSatisfaction(new int[]{-1,-4,-5}));
        assertEquals(35, dishesReducer.maxSatisfaction(new int[]{-2,5,-1,0,3,-3}));
    }

    @Test
    public void testSum() {
        assertEquals(0, dishesReducer.getSum(Arrays.asList(0)));
        assertEquals(1, dishesReducer.getSum(Arrays.asList(0, 1)));
        assertEquals(3, dishesReducer.getSum(Arrays.asList(0, 1, 2)));
        assertEquals(6, dishesReducer.getSum(Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testGetBaseProduct() {
        assertEquals(10, dishesReducer.getBaseProduct(Arrays.asList(0, 5)));
        assertEquals(17, dishesReducer.getBaseProduct(Arrays.asList(0, 1, 5)));
        assertEquals(11, dishesReducer.getBaseProduct(Arrays.asList(1, 5)));
        assertEquals(-5, dishesReducer.getBaseProduct(Arrays.asList(-1, -2)));
        assertEquals(-8, dishesReducer.getBaseProduct(Arrays.asList(-2, -3)));
    }

    @Test
    public void testNegativeSatisfactions () {
        int[] ints = new int[]{-1,-8,0,5,-9};
        Arrays.sort(ints);
        assertEquals(Arrays.asList(-9, -8, -1), dishesReducer.getNegativeSatisfactions(ints));
    }

    @Test
    public void testGetNegativeSatisfactionsStack() {
        int[] ints = new int[]{-1,-8,0,5,-9};
        Arrays.sort(ints);
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(-9);
        integerStack.push(-8);
        integerStack.push(-1);
        assertEquals(integerStack, dishesReducer.getNegativeSatisfactionsStack(ints));
    }

    @Test
    public void testNonNegativeSatisfactions() {
        int[] ints = new int[]{-1,-8,0,5,-9};
        Arrays.sort(ints);
        assertEquals(Arrays.asList(0, 5), dishesReducer.getNonNegativeSatisfactions(ints));
    }

    @Test
    public void testAscendingSort() {
        int[] ints = new int[]{-1,-8,0,5,-9};
        Arrays.sort(ints);
        assertArrayEquals(new int[]{-9, -8, -1, 0, 5}, ints);
    }

    @Test
    public void testNegativeSubListSum() {
        assertEquals(-1, dishesReducer.getBaseProduct(Arrays.asList(-3, -2, -1).subList(2, 3)));
        assertEquals(-4, dishesReducer.getBaseProduct(Arrays.asList(-3, -2, -1).subList(1, 3)));
    }
}
