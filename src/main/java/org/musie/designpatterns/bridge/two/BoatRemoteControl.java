package org.musie.designpatterns.bridge.two;

// Refined Abstraction: BoatRemoteControl
class BoatRemoteControl extends RemoteControl {
    public BoatRemoteControl(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void powerOn() {
        vehicle.startEngine();
    }

    @Override
    public void powerOff() {
        vehicle.stopEngine();
    }

    @Override
    public void increaseSpeed() {
        vehicle.accelerate();
    }

    @Override
    public void decreaseSpeed() {
        vehicle.brake();
    }
}
