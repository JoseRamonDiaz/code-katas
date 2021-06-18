package com.jrda.kata_log.christmas_lights.hex.domain;

public class Switch {
    private Light[][] lights;

    public Switch(Light[][] lights) {
        this.lights = lights;
    }

    public void turnOn(int originX, int originY, int destX, int destY) {
        LightIterator lightIterator = new LightIterator(lights, originX, originY, destX, destY);
        while(lightIterator.hasNext()) {
            lightIterator.next().on();
        }
    }

    public void turnOff(int originX, int originY, int destX, int destY) {
        LightIterator lightIterator = new LightIterator(lights, originX, originY, destX, destY);
        while(lightIterator.hasNext()) {
            lightIterator.next().off();
        }
    }
}
