package com.jrda.algorithms.balanced_brackets;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {
    @Test
    public void testBalancedBrackets() {
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        assertTrue(balancedBrackets.areBalanced("()"));
        assertTrue(balancedBrackets.areBalanced("(){}"));
        assertTrue(balancedBrackets.areBalanced("([]){}"));
        assertFalse(balancedBrackets.areBalanced("([]){"));
        assertFalse(balancedBrackets.areBalanced("((()"));
        assertFalse(balancedBrackets.areBalanced("([)]"));
    }
}
