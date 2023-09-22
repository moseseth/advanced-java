package org.musie.designpatterns.facade;

// Subsystem #2: Sound System
class SoundSystem {
    void turnOn() {
        System.out.println("Sound system is turned on");
    }

    void turnOff() {
        System.out.println("Sound system is turned off");
    }
}
