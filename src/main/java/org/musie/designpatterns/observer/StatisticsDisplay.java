package org.musie.designpatterns.observer;

public class StatisticsDisplay implements WeatherObserver {
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private float sumTemperature = 0;
    private int numReadings = 0;

    @Override
    public void update(float temperature) {
        sumTemperature += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        float averageTemperature = sumTemperature / numReadings;
        System.out.println("Statistics Display: Avg/Max/Min temperature = " + averageTemperature +
                "°C / " + maxTemperature + "°C / " + minTemperature + "°C");
    }
}
