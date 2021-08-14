package com.jrda.algorithms.inheritance;

import org.junit.Test;

public class NodeTest {
    @Test
    public void testIterator() {
        Node node = new Node("0");
        node.addChild("1");
        node.addChild("3");

        node.getChildren().get(0).addChild("2");


        System.out.println("Nodes: ");
        for (Node n : node) {
            System.out.println(n);
        }
    }
}