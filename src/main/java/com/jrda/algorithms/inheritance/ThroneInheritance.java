package com.jrda.algorithms.inheritance;

import java.util.ArrayList;
import java.util.List;

public class ThroneInheritance {
    private final Node kingNode;

    public ThroneInheritance(String kingName) {
        kingNode = new Node(kingName);
    }

    public void birth(String parentName, String childName) {
        for (Node n : kingNode) {
            if (n.getName().equalsIgnoreCase(parentName)) {
                n.addChild(childName);
            }
        }
    }

    public void death(String name) {
        for (Node n : kingNode) {
            if (n.getName().equals(name))
                n.die();
        }
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();

        for (Node n : kingNode) {
            result.add(n.getName());
        }

        return result;
    }
}
