package com.jrda.kata_log.christmas_lights.hex.domain;

public class DimmerLight implements Light {
    private int bright = 0;

    @Override
    public void on() {
        bright++;
    }

    @Override
    public void off() {
        if (bright > 0)
            bright--;
    }

    @Override
    public void toggle() {
        bright += 2;
    }

    public int getBright() {
        return bright;
    }
}
