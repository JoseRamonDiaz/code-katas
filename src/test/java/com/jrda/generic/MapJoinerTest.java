package com.jrda.generic;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MapJoinerTest {
    @Test
    public void testMapJoin() {
        Map<String, List<Integer>> m0 = new HashMap<>();
        ArrayList<Integer> _123 = new ArrayList<>();
        _123.add(1);
        _123.add(2);
        _123.add(3);
        m0.put("a", _123);

        Map<String, List<Integer>> m1 = new HashMap<>();
        ArrayList<Integer> _456 = new ArrayList<>();
        _456.add(4);
        _456.add(5);
        _456.add(6);
        m1.put("a", _456);

        ArrayList<Integer> _789 = new ArrayList<>();
        _789.add(7);
        _789.add(8);
        _789.add(9);
        m1.put("b", _789);

        MapJoiner mapJoiner = new MapJoiner();
        Map<String, List<Integer>> result = mapJoiner.join(m0, m1);

        assertEquals(2, result.size());
        assertEquals(6, result.get("a").size());
        assertEquals(3, result.get("b").size());
    }
}