package com.jrda.algorithms.minimum_window_substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinWindowSubstringTest {
    @Test
    public void testEmptyS() {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        assertEquals("", minWindowSubstring.minWindow("", "ABC"));
    }

    @Test
    public void testEmptyT() {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        assertEquals("", minWindowSubstring.minWindow("A", ""));
    }

    @Test
    public void testMinWindowSubstring() {
        MinWindowSubstring minWindowSubstring = new MinWindowSubstring();
        assertEquals("BANC", minWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
    }
}