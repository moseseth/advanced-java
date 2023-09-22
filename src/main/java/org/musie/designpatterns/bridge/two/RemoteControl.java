package org.musie.designpatterns.bridge.two;

// Abstraction: Remote Control
abstract class RemoteControl {
    protected Vehicle vehicle;

    public RemoteControl(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void increaseSpeed();

    public abstract void decreaseSpeed();
}
