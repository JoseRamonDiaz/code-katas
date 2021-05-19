package com.jrda.kata_log.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void init() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizz() {
        assertNotNull(fizzBuzz.check(3));
        assertFalse(fizzBuzz.check(3).isEmpty());
        assertEquals("fizz", fizzBuzz.check(3));
        assertEquals("fizz", fizzBuzz.check(6));
    }

    @Test
    public void testBuzz() {
        assertNotNull(fizzBuzz.check(5));
        assertFalse(fizzBuzz.check(5).isEmpty());
        assertEquals("buzz", fizzBuzz.check(5));
        assertEquals("buzz", fizzBuzz.check(10));
    }

    @Test
    public void testNotMultiple3or5() {
        assertNotNull(fizzBuzz.check(1));
        assertFalse(fizzBuzz.check(1).isEmpty());
        assertEquals("1", fizzBuzz.check(1));
        assertEquals("2", fizzBuzz.check(2));
    }

    @Test
    public void testMultiple3and5() {
        assertEquals("fizzbuzz", fizzBuzz.check(15));
    }
}
