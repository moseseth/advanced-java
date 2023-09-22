package org.musie.designpatterns.observer;

public class TemperatureDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: Current temperature is " + temperature + "°C");
    }
}

