package com.jrda.algorithms.inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThroneInheritanceTest {
    @Test
    public void testDeath() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.death("king");

        assertFalse(throneInheritance.getInheritanceOrder().stream().anyMatch(s -> s.equals("king")));
    }

//    ["ThroneInheritance","birth","birth","birth","birth","birth","birth","getInheritanceOrder","death","getInheritanceOrder"]
//    [["king"],["king","andy"],["king","bob"],["king","catherine"],["andy","matthew"],["bob","alex"],["bob","asha"],[null],["bob"],[null]]

    @Test
    public void testCase1() {
        ThroneInheritance throneInheritance = new ThroneInheritance("king");
        throneInheritance.birth("king", "andy");
        throneInheritance.birth("king", "bob");
        throneInheritance.birth("king", "catherine");
        throneInheritance.birth("andy", "matthew");
        throneInheritance.birth("bob", "alex");
        throneInheritance.birth("bob", "asha");

        System.out.println(throneInheritance.getInheritanceOrder());

    }
}