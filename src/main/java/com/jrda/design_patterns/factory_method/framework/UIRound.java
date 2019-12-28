package com.jrda.design_patterns.factory_method.framework;

public class UIRound extends UIFactory {
    @Override
    protected Button createButton() {
        return new RoundButton();
    }
}
