package com.jrdadev.palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExpansionPalindromeTest {
   private MiddleExpansionPalindrome palindrome;

   @Before
   public void init() {
      palindrome = new MiddleExpansionPalindrome();
   }

   @Test
    public void testLongestPalindrome() {
       assertEquals(1, palindrome.maxPalSubStr(""));
       assertEquals(1, palindrome.maxPalSubStr("j"));
       assertEquals(4, palindrome.maxPalSubStr("abba"));
       assertEquals(6, palindrome.maxPalSubStr("cabbac"));
       assertEquals(4, palindrome.maxPalSubStr("xyzwabba"));
   }

   @Test
    public void testPalindromeBounds() {
       assertEquals(1, palindrome.maxPalStr("", 0, 0));
       assertEquals(1, palindrome.maxPalStr("a", 0, 0));
       assertEquals(1, palindrome.maxPalStr("abba", 0, 0));
       assertEquals(4, palindrome.maxPalStr("abba", 1, 2));
       assertEquals(2, palindrome.maxPalStr("xbby", 1, 2));
       assertEquals(1, palindrome.maxPalStr("abba", 2, 3));
       assertEquals(2, palindrome.maxPalStr("acbb", 2, 3));
       assertEquals(4, palindrome.maxPalStr("wxyzabba", 5, 6));
       assertEquals(4, palindrome.maxPalStr("abbawxyz", 1, 2));
       assertEquals(4, palindrome.maxPalStr("wxyzabbal", 5, 6));
   }

   @Test (expected = IllegalArgumentException.class)
   public void testIllegalArguments() {
      assertEquals(4, palindrome.maxPalStr("ojoxyojo", 2, 5));
   }
}
