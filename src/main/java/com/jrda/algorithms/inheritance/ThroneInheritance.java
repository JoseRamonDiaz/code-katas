package com.jrda.algorithms.inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThroneInheritance {
    private final Map<String, Person> persons;
    private final String kingName;

    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        persons = new HashMap<>();
        persons.put(kingName, new Person(kingName));
    }

    public void birth(String parentName, String childName) {
        Person parent = persons.get(parentName);
        if (parent != null) {
            Person p = new Person(childName);
            parent.children.add(p);
            persons.put(p.name, p);
        }
    }

    public void death(String name) {
        Person person = persons.get(name);
        if (person != null)
            person.isDead = true;
    }

    public List<String> getInheritanceOrder() {
        List<String> inheritanceOrder = new ArrayList<>();
        Person king = persons.get(kingName);

        addSons(king, inheritanceOrder);

        return inheritanceOrder;
    }

    private void addSons(Person p, List<String> inheritanceOrder) {
        if (p != null && !p.isDead)
            inheritanceOrder.add(p.name);

        if (p != null && p.children != null && !p.children.isEmpty()) {
            p.children.forEach(person -> addSons(person, inheritanceOrder));
        }
    }

    private static class Person {
        String name;
        Boolean isDead;
        List<Person> children;

        public Person(String name) {
            this.name = name;
            isDead = false;
            children = new ArrayList<>();
        }
    }
}
