package org.musie.designpatterns.observer;

/*
The Observer Pattern is a design pattern in
which an object (known as the subject) maintains a
list of its dependents (observers) and notifies them of
any state changes, usually by calling one of their methods.
 */
interface WeatherObserver {
    void update(float temperature);
}
