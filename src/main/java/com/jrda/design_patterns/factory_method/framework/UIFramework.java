package com.jrda.design_patterns.factory_method.framework;

public class UIFramework extends UIFactory {
    @Override
    public Button createButton() {
        return new SquareButton();
    }
}
