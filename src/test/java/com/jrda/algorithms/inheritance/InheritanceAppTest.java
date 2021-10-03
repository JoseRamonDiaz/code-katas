package com.jrda.algorithms.inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceAppTest {
    @Test
    public void testInheritance() {
        String expectedOrder = "king, lucia, peter, ";
        InheritanceApp inheritanceApp = new InheritanceApp("king");
        inheritanceApp.birth("king", "lucia");
        inheritanceApp.birth("king", "peter");

        assertEquals(expectedOrder, inheritanceApp.getSuccession());
    }

    @Test
    public void test() {
        Node king = new Node("King");
        king.addChild("Fulanito");
        king.addChild("Sotanito");

        print(king);
    }

    private void print(Node n) {
        System.out.println(n.getName());

        if (n.getChildren() != null) {
            for (Node son : n.getChildren()) {
                print(son);
            }
        }
    }
}