package com.jrda.design_patterns.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private double humidity;
    private double temperature;
    private double pressure;

    public double getHumidity(){
        return humidity;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        this.setChanged();
        this.notifyObservers();
    }

    public double getPressure(){
        return pressure;
    }
}
