package com.jrda.algorithms.inheritance;

import java.util.*;

public class NodeIterator implements Iterator<Node> {
    private final List<Node> nodeList;
    private int position = 0;

    public NodeIterator(Node current) {
       nodeList = new ArrayList<>();
       flatMap(current);
    }

    private void flatMap(Node current) {
        if (!current.isDead())
            nodeList.add(current);

        if (current.getChildren() != null && !current.getChildren().isEmpty()) {
            for (Node n : current.getChildren()) {
                flatMap(n);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return nodeList.size() > position;
    }

    @Override
    public Node next() {
        return nodeList.get(position++);
    }
}
