package com.jrda.design_patterns.prototype;

public class NameListImpl extends NameList {
    public NameListImpl() {
    }

    public NameListImpl(NameList nameList) {
        super(nameList);
    }

    @Override
    public NameList clone() {
        return new NameListImpl(this);
    }
}
