package com.jrda.algorithms.reducing_dishes;

import org.junit.Before;
import org.junit.Test;

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
}
