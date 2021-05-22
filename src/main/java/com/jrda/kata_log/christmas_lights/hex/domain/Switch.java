package com.jrda.kata_log.christmas_lights.hex.domain;

public class Switch {
    private Light[][] lights;

    public Switch(Light[][] lights) {
        this.lights = lights;
    }

    public void turnOn(int originX, int originY, int destX, int destY) {
        for (int i = originX; i <= destX; i++) {
            for (int j = originY; j <= destY; j++) {
                lights[i][j].on();
            }
        }
    }

    public void turnOff(int originX, int originY, int destX, int destY) {
        for (int i = originX; i <= destX; i++) {
            for (int j = originY; j <= destY; j++) {
                lights[i][j].off();
            }
        }
    }
}
