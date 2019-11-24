package com.jrda.design_patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        display(((WeatherData)o).getTemperature());
    }

    public void display(double temperature){
        System.out.println("Temperature: " + temperature);
    }
}
