package com.jrda.design_patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
