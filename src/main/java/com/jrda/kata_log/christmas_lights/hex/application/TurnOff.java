package com.jrda.kata_log.christmas_lights.hex.application;

import com.jrda.kata_log.christmas_lights.hex.domain.Light;
import com.jrda.kata_log.christmas_lights.hex.domain.Switch;

public class TurnOff {
    private Switch aSwitch;

    public TurnOff(Light[][] lights) {
        this.aSwitch = new Switch(lights) ;
    }

    public void turnOff(int originX, int originY, int destX, int destY) {
        aSwitch.turnOff(originX, originY, destX, destY);
    }
}
