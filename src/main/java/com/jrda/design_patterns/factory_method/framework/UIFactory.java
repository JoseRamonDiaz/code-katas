package com.jrda.design_patterns.factory_method.framework;

public abstract class UIFactory {

    public void printThing(){
        createButton().printName();
    }

    protected abstract Button createButton();
}
