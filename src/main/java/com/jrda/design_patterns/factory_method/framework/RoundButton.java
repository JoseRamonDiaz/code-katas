package com.jrda.design_patterns.factory_method.framework;

public class RoundButton implements Button {
    @Override
    public void printName() {
        System.out.println("I'm a round button mdf");
    }
}
