package org.musie.designpatterns.facade;


/**
 * The Facade pattern is a structural design pattern
 * that provides a simplified interface to a complex
 * system of classes, libraries, or API
 *
 */
// Subsystem #1: TV
class TV {
    void turnOn() {
        System.out.println("TV is turned on");
    }

    void turnOff() {
        System.out.println("TV is turned off");
    }
}

