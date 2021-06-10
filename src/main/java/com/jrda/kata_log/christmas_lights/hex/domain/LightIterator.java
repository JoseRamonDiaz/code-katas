package com.jrda.kata_log.christmas_lights.hex.domain;

import java.util.Iterator;

public class LightIterator implements Iterator<Light> {
    private final Light[][] lights;
    private Integer originX;
    private Integer originY;
    private final Integer destX;
    private final Integer destY;

    public LightIterator(Light[][] lights, int originX, int originY, int destX, int destY) {
        this.lights = lights;
        this.originX = originX;
        this.originY = originY;
        this.destX = destX;
        this.destY = destY;
    }

    @Override
    public boolean hasNext() {
        return originX <= destX && originY <= destY;
    }

    @Override
    public Light next() {

        if (hasNext()) {
            Light next = lights[originX][originY];

            if (originY.equals(destY)) {
                ++originX;
                originY = 0;
            } else {
                ++originY;
            }

            return next;
        }

        return null;
    }
}
