package com.jrda.algorithms.inheritance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NodeIterator implements Iterator<Node> {
    private final Map<Node, Integer> childIndexMap = new HashMap<>();
    private Node current;

    public NodeIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        //TODO create a flat list on iterator creation, to make it easy to traverse and avoid problems preserving the state
        childIndexMap.putIfAbsent(current, -1);

        Node next = current;

        childIndexMap.put(current, childIndexMap.get(current) + 1);

        if (current.getChildren() == null || current.getChildren().isEmpty() || childIndexMap.get(current) >= current.getChildren().size()) {
            //parent != null && parentChildrenIndex < parent.children.length
            //current = parent.getChild
            while (current.getParent() != null && childIndexMap.get(current.getParent()) >= current.getParent().getChildren().size()) {
                current = current.getParent();
            }

            if (current != null && childIndexMap.get(current) < current.getChildren().size()) {
                current = current.getChildren().get(childIndexMap.get(current));
            } else {
                current = null;
            }

        } else
            current = current.getChildren().get(childIndexMap.get(current));

        return next;
    }
}
