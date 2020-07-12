package com.jrda.algorithms.median;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderedListTest {
    @Test
    public void testInsertInorder() {
        List<Integer> expectedList = new ArrayList<>();

        OrderedList orderedList = new OrderedList();
        orderedList.add(1);
        assertEquals(1, orderedList.get(0));

        orderedList.add(0);
        assertEquals(0, orderedList.get(0));

        orderedList.add(3);
        expectedList.add(0);
        expectedList.add(1);
        expectedList.add(3);
        assertEquals(expectedList, orderedList.getList());

        orderedList.add(2);
        expectedList = new ArrayList<>();
        expectedList.add(0);
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        assertEquals(expectedList, orderedList.getList());
        assertEquals(4, orderedList.getSize());
    }
}
