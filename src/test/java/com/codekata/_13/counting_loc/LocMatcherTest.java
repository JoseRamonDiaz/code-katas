package com.codekata._13.counting_loc;

import com.jrdadev.katas.StreamReduce;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;


public class LocMatcherTest extends TestCase {
    LocMatcher locMatcher;

    protected void setUp() {
        locMatcher = new LocMatcher();
    }

    public void testSingleLineComment() throws Exception{
        assertTrue(locMatcher.isSingleLineComment("//this is a comment"));
        assertTrue(locMatcher.isSingleLineComment("//"));
    }

    public void testMultilineCommentStart() throws Exception{
        assertTrue(locMatcher.isMultilineCommentStart("/*this is a start of multiline comment*/"));
        assertFalse(locMatcher.isMultilineCommentStart("/*this is a start of multiline comment*/something else"));
    }
}
