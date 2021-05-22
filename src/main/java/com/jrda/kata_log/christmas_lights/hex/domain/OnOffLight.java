package com.jrda.kata_log.christmas_lights.hex.domain;

public class OnOffLight implements Light{
    private boolean isOn = false;

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public void toggle() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
