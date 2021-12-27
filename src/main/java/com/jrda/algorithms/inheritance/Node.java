package com.jrda.algorithms.inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Node implements Iterable<Node> {
    private final String name;
    private final List<Node> children;
    private Node parent;
    private Boolean alive;

    public Node(String name) {
        children = new ArrayList<>();
        this.name = name;
        alive = true;
    }

    public void die() {
        alive = false;
    }

    public String getName() {
        return name;
    }

    public void addChild(String childName) {
        Node childNode = new Node(childName);
        childNode.setParent(this);
        children.add(childNode);
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public boolean isDead() {
        return !alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                '}';
    }
}
