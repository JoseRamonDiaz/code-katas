package com.jrda.design_patterns.factory_method.framework;

public class UIApp {
    public static void main(String[] args) {
        UIFactory uiFactory = new UIRound();
        uiFactory.printThing();
    }
}
