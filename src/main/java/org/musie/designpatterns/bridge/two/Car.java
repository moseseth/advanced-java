package org.musie.designpatterns.bridge.two;

// Concrete Implementor: Car
class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }
}
