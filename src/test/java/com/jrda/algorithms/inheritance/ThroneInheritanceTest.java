package com.jrda.algorithms.inheritance;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ThroneInheritanceTest {
    @Test
    public void testDeath() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.death("king");

        assertFalse(throneInheritance.getInheritanceOrder().stream().anyMatch(s -> s.equals("king")));
    }

    @Test
    public void testCase1() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");

        assertEquals(Arrays.asList("king","andy","matthew","bob","alex","asha","catherine"), throneInheritance.getInheritanceOrder());

        throneInheritance.death("bob");
        assertEquals(Arrays.asList("king","andy","matthew","alex","asha","catherine"), throneInheritance.getInheritanceOrder());
    }
}