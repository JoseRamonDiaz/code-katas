package com.jrda.design_patterns.adapter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Enumeration;

import static org.junit.Assert.*;

public class IteratorEnumerationTest {
    @Test
    public void testIteratorOnArrayList(){
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Jose");
        stringArrayList.add("Ramon");

        Enumeration iteratorEnumeration = new IteratorEnumeration(stringArrayList.iterator());
        assertEquals("Jose", (String) iteratorEnumeration.nextElement());
        assertTrue(iteratorEnumeration.hasMoreElements());
        assertEquals("Ramon", (String) iteratorEnumeration.nextElement());
        assertFalse(iteratorEnumeration.hasMoreElements());
    }
}
