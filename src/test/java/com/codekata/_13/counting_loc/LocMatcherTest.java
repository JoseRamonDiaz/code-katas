package com.codekata._13.counting_loc;

import junit.framework.TestCase;


public class LocMatcherTest extends TestCase {
    LocMatcher locMatcher;

    protected void setUp() {
        locMatcher = new LocMatcher();
    }

    public void testSingleLineComment() throws Exception{
        assertTrue(locMatcher.isSingleLineComment("//this is a comment"));
        assertTrue(locMatcher.isSingleLineComment("//"));
        assertTrue(locMatcher.isSingleLineComment("    //this is a comment"));
        assertTrue(locMatcher.isSingleLineComment("//this is a comment      "));
    }

    public void testMultilineCommentInline() throws Exception{
        assertTrue(locMatcher.isMultilineCommentInLine("/*this is a start of multiline comment*/"));
        assertTrue(locMatcher.isMultilineCommentInLine("/*this is a start of multiline comment*/     "));
        assertTrue(locMatcher.isMultilineCommentInLine("     /*this is a start of multiline comment*/"));
        assertFalse(locMatcher.isMultilineCommentInLine("/*this is a start of multiline comment*/something else"));
    }

    public void testMultiLineCommentStart()throws Exception{
        assertTrue(locMatcher.isMultilineCommentStart("/*this is a start of multiline comment"));
        assertFalse(locMatcher.isMultilineCommentStart("this is not a start of multiline comment"));
    }

    public void testMultiLineCommentEnd()throws Exception{
        assertTrue(locMatcher.isMultilineCommentEnd("this is the end of multiline comment*/"));
        assertFalse(locMatcher.isMultilineCommentEnd("this is not the end of multiline comment"));
    }
}
