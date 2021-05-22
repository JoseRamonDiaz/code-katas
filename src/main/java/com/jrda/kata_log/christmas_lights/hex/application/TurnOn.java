package com.jrda.kata_log.christmas_lights.hex.application;

import com.jrda.kata_log.christmas_lights.hex.domain.Light;
import com.jrda.kata_log.christmas_lights.hex.domain.Switch;

public class TurnOn {
    private Switch aSwitch;

    public TurnOn(Light[][] lights) {
        this.aSwitch = new Switch(lights) ;
    }

    public void turnOn(int originX, int originY, int destX, int destY) {
        aSwitch.turnOn(originX, originY, destX, destY);
    }
}
