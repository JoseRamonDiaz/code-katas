package com.jrda.algorithms.inheritance;

public class InheritanceApp {
    private Node kingNode;

    public InheritanceApp(String kingName) {
        kingNode = new Node(kingName);
    }

    public void birth(String parent, String childName) {
        for (Node n : kingNode) {
            if (n.getName().equalsIgnoreCase(parent)) {
                n.addChild(childName);
            }
        }
    }

    public String getSuccession() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node n : kingNode) {
            stringBuilder.append(n.getName()).append(", ");
        }

        return stringBuilder.toString();
    }

    protected Node getKingNode() {
        return kingNode;
    }
}
