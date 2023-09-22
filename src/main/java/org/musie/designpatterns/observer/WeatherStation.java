package org.musie.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }
}
