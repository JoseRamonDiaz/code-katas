package com.jrdadev.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCleanerTest {
    @Test
    public void testStringCleaner(){
        StringCleaner stringCleaner = new StringCleaner();

        assertEquals("a", stringCleaner.clean("a"));
        assertEquals("ab", stringCleaner.clean("ab"));
        assertEquals("ab", stringCleaner.clean("aab"));
        assertEquals("ab", stringCleaner.clean("aabb"));
        assertEquals("abc", stringCleaner.clean("aabc"));
    }
}

