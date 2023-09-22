package org.musie.designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        /////////////////////////// Observer pattern ////////////////////
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(statisticsDisplay);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(temperatureDisplay);

        weatherStation.setTemperature(28.0f);
    }
}
