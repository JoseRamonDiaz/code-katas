package com.jrda.design_patterns.observer;

public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay();
        weatherData.addObserver(generalDisplay);

        weatherData.setTemperature(35);
    }
}
