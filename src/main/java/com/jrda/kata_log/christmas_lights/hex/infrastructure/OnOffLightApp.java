package com.jrda.kata_log.christmas_lights.hex.infrastructure;

import com.jrda.kata_log.christmas_lights.hex.application.TurnOn;
import com.jrda.kata_log.christmas_lights.hex.domain.Light;
import com.jrda.kata_log.christmas_lights.hex.domain.OnOffLight;

public class OnOffLightApp {
    public static void main(String[] args) {
        int size = 10;
        OnOffLight[][] lights = new OnOffLight[size][size];
        init(lights);

        TurnOn turnOn = new TurnOn(lights);
        turnOn.turnOn(0, 0, 1, 1);
        print(lights);
    }

    private static void init(Light[][] lights) {
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[0].length; j++) {
                lights[i][j] = new OnOffLight();
            }
        }
    }

    private static void print(OnOffLight[][] lights) {
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[0].length; j++) {
                if (lights[i][j].isOn())
                    System.out.print("o");
                else
                    System.out.print("x");
            }
            System.out.println("");
        }
    }
}
