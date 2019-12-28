package com.jrda.design_patterns.factory_method.framework;

public class SquareButton implements Button {
    @Override
    public void printName() {
        System.out.println("I'm a square button");
    }
}
